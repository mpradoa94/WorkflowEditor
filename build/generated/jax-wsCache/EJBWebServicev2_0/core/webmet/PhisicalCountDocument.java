
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para phisicalCountDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="phisicalCountDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TS_PID_CRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_PID_CLOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_PID_ADJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_PID_1ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_PID_2ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_PID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ES_PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pcli" type="{http://Webmet.core/}phisicalCountLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inventorylocation" type="{http://Webmet.core/}inventoryLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phisicalCountDocument", propOrder = {
    "idlcn",
    "idpid",
    "tspidcrd",
    "tspidclose",
    "tspidadj",
    "tspid1ACC",
    "tspid2ACC",
    "typid",
    "depid",
    "espid",
    "idopr",
    "pcli",
    "inventorylocation"
})
public class PhisicalCountDocument {

    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "ID_PID")
    protected int idpid;
    @XmlElement(name = "TS_PID_CRD")
    protected String tspidcrd;
    @XmlElement(name = "TS_PID_CLOSE")
    protected String tspidclose;
    @XmlElement(name = "TS_PID_ADJ")
    protected String tspidadj;
    @XmlElement(name = "TS_PID_1ACC")
    protected String tspid1ACC;
    @XmlElement(name = "TS_PID_2ACC")
    protected String tspid2ACC;
    @XmlElement(name = "TY_PID")
    protected int typid;
    @XmlElement(name = "DE_PID")
    protected String depid;
    @XmlElement(name = "ES_PID")
    protected String espid;
    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(nillable = true)
    protected List<PhisicalCountLineItem> pcli;
    protected InventoryLocation inventorylocation;

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
     * Obtiene el valor de la propiedad idpid.
     * 
     */
    public int getIDPID() {
        return idpid;
    }

    /**
     * Define el valor de la propiedad idpid.
     * 
     */
    public void setIDPID(int value) {
        this.idpid = value;
    }

    /**
     * Obtiene el valor de la propiedad tspidcrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPIDCRD() {
        return tspidcrd;
    }

    /**
     * Define el valor de la propiedad tspidcrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPIDCRD(String value) {
        this.tspidcrd = value;
    }

    /**
     * Obtiene el valor de la propiedad tspidclose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPIDCLOSE() {
        return tspidclose;
    }

    /**
     * Define el valor de la propiedad tspidclose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPIDCLOSE(String value) {
        this.tspidclose = value;
    }

    /**
     * Obtiene el valor de la propiedad tspidadj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPIDADJ() {
        return tspidadj;
    }

    /**
     * Define el valor de la propiedad tspidadj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPIDADJ(String value) {
        this.tspidadj = value;
    }

    /**
     * Obtiene el valor de la propiedad tspid1ACC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPID1ACC() {
        return tspid1ACC;
    }

    /**
     * Define el valor de la propiedad tspid1ACC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPID1ACC(String value) {
        this.tspid1ACC = value;
    }

    /**
     * Obtiene el valor de la propiedad tspid2ACC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPID2ACC() {
        return tspid2ACC;
    }

    /**
     * Define el valor de la propiedad tspid2ACC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPID2ACC(String value) {
        this.tspid2ACC = value;
    }

    /**
     * Obtiene el valor de la propiedad typid.
     * 
     */
    public int getTYPID() {
        return typid;
    }

    /**
     * Define el valor de la propiedad typid.
     * 
     */
    public void setTYPID(int value) {
        this.typid = value;
    }

    /**
     * Obtiene el valor de la propiedad depid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPID() {
        return depid;
    }

    /**
     * Define el valor de la propiedad depid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPID(String value) {
        this.depid = value;
    }

    /**
     * Obtiene el valor de la propiedad espid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESPID() {
        return espid;
    }

    /**
     * Define el valor de la propiedad espid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESPID(String value) {
        this.espid = value;
    }

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

    /**
     * Gets the value of the pcli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pcli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPcli().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhisicalCountLineItem }
     * 
     * 
     */
    public List<PhisicalCountLineItem> getPcli() {
        if (pcli == null) {
            pcli = new ArrayList<PhisicalCountLineItem>();
        }
        return this.pcli;
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

}
