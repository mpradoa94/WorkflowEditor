
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para A_FingerPrintW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="A_FingerPrintW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fp" type="{http://Webmet.core/}fingerprintIndata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A_FingerPrintW", propOrder = {
    "fp"
})
public class AFingerPrintW {

    protected FingerprintIndata fp;

    /**
     * Obtiene el valor de la propiedad fp.
     * 
     * @return
     *     possible object is
     *     {@link FingerprintIndata }
     *     
     */
    public FingerprintIndata getFp() {
        return fp;
    }

    /**
     * Define el valor de la propiedad fp.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintIndata }
     *     
     */
    public void setFp(FingerprintIndata value) {
        this.fp = value;
    }

}
