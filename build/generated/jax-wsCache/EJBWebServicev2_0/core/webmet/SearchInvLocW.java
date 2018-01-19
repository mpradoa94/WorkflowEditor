
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_InvLocW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_InvLocW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inv" type="{http://Webmet.core/}searchInventoryLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_InvLocW", propOrder = {
    "inv"
})
public class SearchInvLocW {

    protected SearchInventoryLocation inv;

    /**
     * Obtiene el valor de la propiedad inv.
     * 
     * @return
     *     possible object is
     *     {@link SearchInventoryLocation }
     *     
     */
    public SearchInventoryLocation getInv() {
        return inv;
    }

    /**
     * Define el valor de la propiedad inv.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInventoryLocation }
     *     
     */
    public void setInv(SearchInventoryLocation value) {
        this.inv = value;
    }

}
