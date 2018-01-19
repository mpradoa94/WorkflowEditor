
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_RetailStoreW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_RetailStoreW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rts" type="{http://Webmet.core/}searchRetailStore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_RetailStoreW", propOrder = {
    "rts"
})
public class SearchRetailStoreW {

    protected SearchRetailStore rts;

    /**
     * Obtiene el valor de la propiedad rts.
     * 
     * @return
     *     possible object is
     *     {@link SearchRetailStore }
     *     
     */
    public SearchRetailStore getRts() {
        return rts;
    }

    /**
     * Define el valor de la propiedad rts.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRetailStore }
     *     
     */
    public void setRts(SearchRetailStore value) {
        this.rts = value;
    }

}
