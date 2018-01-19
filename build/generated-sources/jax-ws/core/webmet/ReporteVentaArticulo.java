
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteVentaArticulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteVentaArticulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QU_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MO_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MO_TXBL_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MontoImpuesto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteVentaArticulo", propOrder = {
    "iditmps",
    "nmmrhrcgp",
    "nmitm",
    "nmbrn",
    "quslsitm",
    "moslsitm",
    "motxblrtnsls",
    "motxrtnsls",
    "montoImpuesto"
})
public class ReporteVentaArticulo {

    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "NM_MRHRC_GP")
    protected String nmmrhrcgp;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "NM_BRN")
    protected String nmbrn;
    @XmlElement(name = "QU_SLS_ITM")
    protected double quslsitm;
    @XmlElement(name = "MO_SLS_ITM")
    protected double moslsitm;
    @XmlElement(name = "MO_TXBL_RTN_SLS")
    protected double motxblrtnsls;
    @XmlElement(name = "MO_TX_RTN_SLS")
    protected double motxrtnsls;
    @XmlElement(name = "MontoImpuesto")
    protected double montoImpuesto;

    /**
     * Obtiene el valor de la propiedad iditmps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDITMPS() {
        return iditmps;
    }

    /**
     * Define el valor de la propiedad iditmps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDITMPS(String value) {
        this.iditmps = value;
    }

    /**
     * Obtiene el valor de la propiedad nmmrhrcgp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMMRHRCGP() {
        return nmmrhrcgp;
    }

    /**
     * Define el valor de la propiedad nmmrhrcgp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMMRHRCGP(String value) {
        this.nmmrhrcgp = value;
    }

    /**
     * Obtiene el valor de la propiedad nmitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMITM() {
        return nmitm;
    }

    /**
     * Define el valor de la propiedad nmitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMITM(String value) {
        this.nmitm = value;
    }

    /**
     * Obtiene el valor de la propiedad nmbrn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMBRN() {
        return nmbrn;
    }

    /**
     * Define el valor de la propiedad nmbrn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMBRN(String value) {
        this.nmbrn = value;
    }

    /**
     * Obtiene el valor de la propiedad quslsitm.
     * 
     */
    public double getQUSLSITM() {
        return quslsitm;
    }

    /**
     * Define el valor de la propiedad quslsitm.
     * 
     */
    public void setQUSLSITM(double value) {
        this.quslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad moslsitm.
     * 
     */
    public double getMOSLSITM() {
        return moslsitm;
    }

    /**
     * Define el valor de la propiedad moslsitm.
     * 
     */
    public void setMOSLSITM(double value) {
        this.moslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad motxblrtnsls.
     * 
     */
    public double getMOTXBLRTNSLS() {
        return motxblrtnsls;
    }

    /**
     * Define el valor de la propiedad motxblrtnsls.
     * 
     */
    public void setMOTXBLRTNSLS(double value) {
        this.motxblrtnsls = value;
    }

    /**
     * Obtiene el valor de la propiedad motxrtnsls.
     * 
     */
    public double getMOTXRTNSLS() {
        return motxrtnsls;
    }

    /**
     * Define el valor de la propiedad motxrtnsls.
     * 
     */
    public void setMOTXRTNSLS(double value) {
        this.motxrtnsls = value;
    }

    /**
     * Obtiene el valor de la propiedad montoImpuesto.
     * 
     */
    public double getMontoImpuesto() {
        return montoImpuesto;
    }

    /**
     * Define el valor de la propiedad montoImpuesto.
     * 
     */
    public void setMontoImpuesto(double value) {
        this.montoImpuesto = value;
    }

}
