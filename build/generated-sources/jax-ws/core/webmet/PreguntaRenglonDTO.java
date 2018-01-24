
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preguntaRenglonDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preguntaRenglonDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idpRenglon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pregunta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntaRenglonDTO", propOrder = {
    "idpRenglon",
    "pregunta",
    "respuesta"
})
public class PreguntaRenglonDTO {

    @XmlElement(required = true)
    protected String idpRenglon;
    @XmlElement(required = true)
    protected String pregunta;
    @XmlElement(required = true)
    protected String respuesta;

    /**
     * Obtiene el valor de la propiedad idpRenglon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdpRenglon() {
        return idpRenglon;
    }

    /**
     * Define el valor de la propiedad idpRenglon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdpRenglon(String value) {
        this.idpRenglon = value;
    }

    /**
     * Obtiene el valor de la propiedad pregunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Define el valor de la propiedad pregunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPregunta(String value) {
        this.pregunta = value;
    }

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

}
