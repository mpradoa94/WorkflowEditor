
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_TaxRateRulW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_TaxRateRulW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trr" type="{http://Webmet.core/}abcTaxRateRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_TaxRateRulW", propOrder = {
    "trr"
})
public class ABCTaxRateRulW {

    protected AbcTaxRateRule trr;

    /**
     * Obtiene el valor de la propiedad trr.
     * 
     * @return
     *     possible object is
     *     {@link AbcTaxRateRule }
     *     
     */
    public AbcTaxRateRule getTrr() {
        return trr;
    }

    /**
     * Define el valor de la propiedad trr.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcTaxRateRule }
     *     
     */
    public void setTrr(AbcTaxRateRule value) {
        this.trr = value;
    }

}
