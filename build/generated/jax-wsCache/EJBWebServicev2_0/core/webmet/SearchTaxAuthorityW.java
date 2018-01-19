
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_TaxAuthorityW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_TaxAuthorityW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxath" type="{http://Webmet.core/}searchTaxAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_TaxAuthorityW", propOrder = {
    "taxath"
})
public class SearchTaxAuthorityW {

    protected SearchTaxAuthority taxath;

    /**
     * Obtiene el valor de la propiedad taxath.
     * 
     * @return
     *     possible object is
     *     {@link SearchTaxAuthority }
     *     
     */
    public SearchTaxAuthority getTaxath() {
        return taxath;
    }

    /**
     * Define el valor de la propiedad taxath.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTaxAuthority }
     *     
     */
    public void setTaxath(SearchTaxAuthority value) {
        this.taxath = value;
    }

}
