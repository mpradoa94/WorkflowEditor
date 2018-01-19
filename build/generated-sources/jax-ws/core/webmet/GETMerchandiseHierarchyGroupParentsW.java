
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_MerchandiseHierarchyGroupParentsW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_MerchandiseHierarchyGroupParentsW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mhg" type="{http://Webmet.core/}getMerchandiseHierarchyGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_MerchandiseHierarchyGroupParentsW", propOrder = {
    "mhg"
})
public class GETMerchandiseHierarchyGroupParentsW {

    protected GetMerchandiseHierarchyGroup mhg;

    /**
     * Obtiene el valor de la propiedad mhg.
     * 
     * @return
     *     possible object is
     *     {@link GetMerchandiseHierarchyGroup }
     *     
     */
    public GetMerchandiseHierarchyGroup getMhg() {
        return mhg;
    }

    /**
     * Define el valor de la propiedad mhg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMerchandiseHierarchyGroup }
     *     
     */
    public void setMhg(GetMerchandiseHierarchyGroup value) {
        this.mhg = value;
    }

}
