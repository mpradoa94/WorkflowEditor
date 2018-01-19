
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActivaCuentaW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActivaCuentaW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadenaActivacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivaCuentaW", propOrder = {
    "cadenaActivacion"
})
public class ActivaCuentaW {

    protected String cadenaActivacion;

    /**
     * Obtiene el valor de la propiedad cadenaActivacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaActivacion() {
        return cadenaActivacion;
    }

    /**
     * Define el valor de la propiedad cadenaActivacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaActivacion(String value) {
        this.cadenaActivacion = value;
    }

}
