
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteVentaArticuloW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteVentaArticuloW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rva" type="{http://Webmet.core/}getReporteVentaArticulos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteVentaArticuloW", propOrder = {
    "rva"
})
public class GETReporteVentaArticuloW {

    protected GetReporteVentaArticulos rva;

    /**
     * Obtiene el valor de la propiedad rva.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteVentaArticulos }
     *     
     */
    public GetReporteVentaArticulos getRva() {
        return rva;
    }

    /**
     * Define el valor de la propiedad rva.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteVentaArticulos }
     *     
     */
    public void setRva(GetReporteVentaArticulos value) {
        this.rva = value;
    }

}
