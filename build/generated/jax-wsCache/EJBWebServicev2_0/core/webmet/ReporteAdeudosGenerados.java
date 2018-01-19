
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteAdeudosGenerados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteAdeudosGenerados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adeudos" type="{http://Webmet.core/}getAdeudosGenerados" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteAdeudosGenerados", propOrder = {
    "adeudos"
})
public class ReporteAdeudosGenerados {

    protected GetAdeudosGenerados adeudos;

    /**
     * Obtiene el valor de la propiedad adeudos.
     * 
     * @return
     *     possible object is
     *     {@link GetAdeudosGenerados }
     *     
     */
    public GetAdeudosGenerados getAdeudos() {
        return adeudos;
    }

    /**
     * Define el valor de la propiedad adeudos.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAdeudosGenerados }
     *     
     */
    public void setAdeudos(GetAdeudosGenerados value) {
        this.adeudos = value;
    }

}
