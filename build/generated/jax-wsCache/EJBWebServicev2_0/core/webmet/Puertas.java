
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para puertas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="puertas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PUERTA_SUC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SUCUSAL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CVE_PUERTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ZONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TIPO_PUERTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEXO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_DE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "puertas", propOrder = {
    "idpuertasuc",
    "idsucusal",
    "cvepuerta",
    "idzona",
    "tipopuerta",
    "sexo",
    "tipodeid",
    "dcalta",
    "dcbaja",
    "activo"
})
public class Puertas {

    @XmlElement(name = "ID_PUERTA_SUC")
    protected int idpuertasuc;
    @XmlElement(name = "ID_SUCUSAL")
    protected int idsucusal;
    @XmlElement(name = "CVE_PUERTA")
    protected String cvepuerta;
    @XmlElement(name = "ID_ZONA")
    protected int idzona;
    @XmlElement(name = "TIPO_PUERTA")
    protected String tipopuerta;
    @XmlElement(name = "SEXO")
    protected String sexo;
    @XmlElement(name = "TIPO_DE_ID")
    protected String tipodeid;
    @XmlElement(name = "DC_ALTA")
    protected String dcalta;
    @XmlElement(name = "DC_BAJA")
    protected String dcbaja;
    @XmlElement(name = "ACTIVO")
    protected String activo;

    /**
     * Obtiene el valor de la propiedad idpuertasuc.
     * 
     */
    public int getIDPUERTASUC() {
        return idpuertasuc;
    }

    /**
     * Define el valor de la propiedad idpuertasuc.
     * 
     */
    public void setIDPUERTASUC(int value) {
        this.idpuertasuc = value;
    }

    /**
     * Obtiene el valor de la propiedad idsucusal.
     * 
     */
    public int getIDSUCUSAL() {
        return idsucusal;
    }

    /**
     * Define el valor de la propiedad idsucusal.
     * 
     */
    public void setIDSUCUSAL(int value) {
        this.idsucusal = value;
    }

    /**
     * Obtiene el valor de la propiedad cvepuerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVEPUERTA() {
        return cvepuerta;
    }

    /**
     * Define el valor de la propiedad cvepuerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVEPUERTA(String value) {
        this.cvepuerta = value;
    }

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
     * Obtiene el valor de la propiedad tipopuerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPUERTA() {
        return tipopuerta;
    }

    /**
     * Define el valor de la propiedad tipopuerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPUERTA(String value) {
        this.tipopuerta = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEXO() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEXO(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEID() {
        return tipodeid;
    }

    /**
     * Define el valor de la propiedad tipodeid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEID(String value) {
        this.tipodeid = value;
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
