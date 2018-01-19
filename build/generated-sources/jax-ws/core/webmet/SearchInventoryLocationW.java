
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchInventoryLocationW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchInventoryLocationW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inlo" type="{http://Webmet.core/}searchInventoryLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchInventoryLocationW", propOrder = {
    "inlo"
})
public class SearchInventoryLocationW {

    protected SearchInventoryLocation inlo;

    /**
     * Obtiene el valor de la propiedad inlo.
     * 
     * @return
     *     possible object is
     *     {@link SearchInventoryLocation }
     *     
     */
    public SearchInventoryLocation getInlo() {
        return inlo;
    }

    /**
     * Define el valor de la propiedad inlo.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInventoryLocation }
     *     
     */
    public void setInlo(SearchInventoryLocation value) {
        this.inlo = value;
    }

}
