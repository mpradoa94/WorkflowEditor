
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteVentasImpuestosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteVentasImpuestosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ventasimpuestos" type="{http://Webmet.core/}getReporteVentasImpuestos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteVentasImpuestosW", propOrder = {
    "ventasimpuestos"
})
public class ReporteVentasImpuestosW {

    protected GetReporteVentasImpuestos ventasimpuestos;

    /**
     * Obtiene el valor de la propiedad ventasimpuestos.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteVentasImpuestos }
     *     
     */
    public GetReporteVentasImpuestos getVentasimpuestos() {
        return ventasimpuestos;
    }

    /**
     * Define el valor de la propiedad ventasimpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteVentasImpuestos }
     *     
     */
    public void setVentasimpuestos(GetReporteVentasImpuestos value) {
        this.ventasimpuestos = value;
    }

}
