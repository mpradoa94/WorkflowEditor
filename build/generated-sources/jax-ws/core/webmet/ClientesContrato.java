
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clientesContrato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clientesContrato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DET_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ROL_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMERGENCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FACTURACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NMT_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientesContrato", propOrder = {
    "idversion",
    "idct",
    "iddetcontrato",
    "rolcontrato",
    "emergencia",
    "facturacion",
    "nmtc",
    "inscripcion"
})
public class ClientesContrato {

    @XmlElement(name = "ID_VERSION")
    protected int idversion;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "ID_DET_CONTRATO")
    protected int iddetcontrato;
    @XmlElement(name = "ROL_CONTRATO")
    protected String rolcontrato;
    @XmlElement(name = "EMERGENCIA")
    protected String emergencia;
    @XmlElement(name = "FACTURACION")
    protected String facturacion;
    @XmlElement(name = "NMT_C")
    protected String nmtc;
    @XmlElement(name = "INSCRIPCION")
    protected String inscripcion;

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
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
    }

    /**
     * Obtiene el valor de la propiedad iddetcontrato.
     * 
     */
    public int getIDDETCONTRATO() {
        return iddetcontrato;
    }

    /**
     * Define el valor de la propiedad iddetcontrato.
     * 
     */
    public void setIDDETCONTRATO(int value) {
        this.iddetcontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad rolcontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLCONTRATO() {
        return rolcontrato;
    }

    /**
     * Define el valor de la propiedad rolcontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLCONTRATO(String value) {
        this.rolcontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad emergencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMERGENCIA() {
        return emergencia;
    }

    /**
     * Define el valor de la propiedad emergencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMERGENCIA(String value) {
        this.emergencia = value;
    }

    /**
     * Obtiene el valor de la propiedad facturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACTURACION() {
        return facturacion;
    }

    /**
     * Define el valor de la propiedad facturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACTURACION(String value) {
        this.facturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nmtc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMTC() {
        return nmtc;
    }

    /**
     * Define el valor de la propiedad nmtc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMTC(String value) {
        this.nmtc = value;
    }

    /**
     * Obtiene el valor de la propiedad inscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSCRIPCION() {
        return inscripcion;
    }

    /**
     * Define el valor de la propiedad inscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSCRIPCION(String value) {
        this.inscripcion = value;
    }

}
