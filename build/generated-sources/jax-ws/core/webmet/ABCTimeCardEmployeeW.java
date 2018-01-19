
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_TimeCardEmployeeW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_TimeCardEmployeeW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tcard" type="{http://Webmet.core/}abcTCE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_TimeCardEmployeeW", propOrder = {
    "tcard"
})
public class ABCTimeCardEmployeeW {

    protected AbcTCE tcard;

    /**
     * Obtiene el valor de la propiedad tcard.
     * 
     * @return
     *     possible object is
     *     {@link AbcTCE }
     *     
     */
    public AbcTCE getTcard() {
        return tcard;
    }

    /**
     * Define el valor de la propiedad tcard.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcTCE }
     *     
     */
    public void setTcard(AbcTCE value) {
        this.tcard = value;
    }

}
