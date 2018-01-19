
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrdenCompraW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrdenCompraW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spor" type="{http://Webmet.core/}abcSupplierOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdenCompraW", propOrder = {
    "spor"
})
public class OrdenCompraW {

    protected AbcSupplierOrder spor;

    /**
     * Obtiene el valor de la propiedad spor.
     * 
     * @return
     *     possible object is
     *     {@link AbcSupplierOrder }
     *     
     */
    public AbcSupplierOrder getSpor() {
        return spor;
    }

    /**
     * Define el valor de la propiedad spor.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcSupplierOrder }
     *     
     */
    public void setSpor(AbcSupplierOrder value) {
        this.spor = value;
    }

}
