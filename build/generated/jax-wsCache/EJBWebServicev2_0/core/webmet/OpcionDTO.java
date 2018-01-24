
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para opcionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="opcionDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seleccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="descripcion1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genero" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numero" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opcionDTO", propOrder = {
    "seleccion"
})
public class OpcionDTO {

    @XmlElement(required = true)
    protected String seleccion;
    @XmlAttribute(name = "descripcion")
    protected String descripcion;
    @XmlAttribute(name = "descripcion1")
    protected String descripcion1;
    @XmlAttribute(name = "genero")
    protected String genero;
    @XmlAttribute(name = "numero")
    protected String numero;

    /**
     * Obtiene el valor de la propiedad seleccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeleccion() {
        return seleccion;
    }

    /**
     * Define el valor de la propiedad seleccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeleccion(String value) {
        this.seleccion = value;
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
     * Obtiene el valor de la propiedad descripcion1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion1() {
        return descripcion1;
    }

    /**
     * Define el valor de la propiedad descripcion1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion1(String value) {
        this.descripcion1 = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

}
