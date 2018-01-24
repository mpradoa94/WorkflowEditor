
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comparativeDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comparativeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroOpcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparativeDTO", propOrder = {
    "variable",
    "numeroOpcion"
})
public class ComparativeDTO {

    @XmlElement(required = true)
    protected String variable;
    @XmlElement(required = true)
    protected String numeroOpcion;

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

    /**
     * Obtiene el valor de la propiedad numeroOpcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOpcion() {
        return numeroOpcion;
    }

    /**
     * Define el valor de la propiedad numeroOpcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOpcion(String value) {
        this.numeroOpcion = value;
    }

}
