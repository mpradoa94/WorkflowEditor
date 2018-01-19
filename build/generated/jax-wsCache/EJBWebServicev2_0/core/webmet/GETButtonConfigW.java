
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GETButtonConfigW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GETButtonConfigW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bt" type="{http://Webmet.core/}getButtonConfig"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETButtonConfigW", propOrder = {
    "bt"
})
public class GETButtonConfigW {

    @XmlElement(required = true)
    protected GetButtonConfig bt;

    /**
     * Obtiene el valor de la propiedad bt.
     * 
     * @return
     *     possible object is
     *     {@link GetButtonConfig }
     *     
     */
    public GetButtonConfig getBt() {
        return bt;
    }

    /**
     * Define el valor de la propiedad bt.
     * 
     * @param value
     *     allowed object is
     *     {@link GetButtonConfig }
     *     
     */
    public void setBt(GetButtonConfig value) {
        this.bt = value;
    }

}
