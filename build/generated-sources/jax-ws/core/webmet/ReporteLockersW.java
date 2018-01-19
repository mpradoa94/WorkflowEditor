
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteLockersW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteLockersW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportelock" type="{http://Webmet.core/}getReporteLockers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteLockersW", propOrder = {
    "reportelock"
})
public class ReporteLockersW {

    protected GetReporteLockers reportelock;

    /**
     * Obtiene el valor de la propiedad reportelock.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteLockers }
     *     
     */
    public GetReporteLockers getReportelock() {
        return reportelock;
    }

    /**
     * Define el valor de la propiedad reportelock.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteLockers }
     *     
     */
    public void setReportelock(GetReporteLockers value) {
        this.reportelock = value;
    }

}
