
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para employee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_EM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SC_EM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UN_NMB_SCL_SCTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINGERPRINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BAR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://Webmet.core/}scheduleEmployee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyrol" type="{http://Webmet.core/}partyRol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "idem",
    "idprty",
    "tyroprty",
    "scem",
    "unnmbsclscty",
    "fingerprint",
    "barcode",
    "schedule",
    "partyrol"
})
public class Employee {

    @XmlElement(name = "ID_EM")
    protected int idem;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "SC_EM")
    protected String scem;
    @XmlElement(name = "UN_NMB_SCL_SCTY")
    protected String unnmbsclscty;
    @XmlElement(name = "FINGERPRINT")
    protected String fingerprint;
    @XmlElement(name = "BAR_CODE")
    protected String barcode;
    @XmlElement(nillable = true)
    protected List<ScheduleEmployee> schedule;
    protected PartyRol partyrol;

    /**
     * Obtiene el valor de la propiedad idem.
     * 
     */
    public int getIDEM() {
        return idem;
    }

    /**
     * Define el valor de la propiedad idem.
     * 
     */
    public void setIDEM(int value) {
        this.idem = value;
    }

    /**
     * Obtiene el valor de la propiedad idprty.
     * 
     */
    public int getIDPRTY() {
        return idprty;
    }

    /**
     * Define el valor de la propiedad idprty.
     * 
     */
    public void setIDPRTY(int value) {
        this.idprty = value;
    }

    /**
     * Obtiene el valor de la propiedad tyroprty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYROPRTY() {
        return tyroprty;
    }

    /**
     * Define el valor de la propiedad tyroprty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYROPRTY(String value) {
        this.tyroprty = value;
    }

    /**
     * Obtiene el valor de la propiedad scem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCEM() {
        return scem;
    }

    /**
     * Define el valor de la propiedad scem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCEM(String value) {
        this.scem = value;
    }

    /**
     * Obtiene el valor de la propiedad unnmbsclscty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNNMBSCLSCTY() {
        return unnmbsclscty;
    }

    /**
     * Define el valor de la propiedad unnmbsclscty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNNMBSCLSCTY(String value) {
        this.unnmbsclscty = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerprint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINGERPRINT() {
        return fingerprint;
    }

    /**
     * Define el valor de la propiedad fingerprint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINGERPRINT(String value) {
        this.fingerprint = value;
    }

    /**
     * Obtiene el valor de la propiedad barcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARCODE() {
        return barcode;
    }

    /**
     * Define el valor de la propiedad barcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARCODE(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleEmployee }
     * 
     * 
     */
    public List<ScheduleEmployee> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<ScheduleEmployee>();
        }
        return this.schedule;
    }

    /**
     * Obtiene el valor de la propiedad partyrol.
     * 
     * @return
     *     possible object is
     *     {@link PartyRol }
     *     
     */
    public PartyRol getPartyrol() {
        return partyrol;
    }

    /**
     * Define el valor de la propiedad partyrol.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRol }
     *     
     */
    public void setPartyrol(PartyRol value) {
        this.partyrol = value;
    }

}
