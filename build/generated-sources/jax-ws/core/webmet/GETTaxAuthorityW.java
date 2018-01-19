
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_TaxAuthorityW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_TaxAuthorityW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxath" type="{http://Webmet.core/}getTaxAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_TaxAuthorityW", propOrder = {
    "taxath"
})
public class GETTaxAuthorityW {

    protected GetTaxAuthority taxath;

    /**
     * Obtiene el valor de la propiedad taxath.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxAuthority }
     *     
     */
    public GetTaxAuthority getTaxath() {
        return taxath;
    }

    /**
     * Define el valor de la propiedad taxath.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxAuthority }
     *     
     */
    public void setTaxath(GetTaxAuthority value) {
        this.taxath = value;
    }

}
