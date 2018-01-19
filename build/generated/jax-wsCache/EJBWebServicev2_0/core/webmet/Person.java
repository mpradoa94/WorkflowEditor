
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para person complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PRTY_PRS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_PRTY_PRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FN_PRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LN_PRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_PRS_SFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_GND_PERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_PRS_BRT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAIN_PERSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="related" type="{http://Webmet.core/}personsRelated" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "idprtyprs",
    "nmprtyprs",
    "fnprs",
    "lnprs",
    "nmprssfx",
    "tygndpers",
    "dcprsbrt",
    "mainperson",
    "related"
})
public class Person {

    @XmlElement(name = "ID_PRTY_PRS")
    protected int idprtyprs;
    @XmlElement(name = "NM_PRTY_PRS")
    protected String nmprtyprs;
    @XmlElement(name = "FN_PRS")
    protected String fnprs;
    @XmlElement(name = "LN_PRS")
    protected String lnprs;
    @XmlElement(name = "NM_PRS_SFX")
    protected String nmprssfx;
    @XmlElement(name = "TY_GND_PERS")
    protected String tygndpers;
    @XmlElement(name = "DC_PRS_BRT")
    protected String dcprsbrt;
    @XmlElement(name = "MAIN_PERSON")
    protected String mainperson;
    @XmlElement(nillable = true)
    protected List<PersonsRelated> related;

    /**
     * Obtiene el valor de la propiedad idprtyprs.
     * 
     */
    public int getIDPRTYPRS() {
        return idprtyprs;
    }

    /**
     * Define el valor de la propiedad idprtyprs.
     * 
     */
    public void setIDPRTYPRS(int value) {
        this.idprtyprs = value;
    }

    /**
     * Obtiene el valor de la propiedad nmprtyprs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMPRTYPRS() {
        return nmprtyprs;
    }

    /**
     * Define el valor de la propiedad nmprtyprs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMPRTYPRS(String value) {
        this.nmprtyprs = value;
    }

    /**
     * Obtiene el valor de la propiedad fnprs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNPRS() {
        return fnprs;
    }

    /**
     * Define el valor de la propiedad fnprs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNPRS(String value) {
        this.fnprs = value;
    }

    /**
     * Obtiene el valor de la propiedad lnprs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNPRS() {
        return lnprs;
    }

    /**
     * Define el valor de la propiedad lnprs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNPRS(String value) {
        this.lnprs = value;
    }

    /**
     * Obtiene el valor de la propiedad nmprssfx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMPRSSFX() {
        return nmprssfx;
    }

    /**
     * Define el valor de la propiedad nmprssfx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMPRSSFX(String value) {
        this.nmprssfx = value;
    }

    /**
     * Obtiene el valor de la propiedad tygndpers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYGNDPERS() {
        return tygndpers;
    }

    /**
     * Define el valor de la propiedad tygndpers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYGNDPERS(String value) {
        this.tygndpers = value;
    }

    /**
     * Obtiene el valor de la propiedad dcprsbrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCPRSBRT() {
        return dcprsbrt;
    }

    /**
     * Define el valor de la propiedad dcprsbrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCPRSBRT(String value) {
        this.dcprsbrt = value;
    }

    /**
     * Obtiene el valor de la propiedad mainperson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAINPERSON() {
        return mainperson;
    }

    /**
     * Define el valor de la propiedad mainperson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAINPERSON(String value) {
        this.mainperson = value;
    }

    /**
     * Gets the value of the related property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the related property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonsRelated }
     * 
     * 
     */
    public List<PersonsRelated> getRelated() {
        if (related == null) {
            related = new ArrayList<PersonsRelated>();
        }
        return this.related;
    }

}
