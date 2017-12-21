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
    
    private String label;
    private int idFlow;
    private String nameFlow;
    private int idVersion;
    
    public FlowVertex(String label, int idF, String nameF, int idV) {
        super(label);
        setIdFlow(idF);
        setNameFlow(nameF);
        setIdVersion(idV);
    }
    
    public FlowVertex(String label) {
        super(label);
        setIdFlow(0);
        setNameFlow("aaa");
        setIdVersion(0);
    }

    @Override
    public void setLabel(String value) {
        label = value;
    }

    @Override
    public String getLabel() {
        return label;
    }

    /**
     * @return the idFlow
     */
    public int getIdFlow() {
        return idFlow;
    }

    /**
     * @param idFlow the idFlow to set
     */
    public void setIdFlow(int idFlow) {
        this.idFlow = idFlow;
    }

    /**
     * @return the nameFlow
     */
    public String getNameFlow() {
        return nameFlow;
    }

    /**
     * @param nameFlow the nameFlow to set
     */
    public void setNameFlow(String nameFlow) {
        this.nameFlow = nameFlow;
    }

    /**
     * @return the idVersion
     */
    public int getIdVersion() {
        return idVersion;
    }

    /**
     * @param idVersion the idVersion to set
     */
    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }
    
}
