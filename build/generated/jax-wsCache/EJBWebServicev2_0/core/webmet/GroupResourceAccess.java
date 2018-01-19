
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para groupResourceAccess complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="groupResourceAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_GP_WRK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PS_ACS_GP_RD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PS_ACS_GP_WR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://Webmet.core/}resource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupResourceAccess", propOrder = {
    "idgpwrk",
    "idrs",
    "psacsgprd",
    "psacsgpwr",
    "resource"
})
public class GroupResourceAccess {

    @XmlElement(name = "ID_GP_WRK")
    protected int idgpwrk;
    @XmlElement(name = "ID_RS")
    protected int idrs;
    @XmlElement(name = "PS_ACS_GP_RD")
    protected String psacsgprd;
    @XmlElement(name = "PS_ACS_GP_WR")
    protected String psacsgpwr;
    protected Resource resource;

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
     * Obtiene el valor de la propiedad resource.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * Define el valor de la propiedad resource.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResource(Resource value) {
        this.resource = value;
    }

}
