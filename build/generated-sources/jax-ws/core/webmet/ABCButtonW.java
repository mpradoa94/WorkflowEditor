
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_ButtonW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_ButtonW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in" type="{http://Webmet.core/}newButtonConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_ButtonW", propOrder = {
    "in"
})
public class ABCButtonW {

    protected NewButtonConfig in;

    /**
     * Obtiene el valor de la propiedad in.
     * 
     * @return
     *     possible object is
     *     {@link NewButtonConfig }
     *     
     */
    public NewButtonConfig getIn() {
        return in;
    }

    /**
     * Define el valor de la propiedad in.
     * 
     * @param value
     *     allowed object is
     *     {@link NewButtonConfig }
     *     
     */
    public void setIn(NewButtonConfig value) {
        this.in = value;
    }

}