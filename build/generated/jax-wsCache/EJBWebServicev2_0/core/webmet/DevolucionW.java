
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DevolucionW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DevolucionW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dev" type="{http://Webmet.core/}abcBuy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevolucionW", propOrder = {
    "dev"
})
public class DevolucionW {

    protected AbcBuy dev;

    /**
     * Obtiene el valor de la propiedad dev.
     * 
     * @return
     *     possible object is
     *     {@link AbcBuy }
     *     
     */
    public AbcBuy getDev() {
        return dev;
    }

    /**
     * Define el valor de la propiedad dev.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcBuy }
     *     
     */
    public void setDev(AbcBuy value) {
        this.dev = value;
    }

}
