
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_RetailStoreGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_RetailStoreGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rst" type="{http://Webmet.core/}searchRetailStoreGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_RetailStoreGroupW", propOrder = {
    "rst"
})
public class SearchRetailStoreGroupW {

    protected SearchRetailStoreGroup rst;

    /**
     * Obtiene el valor de la propiedad rst.
     * 
     * @return
     *     possible object is
     *     {@link SearchRetailStoreGroup }
     *     
     */
    public SearchRetailStoreGroup getRst() {
        return rst;
    }

    /**
     * Define el valor de la propiedad rst.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRetailStoreGroup }
     *     
     */
    public void setRst(SearchRetailStoreGroup value) {
        this.rst = value;
    }

}
