
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchGeneralEmpleadoW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchGeneralEmpleadoW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SEAZ" type="{http://Webmet.core/}getWorkEmpleado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGeneralEmpleadoW", propOrder = {
    "seaz"
})
public class SearchGeneralEmpleadoW {

    @XmlElement(name = "SEAZ")
    protected GetWorkEmpleado seaz;

    /**
     * Obtiene el valor de la propiedad seaz.
     * 
     * @return
     *     possible object is
     *     {@link GetWorkEmpleado }
     *     
     */
    public GetWorkEmpleado getSEAZ() {
        return seaz;
    }

    /**
     * Define el valor de la propiedad seaz.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWorkEmpleado }
     *     
     */
    public void setSEAZ(GetWorkEmpleado value) {
        this.seaz = value;
    }

}
