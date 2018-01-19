
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_TillW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_TillW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="till" type="{http://Webmet.core/}abcTill" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_TillW", propOrder = {
    "till"
})
public class ABCTillW {

    protected AbcTill till;

    /**
     * Obtiene el valor de la propiedad till.
     * 
     * @return
     *     possible object is
     *     {@link AbcTill }
     *     
     */
    public AbcTill getTill() {
        return till;
    }

    /**
     * Define el valor de la propiedad till.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcTill }
     *     
     */
    public void setTill(AbcTill value) {
        this.till = value;
    }

}
