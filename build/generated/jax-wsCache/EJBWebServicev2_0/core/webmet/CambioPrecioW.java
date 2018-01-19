
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CambioPrecioW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CambioPrecioW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cambio" type="{http://Webmet.core/}abcItemSellPrice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CambioPrecioW", propOrder = {
    "cambio"
})
public class CambioPrecioW {

    protected AbcItemSellPrice cambio;

    /**
     * Obtiene el valor de la propiedad cambio.
     * 
     * @return
     *     possible object is
     *     {@link AbcItemSellPrice }
     *     
     */
    public AbcItemSellPrice getCambio() {
        return cambio;
    }

    /**
     * Define el valor de la propiedad cambio.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcItemSellPrice }
     *     
     */
    public void setCambio(AbcItemSellPrice value) {
        this.cambio = value;
    }

}
