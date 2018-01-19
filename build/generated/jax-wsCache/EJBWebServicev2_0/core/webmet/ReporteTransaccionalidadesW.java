
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteTransaccionalidadesW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteTransaccionalidadesW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get" type="{http://Webmet.core/}getReporteTransaccionalidades" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteTransaccionalidadesW", propOrder = {
    "get"
})
public class ReporteTransaccionalidadesW {

    protected GetReporteTransaccionalidades get;

    /**
     * Obtiene el valor de la propiedad get.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteTransaccionalidades }
     *     
     */
    public GetReporteTransaccionalidades getGet() {
        return get;
    }

    /**
     * Define el valor de la propiedad get.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteTransaccionalidades }
     *     
     */
    public void setGet(GetReporteTransaccionalidades value) {
        this.get = value;
    }

}
