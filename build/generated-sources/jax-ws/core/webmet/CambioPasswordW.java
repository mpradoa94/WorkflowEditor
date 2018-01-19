
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CambioPasswordW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CambioPasswordW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tie" type="{http://Webmet.core/}abcOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CambioPasswordW", propOrder = {
    "tie"
})
public class CambioPasswordW {

    protected AbcOperator tie;

    /**
     * Obtiene el valor de la propiedad tie.
     * 
     * @return
     *     possible object is
     *     {@link AbcOperator }
     *     
     */
    public AbcOperator getTie() {
        return tie;
    }

    /**
     * Define el valor de la propiedad tie.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcOperator }
     *     
     */
    public void setTie(AbcOperator value) {
        this.tie = value;
    }

}
