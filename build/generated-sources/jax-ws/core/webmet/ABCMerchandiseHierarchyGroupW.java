
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_MerchandiseHierarchyGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_MerchandiseHierarchyGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mhg" type="{http://Webmet.core/}abcMerchandiseHierarchyGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_MerchandiseHierarchyGroupW", propOrder = {
    "mhg"
})
public class ABCMerchandiseHierarchyGroupW {

    protected AbcMerchandiseHierarchyGroup mhg;

    /**
     * Obtiene el valor de la propiedad mhg.
     * 
     * @return
     *     possible object is
     *     {@link AbcMerchandiseHierarchyGroup }
     *     
     */
    public AbcMerchandiseHierarchyGroup getMhg() {
        return mhg;
    }

    /**
     * Define el valor de la propiedad mhg.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcMerchandiseHierarchyGroup }
     *     
     */
    public void setMhg(AbcMerchandiseHierarchyGroup value) {
        this.mhg = value;
    }

}
