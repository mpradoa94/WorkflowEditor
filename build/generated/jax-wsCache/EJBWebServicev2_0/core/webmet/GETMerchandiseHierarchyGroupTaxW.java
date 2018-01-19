
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_MerchandiseHierarchyGroupTaxW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_MerchandiseHierarchyGroupTaxW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mhgt" type="{http://Webmet.core/}getMerchandiseHierarchyGroupTax" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_MerchandiseHierarchyGroupTaxW", propOrder = {
    "mhgt"
})
public class GETMerchandiseHierarchyGroupTaxW {

    protected GetMerchandiseHierarchyGroupTax mhgt;

    /**
     * Obtiene el valor de la propiedad mhgt.
     * 
     * @return
     *     possible object is
     *     {@link GetMerchandiseHierarchyGroupTax }
     *     
     */
    public GetMerchandiseHierarchyGroupTax getMhgt() {
        return mhgt;
    }

    /**
     * Define el valor de la propiedad mhgt.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMerchandiseHierarchyGroupTax }
     *     
     */
    public void setMhgt(GetMerchandiseHierarchyGroupTax value) {
        this.mhgt = value;
    }

}
