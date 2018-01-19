
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_UOMW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_UOMW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UOM" type="{http://Webmet.core/}searchUOM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_UOMW", propOrder = {
    "uom"
})
public class SearchUOMW {

    @XmlElement(name = "UOM")
    protected SearchUOM uom;

    /**
     * Obtiene el valor de la propiedad uom.
     * 
     * @return
     *     possible object is
     *     {@link SearchUOM }
     *     
     */
    public SearchUOM getUOM() {
        return uom;
    }

    /**
     * Define el valor de la propiedad uom.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchUOM }
     *     
     */
    public void setUOM(SearchUOM value) {
        this.uom = value;
    }

}
