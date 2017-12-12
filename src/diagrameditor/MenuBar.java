
package diagrameditor;

import com.mxgraph.analysis.mxAnalysisGraph;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import java.awt.event.ActionEvent;
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

        JMenuItem menuItem = new JMenuItem("A text-only menu item",
                KeyEvent.VK_T);

        menu.add(menuItem);
        
    }

}
