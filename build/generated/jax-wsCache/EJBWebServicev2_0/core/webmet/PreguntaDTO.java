
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preguntaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preguntaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condicion" type="{http://Webmet.core/}condicionDTO"/>
 *         &lt;element name="preguntaAbierta" type="{http://Webmet.core/}preguntaAbiertaDTO"/>
 *         &lt;element name="preguntaCerrada" type="{http://Webmet.core/}preguntaCerradaDTO"/>
 *         &lt;element name="preguntaMatriz" type="{http://Webmet.core/}preguntaMatrizDTO"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ayuda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="obligatoria" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roles" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sinRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usoPropietario" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="variable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntaDTO", propOrder = {
    "condicion",
    "preguntaAbierta",
    "preguntaCerrada",
    "preguntaMatriz"
})
public class PreguntaDTO {

    @XmlElement(required = true)
    protected CondicionDTO condicion;
    @XmlElement(required = true)
    protected PreguntaAbiertaDTO preguntaAbierta;
    @XmlElement(required = true)
    protected PreguntaCerradaDTO preguntaCerrada;
    @XmlElement(required = true)
    protected PreguntaMatrizDTO preguntaMatriz;
    @XmlAttribute(name = "ayuda")
    protected String ayuda;
    @XmlAttribute(name = "descripcion")
    protected String descripcion;
    @XmlAttribute(name = "obligatoria")
    protected String obligatoria;
    @XmlAttribute(name = "roles")
    protected String roles;
    @XmlAttribute(name = "sinRespuesta")
    protected String sinRespuesta;
    @XmlAttribute(name = "usoPropietario")
    protected String usoPropietario;
    @XmlAttribute(name = "variable")
    protected String variable;

    /**
     * Obtiene el valor de la propiedad condicion.
     * 
     * @return
     *     possible object is
     *     {@link CondicionDTO }
     *     
     */
    public CondicionDTO getCondicion() {
        return condicion;
    }

    /**
     * Define el valor de la propiedad condicion.
     * 
     * @param value
     *     allowed object is
     *     {@link CondicionDTO }
     *     
     */
    public void setCondicion(CondicionDTO value) {
        this.condicion = value;
    }

    /**
     * Obtiene el valor de la propiedad preguntaAbierta.
     * 
     * @return
     *     possible object is
     *     {@link PreguntaAbiertaDTO }
     *     
     */
    public PreguntaAbiertaDTO getPreguntaAbierta() {
        return preguntaAbierta;
    }

    /**
     * Define el valor de la propiedad preguntaAbierta.
     * 
     * @param value
     *     allowed object is
     *     {@link PreguntaAbiertaDTO }
     *     
     */
    public void setPreguntaAbierta(PreguntaAbiertaDTO value) {
        this.preguntaAbierta = value;
    }

    /**
     * Obtiene el valor de la propiedad preguntaCerrada.
     * 
     * @return
     *     possible object is
     *     {@link PreguntaCerradaDTO }
     *     
     */
    public PreguntaCerradaDTO getPreguntaCerrada() {
        return preguntaCerrada;
    }

    /**
     * Define el valor de la propiedad preguntaCerrada.
     * 
     * @param value
     *     allowed object is
     *     {@link PreguntaCerradaDTO }
     *     
     */
    public void setPreguntaCerrada(PreguntaCerradaDTO value) {
        this.preguntaCerrada = value;
    }

    /**
     * Obtiene el valor de la propiedad preguntaMatriz.
     * 
     * @return
     *     possible object is
     *     {@link PreguntaMatrizDTO }
     *     
     */
    public PreguntaMatrizDTO getPreguntaMatriz() {
        return preguntaMatriz;
    }

    /**
     * Define el valor de la propiedad preguntaMatriz.
     * 
     * @param value
     *     allowed object is
     *     {@link PreguntaMatrizDTO }
     *     
     */
    public void setPreguntaMatriz(PreguntaMatrizDTO value) {
        this.preguntaMatriz = value;
    }

    /**
     * Obtiene el valor de la propiedad ayuda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAyuda() {
        return ayuda;
    }

    /**
     * Define el valor de la propiedad ayuda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAyuda(String value) {
        this.ayuda = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad obligatoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObligatoria() {
        return obligatoria;
    }

    /**
     * Define el valor de la propiedad obligatoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObligatoria(String value) {
        this.obligatoria = value;
    }

    /**
     * Obtiene el valor de la propiedad roles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoles() {
        return roles;
    }

    /**
     * Define el valor de la propiedad roles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoles(String value) {
        this.roles = value;
    }

    /**
     * Obtiene el valor de la propiedad sinRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinRespuesta() {
        return sinRespuesta;
    }

    /**
     * Define el valor de la propiedad sinRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinRespuesta(String value) {
        this.sinRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad usoPropietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoPropietario() {
        return usoPropietario;
    }

    /**
     * Define el valor de la propiedad usoPropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoPropietario(String value) {
        this.usoPropietario = value;
    }

    /**
     * Obtiene el valor de la propiedad variable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Define el valor de la propiedad variable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariable(String value) {
        this.variable = value;
    }

}
