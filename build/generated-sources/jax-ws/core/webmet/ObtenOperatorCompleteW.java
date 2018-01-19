
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObtenOperatorCompleteW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObtenOperatorCompleteW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tie" type="{http://Webmet.core/}getOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenOperatorCompleteW", propOrder = {
    "tie"
})
public class ObtenOperatorCompleteW {

    protected GetOperator tie;

    /**
     * Obtiene el valor de la propiedad tie.
     * 
     * @return
     *     possible object is
     *     {@link GetOperator }
     *     
     */
    public GetOperator getTie() {
        return tie;
    }

    /**
     * Define el valor de la propiedad tie.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOperator }
     *     
     */
    public void setTie(GetOperator value) {
        this.tie = value;
    }

}
