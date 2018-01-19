
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_TaxAuthorityW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_TaxAuthorityW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxat" type="{http://Webmet.core/}abcTaxAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_TaxAuthorityW", propOrder = {
    "taxat"
})
public class ABCTaxAuthorityW {

    protected AbcTaxAuthority taxat;

    /**
     * Obtiene el valor de la propiedad taxat.
     * 
     * @return
     *     possible object is
     *     {@link AbcTaxAuthority }
     *     
     */
    public AbcTaxAuthority getTaxat() {
        return taxat;
    }

    /**
     * Define el valor de la propiedad taxat.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcTaxAuthority }
     *     
     */
    public void setTaxat(AbcTaxAuthority value) {
        this.taxat = value;
    }

}
