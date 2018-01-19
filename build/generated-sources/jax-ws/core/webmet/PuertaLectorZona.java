
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para puertaLectorZona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="puertaLectorZona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Zona" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tipo_Puerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre_Zona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PUERTA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "puertaLectorZona", propOrder = {
    "idZona",
    "tipoPuerta",
    "tipoID",
    "sexo",
    "ip",
    "nombreZona",
    "idpuerta"
})
public class PuertaLectorZona {

    @XmlElement(name = "ID_Zona")
    protected int idZona;
    @XmlElement(name = "Tipo_Puerta")
    protected String tipoPuerta;
    @XmlElement(name = "TipoID")
    protected String tipoID;
    @XmlElement(name = "Sexo")
    protected String sexo;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "Nombre_Zona")
    protected String nombreZona;
    @XmlElement(name = "ID_PUERTA")
    protected int idpuerta;

    /**
     * Obtiene el valor de la propiedad idZona.
     * 
     */
    public int getIDZona() {
        return idZona;
    }

    /**
     * Define el valor de la propiedad idZona.
     * 
     */
    public void setIDZona(int value) {
        this.idZona = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPuerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPuerta() {
        return tipoPuerta;
    }

    /**
     * Define el valor de la propiedad tipoPuerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPuerta(String value) {
        this.tipoPuerta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoID() {
        return tipoID;
    }

    /**
     * Define el valor de la propiedad tipoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoID(String value) {
        this.tipoID = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
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
    public void setSexo(String value) {
        this.sexo = value;
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
     * Obtiene el valor de la propiedad nombreZona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreZona() {
        return nombreZona;
    }

    /**
     * Define el valor de la propiedad nombreZona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreZona(String value) {
        this.nombreZona = value;
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

}
