package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.util.mxGraphTransferable;
import com.mxgraph.swing.util.mxSwingConstants;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

/**
 *
 * @author MPA
 */
public class EditorOptionsMenu extends JPanel {

    private mxEventSource eventSource = new mxEventSource(this);
    private JLabel selectedLabel = null;
    private String name;

    public EditorOptionsMenu() {
        //setBackground(new Color(149, 230, 190));
        setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
        showDragAndDropIcon();
    }

    private void showDragAndDropIcon() {
        setTransferHandler(new TransferHandler() {
            public boolean canImport(JComponent comp, DataFlavor[] flavors) {
                return true;
            }
        });
    }

    public void addListener(String eventName, mxEventSource.mxIEventListener listener) {
        eventSource.addListener(eventName, listener);
    }

    public void addOption(final String nameP, ImageIcon icon, String style,
            int width, int height, Object value) {
        mxCell cell = new mxCell(value, new mxGeometry(0, 0, width, height), style);
        cell.setVertex(true);
        name = nameP;
        addOption(icon, cell);
    }
    
    public void addEdgeOption(final String nameP, ImageIcon icon,
        String style, int width, int height, Object value) {
        mxGeometry geometry = new mxGeometry(0, 0, width, height);
        geometry.setTerminalPoint(new mxPoint(0, height), true);
        geometry.setTerminalPoint(new mxPoint(width, 0), false);
        geometry.setRelative(true);

        mxCell cell = new mxCell(value, geometry, style);
        cell.setEdge(true);
        name = nameP;
        addOption(icon, cell);
    }

    public void addOption(ImageIcon icon, mxCell cell) {
        icon = scaleIconImage(icon);
        JLabel label = new JLabel(icon);
        setLabel(cell, label);
        add(label);
    }

    private ImageIcon scaleIconImage(ImageIcon icon) {
        if (icon != null) {
            if (icon.getIconWidth() > 32 || icon.getIconHeight() > 32) {
                icon = new ImageIcon(icon.getImage().getScaledInstance(32, 32, 0));
            }
        }
        return icon;
    }

    private void setLabel(mxCell cell, JLabel label) {
        mxRectangle bounds = (mxGeometry) cell.getGeometry().clone();
        final mxGraphTransferable t = new mxGraphTransferable(
                new Object[]{cell}, bounds);
        setLabelFormat(label);
        setMouseListener(label, t);
        InstallDragNodeHandler(label, t);
    }

    private void setLabelFormat(JLabel label) {
        label.setPreferredSize(new Dimension(50, 50));
        label.setBackground(EditorOptionsMenu.this.getBackground().brighter());
        label.setFont(new Font(label.getFont().getFamily(), 0, 10));
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIconTextGap(0);
        label.setToolTipText(name);
        label.setText(name);
    }

    private void setMouseListener(JLabel label, mxGraphTransferable t) {

        label.addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                setSelectionEntry(label, t);
            }

            public void mouseClicked(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }
        });
    }

    private void InstallDragNodeHandler(JLabel label, mxGraphTransferable t) {
        DragGestureListener dragGestureListener = (DragGestureEvent e) -> {
            e.startDrag(null, mxSwingConstants.EMPTY_IMAGE, new Point(), t, null);
        };
        DragSource dragSource = new DragSource();
        dragSource.createDefaultDragGestureRecognizer(label, DnDConstants.ACTION_COPY, dragGestureListener);
    }

    public void setSelectionEntry(JLabel label, mxGraphTransferable t) {
        JLabel previous = selectedLabel;
        selectedLabel = label;

        if (previous != null) {
            previous.setBorder(null);
            previous.setOpaque(false);
        }

        if (selectedLabel != null) {
            //selectedLabel.setBorder(ShadowBorder.getSharedInstance());
            selectedLabel.setOpaque(true);
        }

        eventSource.fireEvent(new mxEventObject(mxEvent.SELECT, "entry",
                selectedLabel, "transferable", t, "previous", previous));
    }

    public void setPreferredWidth(int width) {
        int cols = Math.max(1, width / 55);
        setPreferredSize(new Dimension(width,
                (getComponentCount() * 55 / cols) + 30));
        revalidate();
    }

}
