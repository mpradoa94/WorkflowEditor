
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para taxableGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="taxableGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_GP_TX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CD_RCPT_PRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxgrouprule" type="{http://Webmet.core/}taxGroupRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxableGroup", propOrder = {
    "idgptx",
    "nmgptx",
    "cdrcptprn",
    "taxgrouprule"
})
public class TaxableGroup {

    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "NM_GP_TX")
    protected String nmgptx;
    @XmlElement(name = "CD_RCPT_PRN")
    protected String cdrcptprn;
    @XmlElement(nillable = true)
    protected List<TaxGroupRule> taxgrouprule;

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
     * Obtiene el valor de la propiedad cdrcptprn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRCPTPRN() {
        return cdrcptprn;
    }

    /**
     * Define el valor de la propiedad cdrcptprn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRCPTPRN(String value) {
        this.cdrcptprn = value;
    }

    /**
     * Gets the value of the taxgrouprule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxgrouprule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxgrouprule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxGroupRule }
     * 
     * 
     */
    public List<TaxGroupRule> getTaxgrouprule() {
        if (taxgrouprule == null) {
            taxgrouprule = new ArrayList<TaxGroupRule>();
        }
        return this.taxgrouprule;
    }

}
