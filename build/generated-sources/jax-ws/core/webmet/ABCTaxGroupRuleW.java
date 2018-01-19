
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_TaxGroupRuleW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_TaxGroupRuleW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tgr" type="{http://Webmet.core/}abcTaxGroupRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_TaxGroupRuleW", propOrder = {
    "tgr"
})
public class ABCTaxGroupRuleW {

    protected AbcTaxGroupRule tgr;

    /**
     * Obtiene el valor de la propiedad tgr.
     * 
     * @return
     *     possible object is
     *     {@link AbcTaxGroupRule }
     *     
     */
    public AbcTaxGroupRule getTgr() {
        return tgr;
    }

    /**
     * Define el valor de la propiedad tgr.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcTaxGroupRule }
     *     
     */
    public void setTgr(AbcTaxGroupRule value) {
        this.tgr = value;
    }

}
