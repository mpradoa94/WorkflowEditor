
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_TaxableGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_TaxableGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxgp" type="{http://Webmet.core/}abcTaxableGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_TaxableGroupW", propOrder = {
    "taxgp"
})
public class ABCTaxableGroupW {

    protected AbcTaxableGroup taxgp;

    /**
     * Obtiene el valor de la propiedad taxgp.
     * 
     * @return
     *     possible object is
     *     {@link AbcTaxableGroup }
     *     
     */
    public AbcTaxableGroup getTaxgp() {
        return taxgp;
    }

    /**
     * Define el valor de la propiedad taxgp.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcTaxableGroup }
     *     
     */
    public void setTaxgp(AbcTaxableGroup value) {
        this.taxgp = value;
    }

}
