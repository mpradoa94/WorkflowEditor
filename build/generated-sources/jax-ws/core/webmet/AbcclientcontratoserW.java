
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcclientcontratoserW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcclientcontratoserW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abc" type="{http://Webmet.core/}abcClienteContratoServ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcclientcontratoserW", propOrder = {
    "abc"
})
public class AbcclientcontratoserW {

    protected AbcClienteContratoServ abc;

    /**
     * Obtiene el valor de la propiedad abc.
     * 
     * @return
     *     possible object is
     *     {@link AbcClienteContratoServ }
     *     
     */
    public AbcClienteContratoServ getAbc() {
        return abc;
    }

    /**
     * Define el valor de la propiedad abc.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcClienteContratoServ }
     *     
     */
    public void setAbc(AbcClienteContratoServ value) {
        this.abc = value;
    }

}
