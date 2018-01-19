
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para telephone complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="telephone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PARTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PHONE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PH_TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CC_PH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TA_PH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TL_PH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PH_EXTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephonetype" type="{http://Webmet.core/}telephoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telephone", propOrder = {
    "idparty",
    "idphone",
    "idphtype",
    "ccph",
    "taph",
    "tlph",
    "phextn",
    "telephonetype"
})
public class Telephone {

    @XmlElement(name = "ID_PARTY")
    protected int idparty;
    @XmlElement(name = "ID_PHONE")
    protected int idphone;
    @XmlElement(name = "ID_PH_TYPE")
    protected int idphtype;
    @XmlElement(name = "CC_PH")
    protected String ccph;
    @XmlElement(name = "TA_PH")
    protected String taph;
    @XmlElement(name = "TL_PH")
    protected String tlph;
    @XmlElement(name = "PH_EXTN")
    protected String phextn;
    protected TelephoneType telephonetype;

    /**
     * Obtiene el valor de la propiedad idparty.
     * 
     */
    public int getIDPARTY() {
        return idparty;
    }

    /**
     * Define el valor de la propiedad idparty.
     * 
     */
    public void setIDPARTY(int value) {
        this.idparty = value;
    }

    /**
     * Obtiene el valor de la propiedad idphone.
     * 
     */
    public int getIDPHONE() {
        return idphone;
    }

    /**
     * Define el valor de la propiedad idphone.
     * 
     */
    public void setIDPHONE(int value) {
        this.idphone = value;
    }

    /**
     * Obtiene el valor de la propiedad idphtype.
     * 
     */
    public int getIDPHTYPE() {
        return idphtype;
    }

    /**
     * Define el valor de la propiedad idphtype.
     * 
     */
    public void setIDPHTYPE(int value) {
        this.idphtype = value;
    }

    /**
     * Obtiene el valor de la propiedad ccph.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCPH() {
        return ccph;
    }

    /**
     * Define el valor de la propiedad ccph.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCPH(String value) {
        this.ccph = value;
    }

    /**
     * Obtiene el valor de la propiedad taph.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAPH() {
        return taph;
    }

    /**
     * Define el valor de la propiedad taph.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAPH(String value) {
        this.taph = value;
    }

    /**
     * Obtiene el valor de la propiedad tlph.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLPH() {
        return tlph;
    }

    /**
     * Define el valor de la propiedad tlph.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLPH(String value) {
        this.tlph = value;
    }

    /**
     * Obtiene el valor de la propiedad phextn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHEXTN() {
        return phextn;
    }

    /**
     * Define el valor de la propiedad phextn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHEXTN(String value) {
        this.phextn = value;
    }

    /**
     * Obtiene el valor de la propiedad telephonetype.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneType }
     *     
     */
    public TelephoneType getTelephonetype() {
        return telephonetype;
    }

    /**
     * Define el valor de la propiedad telephonetype.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneType }
     *     
     */
    public void setTelephonetype(TelephoneType value) {
        this.telephonetype = value;
    }

}
