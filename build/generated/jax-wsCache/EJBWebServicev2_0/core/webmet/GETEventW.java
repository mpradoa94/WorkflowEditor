
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_EventW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_EventW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt" type="{http://Webmet.core/}getEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_EventW", propOrder = {
    "evt"
})
public class GETEventW {

    protected GetEvent evt;

    /**
     * Obtiene el valor de la propiedad evt.
     * 
     * @return
     *     possible object is
     *     {@link GetEvent }
     *     
     */
    public GetEvent getEvt() {
        return evt;
    }

    /**
     * Define el valor de la propiedad evt.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEvent }
     *     
     */
    public void setEvt(GetEvent value) {
        this.evt = value;
    }

}
