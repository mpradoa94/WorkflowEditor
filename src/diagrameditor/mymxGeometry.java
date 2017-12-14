/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import com.mxgraph.model.mxGeometry;

/**
 *
 * @author MPA
 */
public class mymxGeometry extends mxGeometry{
    
    private String name;
    
    public mymxGeometry(double x, double y, double width, double height, String name)
    {
        super(x, y, width, height);
        setName(name);
    }

    private void setName(String value) 
    {
        name = value;
    }
    
    public String getName()
    {
        return name;
    }
}
