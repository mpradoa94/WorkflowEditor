
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_CustomerW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_CustomerW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cus" type="{http://Webmet.core/}abcCustomer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_CustomerW", propOrder = {
    "cus"
})
public class ABCCustomerW {

    protected AbcCustomer cus;

    /**
     * Obtiene el valor de la propiedad cus.
     * 
     * @return
     *     possible object is
     *     {@link AbcCustomer }
     *     
     */
    public AbcCustomer getCus() {
        return cus;
    }

    /**
     * Define el valor de la propiedad cus.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcCustomer }
     *     
     */
    public void setCus(AbcCustomer value) {
        this.cus = value;
    }

}
