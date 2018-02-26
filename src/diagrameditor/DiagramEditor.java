package diagrameditor;

import com.mxgraph.swing.handler.mxKeyboardHandler;
import com.mxgraph.swing.handler.mxRubberband;
import com.mxgraph.util.mxResources;
import core.webmet.EJBWebServicev20;
import core.webmet.EJBWebServicev20_Service;
import core.webmet.Instancia;
import core.webmet.LogInResponse;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author MPA
 */
public class DiagramEditor {

    private static EJBWebServicev20_Service webService;
    private static EJBWebServicev20 puerto;
    private static LogInResponse respuestaLogIn;
    private static Instancia instancia;
    private static String tituloApp;
    private static JFrame frameEditor;
    private static File archivoActual;

    public DiagramEditor() {
        instancia = null;
    }

    public static void main(String[] args) {
        webService = new EJBWebServicev20_Service();
        puerto = webService.getEJBWebServicev20Port();
        LogIn login = new LogIn();
        login.setVisible(true);
        //startDiagramEditor();
        tituloApp = "Editor";
    }

    public static void startDiagramEditor() {
        MiGraph graph = new MiGraph();
        MiGraphComponent graphComponent = new MiGraphComponent(graph);

        new mxRubberband(graphComponent);
        new mxKeyboardHandler(graphComponent);
        
        WorkflowPanel editor = new WorkflowPanel(graphComponent);
        editor.setListenerToGraph(graph);
        frameEditor = createFrame(new BarraMenuPrincipal(editor), editor);
        frameEditor.setVisible(true);
        actualizarTitulo();
    }

    public static JFrame createFrame(JMenuBar menuBar, JPanel editor) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(editor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        frame.setSize(870, 640);

        return frame;
    }

    private static void actualizarTitulo() {
        if (frameEditor != null) {
            String titulo = (archivoActual != null) ? archivoActual
					.getAbsolutePath() : "Sin título";

            frameEditor.setTitle(tituloApp + " - " + titulo);
        }

    }
    
    public static void limpiarFrameEditor(){
        frameEditor.getContentPane().removeAll();
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
    
    public static LogInResponse getRespuestaLogIn() {
        return respuestaLogIn;
    }

    public static void setRespuestaLogIn(LogInResponse aRespuestaLogIn) {
        respuestaLogIn = aRespuestaLogIn;
    }

    public static void setArchivoActual(File archivo) {
        File aux = archivoActual;
        archivoActual = archivo;
        if (aux != archivo) {
            actualizarTitulo();
        }
    }

    public static File getArchivoActual() {
        return archivoActual;
    }
    
    public static JFrame getFrameEditor() {
        return frameEditor;
    }

}
