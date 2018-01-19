
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lectores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lectores">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LECTOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SUCURSAL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENTIDO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PUERTA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UBICACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVE_LECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lectores", propOrder = {
    "idlector",
    "idsucursal",
    "ip",
    "sentido",
    "idpuerta",
    "ubicacion",
    "cvelector"
})
public class Lectores {

    @XmlElement(name = "ID_LECTOR")
    protected int idlector;
    @XmlElement(name = "ID_SUCURSAL")
    protected int idsucursal;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "SENTIDO")
    protected String sentido;
    @XmlElement(name = "ID_PUERTA")
    protected int idpuerta;
    @XmlElement(name = "UBICACION")
    protected String ubicacion;
    @XmlElement(name = "CVE_LECTOR")
    protected String cvelector;

    /**
     * Obtiene el valor de la propiedad idlector.
     * 
     */
    public int getIDLECTOR() {
        return idlector;
    }

    /**
     * Define el valor de la propiedad idlector.
     * 
     */
    public void setIDLECTOR(int value) {
        this.idlector = value;
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
     * Obtiene el valor de la propiedad ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

    /**
     * Obtiene el valor de la propiedad sentido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENTIDO() {
        return sentido;
    }

    /**
     * Define el valor de la propiedad sentido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENTIDO(String value) {
        this.sentido = value;
    }

    /**
     * Obtiene el valor de la propiedad idpuerta.
     * 
     */
    public int getIDPUERTA() {
        return idpuerta;
    }

    /**
     * Define el valor de la propiedad idpuerta.
     * 
     */
    public void setIDPUERTA(int value) {
        this.idpuerta = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBICACION() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBICACION(String value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cvelector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVELECTOR() {
        return cvelector;
    }

    /**
     * Define el valor de la propiedad cvelector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVELECTOR(String value) {
        this.cvelector = value;
    }

}
