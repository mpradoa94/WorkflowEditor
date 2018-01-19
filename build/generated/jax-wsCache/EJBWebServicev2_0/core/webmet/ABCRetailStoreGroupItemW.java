
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_RetailStoreGroupItemW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_RetailStoreGroupItemW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsgi" type="{http://Webmet.core/}abcRetailStoreGroupItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_RetailStoreGroupItemW", propOrder = {
    "rsgi"
})
public class ABCRetailStoreGroupItemW {

    protected AbcRetailStoreGroupItem rsgi;

    /**
     * Obtiene el valor de la propiedad rsgi.
     * 
     * @return
     *     possible object is
     *     {@link AbcRetailStoreGroupItem }
     *     
     */
    public AbcRetailStoreGroupItem getRsgi() {
        return rsgi;
    }

    /**
     * Define el valor de la propiedad rsgi.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcRetailStoreGroupItem }
     *     
     */
    public void setRsgi(AbcRetailStoreGroupItem value) {
        this.rsgi = value;
    }

}
