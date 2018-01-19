
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para customer2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customer2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CV_CT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customeraccount" type="{http://Webmet.core/}customerAccount" minOccurs="0"/>
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
@XmlType(name = "customer2", propOrder = {
    "idct",
    "cvct",
    "tyroprty",
    "idprty",
    "nmct",
    "customeraccount",
    "partyrol"
})
public class Customer2 {

    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "CV_CT")
    protected String cvct;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "NM_CT")
    protected String nmct;
    protected CustomerAccount customeraccount;
    protected PartyRol partyrol;

    /**
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
    }

    /**
     * Obtiene el valor de la propiedad cvct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVCT() {
        return cvct;
    }

    /**
     * Define el valor de la propiedad cvct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVCT(String value) {
        this.cvct = value;
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
     * Obtiene el valor de la propiedad nmct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMCT() {
        return nmct;
    }

    /**
     * Define el valor de la propiedad nmct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMCT(String value) {
        this.nmct = value;
    }

    /**
     * Obtiene el valor de la propiedad customeraccount.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount }
     *     
     */
    public CustomerAccount getCustomeraccount() {
        return customeraccount;
    }

    /**
     * Define el valor de la propiedad customeraccount.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount }
     *     
     */
    public void setCustomeraccount(CustomerAccount value) {
        this.customeraccount = value;
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
