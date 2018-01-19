
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteHistorialClienteWResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteHistorialClienteWResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Webmet.core/}getReporteHistorialClienteResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteHistorialClienteWResponse", propOrder = {
    "_return"
})
public class GETReporteHistorialClienteWResponse {

    @XmlElement(name = "return")
    protected GetReporteHistorialClienteResponse _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteHistorialClienteResponse }
     *     
     */
    public GetReporteHistorialClienteResponse getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteHistorialClienteResponse }
     *     
     */
    public void setReturn(GetReporteHistorialClienteResponse value) {
        this._return = value;
    }

}
