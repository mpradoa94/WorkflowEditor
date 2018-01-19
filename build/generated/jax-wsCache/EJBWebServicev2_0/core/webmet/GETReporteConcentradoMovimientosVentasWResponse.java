
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteConcentradoMovimientosVentasWResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteConcentradoMovimientosVentasWResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Webmet.core/}getReporteConcentradoMovimientosResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteConcentradoMovimientosVentasWResponse", propOrder = {
    "_return"
})
public class GETReporteConcentradoMovimientosVentasWResponse {

    @XmlElement(name = "return")
    protected GetReporteConcentradoMovimientosResponse _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteConcentradoMovimientosResponse }
     *     
     */
    public GetReporteConcentradoMovimientosResponse getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteConcentradoMovimientosResponse }
     *     
     */
    public void setReturn(GetReporteConcentradoMovimientosResponse value) {
        this._return = value;
    }

}
