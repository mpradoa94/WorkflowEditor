/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

/**
 *
 * @author MPA
 */
public class RoleVertex extends CustomVertex{
    
    private String key;
    private String name;
    
    public RoleVertex(String label, String key, String name) {
        this.label = label;
        this.key = key;
        this.name = name;
    }

    @Override
    public void setLabel(String value) {
        label = value;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
