package diagrameditor;

import com.mxgraph.swing.handler.mxKeyboardHandler;
import com.mxgraph.swing.handler.mxRubberband;
import core.webmet.EJBWebServicev20;
import core.webmet.EJBWebServicev20_Service;
import core.webmet.Instancia;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

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
