
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_TenderW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_TenderW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tend" type="{http://Webmet.core/}searchTender" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_TenderW", propOrder = {
    "tend"
})
public class SearchTenderW {

    protected SearchTender tend;

    /**
     * Obtiene el valor de la propiedad tend.
     * 
     * @return
     *     possible object is
     *     {@link SearchTender }
     *     
     */
    public SearchTender getTend() {
        return tend;
    }

    /**
     * Define el valor de la propiedad tend.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTender }
     *     
     */
    public void setTend(SearchTender value) {
        this.tend = value;
    }

}
