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
import java.net.URLEncoder;
import java.util.HashSet;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author MPA
 */
public class EditorMenuActions {
    
    private static void registerCodecs() {
        
    }
    
    public static class SaveAction extends AbstractAction {

        protected boolean showDialog;
        protected String lastDir = null;
        private DiagramEditor editor;
        private mxGraph graph;

        public SaveAction(boolean showDialog, DiagramEditor editor, mxGraph graph) {
            this.showDialog = showDialog;
            this.editor = editor;
            this.graph = graph;
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println("Saving ...");
            registerCodecs();
            mxCodecRegistry.register(new mxModelCodec( new CustomGraph()));
            JFileChooser fc = new JFileChooser();
            int rsp = fc.showSaveDialog(editor);
            if (rsp == JFileChooser.APPROVE_OPTION) {
                try {
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

}
