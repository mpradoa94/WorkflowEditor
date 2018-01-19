
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para merchandiseHierarchyGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="merchandiseHierarchyGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MRHC_PRNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE_PROFIT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FOOD_STAMP_EX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxGP" type="{http://Webmet.core/}taxableGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "merchandiseHierarchyGroup", propOrder = {
    "idmrhrcgp",
    "idmrhcprnt",
    "nmmrhrcgp",
    "peprofit",
    "idgptx",
    "foodstampex",
    "taxGP"
})
public class MerchandiseHierarchyGroup {

    @XmlElement(name = "ID_MRHRC_GP")
    protected int idmrhrcgp;
    @XmlElement(name = "ID_MRHC_PRNT")
    protected int idmrhcprnt;
    @XmlElement(name = "NM_MRHRC_GP")
    protected String nmmrhrcgp;
    @XmlElement(name = "PE_PROFIT")
    protected double peprofit;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "FOOD_STAMP_EX")
    protected String foodstampex;
    protected TaxableGroup taxGP;

    /**
     * Obtiene el valor de la propiedad idmrhrcgp.
     * 
     */
    public int getIDMRHRCGP() {
        return idmrhrcgp;
    }

    /**
     * Define el valor de la propiedad idmrhrcgp.
     * 
     */
    public void setIDMRHRCGP(int value) {
        this.idmrhrcgp = value;
    }

    /**
     * Obtiene el valor de la propiedad idmrhcprnt.
     * 
     */
    public int getIDMRHCPRNT() {
        return idmrhcprnt;
    }

    /**
     * Define el valor de la propiedad idmrhcprnt.
     * 
     */
    public void setIDMRHCPRNT(int value) {
        this.idmrhcprnt = value;
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
     * Obtiene el valor de la propiedad peprofit.
     * 
     */
    public double getPEPROFIT() {
        return peprofit;
    }

    /**
     * Define el valor de la propiedad peprofit.
     * 
     */
    public void setPEPROFIT(double value) {
        this.peprofit = value;
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
     * Obtiene el valor de la propiedad foodstampex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOODSTAMPEX() {
        return foodstampex;
    }

    /**
     * Define el valor de la propiedad foodstampex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOODSTAMPEX(String value) {
        this.foodstampex = value;
    }

    /**
     * Obtiene el valor de la propiedad taxGP.
     * 
     * @return
     *     possible object is
     *     {@link TaxableGroup }
     *     
     */
    public TaxableGroup getTaxGP() {
        return taxGP;
    }

    /**
     * Define el valor de la propiedad taxGP.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableGroup }
     *     
     */
    public void setTaxGP(TaxableGroup value) {
        this.taxGP = value;
    }

}
