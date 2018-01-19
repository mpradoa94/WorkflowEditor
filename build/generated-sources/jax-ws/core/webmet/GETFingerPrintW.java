
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_FingerPrintW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_FingerPrintW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fp" type="{http://Webmet.core/}getFingerprint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_FingerPrintW", propOrder = {
    "fp"
})
public class GETFingerPrintW {

    protected GetFingerprint fp;

    /**
     * Obtiene el valor de la propiedad fp.
     * 
     * @return
     *     possible object is
     *     {@link GetFingerprint }
     *     
     */
    public GetFingerprint getFp() {
        return fp;
    }

    /**
     * Define el valor de la propiedad fp.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFingerprint }
     *     
     */
    public void setFp(GetFingerprint value) {
        this.fp = value;
    }

}
