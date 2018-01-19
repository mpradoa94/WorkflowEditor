
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ItemVolumePriceALLW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ItemVolumePriceALLW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ivp" type="{http://Webmet.core/}searchItemVolumePriceALL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ItemVolumePriceALLW", propOrder = {
    "ivp"
})
public class GETItemVolumePriceALLW {

    protected SearchItemVolumePriceALL ivp;

    /**
     * Obtiene el valor de la propiedad ivp.
     * 
     * @return
     *     possible object is
     *     {@link SearchItemVolumePriceALL }
     *     
     */
    public SearchItemVolumePriceALL getIvp() {
        return ivp;
    }

    /**
     * Define el valor de la propiedad ivp.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchItemVolumePriceALL }
     *     
     */
    public void setIvp(SearchItemVolumePriceALL value) {
        this.ivp = value;
    }

}
