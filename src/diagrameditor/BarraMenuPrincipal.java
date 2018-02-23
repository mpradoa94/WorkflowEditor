package diagrameditor;

import com.mxgraph.analysis.mxAnalysisGraph;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import diagrameditor.AccionesEditor.AccionCargar;
import diagrameditor.AccionesEditor.AccionGuardar;
import diagrameditor.AccionesEditor.AccionNuevo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

/**
 *
 * @author MPA
 */
public class BarraMenuPrincipal extends JMenuBar {

    Color bgColor = new Color(212, 214, 216);

    public BarraMenuPrincipal(final EditorPanel editor) {
        

        JMenu menu = add(new JMenu("Archivo"));

        JMenu opcionNuevo = new JMenu("Nuevo");
        JMenuItem opcionNuevoWF = new JMenuItem("Workflow");
        JMenuItem opcionNuevoCuestionario = new JMenuItem("Cuestionario");
        JMenuItem opcionNuevoReporte = new JMenuItem("Reporte");
        
        JMenuItem opcionGuardar = new JMenuItem("Guardar",
                new ImageIcon(DiagramEditor.class.getResource("/images/save.gif")));
        JMenuItem opcionCargar = new JMenuItem("Cargar",
                new ImageIcon(DiagramEditor.class.getResource("/images/open.gif")));
        
        opcionNuevo.add(opcionNuevoWF);
        opcionNuevo.add(opcionNuevoCuestionario);
        opcionNuevo.add(opcionNuevoReporte);
        
        menu.add(opcionNuevo);
        menu.addSeparator();
        menu.add(opcionGuardar);
        menu.addSeparator();
        menu.add(opcionCargar);
        
        opcionNuevoWF.addActionListener(new AccionNuevo(TipoEditor.WorkFlow));
        opcionNuevoCuestionario.addActionListener(new AccionNuevo(TipoEditor.Cuestionarios));
        opcionNuevoReporte.addActionListener(new AccionNuevo(TipoEditor.Reportes));
        
        final mxGraphComponent graphComponent;
        if (editor instanceof WorkflowPanel){
             graphComponent = ((WorkflowPanel)editor).getGraphComponent();
             opcionGuardar.addActionListener(new AccionGuardar(true, (WorkflowPanel) editor, graphComponent));
            opcionCargar.addActionListener(new AccionCargar((WorkflowPanel) editor, graphComponent));
        }
        
    }

    public void setColor(Color color) {
        bgColor = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(bgColor);
        g2d.fillRect(0, 0, getWidth() - 1, getHeight() - 1);

    }

}
