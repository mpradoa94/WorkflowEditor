
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteDiasInvW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteDiasInvW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RDI" type="{http://Webmet.core/}getReporteDiasInv" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteDiasInvW", propOrder = {
    "rdi"
})
public class GETReporteDiasInvW {

    @XmlElement(name = "RDI")
    protected GetReporteDiasInv rdi;

    /**
     * Obtiene el valor de la propiedad rdi.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteDiasInv }
     *     
     */
    public GetReporteDiasInv getRDI() {
        return rdi;
    }

    /**
     * Define el valor de la propiedad rdi.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteDiasInv }
     *     
     */
    public void setRDI(GetReporteDiasInv value) {
        this.rdi = value;
    }

}
