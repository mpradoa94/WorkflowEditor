
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Get_SupplierW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Get_SupplierW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supp" type="{http://Webmet.core/}getSupplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_SupplierW", propOrder = {
    "supp"
})
public class GetSupplierW {

    protected GetSupplier supp;

    /**
     * Obtiene el valor de la propiedad supp.
     * 
     * @return
     *     possible object is
     *     {@link GetSupplier }
     *     
     */
    public GetSupplier getSupp() {
        return supp;
    }

    /**
     * Define el valor de la propiedad supp.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSupplier }
     *     
     */
    public void setSupp(GetSupplier value) {
        this.supp = value;
    }

}
