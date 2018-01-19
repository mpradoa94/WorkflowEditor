
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteHistorialClienteW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteHistorialClienteW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SEAZ" type="{http://Webmet.core/}getReporteHistorialCliente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteHistorialClienteW", propOrder = {
    "seaz"
})
public class GETReporteHistorialClienteW {

    @XmlElement(name = "SEAZ")
    protected GetReporteHistorialCliente seaz;

    /**
     * Obtiene el valor de la propiedad seaz.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteHistorialCliente }
     *     
     */
    public GetReporteHistorialCliente getSEAZ() {
        return seaz;
    }

    /**
     * Define el valor de la propiedad seaz.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteHistorialCliente }
     *     
     */
    public void setSEAZ(GetReporteHistorialCliente value) {
        this.seaz = value;
    }

}
