
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_InventoryLocationW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_InventoryLocationW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inv" type="{http://Webmet.core/}getInventoryLocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_InventoryLocationW", propOrder = {
    "inv"
})
public class GETInventoryLocationW {

    protected GetInventoryLocations inv;

    /**
     * Obtiene el valor de la propiedad inv.
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryLocations }
     *     
     */
    public GetInventoryLocations getInv() {
        return inv;
    }

    /**
     * Define el valor de la propiedad inv.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryLocations }
     *     
     */
    public void setInv(GetInventoryLocations value) {
        this.inv = value;
    }

}
