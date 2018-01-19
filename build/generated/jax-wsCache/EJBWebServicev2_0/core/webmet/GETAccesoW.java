
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_AccesoW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_AccesoW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ac" type="{http://Webmet.core/}getAcceso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_AccesoW", propOrder = {
    "ac"
})
public class GETAccesoW {

    protected GetAcceso ac;

    /**
     * Obtiene el valor de la propiedad ac.
     * 
     * @return
     *     possible object is
     *     {@link GetAcceso }
     *     
     */
    public GetAcceso getAc() {
        return ac;
    }

    /**
     * Define el valor de la propiedad ac.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAcceso }
     *     
     */
    public void setAc(GetAcceso value) {
        this.ac = value;
    }

}
