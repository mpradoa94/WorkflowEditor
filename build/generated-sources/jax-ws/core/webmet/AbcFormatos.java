
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcFormatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcFormatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formato" type="{http://Webmet.core/}formatos"/>
 *         &lt;element name="formatosNom" type="{http://Webmet.core/}formatosNombres"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcFormatos", propOrder = {
    "operacion",
    "idInstancia",
    "formato",
    "formatosNom"
})
public class AbcFormatos {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "id_instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected Formatos formato;
    @XmlElement(required = true)
    protected FormatosNombres formatosNom;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad formato.
     * 
     * @return
     *     possible object is
     *     {@link Formatos }
     *     
     */
    public Formatos getFormato() {
        return formato;
    }

    /**
     * Define el valor de la propiedad formato.
     * 
     * @param value
     *     allowed object is
     *     {@link Formatos }
     *     
     */
    public void setFormato(Formatos value) {
        this.formato = value;
    }

    /**
     * Obtiene el valor de la propiedad formatosNom.
     * 
     * @return
     *     possible object is
     *     {@link FormatosNombres }
     *     
     */
    public FormatosNombres getFormatosNom() {
        return formatosNom;
    }

    /**
     * Define el valor de la propiedad formatosNom.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatosNombres }
     *     
     */
    public void setFormatosNom(FormatosNombres value) {
        this.formatosNom = value;
    }

}
