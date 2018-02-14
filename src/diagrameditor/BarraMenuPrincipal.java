package diagrameditor;

import com.mxgraph.analysis.mxAnalysisGraph;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;
import diagrameditor.AccionesEditor.AccionCargar;
import diagrameditor.AccionesEditor.AccionGuardar;
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

    public BarraMenuPrincipal(final DiagramPanel editor) {
        final mxGraphComponent graphComponent = editor.getGraphComponent();

        JMenu menu = add(new JMenu("Archivo"));

        JMenuItem OpcionGuardar = new JMenuItem("Guardar",
                new ImageIcon(DiagramEditor.class.getResource("/images/save.gif")));
        JMenuItem opcionCargar = new JMenuItem("Cargar",
                new ImageIcon(DiagramEditor.class.getResource("/images/open.gif")));

        menu.add(OpcionGuardar);
        menu.addSeparator();
        menu.add(opcionCargar);

        OpcionGuardar.addActionListener(new AccionGuardar(true, editor, graphComponent));
        opcionCargar.addActionListener(new AccionCargar(editor, graphComponent));
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
