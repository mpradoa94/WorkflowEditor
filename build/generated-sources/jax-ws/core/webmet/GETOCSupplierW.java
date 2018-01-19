
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_OCSupplierW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_OCSupplierW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sup" type="{http://Webmet.core/}getOCSupplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_OCSupplierW", propOrder = {
    "sup"
})
public class GETOCSupplierW {

    protected GetOCSupplier sup;

    /**
     * Obtiene el valor de la propiedad sup.
     * 
     * @return
     *     possible object is
     *     {@link GetOCSupplier }
     *     
     */
    public GetOCSupplier getSup() {
        return sup;
    }

    /**
     * Define el valor de la propiedad sup.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOCSupplier }
     *     
     */
    public void setSup(GetOCSupplier value) {
        this.sup = value;
    }

}
