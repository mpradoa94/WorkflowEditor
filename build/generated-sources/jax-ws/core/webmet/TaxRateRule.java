
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para taxRateRule complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="taxRateRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MO_TXBM_MNM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MO_TXBL_MXM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MO_RT_TX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PE_RT_TX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxRateRule", propOrder = {
    "idathytx",
    "idgptx",
    "aitxrtru",
    "tytxrtru",
    "motxbmmnm",
    "motxblmxm",
    "morttx",
    "perttx"
})
public class TaxRateRule {

    @XmlElement(name = "ID_ATHY_TX")
    protected int idathytx;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "AI_TX_RT_RU")
    protected int aitxrtru;
    @XmlElement(name = "TY_TX_RT_RU")
    protected String tytxrtru;
    @XmlElement(name = "MO_TXBM_MNM")
    protected double motxbmmnm;
    @XmlElement(name = "MO_TXBL_MXM")
    protected double motxblmxm;
    @XmlElement(name = "MO_RT_TX")
    protected double morttx;
    @XmlElement(name = "PE_RT_TX")
    protected double perttx;

    /**
     * Obtiene el valor de la propiedad idathytx.
     * 
     */
    public int getIDATHYTX() {
        return idathytx;
    }

    /**
     * Define el valor de la propiedad idathytx.
     * 
     */
    public void setIDATHYTX(int value) {
        this.idathytx = value;
    }

    /**
     * Obtiene el valor de la propiedad idgptx.
     * 
     */
    public int getIDGPTX() {
        return idgptx;
    }

    /**
     * Define el valor de la propiedad idgptx.
     * 
     */
    public void setIDGPTX(int value) {
        this.idgptx = value;
    }

    /**
     * Obtiene el valor de la propiedad aitxrtru.
     * 
     */
    public int getAITXRTRU() {
        return aitxrtru;
    }

    /**
     * Define el valor de la propiedad aitxrtru.
     * 
     */
    public void setAITXRTRU(int value) {
        this.aitxrtru = value;
    }

    /**
     * Obtiene el valor de la propiedad tytxrtru.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTXRTRU() {
        return tytxrtru;
    }

    /**
     * Define el valor de la propiedad tytxrtru.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTXRTRU(String value) {
        this.tytxrtru = value;
    }

    /**
     * Obtiene el valor de la propiedad motxbmmnm.
     * 
     */
    public double getMOTXBMMNM() {
        return motxbmmnm;
    }

    /**
     * Define el valor de la propiedad motxbmmnm.
     * 
     */
    public void setMOTXBMMNM(double value) {
        this.motxbmmnm = value;
    }

    /**
     * Obtiene el valor de la propiedad motxblmxm.
     * 
     */
    public double getMOTXBLMXM() {
        return motxblmxm;
    }

    /**
     * Define el valor de la propiedad motxblmxm.
     * 
     */
    public void setMOTXBLMXM(double value) {
        this.motxblmxm = value;
    }

    /**
     * Obtiene el valor de la propiedad morttx.
     * 
     */
    public double getMORTTX() {
        return morttx;
    }

    /**
     * Define el valor de la propiedad morttx.
     * 
     */
    public void setMORTTX(double value) {
        this.morttx = value;
    }

    /**
     * Obtiene el valor de la propiedad perttx.
     * 
     */
    public double getPERTTX() {
        return perttx;
    }

    /**
     * Define el valor de la propiedad perttx.
     * 
     */
    public void setPERTTX(double value) {
        this.perttx = value;
    }

}
