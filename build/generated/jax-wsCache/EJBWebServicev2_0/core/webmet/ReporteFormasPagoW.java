
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteFormasPagoW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteFormasPagoW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formas" type="{http://Webmet.core/}getReporteFormasPago" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteFormasPagoW", propOrder = {
    "formas"
})
public class ReporteFormasPagoW {

    protected GetReporteFormasPago formas;

    /**
     * Obtiene el valor de la propiedad formas.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteFormasPago }
     *     
     */
    public GetReporteFormasPago getFormas() {
        return formas;
    }

    /**
     * Define el valor de la propiedad formas.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteFormasPago }
     *     
     */
    public void setFormas(GetReporteFormasPago value) {
        this.formas = value;
    }

}
