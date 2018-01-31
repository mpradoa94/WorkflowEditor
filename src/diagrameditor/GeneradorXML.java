/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

/**
 *
 * @author MPA
 */
public class GeneradorXML {

    private mxGraph graph;
    private String XMLstring;

    public GeneradorXML(mxGraphComponent component) {
        graph = component.getGraph();
        XMLstring = "";
    }

    public void generate() {
        generate(graph.getDefaultParent());

    }

    private void generate(Object parent) {
        Object[] vertices = graph.getChildVertices(parent);
        for (Object vertice : vertices) {
            mxCell cell = (mxCell) vertice;
            Nodo nodo = (Nodo) cell.getValue();
            if (nodo instanceof NodoRol == false) {
                XMLstring += nodo.generateXMLstringInicio();
                if (cell.getChildCount() > 0) {
                    generate(cell);
                }
                agregarReferenciaSiguiente(cell);
                XMLstring += nodo.generateXMLstringFin();
            } else {
                if (cell.getChildCount() > 0) {
                    generate(cell);
                }
            }

        }
    }

    private void agregarReferenciaSiguiente(mxCell cell) {
        int edgesNum = cell.getEdgeCount();
        int i;
        if (edgesNum > 0) {
            for (i = 0; i < edgesNum; i++) {
                Object terminal = ((mxCell) cell.getEdgeAt(i).getTerminal(true)).getValue();
                if (terminal instanceof Nodo) {
                    Nodo siguiente = (Nodo) terminal;
                    if (siguiente instanceof NodoCondicion) {
                        XMLstring += "<siguiente>";
                        XMLstring += "<numNodoSiguiente>" + ((NodoCondicion) siguiente).getNum();
                        XMLstring += "</numNodoSiguiente>";
                        XMLstring += "</siguiente>";
                    } else if (siguiente instanceof NodoProceso) {
                        XMLstring += "<siguiente>";
                        XMLstring += "<numNodoSiguiente>" + ((NodoProceso) siguiente).getNumNodo();
                        XMLstring += "</numNodoSiguiente>";
                        XMLstring += "</siguiente>";
                    }
                }
            }
        }
    }

    public String getXMLstring() {
        return XMLstring;
    }

}
