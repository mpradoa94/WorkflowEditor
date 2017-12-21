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
public class NodeVertex extends CustomVertex {
    
    
    private String label;
    private int id;
    private String name;
    private int timeNode;
    private int timeNodeMax;
    private NodeType type;
    
    public NodeVertex(String label, String name, NodeType type, int timeNode, int timeNodeMax) {
        this.label = label;
        this.name = name;
        this.type = type;
        this.timeNode = timeNode;
        this.timeNodeMax = timeNodeMax;
    }
    
    public NodeVertex(String label, String name, NodeType type) {
        this(label, name, type, 0, 0);
    }

    @Override
    public void setLabel(String value) {
        label = value;
    }

    @Override
    public String getLabel() {
        return label;
    }
    
}
