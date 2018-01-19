
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para handHeldTax complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="handHeldTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CD_RCPR_PRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_GP_TX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handHeldTax", propOrder = {
    "idtax",
    "dctax",
    "cdrcprprn",
    "nmgptx"
})
public class HandHeldTax {

    @XmlElement(name = "ID_TAX")
    protected String idtax;
    @XmlElement(name = "DC_TAX")
    protected String dctax;
    @XmlElement(name = "CD_RCPR_PRN")
    protected String cdrcprprn;
    @XmlElement(name = "NM_GP_TX")
    protected String nmgptx;

    /**
     * Obtiene el valor de la propiedad idtax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTAX() {
        return idtax;
    }

    /**
     * Define el valor de la propiedad idtax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTAX(String value) {
        this.idtax = value;
    }

    /**
     * Obtiene el valor de la propiedad dctax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCTAX() {
        return dctax;
    }

    /**
     * Define el valor de la propiedad dctax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCTAX(String value) {
        this.dctax = value;
    }

    /**
     * Obtiene el valor de la propiedad cdrcprprn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRCPRPRN() {
        return cdrcprprn;
    }

    /**
     * Define el valor de la propiedad cdrcprprn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRCPRPRN(String value) {
        this.cdrcprprn = value;
    }

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

}
