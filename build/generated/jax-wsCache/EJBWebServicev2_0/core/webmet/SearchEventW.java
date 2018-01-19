
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_EventW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_EventW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt" type="{http://Webmet.core/}searchEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_EventW", propOrder = {
    "evt"
})
public class SearchEventW {

    protected SearchEvent evt;

    /**
     * Obtiene el valor de la propiedad evt.
     * 
     * @return
     *     possible object is
     *     {@link SearchEvent }
     *     
     */
    public SearchEvent getEvt() {
        return evt;
    }

    /**
     * Define el valor de la propiedad evt.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEvent }
     *     
     */
    public void setEvt(SearchEvent value) {
        this.evt = value;
    }

}
