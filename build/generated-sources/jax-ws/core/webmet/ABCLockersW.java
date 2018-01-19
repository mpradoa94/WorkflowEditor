
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_LockersW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_LockersW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABCZ" type="{http://Webmet.core/}abcLockers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_LockersW", propOrder = {
    "abcz"
})
public class ABCLockersW {

    @XmlElement(name = "ABCZ")
    protected AbcLockers abcz;

    /**
     * Obtiene el valor de la propiedad abcz.
     * 
     * @return
     *     possible object is
     *     {@link AbcLockers }
     *     
     */
    public AbcLockers getABCZ() {
        return abcz;
    }

    /**
     * Define el valor de la propiedad abcz.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcLockers }
     *     
     */
    public void setABCZ(AbcLockers value) {
        this.abcz = value;
    }

}
