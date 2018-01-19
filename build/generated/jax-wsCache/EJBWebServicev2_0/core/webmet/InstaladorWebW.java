
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InstaladorWebW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InstaladorWebW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tie" type="{http://Webmet.core/}retailStore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstaladorWebW", propOrder = {
    "tie"
})
public class InstaladorWebW {

    protected RetailStore tie;

    /**
     * Obtiene el valor de la propiedad tie.
     * 
     * @return
     *     possible object is
     *     {@link RetailStore }
     *     
     */
    public RetailStore getTie() {
        return tie;
    }

    /**
     * Define el valor de la propiedad tie.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStore }
     *     
     */
    public void setTie(RetailStore value) {
        this.tie = value;
    }

}
