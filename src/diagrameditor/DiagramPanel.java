/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.*;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author MPA
 */
public class DiagramPanel extends JPanel{
    private String appTitle;
    private mxGraphComponent graphComponent;
    private mxGraphOutline graphOutline;
    private final JTabbedPane libraryPane;
    
    private JPanel propertiesPanel;
    
    public DiagramPanel(String appTitle, mxGraphComponent component){
        this.appTitle = appTitle;
        graphComponent = component;
        graphOutline = new mxGraphOutline(graphComponent);
        libraryPane = new JTabbedPane();
        final mxGraph graph = graphComponent.getGraph();
        this.setWindowPanels();
        setShapeOptions(graph);
        setMouseListener(graphComponent);
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

        setLayout(new BorderLayout());
        add(outer, BorderLayout.CENTER);
        add(propertiesPanel, BorderLayout.EAST);
    }

    private void setShapeOptions(mxGraph graph) {
        EditorOptionsMenu shapeOptions = insertOptionsMenu(mxResources.get("shapes"));

        FlowVertex flow = new FlowVertex("Flow");
        RoleVertex role = new RoleVertex("Role", "", "");
        NodeVertex start = new NodeVertex("Start", "", NodeType.START);
        NodeVertex process = new NodeVertex("Process", "", NodeType.PROCESS);
        ConditionVertex ifNode = new ConditionVertex("Condition", "", NodeType.IF);
        NodeVertex end = new NodeVertex("End", "", NodeType.END);

        shapeOptions.addOption("Flowchart", new ImageIcon(
                DiagramEditor.class.getResource("/images/swimlane.png")),
                "swimlane", 160, 120, flow);
        shapeOptions.addOption("Role", new ImageIcon(
                DiagramEditor.class.getResource("/images/swimlane.png")),
                "swimlane;horizontal=0;", 160, 120, role);
        shapeOptions.addOption("Start", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/ellipse.png")),
                "swimlane", 60, 60, start);
        shapeOptions.addOption("Process", new ImageIcon(
                DiagramEditor.class.getResource("/images/rectangle.png")),
                "swimlane", 160, 120, process);
        shapeOptions.addOption("If", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/rhombus.png")),
                "swimlane", 160, 160, ifNode);
        shapeOptions.addOption("End", new ImageIcon(
                DiagramEditor.class
                .getResource("/images/ellipse.png")),
                "swimlane", 60, 60, end);
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

    private EditorOptionsMenu insertOptionsMenu(String get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
