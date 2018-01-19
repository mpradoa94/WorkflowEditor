
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_UserExternoW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_UserExternoW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entra" type="{http://Webmet.core/}abcUserExterno" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_UserExternoW", propOrder = {
    "entra"
})
public class ABCUserExternoW {

    protected AbcUserExterno entra;

    /**
     * Obtiene el valor de la propiedad entra.
     * 
     * @return
     *     possible object is
     *     {@link AbcUserExterno }
     *     
     */
    public AbcUserExterno getEntra() {
        return entra;
    }

    /**
     * Define el valor de la propiedad entra.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcUserExterno }
     *     
     */
    public void setEntra(AbcUserExterno value) {
        this.entra = value;
    }

}
