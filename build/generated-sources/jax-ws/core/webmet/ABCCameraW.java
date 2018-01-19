
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_CameraW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_CameraW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cam" type="{http://Webmet.core/}abcCamera" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_CameraW", propOrder = {
    "cam"
})
public class ABCCameraW {

    protected AbcCamera cam;

    /**
     * Obtiene el valor de la propiedad cam.
     * 
     * @return
     *     possible object is
     *     {@link AbcCamera }
     *     
     */
    public AbcCamera getCam() {
        return cam;
    }

    /**
     * Define el valor de la propiedad cam.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcCamera }
     *     
     */
    public void setCam(AbcCamera value) {
        this.cam = value;
    }

}
