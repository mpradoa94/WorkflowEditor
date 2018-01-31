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
import com.mxgraph.util.mxDomUtils;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxResources;
import com.mxgraph.util.mxUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.util.png.mxPngEncodeParam;
import com.mxgraph.util.png.mxPngImageEncoder;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.HashSet;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JButton;
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

        public void actionPerformed(ActionEvent e) {
            JFileChooser seleccionadorArchivo = new JFileChooser();
            int respuesta = seleccionadorArchivo.showSaveDialog(editor);
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                if (!registrado) {
                    registrarCodecs();
                }

                try {
                    mxGraph graph = graphComponent.getGraph();

                    String nombreArchivo = seleccionadorArchivo.getSelectedFile().getAbsolutePath();
                    String extension = seleccionadorArchivo.getFileFilter().getDescription();
                    String nuevoNombre = cambiarExtensionXML(nombreArchivo, extension);
                    
                    GeneradorXML generador = new GeneradorXML(graphComponent);
                    generador.generate();
                    System.out.println("XML: "+generador.getXMLstring());
                            
                    mxCodec codec = new mxCodec();
                    String xml = mxXmlUtils.getXml(codec.encode(graph.getModel()));
                    mxUtils.writeFile(xml, nuevoNombre);
                    mxUtils.writeFile(generador.getXMLstring(), nombreArchivo+"_CORE.xml");

                } catch (IOException ioe) {
                    System.out.println("Error al guardar: " + ioe);
                }
            }
        }

        private String cambiarExtensionXML(String nombreArchivo, String extension) {
            if (!"xml".equals(extension)) {
                return nombreArchivo + ".xml";
            }
            return nombreArchivo;
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

                try {
                    mxGraph graph = graphComponent.getGraph();

                    String nombreArchivo = seleccionadorArchivo.getSelectedFile().getAbsolutePath();
                    
                    Document document = mxXmlUtils.parseXml( mxUtils.readFile( nombreArchivo));
                    mxCodec codec = new mxCodec(document);
                    codec.decode( document.getDocumentElement(), graph.getModel());
                } catch (IOException ioe) {
                    System.out.println("Error while loading: " + ioe);
                }
            }
        }
    }
    
}