
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Get_InventoryControlDocumentW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Get_InventoryControlDocumentW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idc" type="{http://Webmet.core/}getInventoryControlDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_InventoryControlDocumentW", propOrder = {
    "idc"
})
public class GetInventoryControlDocumentW {

    protected GetInventoryControlDocument idc;

    /**
     * Obtiene el valor de la propiedad idc.
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryControlDocument }
     *     
     */
    public GetInventoryControlDocument getIdc() {
        return idc;
    }

    /**
     * Define el valor de la propiedad idc.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryControlDocument }
     *     
     */
    public void setIdc(GetInventoryControlDocument value) {
        this.idc = value;
    }

}
