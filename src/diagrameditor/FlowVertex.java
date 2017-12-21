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
public class FlowVertex extends CustomVertex{
    
    private int idFlow;
    private String nameFlow;
    private int idVersion;
    
    public FlowVertex(String label, int idF, String nameF, int idV) {
        setLabel(label);
        setIdFlow(idF);
        setNameFlow(nameF);
        setIdVersion(idV);
    }
    
    public FlowVertex(String label) {
        this(label, 0, "", 0);
    }

    @Override
    public void setLabel(String value) {
        label = value;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public int getIdFlow() {
        return idFlow;
    }

    public void setIdFlow(int idFlow) {
        this.idFlow = idFlow;
    }

    public String getNameFlow() {
        return nameFlow;
    }

    public void setNameFlow(String nameFlow) {
        this.nameFlow = nameFlow;
    }

    public int getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }
    
}
