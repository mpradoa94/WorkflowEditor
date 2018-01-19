
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NewButtonConfigW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NewButtonConfigW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bt" type="{http://Webmet.core/}newButtonConfig"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewButtonConfigW", propOrder = {
    "bt"
})
public class NewButtonConfigW {

    @XmlElement(required = true)
    protected NewButtonConfig bt;

    /**
     * Obtiene el valor de la propiedad bt.
     * 
     * @return
     *     possible object is
     *     {@link NewButtonConfig }
     *     
     */
    public NewButtonConfig getBt() {
        return bt;
    }

    /**
     * Define el valor de la propiedad bt.
     * 
     * @param value
     *     allowed object is
     *     {@link NewButtonConfig }
     *     
     */
    public void setBt(NewButtonConfig value) {
        this.bt = value;
    }

}
