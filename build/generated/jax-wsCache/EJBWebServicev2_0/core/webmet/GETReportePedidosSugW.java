
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReportePedidosSugW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReportePedidosSugW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RPSW" type="{http://Webmet.core/}getReporteDiasInv" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReportePedidosSugW", propOrder = {
    "rpsw"
})
public class GETReportePedidosSugW {

    @XmlElement(name = "RPSW")
    protected GetReporteDiasInv rpsw;

    /**
     * Obtiene el valor de la propiedad rpsw.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteDiasInv }
     *     
     */
    public GetReporteDiasInv getRPSW() {
        return rpsw;
    }

    /**
     * Define el valor de la propiedad rpsw.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteDiasInv }
     *     
     */
    public void setRPSW(GetReporteDiasInv value) {
        this.rpsw = value;
    }

}
