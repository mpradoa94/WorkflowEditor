/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import diagrameditor.workfloweditor.NodoRol;
import diagrameditor.workfloweditor.NodoCondicion;
import diagrameditor.workfloweditor.Nodo;
import diagrameditor.workfloweditor.NodoBase;
import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import diagrameditor.exceptions.ExcepcionNodo;
import diagrameditor.workfloweditor.NodoFlujo;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            NodoBase nodo = (NodoBase) cell.getValue();
            if (nodo instanceof NodoFlujo) {
                try {
                    XMLstring += nodo.generarXML();
                    break;
                } catch (ExcepcionNodo ex) {
                    Logger.getLogger(GeneradorXML.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (cell.getChildCount() > 0) {
                    generate(cell);
                }
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
                if (terminal instanceof NodoBase) {
                    NodoBase siguiente = (NodoBase) terminal;
                    if (siguiente instanceof NodoCondicion) {
                        XMLstring += "<siguiente>";
                        //XMLstring += "<numNodoSiguiente>" + ((NodoCondicion) siguiente).getNum();
                        XMLstring += "</numNodoSiguiente>";
                        XMLstring += "</siguiente>";
                    } else if (siguiente instanceof Nodo) {
                        XMLstring += "<siguiente>";
                        XMLstring += "<numNodoSiguiente>" + ((Nodo) siguiente).getNumNodo();
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
