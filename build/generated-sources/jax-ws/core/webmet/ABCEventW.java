
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_EventW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_EventW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt" type="{http://Webmet.core/}abcEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_EventW", propOrder = {
    "evt"
})
public class ABCEventW {

    protected AbcEvent evt;

    /**
     * Obtiene el valor de la propiedad evt.
     * 
     * @return
     *     possible object is
     *     {@link AbcEvent }
     *     
     */
    public AbcEvent getEvt() {
        return evt;
    }

    /**
     * Define el valor de la propiedad evt.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcEvent }
     *     
     */
    public void setEvt(AbcEvent value) {
        this.evt = value;
    }

}
