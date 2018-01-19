
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para permiso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="permiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_GP_WRK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RS_PRNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_RS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PS_ACS_GP_RD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PS_ACS_GP_WR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_MODULO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ORDEN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permiso", propOrder = {
    "idgpwrk",
    "idrs",
    "idrsprnt",
    "nmrs",
    "psacsgprd",
    "psacsgpwr",
    "url",
    "idmodulo",
    "orden"
})
public class Permiso {

    @XmlElement(name = "ID_GP_WRK")
    protected int idgpwrk;
    @XmlElement(name = "ID_RS")
    protected int idrs;
    @XmlElement(name = "ID_RS_PRNT")
    protected int idrsprnt;
    @XmlElement(name = "NM_RS")
    protected String nmrs;
    @XmlElement(name = "PS_ACS_GP_RD")
    protected String psacsgprd;
    @XmlElement(name = "PS_ACS_GP_WR")
    protected String psacsgpwr;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "ID_MODULO")
    protected int idmodulo;
    @XmlElement(name = "ORDEN")
    protected int orden;

    /**
     * Obtiene el valor de la propiedad idgpwrk.
     * 
     */
    public int getIDGPWRK() {
        return idgpwrk;
    }

    /**
     * Define el valor de la propiedad idgpwrk.
     * 
     */
    public void setIDGPWRK(int value) {
        this.idgpwrk = value;
    }

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
     * Obtiene el valor de la propiedad psacsgprd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSACSGPRD() {
        return psacsgprd;
    }

    /**
     * Define el valor de la propiedad psacsgprd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSACSGPRD(String value) {
        this.psacsgprd = value;
    }

    /**
     * Obtiene el valor de la propiedad psacsgpwr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSACSGPWR() {
        return psacsgpwr;
    }

    /**
     * Define el valor de la propiedad psacsgpwr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSACSGPWR(String value) {
        this.psacsgpwr = value;
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

}
