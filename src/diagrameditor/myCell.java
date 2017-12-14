/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;

/**
 *
 * @author MPA
 */
public class myCell extends mxCell{
    
    private mymxGeometry geometryCell;
    
    public myCell(Object value, mymxGeometry geometry, String style)
    {
        super(value, geometry, style);
        setMyGeometry(geometry);
    }
    
    private void setMyGeometry(mymxGeometry geometry)
    {
        this.geometryCell = geometry;
    }
    
    public mymxGeometry getMyGeometry()
    {
        return geometryCell;
    }
    
}
