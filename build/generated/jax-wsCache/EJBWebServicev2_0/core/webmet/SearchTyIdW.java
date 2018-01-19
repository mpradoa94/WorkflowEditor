
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_TyIdW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_TyIdW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tyid" type="{http://Webmet.core/}searchTyId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_TyIdW", propOrder = {
    "tyid"
})
public class SearchTyIdW {

    protected SearchTyId tyid;

    /**
     * Obtiene el valor de la propiedad tyid.
     * 
     * @return
     *     possible object is
     *     {@link SearchTyId }
     *     
     */
    public SearchTyId getTyid() {
        return tyid;
    }

    /**
     * Define el valor de la propiedad tyid.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTyId }
     *     
     */
    public void setTyid(SearchTyId value) {
        this.tyid = value;
    }

}
