
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteDiferencInventW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteDiferencInventW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tie" type="{http://Webmet.core/}getReporteInventario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteDiferencInventW", propOrder = {
    "tie"
})
public class ReporteDiferencInventW {

    protected GetReporteInventario tie;

    /**
     * Obtiene el valor de la propiedad tie.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteInventario }
     *     
     */
    public GetReporteInventario getTie() {
        return tie;
    }

    /**
     * Define el valor de la propiedad tie.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteInventario }
     *     
     */
    public void setTie(GetReporteInventario value) {
        this.tie = value;
    }

}
