
package diagrameditor;

import com.mxgraph.analysis.mxAnalysisGraph;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import diagrameditor.AccionesMenuPrincipal.AccionCargar;
import diagrameditor.AccionesMenuPrincipal.AccionGuardar;
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
public class BarraMenuPrincipal extends JMenuBar {

    public BarraMenuPrincipal(final DiagramPanel editor) {
        final mxGraphComponent graphComponent = editor.getGraphComponent();
        
        JMenu menu = add(new JMenu("Archivo"));

        JMenuItem OpcionGuardar = new JMenuItem("Guardar", KeyEvent.VK_T);
        JMenuItem opcionCargar = new JMenuItem("Cargar", KeyEvent.VK_T);

        menu.add(OpcionGuardar);
        menu.add(opcionCargar);
        
        OpcionGuardar.addActionListener(new AccionGuardar(true, editor, graphComponent));
        opcionCargar.addActionListener(new AccionCargar(editor, graphComponent));       
    }

}
