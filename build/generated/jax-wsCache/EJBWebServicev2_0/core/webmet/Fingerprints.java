
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fingerprints complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fingerprints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_EM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FINGERPRINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINGERPRINT_LEFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fingerprints", propOrder = {
    "idem",
    "fingerprint",
    "fingerprintleft"
})
public class Fingerprints {

    @XmlElement(name = "ID_EM")
    protected int idem;
    @XmlElement(name = "FINGERPRINT")
    protected String fingerprint;
    @XmlElement(name = "FINGERPRINT_LEFT")
    protected String fingerprintleft;

    /**
     * Obtiene el valor de la propiedad idem.
     * 
     */
    public int getIDEM() {
        return idem;
    }

    /**
     * Define el valor de la propiedad idem.
     * 
     */
    public void setIDEM(int value) {
        this.idem = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerprint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINGERPRINT() {
        return fingerprint;
    }

    /**
     * Define el valor de la propiedad fingerprint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINGERPRINT(String value) {
        this.fingerprint = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerprintleft.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINGERPRINTLEFT() {
        return fingerprintleft;
    }

    /**
     * Define el valor de la propiedad fingerprintleft.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINGERPRINTLEFT(String value) {
        this.fingerprintleft = value;
    }

}
