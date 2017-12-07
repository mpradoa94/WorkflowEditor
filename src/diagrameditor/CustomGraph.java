package diagrameditor;

import com.mxgraph.view.mxGraph;

/**
 *
 * @author MPA
 */
class CustomGraph extends mxGraph {

    protected Object edgeTemplate;

    public CustomGraph() {
        setAlternateEdgeStyle("edgeStyle=mxEdgeStyle.ElbowConnector;elbow=vertical");
    }

    public void setEdgeTemplate(Object template) {
        edgeTemplate = template;
    }

}
