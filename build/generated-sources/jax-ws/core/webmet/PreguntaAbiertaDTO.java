
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preguntaAbiertaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preguntaAbiertaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="datos" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noRenglones" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tamanoMax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tamanoMin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tipoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntaAbiertaDTO", propOrder = {
    "respuesta"
})
public class PreguntaAbiertaDTO {

    protected String respuesta;
    @XmlAttribute(name = "datos")
    protected String datos;
    @XmlAttribute(name = "noRenglones")
    protected String noRenglones;
    @XmlAttribute(name = "tamanoMax")
    protected String tamanoMax;
    @XmlAttribute(name = "tamanoMin")
    protected String tamanoMin;
    @XmlAttribute(name = "tipoRespuesta")
    protected String tipoRespuesta;

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatos(String value) {
        this.datos = value;
    }

    /**
     * Obtiene el valor de la propiedad noRenglones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRenglones() {
        return noRenglones;
    }

    /**
     * Define el valor de la propiedad noRenglones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRenglones(String value) {
        this.noRenglones = value;
    }

    /**
     * Obtiene el valor de la propiedad tamanoMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamanoMax() {
        return tamanoMax;
    }

    /**
     * Define el valor de la propiedad tamanoMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamanoMax(String value) {
        this.tamanoMax = value;
    }

    /**
     * Obtiene el valor de la propiedad tamanoMin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamanoMin() {
        return tamanoMin;
    }

    /**
     * Define el valor de la propiedad tamanoMin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamanoMin(String value) {
        this.tamanoMin = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRespuesta() {
        return tipoRespuesta;
    }

    /**
     * Define el valor de la propiedad tipoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRespuesta(String value) {
        this.tipoRespuesta = value;
    }

}
