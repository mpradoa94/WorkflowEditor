
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_GpersonW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_GpersonW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GETZ" type="{http://Webmet.core/}getPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_GpersonW", propOrder = {
    "getz"
})
public class GETGpersonW {

    @XmlElement(name = "GETZ")
    protected GetPersona getz;

    /**
     * Obtiene el valor de la propiedad getz.
     * 
     * @return
     *     possible object is
     *     {@link GetPersona }
     *     
     */
    public GetPersona getGETZ() {
        return getz;
    }

    /**
     * Define el valor de la propiedad getz.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersona }
     *     
     */
    public void setGETZ(GetPersona value) {
        this.getz = value;
    }

}
