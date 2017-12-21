/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import java.io.Serializable;

/**
 *
 * @author MPA
 */
public abstract class CustomVertex implements Serializable{
    
    public CustomVertex(String label) {
        setLabel(label);
    }
    
    public abstract void setLabel(String value);
    public abstract String getLabel();
    
}
