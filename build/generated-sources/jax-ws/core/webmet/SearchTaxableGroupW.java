
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_TaxableGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_TaxableGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxgp" type="{http://Webmet.core/}searchTaxableGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_TaxableGroupW", propOrder = {
    "taxgp"
})
public class SearchTaxableGroupW {

    protected SearchTaxableGroup taxgp;

    /**
     * Obtiene el valor de la propiedad taxgp.
     * 
     * @return
     *     possible object is
     *     {@link SearchTaxableGroup }
     *     
     */
    public SearchTaxableGroup getTaxgp() {
        return taxgp;
    }

    /**
     * Define el valor de la propiedad taxgp.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTaxableGroup }
     *     
     */
    public void setTaxgp(SearchTaxableGroup value) {
        this.taxgp = value;
    }

}
