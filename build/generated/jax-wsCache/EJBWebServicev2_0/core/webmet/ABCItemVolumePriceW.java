
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_ItemVolumePriceW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_ItemVolumePriceW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ivp" type="{http://Webmet.core/}abcItemVolumePrice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_ItemVolumePriceW", propOrder = {
    "ivp"
})
public class ABCItemVolumePriceW {

    protected AbcItemVolumePrice ivp;

    /**
     * Obtiene el valor de la propiedad ivp.
     * 
     * @return
     *     possible object is
     *     {@link AbcItemVolumePrice }
     *     
     */
    public AbcItemVolumePrice getIvp() {
        return ivp;
    }

    /**
     * Define el valor de la propiedad ivp.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcItemVolumePrice }
     *     
     */
    public void setIvp(AbcItemVolumePrice value) {
        this.ivp = value;
    }

}
