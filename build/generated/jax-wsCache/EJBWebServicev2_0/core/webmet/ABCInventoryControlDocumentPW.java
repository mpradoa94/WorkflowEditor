
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_InventoryControlDocumentPW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_InventoryControlDocumentPW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="icd" type="{http://Webmet.core/}abcInventoryControlDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_InventoryControlDocumentPW", propOrder = {
    "icd"
})
public class ABCInventoryControlDocumentPW {

    protected AbcInventoryControlDocument icd;

    /**
     * Obtiene el valor de la propiedad icd.
     * 
     * @return
     *     possible object is
     *     {@link AbcInventoryControlDocument }
     *     
     */
    public AbcInventoryControlDocument getIcd() {
        return icd;
    }

    /**
     * Define el valor de la propiedad icd.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcInventoryControlDocument }
     *     
     */
    public void setIcd(AbcInventoryControlDocument value) {
        this.icd = value;
    }

}
