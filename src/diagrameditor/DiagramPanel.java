/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.handler.mxKeyboardHandler;
import com.mxgraph.swing.handler.mxRubberband;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.mxGraphOutline;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphSelectionModel;
import core.webmet.GetModelo;
import core.webmet.GetModeloResponse;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

/**
 *
 * @author MPA
 */
public class DiagramPanel extends JPanel {

    protected mxGraphComponent graphComponent;
    protected mxGraphOutline graphOutline;
    protected final JTabbedPane libraryPane;
    
    private JPanel propertiesPanel;
    private static JPanel modelsPanel;
    public static int idSelectedModel;
    
    public DiagramPanel(String appTitle, mxGraphComponent component) {
        graphComponent = component;
        graphOutline = new mxGraphOutline(graphComponent);
        libraryPane = new JTabbedPane();
        final mxGraph graph = graphComponent.getGraph();
        graph.setResetViewOnRootChange(false);
        this.setWindowPanels();
        setShapeOptions(graph);
        setMouseListener(graphComponent);
        setLookAndFeel();
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
        
        propertiesPanel = new JPanel();
        modelsPanel = new JPanel();
        setLayout(new BorderLayout());
        add(outer, BorderLayout.CENTER);
        add(propertiesPanel, BorderLayout.EAST);
        add(modelsPanel, BorderLayout.NORTH);
        this.setPreferredSize(this.getPreferredSize());
    }

    private void setShapeOptions(mxGraph graph) {
        EditorOpcionesFiguras shapeOptions = insertOptionsMenu(mxResources.get("shapes"));

        Nodo flujo = NodoFactory.getNodo("NodoFlujo");
        Nodo rol = NodoFactory.getNodo("NodoRol");
        Nodo Inicio = NodoFactory.getNodo("NodoInicio");
        Nodo proceso = NodoFactory.getNodo("NodoProceso");
        Nodo condicion = NodoFactory.getNodo("NodoCondicion");
        Nodo fin = NodoFactory.getNodo("NodoFin");

        shapeOptions.addOption("Flowchart", new ImageIcon(
                DiagramEditor.class.getResource("/images/swimlane.png")),
                "swimlane", 160, 120, flujo);
        shapeOptions.addOption("Role", new ImageIcon(
                DiagramEditor.class.getResource("/images/swimlane.png")),
                "swimlane;horizontal=0;", 160, 120, rol);
        shapeOptions.addOption("Start", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/ellipse.png")),
                "ellipse", 70, 70, Inicio);
        shapeOptions.addOption("Process", new ImageIcon(
                DiagramEditor.class.getResource("/images/rectangle.png")),
                "swimlane", 160, 120, proceso);
        shapeOptions.addOption("If", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/rhombus.png")),
                "swimlane", 160, 160, condicion);
        shapeOptions.addOption("End", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/ellipse.png")),
                "ellipse", 70, 70, fin);
        shapeOptions.addEdgeOption("Horizontal Connector", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/connect.png")),
                null, 100, 100, "");
        shapeOptions.addEdgeOption("Vertical Connector", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/vertical.png")),
                "vertical", 100, 100, "");
    }

    private void setMouseListener(mxGraphComponent graphComponent) {
        // MouseListener that Prints the Cell on Doubleclick
        graphComponent.getGraphControl().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    // Get Cell under Mousepointer
                    mxCell cell = (mxCell) getGraphComponent().getCellAt(e.getX(), e.getY());
                    String id = cell.getId();
                    // Print Cell Label
                    if (cell != null) {
                        JOptionPane.showMessageDialog(null, "Id: " + id + " location: " + cell.getGeometry());
                        System.out.println(cell);
                    }
                }
            }
        });
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    
    private EditorOpcionesFiguras insertOptionsMenu(String title) {
        EditorOpcionesFiguras optionsMenu = new EditorOpcionesFiguras();
        final JScrollPane scrollPanel = new JScrollPane(optionsMenu);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        libraryPane.add(title, scrollPanel);
        update_pane_width(scrollPanel, optionsMenu);
        return optionsMenu;
    }

    private void update_pane_width(JScrollPane scrollPanel, EditorOpcionesFiguras menu) {
        // Updates the widths of the palettes if the container size changes
        libraryPane.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                int w = scrollPanel.getWidth()
                        - scrollPanel.getVerticalScrollBar().getWidth();
                menu.setPreferredWidth(w);
            }

        });
    }
    
    public mxGraphComponent getGraphComponent() {
        return graphComponent;
    }
    
    public static void modelOptions(){
        JPanel propertiesPanel = new JPanel(new GridLayout(0, 1));
        propertiesPanel.add(new JLabel("<html><h3>Models</h3></html>"));
        
        List<Cuestionario> models = Cuestionario.getOpcionesCuestionario();
       
        JComboBox modelsList = new JComboBox(new DefaultComboBoxModel(models.toArray()));
        modelsList.addItemListener(new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e) {
                Cuestionario item =(Cuestionario) e.getItem();
                idSelectedModel = item.getModelo().getIdModelo();
            }
        
        });
        modelsPanel.add(modelsList);
    }
    
    public void setListenerToGraph(MiGraph graph) {
        graph.getSelectionModel().addListener(mxEvent.CHANGE, new mxEventSource.mxIEventListener() {

            @Override
            public void invoke(Object sender, mxEventObject evt) {
                System.out.println("Selection in graph component" + sender.toString());
                if (sender instanceof mxGraphSelectionModel) {
                    for (Object cell : ((mxGraphSelectionModel) sender).getCells()) {
                        graph.setRoleToVertex((mxCell) cell);
                        addNewCellPanel((mxCell) cell);
                    }
                }
            }

        });
    }
    
     public void addNewCellPanel(mxCell cell) {
        Object value = cell.getValue();
        if (value instanceof Nodo) {
            propertiesPanel.removeAll();
            JPanelPropiedadesNodo panel = new JPanelPropiedadesNodo((Nodo) value);
            propertiesPanel.add(panel);
        }
        propertiesPanel.revalidate();
        propertiesPanel.repaint();
    }
        
}
