
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolesProcesoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolesProcesoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PROCESO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CVE_ROL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ROL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolesProcesoDTO", propOrder = {
    "idproceso",
    "idversion",
    "cverol",
    "nmrol"
})
public class RolesProcesoDTO {

    @XmlElement(name = "ID_PROCESO")
    protected int idproceso;
    @XmlElement(name = "ID_VERSION")
    protected int idversion;
    @XmlElement(name = "CVE_ROL")
    protected String cverol;
    @XmlElement(name = "NM_ROL")
    protected String nmrol;

    /**
     * Obtiene el valor de la propiedad idproceso.
     * 
     */
    public int getIDPROCESO() {
        return idproceso;
    }

    /**
     * Define el valor de la propiedad idproceso.
     * 
     */
    public void setIDPROCESO(int value) {
        this.idproceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idversion.
     * 
     */
    public int getIDVERSION() {
        return idversion;
    }

    /**
     * Define el valor de la propiedad idversion.
     * 
     */
    public void setIDVERSION(int value) {
        this.idversion = value;
    }

    /**
     * Obtiene el valor de la propiedad cverol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVEROL() {
        return cverol;
    }

    /**
     * Define el valor de la propiedad cverol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVEROL(String value) {
        this.cverol = value;
    }

    /**
     * Obtiene el valor de la propiedad nmrol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMROL() {
        return nmrol;
    }

    /**
     * Define el valor de la propiedad nmrol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMROL(String value) {
        this.nmrol = value;
    }

}
