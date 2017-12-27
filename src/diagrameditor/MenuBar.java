
package diagrameditor;

import com.mxgraph.analysis.mxAnalysisGraph;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import diagrameditor.EditorMenuActions.LoadAction;
import diagrameditor.EditorMenuActions.SaveAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author MPA
 */
public class MenuBar extends JMenuBar {

    public MenuBar(final DiagramEditor editor) {
        final mxGraphComponent graphComponent = editor.getGraphComponent();
        final mxGraph graph = graphComponent.getGraph();
        mxAnalysisGraph aGraph = new mxAnalysisGraph();

        JMenu menu = add(new JMenu("File"));

        JMenuItem saveOpt = new JMenuItem("Save", KeyEvent.VK_T);
        JMenuItem loadOpt = new JMenuItem("Load", KeyEvent.VK_T);

        menu.add(saveOpt);
        menu.add(loadOpt);
        
        saveOpt.addActionListener(new SaveAction(true, editor, graphComponent));
        loadOpt.addActionListener(new LoadAction(editor, graphComponent));
    }

}
