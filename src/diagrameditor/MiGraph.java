package diagrameditor;

import diagrameditor.workfloweditor.NodoRol;
import diagrameditor.workfloweditor.NodoCondicion;
import diagrameditor.workfloweditor.Nodo;
import diagrameditor.workfloweditor.NodoBase;
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
class MiGraph extends mxGraph {

    protected Object edgeTemplate;

    public MiGraph() {
        setAlternateEdgeStyle("edgeStyle=mxEdgeStyle.ElbowConnector;elbow=vertical");
    }

    public void setEdgeTemplate(Object template) {
        edgeTemplate = template;
    }
    
    @Override
    public String convertValueToString(Object cell)
    {
            Object resultado = model.getValue(cell);
            if(resultado instanceof String){
                return (resultado != null) ? resultado.toString() : "";
            }
            else if(resultado instanceof NodoBase){
                NodoBase nodo = (NodoBase)resultado;
                return nodo.getEtiqueta();
            }
            else{
                return "";          
            }
    }
    
    public void setRoleToVertex(Object cell)
    {
        mxCell mxcell = (mxCell) cell;
        Object valor = mxcell.getValue();
        mxICell padre = mxcell.getParent();
        if (valor instanceof Nodo){
            Nodo nodo = (Nodo) valor; 
            if (padre.getValue() instanceof NodoRol){
                nodo.addRol((NodoRol) padre.getValue());
            }
        }
        else if (valor instanceof NodoCondicion){
            NodoCondicion nodo = (NodoCondicion) valor;         
            if (padre.getValue() instanceof NodoRol){
                //nodo.setRol((NodoRol) padre.getValue());
            }
        }
    }

    public String getToolTipForCell(Object cell) {
        String tip = "<html>";
        mxGeometry geo = getModel().getGeometry(cell);
        mxCellState estado = getView().getState(cell);
        NumberFormat formatoNum = NumberFormat.getInstance();
        mxCell mxcell = (mxCell) cell;
        
        if (getModel().isEdge(cell)) {
            tip += "points={";

            if (geo != null) {
                List<mxPoint> points = geo.getPoints();
                if (points != null) {
                    Iterator<mxPoint> it = points.iterator();
                    while (it.hasNext()) {
                        mxPoint point = it.next();
                        tip += "[x=" + formatoNum.format(point.getX())
                                + ",y=" + formatoNum.format(point.getY())
                                + "],";
                    }
                    tip = tip.substring(0, tip.length() - 1);
                }
            }

            tip += "}<br>";
            tip += "absPoints={";

            if (estado != null) {

                for (int i = 0; i < estado.getAbsolutePointCount(); i++) {
                    mxPoint point = estado.getAbsolutePoint(i);
                    tip += "[x=" + formatoNum.format(point.getX())
                            + ",y=" + formatoNum.format(point.getY())
                            + "],";
                }

                tip = tip.substring(0, tip.length() - 1);
            }

            tip += "}";
        } else {
            tip += "geo=[";

            if (geo != null) {
                tip += "x=" + formatoNum.format(geo.getX()) + ",y="
                        + formatoNum.format(geo.getY()) + ",width="
                        + formatoNum.format(geo.getWidth()) + ",height="
                        + formatoNum.format(geo.getHeight());
            }

            tip += "]<br>";
            tip += "state=[";

            if (estado != null) {
                tip += "x=" + formatoNum.format(estado.getX()) + ",y="
                        + formatoNum.format(estado.getY()) + ",width="
                        + formatoNum.format(estado.getWidth())
                        + ",height="
                        + formatoNum.format(estado.getHeight());
            }

            tip += "]";
        }

        mxPoint trans = getView().getTranslate();

        tip += "<br>scale=" + formatoNum.format(getView().getScale())
                + ", translate=[x=" + formatoNum.format(trans.getX())
                + ",y=" + formatoNum.format(trans.getY()) + "]";
        tip += "<br>childs= " + mxcell.getChildCount();
        tip += "</html>";

        return tip;
    }
    
    

}
