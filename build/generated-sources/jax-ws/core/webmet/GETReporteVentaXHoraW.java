
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteVentaXHoraW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteVentaXHoraW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vxh" type="{http://Webmet.core/}getReporteVentaXHora" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteVentaXHoraW", propOrder = {
    "vxh"
})
public class GETReporteVentaXHoraW {

    protected GetReporteVentaXHora vxh;

    /**
     * Obtiene el valor de la propiedad vxh.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteVentaXHora }
     *     
     */
    public GetReporteVentaXHora getVxh() {
        return vxh;
    }

    /**
     * Define el valor de la propiedad vxh.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteVentaXHora }
     *     
     */
    public void setVxh(GetReporteVentaXHora value) {
        this.vxh = value;
    }

}
