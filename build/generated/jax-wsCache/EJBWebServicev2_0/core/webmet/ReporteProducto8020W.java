
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteProducto8020W complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteProducto8020W">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get" type="{http://Webmet.core/}getReporteProducto8020" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteProducto8020W", propOrder = {
    "get"
})
public class ReporteProducto8020W {

    protected GetReporteProducto8020 get;

    /**
     * Obtiene el valor de la propiedad get.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteProducto8020 }
     *     
     */
    public GetReporteProducto8020 getGet() {
        return get;
    }

    /**
     * Define el valor de la propiedad get.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteProducto8020 }
     *     
     */
    public void setGet(GetReporteProducto8020 value) {
        this.get = value;
    }

}
