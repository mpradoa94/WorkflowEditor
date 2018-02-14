/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import com.mxgraph.canvas.mxICanvas;
import com.mxgraph.canvas.mxSvgCanvas;
import com.mxgraph.io.mxCodec;
import com.mxgraph.io.mxCodecRegistry;
import com.mxgraph.io.mxGdCodec;
import com.mxgraph.io.mxModelCodec;
import com.mxgraph.io.mxObjectCodec;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxResources;
import com.mxgraph.util.mxUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.util.png.mxPngEncodeParam;
import com.mxgraph.util.png.mxPngImageEncoder;
import com.mxgraph.util.png.mxPngTextDecoder;
import com.mxgraph.view.mxGraph;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.w3c.dom.Document;

/**
 *
 * @author MPA
 */
public class AccionesMenuPrincipal {

    static boolean registrado = false;

    private static void registrarCodecs() {
        //Regisrar el modelo
        mxCodecRegistry.register(new mxModelCodec(new MiGraph()));

        //Registrar NodoFlujo
        mxCodecRegistry.register(new mxObjectCodec(new NodoFlujo()));

        //Registrar NodoRol
        mxCodecRegistry.register(new mxObjectCodec(new NodoRol()));

        //Registrar NodoProceso con enum
        mxCodecRegistry.register(new mxObjectCodec(new NodoProceso()) {
            @Override
            protected boolean isPrimitiveValue(Object value) {
                return super.isPrimitiveValue(value) || value.getClass().isEnum();
            }

            @Override
            protected void setFieldValue(Object obj, String fieldname, Object value) {
                Field field = getField(obj, fieldname);

                if (field.getType().isEnum()) {
                    Object[] c = field.getType().getEnumConstants();

                    for (int i = 0; i < c.length; i++) {
                        if (c[i].toString().equals(value)) {
                            value = c[i];
                            break;
                        }
                    }
                }

                super.setFieldValue(obj, fieldname, value);
            }
        });
    }

    public static class AccionGuardar extends AbstractAction {

        protected boolean mostrarCuadroDialogo;
        private final DiagramPanel editor;
        private mxGraphComponent graphComponent;

        public AccionGuardar(boolean showDialog, DiagramPanel editor, mxGraphComponent graphComponent) {
            this.mostrarCuadroDialogo = showDialog;
            this.editor = editor;
            this.graphComponent = graphComponent;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser seleccionadorArchivo = new JFileChooser();

            seleccionadorArchivo.addChoosableFileFilter(
                    new FiltroArchivo(".png", "PNG+XML " + mxResources.get("file") + " (.png)"));

            int respuesta = seleccionadorArchivo.showSaveDialog(editor);

            if (respuesta == JFileChooser.APPROVE_OPTION) {
                try {
                    if (!registrado) {
                        registrarCodecs();
                    }

                    File archivo = seleccionadorArchivo.getSelectedFile();
                    FileFilter selectedFilter = seleccionadorArchivo.getFileFilter();
                    String nombreArchivo = archivo.getAbsolutePath();

                    nombreArchivo = cambiarExtension(nombreArchivo, selectedFilter);
                    guardarXmlPng(nombreArchivo);
                    String xmlString = crearXML();
                    guardarXML(xmlString, nombreArchivo);
                } catch (IOException ex) {
                    Logger.getLogger(AccionesMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        private String cambiarExtension(String nombreArchivo, FileFilter selectedFilter) {
            if (selectedFilter instanceof FiltroArchivo) {
                String ext = ((FiltroArchivo) selectedFilter).getExtension();

                if (!nombreArchivo.toLowerCase().endsWith(ext)) {
                    nombreArchivo += ext;
                }
            }
            return nombreArchivo;
        }

        private void guardarXmlPng(String nombreArchivo) {
            String ext = nombreArchivo.substring(nombreArchivo.lastIndexOf('.') + 1);

            if (ext.equalsIgnoreCase("png")) {
                try {
                    mxGraph graph = graphComponent.getGraph();

                    BufferedImage image = crearImagen(graph);
                    String encodedXML = getXMLurl(graph);

                    mxPngEncodeParam param = mxPngEncodeParam.getDefaultEncodeParam(image);
                    param.setCompressedText(new String[]{"mxGraphModel", encodedXML});

                    FileOutputStream outputStream = new FileOutputStream(new File(nombreArchivo));
                    mxPngImageEncoder encoder = new mxPngImageEncoder(outputStream,
                            param);

                    if (image != null) {
                        encoder.encode(image);
                        //editor.setModified(false);
                        DiagramEditor.setArchivoActual(new File(nombreArchivo));
                    } else {
                        JOptionPane.showMessageDialog(graphComponent,
                                mxResources.get("noImageData"));
                    }
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(AccionesMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AccionesMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AccionesMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        private String crearXML() {
            GeneradorXML generador = new GeneradorXML(graphComponent);
            generador.generate();
            return generador.getXMLstring();
        }

        private void guardarXML(String xmlString, String nombreArchivo) throws IOException {
            ParseMarshall esValido = new ParseMarshall();
            if (esValido.ValidaStringXML(xmlString)) {
                mxUtils.writeFile(xmlString, nombreArchivo + "_CORE.xml");
            } else {
                System.out.println("XML invalido");
            }
        }

        private BufferedImage crearImagen(mxGraph graph) {
            return mxCellRenderer.createBufferedImage(graph,
                    null, 1, Color.WHITE, graphComponent.isAntiAlias(), null,
                    graphComponent.getCanvas());
        }

        private String getXMLurl(mxGraph graph) throws UnsupportedEncodingException {
            mxCodec codec = new mxCodec();
            String xml = mxXmlUtils.getXml(codec.encode(graph.getModel()));
            return URLEncoder.encode(xml, "UTF-8");
        }

    }

    public static class AccionCargar extends AbstractAction {

        private final DiagramPanel editor;
        private mxGraphComponent graphComponent;

        public AccionCargar(DiagramPanel editor, mxGraphComponent graphComponent) {
            this.editor = editor;
            this.graphComponent = graphComponent;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser seleccionadorArchivo = new JFileChooser();
            int respuesta = seleccionadorArchivo.showSaveDialog(editor);
            if (respuesta == JFileChooser.APPROVE_OPTION) {

                if (!registrado) {
                    registrarCodecs();
                }

                File archivo = seleccionadorArchivo.getSelectedFile();
                String nombreArchivo = archivo.getAbsolutePath();

                if (nombreArchivo.toLowerCase().endsWith(".png")) {
                    abrirXmlPng(archivo);
                }
            }
        }

        private void abrirXmlPng(File archivo) {
            try {
                mxGraph graph = graphComponent.getGraph();
                Map<String, String> texto;

                texto = mxPngTextDecoder.decodeCompressedText(new FileInputStream(archivo));
                if (texto != null) {
                    String value = texto.get("mxGraphModel");

                    if (value != null) {
                        Document document = mxXmlUtils.parseXml(URLDecoder.decode(
                                value, "UTF-8"));
                        mxCodec codec = new mxCodec(document);
                        codec.decode(document.getDocumentElement(), graph.getModel());
                        DiagramEditor.setArchivoActual(archivo);
                    }
                } else {
                    JOptionPane.showMessageDialog(editor,
                            mxResources.get("imageContainsNoDiagramData"));
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AccionesMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(AccionesMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
