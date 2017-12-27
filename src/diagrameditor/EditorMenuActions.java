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
import com.mxgraph.util.mxResources;
import com.mxgraph.util.mxUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.util.png.mxPngEncodeParam;
import com.mxgraph.util.png.mxPngImageEncoder;
import com.mxgraph.view.mxGraph;
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
public class EditorMenuActions {

    static boolean registered = false;

    private static void registerCodecs() {
        //Register the custom model
        mxCodecRegistry.register(new mxModelCodec(new CustomGraph()));

        //Register FlowVertex
        mxCodecRegistry.register(new mxObjectCodec(new FlowVertex()));

        //Register RoleVertex
        mxCodecRegistry.register(new mxObjectCodec(new RoleVertex()));

        //Register NodeVertex with support for enum
        mxCodecRegistry.register(new mxObjectCodec(new NodeVertex()) {
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

    public static class SaveAction extends AbstractAction {

        protected boolean showDialog;
        private final DiagramEditor editor;
        private mxGraphComponent graphComponent;

        public SaveAction(boolean showDialog, DiagramEditor editor, mxGraphComponent graphComponent) {
            this.showDialog = showDialog;
            this.editor = editor;
            this.graphComponent = graphComponent;
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println("Saving ...");

            JFileChooser fc = new JFileChooser();
            int rsp = fc.showSaveDialog(editor);
            if (rsp == JFileChooser.APPROVE_OPTION) {

                if (!registered) {
                    registerCodecs();
                }

                try {
                    mxGraph graph = graphComponent.getGraph();

                    String fileName = fc.getSelectedFile().getAbsolutePath();
                    String extension = fc.getFileFilter().getDescription();
                    fileName = changeExtensionToXML(fileName, extension);

                    mxCodec codec = new mxCodec();
                    String xml = mxXmlUtils.getXml(codec.encode(graph.getModel()));
                    mxUtils.writeFile(xml, fileName);

                } catch (IOException ioe) {
                    System.out.println("Error while saving: " + ioe);
                }
            }
        }

        private String changeExtensionToXML(String filename, String extension) {
            if (!"xml".equals(extension)) {
                return filename + ".xml";
            }
            return filename;
        }

    }

    public static class LoadAction extends AbstractAction {

        private final DiagramEditor editor;
        private mxGraphComponent graphComponent;

        public LoadAction(DiagramEditor editor, mxGraphComponent graphComponent) {
            this.editor = editor;
            this.graphComponent = graphComponent;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fc = new JFileChooser();
            int rsp = fc.showSaveDialog(editor);
            if (rsp == JFileChooser.APPROVE_OPTION) {

                if (!registered) {
                    registerCodecs();
                }

                try {
                    mxGraph graph = graphComponent.getGraph();

                    String fileName = fc.getSelectedFile().getAbsolutePath();
                    String extension = fc.getFileFilter().getDescription();
                    
                    Document document = mxXmlUtils.parseXml( mxUtils.readFile( fileName));
                    mxCodec codec = new mxCodec(document);
                    codec.decode( document.getDocumentElement(), graph.getModel());
                } catch (IOException ioe) {
                    System.out.println("Error while loading: " + ioe);
                }
            }
        }
    }
}
