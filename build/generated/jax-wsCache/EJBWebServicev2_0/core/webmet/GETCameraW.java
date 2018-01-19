
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_CameraW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_CameraW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get" type="{http://Webmet.core/}getCamera" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_CameraW", propOrder = {
    "get"
})
public class GETCameraW {

    protected GetCamera get;

    /**
     * Obtiene el valor de la propiedad get.
     * 
     * @return
     *     possible object is
     *     {@link GetCamera }
     *     
     */
    public GetCamera getGet() {
        return get;
    }

    /**
     * Define el valor de la propiedad get.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCamera }
     *     
     */
    public void setGet(GetCamera value) {
        this.get = value;
    }

}
