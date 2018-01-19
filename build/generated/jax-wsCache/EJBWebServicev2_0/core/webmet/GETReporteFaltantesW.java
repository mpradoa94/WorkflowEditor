
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteFaltantesW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteFaltantesW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RFW" type="{http://Webmet.core/}getReporteDiasInv" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteFaltantesW", propOrder = {
    "rfw"
})
public class GETReporteFaltantesW {

    @XmlElement(name = "RFW")
    protected GetReporteDiasInv rfw;

    /**
     * Obtiene el valor de la propiedad rfw.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteDiasInv }
     *     
     */
    public GetReporteDiasInv getRFW() {
        return rfw;
    }

    /**
     * Define el valor de la propiedad rfw.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteDiasInv }
     *     
     */
    public void setRFW(GetReporteDiasInv value) {
        this.rfw = value;
    }

}
