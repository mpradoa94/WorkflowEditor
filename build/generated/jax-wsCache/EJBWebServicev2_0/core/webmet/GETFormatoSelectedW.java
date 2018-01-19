
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_FormatoSelectedW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_FormatoSelectedW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entra" type="{http://Webmet.core/}getFormatoSelected" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_FormatoSelectedW", propOrder = {
    "entra"
})
public class GETFormatoSelectedW {

    protected GetFormatoSelected entra;

    /**
     * Obtiene el valor de la propiedad entra.
     * 
     * @return
     *     possible object is
     *     {@link GetFormatoSelected }
     *     
     */
    public GetFormatoSelected getEntra() {
        return entra;
    }

    /**
     * Define el valor de la propiedad entra.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFormatoSelected }
     *     
     */
    public void setEntra(GetFormatoSelected value) {
        this.entra = value;
    }

}
