
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_GpersonW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_GpersonW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABCZ" type="{http://Webmet.core/}abcPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_GpersonW", propOrder = {
    "abcz"
})
public class ABCGpersonW {

    @XmlElement(name = "ABCZ")
    protected AbcPersona abcz;

    /**
     * Obtiene el valor de la propiedad abcz.
     * 
     * @return
     *     possible object is
     *     {@link AbcPersona }
     *     
     */
    public AbcPersona getABCZ() {
        return abcz;
    }

    /**
     * Define el valor de la propiedad abcz.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcPersona }
     *     
     */
    public void setABCZ(AbcPersona value) {
        this.abcz = value;
    }

}
