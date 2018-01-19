
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTaxAuthorityResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTaxAuthorityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="taxauth" type="{http://Webmet.core/}taxAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTaxAuthorityResponse", propOrder = {
    "resultado",
    "taxauth"
})
public class GetTaxAuthorityResponse {

    protected Resultado resultado;
    protected TaxAuthority taxauth;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad taxauth.
     * 
     * @return
     *     possible object is
     *     {@link TaxAuthority }
     *     
     */
    public TaxAuthority getTaxauth() {
        return taxauth;
    }

    /**
     * Define el valor de la propiedad taxauth.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAuthority }
     *     
     */
    public void setTaxauth(TaxAuthority value) {
        this.taxauth = value;
    }

}
