
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Abc_SupplierW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Abc_SupplierW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supp" type="{http://Webmet.core/}abcSupplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abc_SupplierW", propOrder = {
    "supp"
})
public class AbcSupplierW {

    protected AbcSupplier supp;

    /**
     * Obtiene el valor de la propiedad supp.
     * 
     * @return
     *     possible object is
     *     {@link AbcSupplier }
     *     
     */
    public AbcSupplier getSupp() {
        return supp;
    }

    /**
     * Define el valor de la propiedad supp.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcSupplier }
     *     
     */
    public void setSupp(AbcSupplier value) {
        this.supp = value;
    }

}
