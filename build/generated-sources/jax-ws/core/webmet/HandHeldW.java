
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HandHeldW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HandHeldW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hh" type="{http://Webmet.core/}abcSincHandHeld" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandHeldW", propOrder = {
    "hh"
})
public class HandHeldW {

    protected AbcSincHandHeld hh;

    /**
     * Obtiene el valor de la propiedad hh.
     * 
     * @return
     *     possible object is
     *     {@link AbcSincHandHeld }
     *     
     */
    public AbcSincHandHeld getHh() {
        return hh;
    }

    /**
     * Define el valor de la propiedad hh.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcSincHandHeld }
     *     
     */
    public void setHh(AbcSincHandHeld value) {
        this.hh = value;
    }

}
