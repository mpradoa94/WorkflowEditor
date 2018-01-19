
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usersRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usersRol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_proceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cve_rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_opr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_opr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usersRol", propOrder = {
    "idProceso",
    "idVersion",
    "cveRol",
    "idOpr",
    "nmOpr"
})
public class UsersRol {

    @XmlElement(name = "id_proceso")
    protected int idProceso;
    @XmlElement(name = "id_version")
    protected int idVersion;
    @XmlElement(name = "cve_rol")
    protected String cveRol;
    @XmlElement(name = "id_opr")
    protected int idOpr;
    @XmlElement(name = "nm_opr")
    protected String nmOpr;

    /**
     * Obtiene el valor de la propiedad idProceso.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Define el valor de la propiedad idProceso.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idVersion.
     * 
     */
    public int getIdVersion() {
        return idVersion;
    }

    /**
     * Define el valor de la propiedad idVersion.
     * 
     */
    public void setIdVersion(int value) {
        this.idVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad cveRol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveRol() {
        return cveRol;
    }

    /**
     * Define el valor de la propiedad cveRol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveRol(String value) {
        this.cveRol = value;
    }

    /**
     * Obtiene el valor de la propiedad idOpr.
     * 
     */
    public int getIdOpr() {
        return idOpr;
    }

    /**
     * Define el valor de la propiedad idOpr.
     * 
     */
    public void setIdOpr(int value) {
        this.idOpr = value;
    }

    /**
     * Obtiene el valor de la propiedad nmOpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmOpr() {
        return nmOpr;
    }

    /**
     * Define el valor de la propiedad nmOpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmOpr(String value) {
        this.nmOpr = value;
    }

}
