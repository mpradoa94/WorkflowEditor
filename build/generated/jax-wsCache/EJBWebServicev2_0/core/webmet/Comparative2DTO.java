
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comparative2DTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comparative2DTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opLogico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="condicion" type="{http://Webmet.core/}condicionDTO"/>
 *         &lt;element name="comparative" type="{http://Webmet.core/}comparativeDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparative2DTO", propOrder = {
    "opLogico",
    "condicion",
    "comparative"
})
public class Comparative2DTO {

    @XmlElement(required = true)
    protected String opLogico;
    @XmlElement(required = true)
    protected CondicionDTO condicion;
    @XmlElement(required = true)
    protected ComparativeDTO comparative;

    /**
     * Obtiene el valor de la propiedad opLogico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpLogico() {
        return opLogico;
    }

    /**
     * Define el valor de la propiedad opLogico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpLogico(String value) {
        this.opLogico = value;
    }

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
     * Obtiene el valor de la propiedad comparative.
     * 
     * @return
     *     possible object is
     *     {@link ComparativeDTO }
     *     
     */
    public ComparativeDTO getComparative() {
        return comparative;
    }

    /**
     * Define el valor de la propiedad comparative.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparativeDTO }
     *     
     */
    public void setComparative(ComparativeDTO value) {
        this.comparative = value;
    }

}
