
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ContratosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ContratosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GETZ" type="{http://Webmet.core/}getContrato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ContratosW", propOrder = {
    "getz"
})
public class GETContratosW {

    @XmlElement(name = "GETZ")
    protected GetContrato getz;

    /**
     * Obtiene el valor de la propiedad getz.
     * 
     * @return
     *     possible object is
     *     {@link GetContrato }
     *     
     */
    public GetContrato getGETZ() {
        return getz;
    }

    /**
     * Define el valor de la propiedad getz.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContrato }
     *     
     */
    public void setGETZ(GetContrato value) {
        this.getz = value;
    }

}
