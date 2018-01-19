
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoDocumentoDatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumentoDatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TY_DCTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODULO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE_DOCUMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFECTA_INVENTARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_AFECTACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO_AFECTA_INVENTARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFECTA_CLIENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_AFECTACION_CLIENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFECTA_PROVEEDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_AFECTACION_PROV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFECTA_BANCOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_AFECTACION_BANCO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumentoDatos", propOrder = {
    "tydcto",
    "modulo",
    "nombredocumento",
    "afectainventario",
    "tipoafectacion",
    "campoafectainventario",
    "afectacliente",
    "tipoafectacioncliente",
    "afectaproveedor",
    "tipoafectacionprov",
    "afectabancos",
    "tipoafectacionbanco"
})
public class TipoDocumentoDatos {

    @XmlElement(name = "TY_DCTO")
    protected String tydcto;
    @XmlElement(name = "MODULO")
    protected String modulo;
    @XmlElement(name = "NOMBRE_DOCUMENTO")
    protected String nombredocumento;
    @XmlElement(name = "AFECTA_INVENTARIO")
    protected String afectainventario;
    @XmlElement(name = "TIPO_AFECTACION")
    protected String tipoafectacion;
    @XmlElement(name = "CAMPO_AFECTA_INVENTARIO")
    protected String campoafectainventario;
    @XmlElement(name = "AFECTA_CLIENTE")
    protected String afectacliente;
    @XmlElement(name = "TIPO_AFECTACION_CLIENTE")
    protected String tipoafectacioncliente;
    @XmlElement(name = "AFECTA_PROVEEDOR")
    protected String afectaproveedor;
    @XmlElement(name = "TIPO_AFECTACION_PROV")
    protected String tipoafectacionprov;
    @XmlElement(name = "AFECTA_BANCOS")
    protected String afectabancos;
    @XmlElement(name = "TIPO_AFECTACION_BANCO")
    protected String tipoafectacionbanco;

    /**
     * Obtiene el valor de la propiedad tydcto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYDCTO() {
        return tydcto;
    }

    /**
     * Define el valor de la propiedad tydcto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYDCTO(String value) {
        this.tydcto = value;
    }

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULO() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULO(String value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombredocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREDOCUMENTO() {
        return nombredocumento;
    }

    /**
     * Define el valor de la propiedad nombredocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREDOCUMENTO(String value) {
        this.nombredocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad afectainventario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFECTAINVENTARIO() {
        return afectainventario;
    }

    /**
     * Define el valor de la propiedad afectainventario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFECTAINVENTARIO(String value) {
        this.afectainventario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoafectacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOAFECTACION() {
        return tipoafectacion;
    }

    /**
     * Define el valor de la propiedad tipoafectacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOAFECTACION(String value) {
        this.tipoafectacion = value;
    }

    /**
     * Obtiene el valor de la propiedad campoafectainventario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMPOAFECTAINVENTARIO() {
        return campoafectainventario;
    }

    /**
     * Define el valor de la propiedad campoafectainventario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMPOAFECTAINVENTARIO(String value) {
        this.campoafectainventario = value;
    }

    /**
     * Obtiene el valor de la propiedad afectacliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFECTACLIENTE() {
        return afectacliente;
    }

    /**
     * Define el valor de la propiedad afectacliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFECTACLIENTE(String value) {
        this.afectacliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoafectacioncliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOAFECTACIONCLIENTE() {
        return tipoafectacioncliente;
    }

    /**
     * Define el valor de la propiedad tipoafectacioncliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOAFECTACIONCLIENTE(String value) {
        this.tipoafectacioncliente = value;
    }

    /**
     * Obtiene el valor de la propiedad afectaproveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFECTAPROVEEDOR() {
        return afectaproveedor;
    }

    /**
     * Define el valor de la propiedad afectaproveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFECTAPROVEEDOR(String value) {
        this.afectaproveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoafectacionprov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOAFECTACIONPROV() {
        return tipoafectacionprov;
    }

    /**
     * Define el valor de la propiedad tipoafectacionprov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOAFECTACIONPROV(String value) {
        this.tipoafectacionprov = value;
    }

    /**
     * Obtiene el valor de la propiedad afectabancos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFECTABANCOS() {
        return afectabancos;
    }

    /**
     * Define el valor de la propiedad afectabancos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFECTABANCOS(String value) {
        this.afectabancos = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoafectacionbanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOAFECTACIONBANCO() {
        return tipoafectacionbanco;
    }

    /**
     * Define el valor de la propiedad tipoafectacionbanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOAFECTACIONBANCO(String value) {
        this.tipoafectacionbanco = value;
    }

}
