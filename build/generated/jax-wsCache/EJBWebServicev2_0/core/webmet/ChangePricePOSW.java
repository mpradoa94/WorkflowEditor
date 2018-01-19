
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChangePricePOSW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChangePricePOSW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="change" type="{http://Webmet.core/}changePricePos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePricePOSW", propOrder = {
    "change"
})
public class ChangePricePOSW {

    protected ChangePricePos change;

    /**
     * Obtiene el valor de la propiedad change.
     * 
     * @return
     *     possible object is
     *     {@link ChangePricePos }
     *     
     */
    public ChangePricePos getChange() {
        return change;
    }

    /**
     * Define el valor de la propiedad change.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePricePos }
     *     
     */
    public void setChange(ChangePricePos value) {
        this.change = value;
    }

}
