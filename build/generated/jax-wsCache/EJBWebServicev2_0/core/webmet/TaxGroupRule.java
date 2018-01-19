
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para taxGroupRule complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="taxGroupRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_CMPND" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_RU_TX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ACNT_LDG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxraterule" type="{http://Webmet.core/}taxRateRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxauthority" type="{http://Webmet.core/}taxAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxGroupRule", propOrder = {
    "idathytx",
    "idgptx",
    "aicmpnd",
    "nmrutx",
    "idacntldg",
    "taxraterule",
    "taxauthority"
})
public class TaxGroupRule {

    @XmlElement(name = "ID_ATHY_TX")
    protected int idathytx;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "AI_CMPND")
    protected int aicmpnd;
    @XmlElement(name = "NM_RU_TX")
    protected String nmrutx;
    @XmlElement(name = "ID_ACNT_LDG")
    protected int idacntldg;
    @XmlElement(nillable = true)
    protected List<TaxRateRule> taxraterule;
    protected TaxAuthority taxauthority;

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
     * Obtiene el valor de la propiedad aicmpnd.
     * 
     */
    public int getAICMPND() {
        return aicmpnd;
    }

    /**
     * Define el valor de la propiedad aicmpnd.
     * 
     */
    public void setAICMPND(int value) {
        this.aicmpnd = value;
    }

    /**
     * Obtiene el valor de la propiedad nmrutx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMRUTX() {
        return nmrutx;
    }

    /**
     * Define el valor de la propiedad nmrutx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMRUTX(String value) {
        this.nmrutx = value;
    }

    /**
     * Obtiene el valor de la propiedad idacntldg.
     * 
     */
    public int getIDACNTLDG() {
        return idacntldg;
    }

    /**
     * Define el valor de la propiedad idacntldg.
     * 
     */
    public void setIDACNTLDG(int value) {
        this.idacntldg = value;
    }

    /**
     * Gets the value of the taxraterule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxraterule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxraterule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRateRule }
     * 
     * 
     */
    public List<TaxRateRule> getTaxraterule() {
        if (taxraterule == null) {
            taxraterule = new ArrayList<TaxRateRule>();
        }
        return this.taxraterule;
    }

    /**
     * Obtiene el valor de la propiedad taxauthority.
     * 
     * @return
     *     possible object is
     *     {@link TaxAuthority }
     *     
     */
    public TaxAuthority getTaxauthority() {
        return taxauthority;
    }

    /**
     * Define el valor de la propiedad taxauthority.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAuthority }
     *     
     */
    public void setTaxauthority(TaxAuthority value) {
        this.taxauthority = value;
    }

}
