/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        /* Creates the file menu
         menu = add(new JMenu(mxResources.get("file")));
         menu.add(editor.bind(mxResources.get("new"), new NewAction(), "/images/new.gif"));
         menu.add(editor.bind(mxResources.get("openFile"), new OpenAction(), "/images/open.gif"));
	
         menu.add(editor.bind(mxResources.get("save"), new SaveAction(false), "/images/save.gif"));
         menu.add(editor.bind(mxResources.get("saveAs"), new SaveAction(true), "/images/saveas.gif"));

         menu.addSeparator();*/
    }

}
