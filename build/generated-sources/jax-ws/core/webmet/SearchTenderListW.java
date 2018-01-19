
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_TenderListW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_TenderListW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="te" type="{http://Webmet.core/}searchTender" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_TenderListW", propOrder = {
    "te"
})
public class SearchTenderListW {

    protected SearchTender te;

    /**
     * Obtiene el valor de la propiedad te.
     * 
     * @return
     *     possible object is
     *     {@link SearchTender }
     *     
     */
    public SearchTender getTe() {
        return te;
    }

    /**
     * Define el valor de la propiedad te.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTender }
     *     
     */
    public void setTe(SearchTender value) {
        this.te = value;
    }

}
