
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_TaxableGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_TaxableGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxgp" type="{http://Webmet.core/}getTaxableGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_TaxableGroupW", propOrder = {
    "taxgp"
})
public class GETTaxableGroupW {

    protected GetTaxableGroup taxgp;

    /**
     * Obtiene el valor de la propiedad taxgp.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxableGroup }
     *     
     */
    public GetTaxableGroup getTaxgp() {
        return taxgp;
    }

    /**
     * Define el valor de la propiedad taxgp.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxableGroup }
     *     
     */
    public void setTaxgp(GetTaxableGroup value) {
        this.taxgp = value;
    }

}
