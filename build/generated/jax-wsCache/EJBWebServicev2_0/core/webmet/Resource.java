
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RS_PRNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MODULO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_RS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_RS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_RS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_PRNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDEN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource", propOrder = {
    "idrs",
    "idrsprnt",
    "idmodulo",
    "nmrs",
    "nmrs2",
    "tyrs",
    "url",
    "nmprnt",
    "orden",
    "idopr"
})
public class Resource {

    @XmlElement(name = "ID_RS")
    protected int idrs;
    @XmlElement(name = "ID_RS_PRNT")
    protected int idrsprnt;
    @XmlElement(name = "ID_MODULO")
    protected int idmodulo;
    @XmlElement(name = "NM_RS")
    protected String nmrs;
    @XmlElement(name = "NM_RS2")
    protected String nmrs2;
    @XmlElement(name = "TY_RS")
    protected String tyrs;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "NM_PRNT")
    protected String nmprnt;
    @XmlElement(name = "ORDEN")
    protected int orden;
    @XmlElement(name = "ID_OPR")
    protected int idopr;

    /**
     * Obtiene el valor de la propiedad idrs.
     * 
     */
    public int getIDRS() {
        return idrs;
    }

    /**
     * Define el valor de la propiedad idrs.
     * 
     */
    public void setIDRS(int value) {
        this.idrs = value;
    }

    /**
     * Obtiene el valor de la propiedad idrsprnt.
     * 
     */
    public int getIDRSPRNT() {
        return idrsprnt;
    }

    /**
     * Define el valor de la propiedad idrsprnt.
     * 
     */
    public void setIDRSPRNT(int value) {
        this.idrsprnt = value;
    }

    /**
     * Obtiene el valor de la propiedad idmodulo.
     * 
     */
    public int getIDMODULO() {
        return idmodulo;
    }

    /**
     * Define el valor de la propiedad idmodulo.
     * 
     */
    public void setIDMODULO(int value) {
        this.idmodulo = value;
    }

    /**
     * Obtiene el valor de la propiedad nmrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMRS() {
        return nmrs;
    }

    /**
     * Define el valor de la propiedad nmrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMRS(String value) {
        this.nmrs = value;
    }

    /**
     * Obtiene el valor de la propiedad nmrs2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMRS2() {
        return nmrs2;
    }

    /**
     * Define el valor de la propiedad nmrs2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMRS2(String value) {
        this.nmrs2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tyrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYRS() {
        return tyrs;
    }

    /**
     * Define el valor de la propiedad tyrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYRS(String value) {
        this.tyrs = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad nmprnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMPRNT() {
        return nmprnt;
    }

    /**
     * Define el valor de la propiedad nmprnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMPRNT(String value) {
        this.nmprnt = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     */
    public int getORDEN() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     */
    public void setORDEN(int value) {
        this.orden = value;
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

}
