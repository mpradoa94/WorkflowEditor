/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.mxGraphOutline;
import com.mxgraph.swing.util.mxSwingConstants;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxResources;
import com.mxgraph.util.mxUndoManager;
import com.mxgraph.util.mxUndoableEdit;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphSelectionModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;

/**
 *
 * @author MPA
 */
public class WorkflowPanel extends JPanel {

    protected mxGraphComponent graphComponent;
    private mxGraphOutline graphOutline;
    private final JToolBar libraryPane;
    private mxUndoManager undoManager;
    private boolean modificado;

    private mxEventSource.mxIEventListener undoHandler = new mxEventSource.mxIEventListener() {
        @Override
        public void invoke(Object source, mxEventObject evt) {
            getUndoManager().undoableEditHappened((mxUndoableEdit) evt
                    .getProperty("edit"));
        }
    };

    protected mxEventSource.mxIEventListener changeTracker = new mxEventSource.mxIEventListener() {
        public void invoke(Object source, mxEventObject evt) {
            modificado = true;
        }
    };

    //private JPanel panelPropiedades;
    public WorkflowPanel(mxGraphComponent component) {
        graphComponent = component;
        graphOutline = new mxGraphOutline(graphComponent);
        libraryPane = new JToolBar();
        libraryPane.setFloatable(false);

        final mxGraph graph = graphComponent.getGraph();
        graph.setResetViewOnRootChange(false);

        undoManager = crearUndoManager();
        setWindowPanels();
        setShapeOptions(graph);

        agregarListeners(graphComponent, graph);

        setLookAndFeel();
    }
    
    private mxUndoManager crearUndoManager(){
        return new mxUndoManager();
    }

    private void setWindowPanels() {
        JSplitPane inner = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        inner.setLeftComponent(libraryPane);
        inner.setRightComponent(graphOutline);
        inner.setDividerLocation(320);
        inner.setDividerSize(6);
        inner.setBorder(null);

        JSplitPane outer = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        outer.setLeftComponent(inner);
        outer.setRightComponent(graphComponent);
        outer.setDividerLocation(200);
        outer.setDividerSize(6);
        outer.setBorder(null);

        setLayout(new BorderLayout());
        add(outer, BorderLayout.CENTER);
        //add(panelPropiedades, BorderLayout.EAST);
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

    private void agregarListeners(mxGraphComponent graphComponent, mxGraph graph) {
        setMouseListener(graphComponent);
        setUndoListener(graph);
        new EditorKeyboardHandler(graphComponent);
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

    private void setUndoListener(mxGraph graph) {
        graph.getModel().addListener(mxEvent.CHANGE, changeTracker);

        graph.getModel().addListener(mxEvent.UNDO, undoHandler);
        graph.getView().addListener(mxEvent.UNDO, undoHandler);

        mxEventSource.mxIEventListener undoHandler = new mxEventSource.mxIEventListener() {
            public void invoke(Object source, mxEventObject evt) {
                List<mxUndoableEdit.mxUndoableChange> changes = ((mxUndoableEdit) evt
                        .getProperty("edit")).getChanges();
                graph.setSelectionCells(graph.getSelectionCellsForChanges(changes));
            }
        };

        getUndoManager().addListener(mxEvent.UNDO, undoHandler);
        getUndoManager().addListener(mxEvent.REDO, undoHandler);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        mxSwingConstants.SHADOW_COLOR = Color.LIGHT_GRAY;
        mxConstants.W3C_SHADOWCOLOR = "#D3D3D3";
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
            //panelPropiedades.removeAll();
            JPanelPropiedadesNodo panel = new JPanelPropiedadesNodo((Nodo) value);
            JPanel pane = new JPanel();
            pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
            //panelPropiedades.add(panel);
            JDialog dialog = new JDialog(DiagramEditor.getFrameEditor(), "Propiedades", true);
            JButton cerrar = new JButton("Cerrar");
            cerrar.setAlignmentX(Component.CENTER_ALIGNMENT);

            cerrar.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });

            pane.add(panel);
            pane.add(cerrar);
            pane.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

            dialog.getContentPane().add(pane);
            dialog.pack();
            dialog.setLocationRelativeTo(null);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

        //panelPropiedades.revalidate();
        //panelPropiedades.repaint();
    }

    public boolean isModificado() {
        return modificado;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }

    public mxUndoManager getUndoManager() {
        return undoManager;
    }

    public void setUndoManager(mxUndoManager undoManager) {
        this.undoManager = undoManager;
    }

}
