
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_PhisicalCountDocumentW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_PhisicalCountDocumentW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pcd" type="{http://Webmet.core/}searchPhisicalCountDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_PhisicalCountDocumentW", propOrder = {
    "pcd"
})
public class SearchPhisicalCountDocumentW {

    protected SearchPhisicalCountDocument pcd;

    /**
     * Obtiene el valor de la propiedad pcd.
     * 
     * @return
     *     possible object is
     *     {@link SearchPhisicalCountDocument }
     *     
     */
    public SearchPhisicalCountDocument getPcd() {
        return pcd;
    }

    /**
     * Define el valor de la propiedad pcd.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPhisicalCountDocument }
     *     
     */
    public void setPcd(SearchPhisicalCountDocument value) {
        this.pcd = value;
    }

}
