
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ReporteExistenciasW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ReporteExistenciasW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RE" type="{http://Webmet.core/}getReporteExistencias" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ReporteExistenciasW", propOrder = {
    "re"
})
public class GETReporteExistenciasW {

    @XmlElement(name = "RE")
    protected GetReporteExistencias re;

    /**
     * Obtiene el valor de la propiedad re.
     * 
     * @return
     *     possible object is
     *     {@link GetReporteExistencias }
     *     
     */
    public GetReporteExistencias getRE() {
        return re;
    }

    /**
     * Define el valor de la propiedad re.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReporteExistencias }
     *     
     */
    public void setRE(GetReporteExistencias value) {
        this.re = value;
    }

}
