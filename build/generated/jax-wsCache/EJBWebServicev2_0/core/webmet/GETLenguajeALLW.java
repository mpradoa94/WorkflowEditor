
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_LenguajeALLW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_LenguajeALLW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="len" type="{http://Webmet.core/}getLenguajeALL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_LenguajeALLW", propOrder = {
    "len"
})
public class GETLenguajeALLW {

    protected GetLenguajeALL len;

    /**
     * Obtiene el valor de la propiedad len.
     * 
     * @return
     *     possible object is
     *     {@link GetLenguajeALL }
     *     
     */
    public GetLenguajeALL getLen() {
        return len;
    }

    /**
     * Define el valor de la propiedad len.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLenguajeALL }
     *     
     */
    public void setLen(GetLenguajeALL value) {
        this.len = value;
    }

}
