
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_WorkGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_WorkGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wkg" type="{http://Webmet.core/}searchWorkGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_WorkGroupW", propOrder = {
    "wkg"
})
public class SearchWorkGroupW {

    protected SearchWorkGroup wkg;

    /**
     * Obtiene el valor de la propiedad wkg.
     * 
     * @return
     *     possible object is
     *     {@link SearchWorkGroup }
     *     
     */
    public SearchWorkGroup getWkg() {
        return wkg;
    }

    /**
     * Define el valor de la propiedad wkg.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchWorkGroup }
     *     
     */
    public void setWkg(SearchWorkGroup value) {
        this.wkg = value;
    }

}
