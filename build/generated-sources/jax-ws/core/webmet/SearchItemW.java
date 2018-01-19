
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_ItemW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_ItemW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itm" type="{http://Webmet.core/}searchItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_ItemW", propOrder = {
    "itm"
})
public class SearchItemW {

    protected SearchItem itm;

    /**
     * Obtiene el valor de la propiedad itm.
     * 
     * @return
     *     possible object is
     *     {@link SearchItem }
     *     
     */
    public SearchItem getItm() {
        return itm;
    }

    /**
     * Define el valor de la propiedad itm.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchItem }
     *     
     */
    public void setItm(SearchItem value) {
        this.itm = value;
    }

}
