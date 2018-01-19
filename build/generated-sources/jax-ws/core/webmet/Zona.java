
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para zona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="zona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ZONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SUCURSAL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CVE_ZONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE_ZONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_ALTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_BAJA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zona", propOrder = {
    "idzona",
    "idsucursal",
    "cvezona",
    "nombrezona",
    "dcalta",
    "dcbaja",
    "activo"
})
public class Zona {

    @XmlElement(name = "ID_ZONA")
    protected int idzona;
    @XmlElement(name = "ID_SUCURSAL")
    protected int idsucursal;
    @XmlElement(name = "CVE_ZONA")
    protected String cvezona;
    @XmlElement(name = "NOMBRE_ZONA")
    protected String nombrezona;
    @XmlElement(name = "DC_ALTA")
    protected String dcalta;
    @XmlElement(name = "DC_BAJA")
    protected String dcbaja;
    @XmlElement(name = "ACTIVO")
    protected String activo;

    /**
     * Obtiene el valor de la propiedad idzona.
     * 
     */
    public int getIDZONA() {
        return idzona;
    }

    /**
     * Define el valor de la propiedad idzona.
     * 
     */
    public void setIDZONA(int value) {
        this.idzona = value;
    }

    /**
     * Obtiene el valor de la propiedad idsucursal.
     * 
     */
    public int getIDSUCURSAL() {
        return idsucursal;
    }

    /**
     * Define el valor de la propiedad idsucursal.
     * 
     */
    public void setIDSUCURSAL(int value) {
        this.idsucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad cvezona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVEZONA() {
        return cvezona;
    }

    /**
     * Define el valor de la propiedad cvezona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVEZONA(String value) {
        this.cvezona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrezona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREZONA() {
        return nombrezona;
    }

    /**
     * Define el valor de la propiedad nombrezona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREZONA(String value) {
        this.nombrezona = value;
    }

    /**
     * Obtiene el valor de la propiedad dcalta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCALTA() {
        return dcalta;
    }

    /**
     * Define el valor de la propiedad dcalta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCALTA(String value) {
        this.dcalta = value;
    }

    /**
     * Obtiene el valor de la propiedad dcbaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCBAJA() {
        return dcbaja;
    }

    /**
     * Define el valor de la propiedad dcbaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCBAJA(String value) {
        this.dcbaja = value;
    }

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVO() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVO(String value) {
        this.activo = value;
    }

}
