
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFingerprintResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFingerprintResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="fingerprint" type="{http://Webmet.core/}fingerprints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFingerprintResponse", propOrder = {
    "resultado",
    "fingerprint"
})
public class GetFingerprintResponse {

    protected Resultado resultado;
    protected Fingerprints fingerprint;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerprint.
     * 
     * @return
     *     possible object is
     *     {@link Fingerprints }
     *     
     */
    public Fingerprints getFingerprint() {
        return fingerprint;
    }

    /**
     * Define el valor de la propiedad fingerprint.
     * 
     * @param value
     *     allowed object is
     *     {@link Fingerprints }
     *     
     */
    public void setFingerprint(Fingerprints value) {
        this.fingerprint = value;
    }

}
