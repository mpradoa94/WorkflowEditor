
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para horarioClient complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="horarioClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIA_SEMANA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_I" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PUERTA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROX_VENC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE_ZONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horarioClient", propOrder = {
    "diasemana",
    "horai",
    "horaf",
    "estatus",
    "idpuerta",
    "idct",
    "nmitm",
    "foto",
    "nombre",
    "proxvenc",
    "nombrezona"
})
public class HorarioClient {

    @XmlElement(name = "DIA_SEMANA")
    protected String diasemana;
    @XmlElement(name = "HORA_I")
    protected String horai;
    @XmlElement(name = "HORA_F")
    protected String horaf;
    @XmlElement(name = "ESTATUS")
    protected String estatus;
    @XmlElement(name = "ID_PUERTA")
    protected int idpuerta;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "FOTO")
    protected String foto;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "PROX_VENC")
    protected String proxvenc;
    @XmlElement(name = "NOMBRE_ZONA")
    protected String nombrezona;

    /**
     * Obtiene el valor de la propiedad diasemana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIASEMANA() {
        return diasemana;
    }

    /**
     * Define el valor de la propiedad diasemana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIASEMANA(String value) {
        this.diasemana = value;
    }

    /**
     * Obtiene el valor de la propiedad horai.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAI() {
        return horai;
    }

    /**
     * Define el valor de la propiedad horai.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAI(String value) {
        this.horai = value;
    }

    /**
     * Obtiene el valor de la propiedad horaf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAF() {
        return horaf;
    }

    /**
     * Define el valor de la propiedad horaf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAF(String value) {
        this.horaf = value;
    }

    /**
     * Obtiene el valor de la propiedad estatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTATUS() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTATUS(String value) {
        this.estatus = value;
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
     * Obtiene el valor de la propiedad nmitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMITM() {
        return nmitm;
    }

    /**
     * Define el valor de la propiedad nmitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMITM(String value) {
        this.nmitm = value;
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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
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

}
