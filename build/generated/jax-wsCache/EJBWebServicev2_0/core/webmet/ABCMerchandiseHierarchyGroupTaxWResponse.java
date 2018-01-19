
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_MerchandiseHierarchyGroupTaxWResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_MerchandiseHierarchyGroupTaxWResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Webmet.core/}abcMerchandiseHierarchyGroupTaxResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_MerchandiseHierarchyGroupTaxWResponse", propOrder = {
    "_return"
})
public class ABCMerchandiseHierarchyGroupTaxWResponse {

    @XmlElement(name = "return")
    protected AbcMerchandiseHierarchyGroupTaxResponse _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link AbcMerchandiseHierarchyGroupTaxResponse }
     *     
     */
    public AbcMerchandiseHierarchyGroupTaxResponse getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcMerchandiseHierarchyGroupTaxResponse }
     *     
     */
    public void setReturn(AbcMerchandiseHierarchyGroupTaxResponse value) {
        this._return = value;
    }

}
