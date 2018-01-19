
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_TSW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_TSW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in" type="{http://Webmet.core/}searchInventoryControlDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_TSW", propOrder = {
    "in"
})
public class SearchTSW {

    protected SearchInventoryControlDocument in;

    /**
     * Obtiene el valor de la propiedad in.
     * 
     * @return
     *     possible object is
     *     {@link SearchInventoryControlDocument }
     *     
     */
    public SearchInventoryControlDocument getIn() {
        return in;
    }

    /**
     * Define el valor de la propiedad in.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInventoryControlDocument }
     *     
     */
    public void setIn(SearchInventoryControlDocument value) {
        this.in = value;
    }

}
