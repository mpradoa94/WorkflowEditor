
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemCollection complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_PRNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_ITM_CLN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QU_ITM_PR_ASMB" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PE_BLD" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemCollection", propOrder = {
    "iditmprnt",
    "iditm",
    "aiitmcln",
    "quitmprasmb",
    "pebld"
})
public class ItemCollection {

    @XmlElement(name = "ID_ITM_PRNT")
    protected int iditmprnt;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "AI_ITM_CLN")
    protected int aiitmcln;
    @XmlElement(name = "QU_ITM_PR_ASMB")
    protected double quitmprasmb;
    @XmlElement(name = "PE_BLD")
    protected double pebld;

    /**
     * Obtiene el valor de la propiedad iditmprnt.
     * 
     */
    public int getIDITMPRNT() {
        return iditmprnt;
    }

    /**
     * Define el valor de la propiedad iditmprnt.
     * 
     */
    public void setIDITMPRNT(int value) {
        this.iditmprnt = value;
    }

    /**
     * Obtiene el valor de la propiedad iditm.
     * 
     */
    public int getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     */
    public void setIDITM(int value) {
        this.iditm = value;
    }

    /**
     * Obtiene el valor de la propiedad aiitmcln.
     * 
     */
    public int getAIITMCLN() {
        return aiitmcln;
    }

    /**
     * Define el valor de la propiedad aiitmcln.
     * 
     */
    public void setAIITMCLN(int value) {
        this.aiitmcln = value;
    }

    /**
     * Obtiene el valor de la propiedad quitmprasmb.
     * 
     */
    public double getQUITMPRASMB() {
        return quitmprasmb;
    }

    /**
     * Define el valor de la propiedad quitmprasmb.
     * 
     */
    public void setQUITMPRASMB(double value) {
        this.quitmprasmb = value;
    }

    /**
     * Obtiene el valor de la propiedad pebld.
     * 
     */
    public double getPEBLD() {
        return pebld;
    }

    /**
     * Define el valor de la propiedad pebld.
     * 
     */
    public void setPEBLD(double value) {
        this.pebld = value;
    }

}
