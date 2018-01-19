
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_RetailStoreGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_RetailStoreGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsgp" type="{http://Webmet.core/}abcRetailStoreGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_RetailStoreGroupW", propOrder = {
    "rsgp"
})
public class ABCRetailStoreGroupW {

    protected AbcRetailStoreGroup rsgp;

    /**
     * Obtiene el valor de la propiedad rsgp.
     * 
     * @return
     *     possible object is
     *     {@link AbcRetailStoreGroup }
     *     
     */
    public AbcRetailStoreGroup getRsgp() {
        return rsgp;
    }

    /**
     * Define el valor de la propiedad rsgp.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcRetailStoreGroup }
     *     
     */
    public void setRsgp(AbcRetailStoreGroup value) {
        this.rsgp = value;
    }

}
