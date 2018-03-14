package diagrameditor;

import com.mxgraph.io.mxCodec;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.swing.handler.mxGraphHandler;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;
import diagrameditor.exceptions.ExcepcionNodo;
import diagrameditor.workfloweditor.Nodo;
import diagrameditor.workfloweditor.NodoFlujo;
import diagrameditor.workfloweditor.NodoRol;
import diagrameditor.workfloweditor.TipoNodo;
import java.awt.Color;
import java.awt.Point;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;
import org.w3c.dom.Document;

/**
 *
 * @author MPA
 */
public class MiGraphComponent extends mxGraphComponent {

    public MiGraphComponent(mxGraph graph) {
        super(graph);
        setPageVisible(true);
        setToolTips(true);
        getConnectionHandler().setCreateTarget(true);
        this.load_stylesheet();
    }

    @Override
    public mxGraphHandler createGraphHandler() {
        return new mxGraphHandler(this) {
            @Override
            public boolean isRemoveCellsFromParent() {
                return false;
            }
        };
    }

    @Override
    public Object[] importCells(Object[] cells, double dx, double dy,
                                Object target, Point location) {
        if (graph.isValidDropTarget(target, cells)) {
            return super.importCells(cells, dx, dy, target,location);
        }
        List<String>errors = ((MiGraph)graph).getErrors();
        JOptionPane.showMessageDialog(null, errors.get(errors.size() - 1));
        return null;
    }

    private void load_stylesheet() {
        mxCodec codec = new mxCodec();
        String uri = (this.getClass().getResource("/resources/default_style.xml").toString());
        Document doc = parse_doc(uri);
        if (doc != null) {
            codec.decode(doc.getDocumentElement(), graph.getStylesheet());
        }

        getViewport().setOpaque(true);
        getViewport().setBackground(Color.WHITE);
    }

    private Document parse_doc(String uri) {
        try {
            return mxXmlUtils.getDocumentBuilder().parse(uri);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
