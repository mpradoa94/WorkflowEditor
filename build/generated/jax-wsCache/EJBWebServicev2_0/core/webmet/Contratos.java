
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contratos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contratos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SUCURSAL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FECHA_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VENC_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROX_VENC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIGENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_VENDEDOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contratover" type="{http://Webmet.core/}contratoVersion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratos", propOrder = {
    "idcontrato",
    "idsucursal",
    "fechacontrato",
    "venccontrato",
    "proxvenc",
    "vigente",
    "idvendedor",
    "contratover"
})
public class Contratos {

    @XmlElement(name = "ID_CONTRATO")
    protected int idcontrato;
    @XmlElement(name = "ID_SUCURSAL")
    protected int idsucursal;
    @XmlElement(name = "FECHA_CONTRATO")
    protected String fechacontrato;
    @XmlElement(name = "VENC_CONTRATO")
    protected String venccontrato;
    @XmlElement(name = "PROX_VENC")
    protected String proxvenc;
    @XmlElement(name = "VIGENTE")
    protected String vigente;
    @XmlElement(name = "ID_VENDEDOR")
    protected int idvendedor;
    protected ContratoVersion contratover;

    /**
     * Obtiene el valor de la propiedad idcontrato.
     * 
     */
    public int getIDCONTRATO() {
        return idcontrato;
    }

    /**
     * Define el valor de la propiedad idcontrato.
     * 
     */
    public void setIDCONTRATO(int value) {
        this.idcontrato = value;
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
     * Obtiene el valor de la propiedad fechacontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHACONTRATO() {
        return fechacontrato;
    }

    /**
     * Define el valor de la propiedad fechacontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHACONTRATO(String value) {
        this.fechacontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad venccontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENCCONTRATO() {
        return venccontrato;
    }

    /**
     * Define el valor de la propiedad venccontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENCCONTRATO(String value) {
        this.venccontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad proxvenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROXVENC() {
        return proxvenc;
    }

    /**
     * Define el valor de la propiedad proxvenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROXVENC(String value) {
        this.proxvenc = value;
    }

    /**
     * Obtiene el valor de la propiedad vigente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIGENTE() {
        return vigente;
    }

    /**
     * Define el valor de la propiedad vigente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIGENTE(String value) {
        this.vigente = value;
    }

    /**
     * Obtiene el valor de la propiedad idvendedor.
     * 
     */
    public int getIDVENDEDOR() {
        return idvendedor;
    }

    /**
     * Define el valor de la propiedad idvendedor.
     * 
     */
    public void setIDVENDEDOR(int value) {
        this.idvendedor = value;
    }

    /**
     * Obtiene el valor de la propiedad contratover.
     * 
     * @return
     *     possible object is
     *     {@link ContratoVersion }
     *     
     */
    public ContratoVersion getContratover() {
        return contratover;
    }

    /**
     * Define el valor de la propiedad contratover.
     * 
     * @param value
     *     allowed object is
     *     {@link ContratoVersion }
     *     
     */
    public void setContratover(ContratoVersion value) {
        this.contratover = value;
    }

}
