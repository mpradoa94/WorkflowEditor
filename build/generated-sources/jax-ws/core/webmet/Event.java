
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para event complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_EV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_EV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DE_EV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_EV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SC_EV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TS_EV_PL_EF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_EV_PL_EP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_EV_ACT_EF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_EV_ACT_EP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc" type="{http://Webmet.core/}preciosCHDOC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event", propOrder = {
    "idev",
    "tyev",
    "deev",
    "nmev",
    "scev",
    "tsevplef",
    "tsevplep",
    "tsevactef",
    "tsevactep",
    "xml",
    "doc"
})
public class Event {

    @XmlElement(name = "ID_EV")
    protected int idev;
    @XmlElement(name = "TY_EV")
    protected String tyev;
    @XmlElement(name = "DE_EV")
    protected String deev;
    @XmlElement(name = "NM_EV")
    protected String nmev;
    @XmlElement(name = "SC_EV")
    protected int scev;
    @XmlElement(name = "TS_EV_PL_EF")
    protected String tsevplef;
    @XmlElement(name = "TS_EV_PL_EP")
    protected String tsevplep;
    @XmlElement(name = "TS_EV_ACT_EF")
    protected String tsevactef;
    @XmlElement(name = "TS_EV_ACT_EP")
    protected String tsevactep;
    @XmlElement(name = "XML")
    protected String xml;
    protected PreciosCHDOC doc;

    /**
     * Obtiene el valor de la propiedad idev.
     * 
     */
    public int getIDEV() {
        return idev;
    }

    /**
     * Define el valor de la propiedad idev.
     * 
     */
    public void setIDEV(int value) {
        this.idev = value;
    }

    /**
     * Obtiene el valor de la propiedad tyev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYEV() {
        return tyev;
    }

    /**
     * Define el valor de la propiedad tyev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYEV(String value) {
        this.tyev = value;
    }

    /**
     * Obtiene el valor de la propiedad deev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEEV() {
        return deev;
    }

    /**
     * Define el valor de la propiedad deev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEEV(String value) {
        this.deev = value;
    }

    /**
     * Obtiene el valor de la propiedad nmev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMEV() {
        return nmev;
    }

    /**
     * Define el valor de la propiedad nmev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMEV(String value) {
        this.nmev = value;
    }

    /**
     * Obtiene el valor de la propiedad scev.
     * 
     */
    public int getSCEV() {
        return scev;
    }

    /**
     * Define el valor de la propiedad scev.
     * 
     */
    public void setSCEV(int value) {
        this.scev = value;
    }

    /**
     * Obtiene el valor de la propiedad tsevplef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSEVPLEF() {
        return tsevplef;
    }

    /**
     * Define el valor de la propiedad tsevplef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSEVPLEF(String value) {
        this.tsevplef = value;
    }

    /**
     * Obtiene el valor de la propiedad tsevplep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSEVPLEP() {
        return tsevplep;
    }

    /**
     * Define el valor de la propiedad tsevplep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSEVPLEP(String value) {
        this.tsevplep = value;
    }

    /**
     * Obtiene el valor de la propiedad tsevactef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSEVACTEF() {
        return tsevactef;
    }

    /**
     * Define el valor de la propiedad tsevactef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSEVACTEF(String value) {
        this.tsevactef = value;
    }

    /**
     * Obtiene el valor de la propiedad tsevactep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSEVACTEP() {
        return tsevactep;
    }

    /**
     * Define el valor de la propiedad tsevactep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSEVACTEP(String value) {
        this.tsevactep = value;
    }

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXML() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXML(String value) {
        this.xml = value;
    }

    /**
     * Obtiene el valor de la propiedad doc.
     * 
     * @return
     *     possible object is
     *     {@link PreciosCHDOC }
     *     
     */
    public PreciosCHDOC getDoc() {
        return doc;
    }

    /**
     * Define el valor de la propiedad doc.
     * 
     * @param value
     *     allowed object is
     *     {@link PreciosCHDOC }
     *     
     */
    public void setDoc(PreciosCHDOC value) {
        this.doc = value;
    }

}
