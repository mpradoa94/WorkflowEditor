package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxICell;
import com.mxgraph.util.mxPoint;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

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
    
    @Override
    public String convertValueToString(Object cell)
    {
            Object result = model.getValue(cell);
            if(result instanceof String){
                return (result != null) ? result.toString() : "";
            }
            else if(result instanceof CustomVertex){
                CustomVertex custom = (CustomVertex)result;
                return custom.getLabel();
            }
            else{
                return "";          
            }
    }

    public String getToolTipForCell(Object cell) {
        String tip = "<html>";
        mxGeometry geo = getModel().getGeometry(cell);
        mxCellState state = getView().getState(cell);
        NumberFormat numberFormat = NumberFormat.getInstance();
        mxCell mxcell = (mxCell) cell;
        
        //TODO: move to more logical location
        if (mxcell.getValue() instanceof NodeVertex){
            NodeVertex node = (NodeVertex) mxcell.getValue();
            mxICell parent = mxcell.getParent();
            if (parent.getValue() instanceof RoleVertex){
                node.setRole((RoleVertex) parent.getValue());
                this.getView().validate();
            }
        }
        
        if (getModel().isEdge(cell)) {
            tip += "points={";

            if (geo != null) {
                List<mxPoint> points = geo.getPoints();
                if (points != null) {
                    Iterator<mxPoint> it = points.iterator();
                    while (it.hasNext()) {
                        mxPoint point = it.next();
                        tip += "[x=" + numberFormat.format(point.getX())
                                + ",y=" + numberFormat.format(point.getY())
                                + "],";
                    }
                    tip = tip.substring(0, tip.length() - 1);
                }
            }

            tip += "}<br>";
            tip += "absPoints={";

            if (state != null) {

                for (int i = 0; i < state.getAbsolutePointCount(); i++) {
                    mxPoint point = state.getAbsolutePoint(i);
                    tip += "[x=" + numberFormat.format(point.getX())
                            + ",y=" + numberFormat.format(point.getY())
                            + "],";
                }

                tip = tip.substring(0, tip.length() - 1);
            }

            tip += "}";
        } else {
            tip += "geo=[";

            if (geo != null) {
                tip += "x=" + numberFormat.format(geo.getX()) + ",y="
                        + numberFormat.format(geo.getY()) + ",width="
                        + numberFormat.format(geo.getWidth()) + ",height="
                        + numberFormat.format(geo.getHeight());
            }

            tip += "]<br>";
            tip += "state=[";

            if (state != null) {
                tip += "x=" + numberFormat.format(state.getX()) + ",y="
                        + numberFormat.format(state.getY()) + ",width="
                        + numberFormat.format(state.getWidth())
                        + ",height="
                        + numberFormat.format(state.getHeight());
            }

            tip += "]";
        }

        mxPoint trans = getView().getTranslate();

        tip += "<br>scale=" + numberFormat.format(getView().getScale())
                + ", translate=[x=" + numberFormat.format(trans.getX())
                + ",y=" + numberFormat.format(trans.getY()) + "]";
        tip += "<br>childs= " + mxcell.getChildCount();
        tip += "<br>lalal= " + mxcell.getAttribute("name", "");
        tip += "</html>";

        return tip;
    }
    
    

}
