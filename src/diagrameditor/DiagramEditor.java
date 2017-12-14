package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.mxGraphOutline;
import com.mxgraph.swing.util.mxGraphTransferable;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import java.awt.BorderLayout;
import java.awt.PopupMenu;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author MPA
 */
public class DiagramEditor extends JPanel {

    protected String appTitle;
    protected mxGraphComponent graphComponent;
    protected mxGraphOutline graphOutline;
    protected final JTabbedPane libraryPane;

    public DiagramEditor(String appTitle, mxGraphComponent component) {
        this.appTitle = appTitle;
        graphComponent = component;
        graphOutline = new mxGraphOutline(graphComponent);
        libraryPane = new JTabbedPane();
        final mxGraph graph = graphComponent.getGraph();
        this.setWindowPanels();
        setShapeOptions(graph);
        setMouseListener(graphComponent);
    }

    public static void main(String[] args) {
        CustomGraphComponent graphComponent = new CustomGraphComponent(new CustomGraph());
        DiagramEditor editor = new DiagramEditor("mxGraph Editor", graphComponent);
        editor.setLookAndFeel();
        editor.createFrame(new MenuBar(editor)).setVisible(true);
    }

    public void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public JFrame createFrame(JMenuBar menuBar) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        frame.setSize(870, 640);

        // Updates the frame title
        //updateTitle();
        return frame;
    }

    private void setWindowPanels() {
        // Creates the inner split pane that contains the library with the
        // palettes and the graph outline on the left side of the window
        JSplitPane inner = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                libraryPane, graphOutline);
        inner.setDividerLocation(320);
        inner.setDividerSize(6);
        inner.setBorder(null);

        // Creates the outer split pane that contains the inner split pane and
        // the graph component on the right side of the window
        JSplitPane outer = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, inner,
                graphComponent);
        outer.setDividerLocation(200);
        outer.setDividerSize(6);
        outer.setBorder(null);

        setLayout(new BorderLayout());
        add(outer, BorderLayout.CENTER);
    }

    private void setShapeOptions(mxGraph graph) {
        EditorOptionsMenu shapeOptions = insertOptionsMenu(mxResources.get("shapes"));

        shapeOptions.addOption("Rectangle", new ImageIcon(
                DiagramEditor.class.getResource("/images/rectangle.png")),
                null, 160, 120, "");
        shapeOptions.addOption("Rectangle2", new ImageIcon(
                DiagramEditor.class.getResource("/images/rectangle.png")),
                "fillColor=red", 160, 120, "");
        shapeOptions.addOption("Ellipse", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/ellipse.png")),
                "ellipse", 160, 160, "");
        shapeOptions.addOption("Rhombus", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/rhombus.png")),
                "rhombus", 160, 160, "");
        shapeOptions.addEdgeOption("Horizontal Connector", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/connect.png")),
                null, 100, 100, "");
        shapeOptions.addEdgeOption("Vertical Connector", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/vertical.png")),
                "vertical", 100, 100, "");
    }

    private EditorOptionsMenu insertOptionsMenu(String title) {
        final EditorOptionsMenu optionsMenu = new EditorOptionsMenu();
        final JScrollPane scrollPanel = new JScrollPane(optionsMenu);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        libraryPane.add(title, scrollPanel);
        return optionsMenu;
    }

    public mxGraphComponent getGraphComponent() {
        return graphComponent;
    }
    
    public void setMouseListener(mxGraphComponent graphComponent){
        // MouseListener that Prints the Cell on Doubleclick
        graphComponent.getGraphControl().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
              if (e.getClickCount() == 2) {
                // Get Cell under Mousepointer
                myCell cell =(myCell) getGraphComponent().getCellAt(e.getX(), e.getY());
                String name = cell.getMyGeometry().getName();
                String id = cell.getId();
                // Print Cell Label
                if (cell != null) {
                    JOptionPane.showMessageDialog(null, "Name: "+name+" Id: "+id+" location: "+cell.getGeometry());
                  System.out.println(cell);
                }
              }
            }
        });
    }

}
