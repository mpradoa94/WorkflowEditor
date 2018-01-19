
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ServicioProveedorDashW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ServicioProveedorDashW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entra" type="{http://Webmet.core/}getServicioProveedorDash" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ServicioProveedorDashW", propOrder = {
    "entra"
})
public class GETServicioProveedorDashW {

    protected GetServicioProveedorDash entra;

    /**
     * Obtiene el valor de la propiedad entra.
     * 
     * @return
     *     possible object is
     *     {@link GetServicioProveedorDash }
     *     
     */
    public GetServicioProveedorDash getEntra() {
        return entra;
    }

    /**
     * Define el valor de la propiedad entra.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServicioProveedorDash }
     *     
     */
    public void setEntra(GetServicioProveedorDash value) {
        this.entra = value;
    }

}
