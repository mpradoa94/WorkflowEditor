
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CompraW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CompraW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buy" type="{http://Webmet.core/}abcBuy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompraW", propOrder = {
    "buy"
})
public class CompraW {

    protected AbcBuy buy;

    /**
     * Obtiene el valor de la propiedad buy.
     * 
     * @return
     *     possible object is
     *     {@link AbcBuy }
     *     
     */
    public AbcBuy getBuy() {
        return buy;
    }

    /**
     * Define el valor de la propiedad buy.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcBuy }
     *     
     */
    public void setBuy(AbcBuy value) {
        this.buy = value;
    }

}
