package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.handler.mxKeyboardHandler;
import com.mxgraph.swing.handler.mxRubberband;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.mxGraphOutline;
import com.mxgraph.swing.util.mxGraphTransferable;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxEventSource.mxIEventListener;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphSelectionModel;
import core.webmet.EJBWebServicev20;
import core.webmet.EJBWebServicev20_Service;
import core.webmet.GetModelo;
import core.webmet.GetModeloResponse;
import core.webmet.Instancia;
import core.webmet.LogInIndata;
import core.webmet.LogInResponse;
import core.webmet.Modelo;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author MPA
 */
public class DiagramEditor {

    private static EJBWebServicev20_Service webService;
    private static EJBWebServicev20 puerto;
    private static Instancia instancia;
    

    public DiagramEditor() {
        instancia = null;
    }

    public static void main(String[] args) {
        webService = new EJBWebServicev20_Service();
        puerto = webService.getEJBWebServicev20Port();
        LogIn login = new LogIn();
        login.setVisible(true);
    }
    
    public static void startDiagramEditor() {
        MiGraph graph = new MiGraph();
        MiGraphComponent graphComponent = new MiGraphComponent(graph);
        
        new mxRubberband(graphComponent);
        new mxKeyboardHandler(graphComponent);
        
        DiagramPanel editor = new DiagramPanel("mxGraph Editor", graphComponent);
        editor.setListenerToGraph(graph);
        createFrame(new BarraMenuPrincipal(editor), editor).setVisible(true);
    }
    
    public static JFrame createFrame(JMenuBar menuBar, DiagramPanel editor) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(editor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        frame.setSize(870, 640);

        // Updates the frame title
        //updateTitle();
        return frame;
    }

    public static void setInstancia(Instancia inst) {
        instancia = inst;
    }

    public static Instancia getInstancia() {
        return instancia;
    }

    public static EJBWebServicev20_Service getService() {
        return webService;
    }

    public static EJBWebServicev20 getPort() {
        return puerto;
    }

}
