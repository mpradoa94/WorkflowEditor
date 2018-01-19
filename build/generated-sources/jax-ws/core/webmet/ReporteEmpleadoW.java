
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteEmpleadoW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteEmpleadoW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SEAZ" type="{http://Webmet.core/}getReporteEmpleado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteEmpleadoW", propOrder = {
    "seaz"
})
public class ReporteEmpleadoW {

    @XmlElement(name = "SEAZ")
    protected GetReporteEmpleado seaz;

    /**
     * Obtiene el valor de la propiedad seaz.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteEmpleado }
     *     
     */
    public GetReporteEmpleado getSEAZ() {
        return seaz;
    }

    /**
     * Define el valor de la propiedad seaz.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteEmpleado }
     *     
     */
    public void setSEAZ(GetReporteEmpleado value) {
        this.seaz = value;
    }

}
