
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteVentasImpuestosSubrepote complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteVentasImpuestosSubrepote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NM_GP_TX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="V_NETA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteVentasImpuestosSubrepote", propOrder = {
    "nmgptx",
    "motxrtnsls",
    "vneta",
    "total"
})
public class ReporteVentasImpuestosSubrepote {

    @XmlElement(name = "NM_GP_TX")
    protected String nmgptx;
    @XmlElement(name = "MO_TX_RTN_SLS")
    protected String motxrtnsls;
    @XmlElement(name = "V_NETA")
    protected String vneta;
    @XmlElement(name = "TOTAL")
    protected String total;

    /**
     * Obtiene el valor de la propiedad nmgptx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMGPTX() {
        return nmgptx;
    }

    /**
     * Define el valor de la propiedad nmgptx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMGPTX(String value) {
        this.nmgptx = value;
    }

    /**
     * Obtiene el valor de la propiedad motxrtnsls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTXRTNSLS() {
        return motxrtnsls;
    }

    /**
     * Define el valor de la propiedad motxrtnsls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTXRTNSLS(String value) {
        this.motxrtnsls = value;
    }

    /**
     * Obtiene el valor de la propiedad vneta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNETA() {
        return vneta;
    }

    /**
     * Define el valor de la propiedad vneta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNETA(String value) {
        this.vneta = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTAL() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTAL(String value) {
        this.total = value;
    }

}
