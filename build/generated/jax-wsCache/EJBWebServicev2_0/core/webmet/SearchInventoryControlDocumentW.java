
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_InventoryControlDocumentW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_InventoryControlDocumentW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="icd" type="{http://Webmet.core/}searchInventoryControlDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_InventoryControlDocumentW", propOrder = {
    "icd"
})
public class SearchInventoryControlDocumentW {

    protected SearchInventoryControlDocument icd;

    /**
     * Obtiene el valor de la propiedad icd.
     * 
     * @return
     *     possible object is
     *     {@link SearchInventoryControlDocument }
     *     
     */
    public SearchInventoryControlDocument getIcd() {
        return icd;
    }

    /**
     * Define el valor de la propiedad icd.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInventoryControlDocument }
     *     
     */
    public void setIcd(SearchInventoryControlDocument value) {
        this.icd = value;
    }

}
