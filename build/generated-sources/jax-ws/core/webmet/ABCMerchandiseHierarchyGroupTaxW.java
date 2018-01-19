
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_MerchandiseHierarchyGroupTaxW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_MerchandiseHierarchyGroupTaxW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mhgt" type="{http://Webmet.core/}abcMerchandiseHierarchyGroupTax" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_MerchandiseHierarchyGroupTaxW", propOrder = {
    "mhgt"
})
public class ABCMerchandiseHierarchyGroupTaxW {

    protected AbcMerchandiseHierarchyGroupTax mhgt;

    /**
     * Obtiene el valor de la propiedad mhgt.
     * 
     * @return
     *     possible object is
     *     {@link AbcMerchandiseHierarchyGroupTax }
     *     
     */
    public AbcMerchandiseHierarchyGroupTax getMhgt() {
        return mhgt;
    }

    /**
     * Define el valor de la propiedad mhgt.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcMerchandiseHierarchyGroupTax }
     *     
     */
    public void setMhgt(AbcMerchandiseHierarchyGroupTax value) {
        this.mhgt = value;
    }

}
