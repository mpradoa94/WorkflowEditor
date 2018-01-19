
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_SupplierW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_SupplierW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supp" type="{http://Webmet.core/}searchSupplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_SupplierW", propOrder = {
    "supp"
})
public class SearchSupplierW {

    protected SearchSupplier supp;

    /**
     * Obtiene el valor de la propiedad supp.
     * 
     * @return
     *     possible object is
     *     {@link SearchSupplier }
     *     
     */
    public SearchSupplier getSupp() {
        return supp;
    }

    /**
     * Define el valor de la propiedad supp.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSupplier }
     *     
     */
    public void setSupp(SearchSupplier value) {
        this.supp = value;
    }

}
