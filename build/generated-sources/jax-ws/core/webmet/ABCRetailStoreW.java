
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_RetailStoreW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_RetailStoreW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rst" type="{http://Webmet.core/}abcRetailStore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_RetailStoreW", propOrder = {
    "rst"
})
public class ABCRetailStoreW {

    protected AbcRetailStore rst;

    /**
     * Obtiene el valor de la propiedad rst.
     * 
     * @return
     *     possible object is
     *     {@link AbcRetailStore }
     *     
     */
    public AbcRetailStore getRst() {
        return rst;
    }

    /**
     * Define el valor de la propiedad rst.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcRetailStore }
     *     
     */
    public void setRst(AbcRetailStore value) {
        this.rst = value;
    }

}
