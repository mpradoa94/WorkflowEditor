package diagrameditor;

import com.mxgraph.io.mxCodec;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;
import java.awt.Color;
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

    private void load_stylesheet() {
        mxCodec codec = new mxCodec();
        String uri = (this.getClass().getResource("/resources/default_style.xml").toString());
        Document doc = parse_doc(uri);
        if (doc != null) {
            codec.decode(doc.getDocumentElement(), graph.getStylesheet());
        }
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
