
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_GEmpleadoW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_GEmpleadoW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GETZ" type="{http://Webmet.core/}getGEmpleado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_GEmpleadoW", propOrder = {
    "getz"
})
public class GETGEmpleadoW {

    @XmlElement(name = "GETZ")
    protected GetGEmpleado getz;

    /**
     * Obtiene el valor de la propiedad getz.
     * 
     * @return
     *     possible object is
     *     {@link GetGEmpleado }
     *     
     */
    public GetGEmpleado getGETZ() {
        return getz;
    }

    /**
     * Define el valor de la propiedad getz.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGEmpleado }
     *     
     */
    public void setGETZ(GetGEmpleado value) {
        this.getz = value;
    }

}
