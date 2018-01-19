
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gempleadoPersona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gempleadoPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PERSONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DIRECCION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EDO_CIVIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HUELLA_IZQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HUELLA_DER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OCUPACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRABAJO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_REC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_ACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "gempleadoPersona", propOrder = {
    "idpersona",
    "iddireccion",
    "edocivil",
    "huellaizq",
    "huellader",
    "foto",
    "nip",
    "ocupacion",
    "trabajo",
    "dcrec",
    "dcact",
    "activo"
})
public class GempleadoPersona {

    @XmlElement(name = "ID_PERSONA")
    protected int idpersona;
    @XmlElement(name = "ID_DIRECCION")
    protected int iddireccion;
    @XmlElement(name = "EDO_CIVIL")
    protected String edocivil;
    @XmlElement(name = "HUELLA_IZQ")
    protected String huellaizq;
    @XmlElement(name = "HUELLA_DER")
    protected String huellader;
    @XmlElement(name = "FOTO")
    protected String foto;
    @XmlElement(name = "NIP")
    protected String nip;
    @XmlElement(name = "OCUPACION")
    protected String ocupacion;
    @XmlElement(name = "TRABAJO")
    protected String trabajo;
    @XmlElement(name = "DC_REC")
    protected String dcrec;
    @XmlElement(name = "DC_ACT")
    protected String dcact;
    @XmlElement(name = "ACTIVO")
    protected String activo;

    /**
     * Obtiene el valor de la propiedad idpersona.
     * 
     */
    public int getIDPERSONA() {
        return idpersona;
    }

    /**
     * Define el valor de la propiedad idpersona.
     * 
     */
    public void setIDPERSONA(int value) {
        this.idpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad iddireccion.
     * 
     */
    public int getIDDIRECCION() {
        return iddireccion;
    }

    /**
     * Define el valor de la propiedad iddireccion.
     * 
     */
    public void setIDDIRECCION(int value) {
        this.iddireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad edocivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDOCIVIL() {
        return edocivil;
    }

    /**
     * Define el valor de la propiedad edocivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDOCIVIL(String value) {
        this.edocivil = value;
    }

    /**
     * Obtiene el valor de la propiedad huellaizq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUELLAIZQ() {
        return huellaizq;
    }

    /**
     * Define el valor de la propiedad huellaizq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUELLAIZQ(String value) {
        this.huellaizq = value;
    }

    /**
     * Obtiene el valor de la propiedad huellader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUELLADER() {
        return huellader;
    }

    /**
     * Define el valor de la propiedad huellader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUELLADER(String value) {
        this.huellader = value;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOTO() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOTO(String value) {
        this.foto = value;
    }

    /**
     * Obtiene el valor de la propiedad nip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIP() {
        return nip;
    }

    /**
     * Define el valor de la propiedad nip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIP(String value) {
        this.nip = value;
    }

    /**
     * Obtiene el valor de la propiedad ocupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCUPACION() {
        return ocupacion;
    }

    /**
     * Define el valor de la propiedad ocupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCUPACION(String value) {
        this.ocupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad trabajo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRABAJO() {
        return trabajo;
    }

    /**
     * Define el valor de la propiedad trabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRABAJO(String value) {
        this.trabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad dcrec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCREC() {
        return dcrec;
    }

    /**
     * Define el valor de la propiedad dcrec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCREC(String value) {
        this.dcrec = value;
    }

    /**
     * Obtiene el valor de la propiedad dcact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCACT() {
        return dcact;
    }

    /**
     * Define el valor de la propiedad dcact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCACT(String value) {
        this.dcact = value;
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
