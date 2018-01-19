
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_CamW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_CamW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="search" type="{http://Webmet.core/}searchCamera" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_CamW", propOrder = {
    "search"
})
public class SearchCamW {

    protected SearchCamera search;

    /**
     * Obtiene el valor de la propiedad search.
     * 
     * @return
     *     possible object is
     *     {@link SearchCamera }
     *     
     */
    public SearchCamera getSearch() {
        return search;
    }

    /**
     * Define el valor de la propiedad search.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCamera }
     *     
     */
    public void setSearch(SearchCamera value) {
        this.search = value;
    }

}
