
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para workstation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="workstation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_EQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SERIE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QU_TL_WS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FL_MOD_TRG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_KEYBOARD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BTNSET" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_POS_ED" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inventorylocation" type="{http://Webmet.core/}inventoryLocation" minOccurs="0"/>
 *         &lt;element name="cajones" type="{http://Webmet.core/}till" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workstation", propOrder = {
    "idstrrt",
    "idws",
    "idlcn",
    "ideq",
    "serie",
    "qutlws",
    "flmodtrg",
    "flkeyboard",
    "idbtnset",
    "idposed",
    "inventorylocation",
    "cajones"
})
public class Workstation {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_WS")
    protected int idws;
    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "ID_EQ")
    protected int ideq;
    @XmlElement(name = "SERIE")
    protected String serie;
    @XmlElement(name = "QU_TL_WS")
    protected double qutlws;
    @XmlElement(name = "FL_MOD_TRG")
    protected int flmodtrg;
    @XmlElement(name = "FL_KEYBOARD")
    protected int flkeyboard;
    @XmlElement(name = "ID_BTNSET")
    protected int idbtnset;
    @XmlElement(name = "ID_POS_ED")
    protected int idposed;
    protected InventoryLocation inventorylocation;
    @XmlElement(nillable = true)
    protected List<Till> cajones;

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad idws.
     * 
     */
    public int getIDWS() {
        return idws;
    }

    /**
     * Define el valor de la propiedad idws.
     * 
     */
    public void setIDWS(int value) {
        this.idws = value;
    }

    /**
     * Obtiene el valor de la propiedad idlcn.
     * 
     */
    public int getIDLCN() {
        return idlcn;
    }

    /**
     * Define el valor de la propiedad idlcn.
     * 
     */
    public void setIDLCN(int value) {
        this.idlcn = value;
    }

    /**
     * Obtiene el valor de la propiedad ideq.
     * 
     */
    public int getIDEQ() {
        return ideq;
    }

    /**
     * Define el valor de la propiedad ideq.
     * 
     */
    public void setIDEQ(int value) {
        this.ideq = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIE() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIE(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad qutlws.
     * 
     */
    public double getQUTLWS() {
        return qutlws;
    }

    /**
     * Define el valor de la propiedad qutlws.
     * 
     */
    public void setQUTLWS(double value) {
        this.qutlws = value;
    }

    /**
     * Obtiene el valor de la propiedad flmodtrg.
     * 
     */
    public int getFLMODTRG() {
        return flmodtrg;
    }

    /**
     * Define el valor de la propiedad flmodtrg.
     * 
     */
    public void setFLMODTRG(int value) {
        this.flmodtrg = value;
    }

    /**
     * Obtiene el valor de la propiedad flkeyboard.
     * 
     */
    public int getFLKEYBOARD() {
        return flkeyboard;
    }

    /**
     * Define el valor de la propiedad flkeyboard.
     * 
     */
    public void setFLKEYBOARD(int value) {
        this.flkeyboard = value;
    }

    /**
     * Obtiene el valor de la propiedad idbtnset.
     * 
     */
    public int getIDBTNSET() {
        return idbtnset;
    }

    /**
     * Define el valor de la propiedad idbtnset.
     * 
     */
    public void setIDBTNSET(int value) {
        this.idbtnset = value;
    }

    /**
     * Obtiene el valor de la propiedad idposed.
     * 
     */
    public int getIDPOSED() {
        return idposed;
    }

    /**
     * Define el valor de la propiedad idposed.
     * 
     */
    public void setIDPOSED(int value) {
        this.idposed = value;
    }

    /**
     * Obtiene el valor de la propiedad inventorylocation.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocation }
     *     
     */
    public InventoryLocation getInventorylocation() {
        return inventorylocation;
    }

    /**
     * Define el valor de la propiedad inventorylocation.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocation }
     *     
     */
    public void setInventorylocation(InventoryLocation value) {
        this.inventorylocation = value;
    }

    /**
     * Gets the value of the cajones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cajones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCajones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Till }
     * 
     * 
     */
    public List<Till> getCajones() {
        if (cajones == null) {
            cajones = new ArrayList<Till>();
        }
        return this.cajones;
    }

}
