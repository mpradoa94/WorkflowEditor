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
    
    public GeneradorXML(mxGraphComponent component){
        graph = component.getGraph();
        XMLstring = "";
    }
    
    public void generate(){
        generate(graph.getDefaultParent());
        
    }
    
    private void generate(Object parent){
        Object[] vertices = graph.getChildVertices(parent);       
        for (Object vertice: vertices){
            mxCell cell = (mxCell) vertice;
            Nodo nodo = (Nodo) cell.getValue();
            if (nodo instanceof NodoRol == false){
                XMLstring += nodo.generateXMLstringInicio();
                if (cell.getChildCount() > 0) 
                    generate(cell);
                XMLstring += nodo.generateXMLstringFin();
            }
            else {
                if (cell.getChildCount() > 0) 
                    generate(cell);
            }
            
        }
    }
    
    public String getXMLstring(){
        return XMLstring;
    }
    
}
