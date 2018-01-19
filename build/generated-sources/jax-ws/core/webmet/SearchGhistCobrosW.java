
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_Ghist_CobrosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_Ghist_CobrosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="search" type="{http://Webmet.core/}searchGhistCobros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_Ghist_CobrosW", propOrder = {
    "search"
})
public class SearchGhistCobrosW {

    protected SearchGhistCobros search;

    /**
     * Obtiene el valor de la propiedad search.
     * 
     * @return
     *     possible object is
     *     {@link SearchGhistCobros }
     *     
     */
    public SearchGhistCobros getSearch() {
        return search;
    }

    /**
     * Define el valor de la propiedad search.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchGhistCobros }
     *     
     */
    public void setSearch(SearchGhistCobros value) {
        this.search = value;
    }

}
