
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteConsecutivoMW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteConsecutivoMW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RCM" type="{http://Webmet.core/}getReporteConsecutivoM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteConsecutivoMW", propOrder = {
    "rcm"
})
public class GETReporteConsecutivoMW {

    @XmlElement(name = "RCM")
    protected GetReporteConsecutivoM rcm;

    /**
     * Obtiene el valor de la propiedad rcm.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteConsecutivoM }
     *     
     */
    public GetReporteConsecutivoM getRCM() {
        return rcm;
    }

    /**
     * Define el valor de la propiedad rcm.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteConsecutivoM }
     *     
     */
    public void setRCM(GetReporteConsecutivoM value) {
        this.rcm = value;
    }

}
