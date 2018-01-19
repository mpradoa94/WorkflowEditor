
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_LockersW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_LockersW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GETZ" type="{http://Webmet.core/}getLockers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_LockersW", propOrder = {
    "getz"
})
public class GETLockersW {

    @XmlElement(name = "GETZ")
    protected GetLockers getz;

    /**
     * Obtiene el valor de la propiedad getz.
     * 
     * @return
     *     possible object is
     *     {@link GetLockers }
     *     
     */
    public GetLockers getGETZ() {
        return getz;
    }

    /**
     * Define el valor de la propiedad getz.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLockers }
     *     
     */
    public void setGETZ(GetLockers value) {
        this.getz = value;
    }

}
