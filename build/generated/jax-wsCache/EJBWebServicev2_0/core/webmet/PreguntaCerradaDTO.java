
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preguntaCerradaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preguntaCerradaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opciones" type="{http://Webmet.core/}opcionesDTO"/>
 *         &lt;element name="respuestaOtros" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="incluirOtros" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listaDesplegable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noColumnas" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tipoPregunta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntaCerradaDTO", propOrder = {
    "opciones",
    "respuestaOtros"
})
public class PreguntaCerradaDTO {

    @XmlElement(required = true)
    protected OpcionesDTO opciones;
    @XmlElement(required = true)
    protected String respuestaOtros;
    @XmlAttribute(name = "incluirOtros")
    protected String incluirOtros;
    @XmlAttribute(name = "listaDesplegable")
    protected String listaDesplegable;
    @XmlAttribute(name = "noColumnas")
    protected String noColumnas;
    @XmlAttribute(name = "tipoPregunta")
    protected String tipoPregunta;

    /**
     * Obtiene el valor de la propiedad opciones.
     * 
     * @return
     *     possible object is
     *     {@link OpcionesDTO }
     *     
     */
    public OpcionesDTO getOpciones() {
        return opciones;
    }

    /**
     * Define el valor de la propiedad opciones.
     * 
     * @param value
     *     allowed object is
     *     {@link OpcionesDTO }
     *     
     */
    public void setOpciones(OpcionesDTO value) {
        this.opciones = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaOtros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaOtros() {
        return respuestaOtros;
    }

    /**
     * Define el valor de la propiedad respuestaOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaOtros(String value) {
        this.respuestaOtros = value;
    }

    /**
     * Obtiene el valor de la propiedad incluirOtros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncluirOtros() {
        return incluirOtros;
    }

    /**
     * Define el valor de la propiedad incluirOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncluirOtros(String value) {
        this.incluirOtros = value;
    }

    /**
     * Obtiene el valor de la propiedad listaDesplegable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaDesplegable() {
        return listaDesplegable;
    }

    /**
     * Define el valor de la propiedad listaDesplegable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaDesplegable(String value) {
        this.listaDesplegable = value;
    }

    /**
     * Obtiene el valor de la propiedad noColumnas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoColumnas() {
        return noColumnas;
    }

    /**
     * Define el valor de la propiedad noColumnas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoColumnas(String value) {
        this.noColumnas = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPregunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPregunta() {
        return tipoPregunta;
    }

    /**
     * Define el valor de la propiedad tipoPregunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPregunta(String value) {
        this.tipoPregunta = value;
    }

}
