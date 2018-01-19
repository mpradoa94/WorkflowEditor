
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para supplier complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="supplier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_SPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_SPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DU_SPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_MF_SPR_IS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PERIODICITY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MONEY_ORDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyrol" type="{http://Webmet.core/}partyRol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplier", propOrder = {
    "idspr",
    "idprty",
    "tyroprty",
    "nmspr",
    "duspr",
    "flmfspris",
    "balance",
    "periodicity",
    "moneyorder",
    "partyrol"
})
public class Supplier {

    @XmlElement(name = "ID_SPR")
    protected int idspr;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "NM_SPR")
    protected String nmspr;
    @XmlElement(name = "DU_SPR")
    protected String duspr;
    @XmlElement(name = "FL_MF_SPR_IS")
    protected String flmfspris;
    @XmlElement(name = "BALANCE")
    protected double balance;
    @XmlElement(name = "PERIODICITY")
    protected int periodicity;
    @XmlElement(name = "MONEY_ORDER")
    protected String moneyorder;
    protected PartyRol partyrol;

    /**
     * Obtiene el valor de la propiedad idspr.
     * 
     */
    public int getIDSPR() {
        return idspr;
    }

    /**
     * Define el valor de la propiedad idspr.
     * 
     */
    public void setIDSPR(int value) {
        this.idspr = value;
    }

    /**
     * Obtiene el valor de la propiedad idprty.
     * 
     */
    public int getIDPRTY() {
        return idprty;
    }

    /**
     * Define el valor de la propiedad idprty.
     * 
     */
    public void setIDPRTY(int value) {
        this.idprty = value;
    }

    /**
     * Obtiene el valor de la propiedad tyroprty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYROPRTY() {
        return tyroprty;
    }

    /**
     * Define el valor de la propiedad tyroprty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYROPRTY(String value) {
        this.tyroprty = value;
    }

    /**
     * Obtiene el valor de la propiedad nmspr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSPR() {
        return nmspr;
    }

    /**
     * Define el valor de la propiedad nmspr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSPR(String value) {
        this.nmspr = value;
    }

    /**
     * Obtiene el valor de la propiedad duspr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUSPR() {
        return duspr;
    }

    /**
     * Define el valor de la propiedad duspr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUSPR(String value) {
        this.duspr = value;
    }

    /**
     * Obtiene el valor de la propiedad flmfspris.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLMFSPRIS() {
        return flmfspris;
    }

    /**
     * Define el valor de la propiedad flmfspris.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLMFSPRIS(String value) {
        this.flmfspris = value;
    }

    /**
     * Obtiene el valor de la propiedad balance.
     * 
     */
    public double getBALANCE() {
        return balance;
    }

    /**
     * Define el valor de la propiedad balance.
     * 
     */
    public void setBALANCE(double value) {
        this.balance = value;
    }

    /**
     * Obtiene el valor de la propiedad periodicity.
     * 
     */
    public int getPERIODICITY() {
        return periodicity;
    }

    /**
     * Define el valor de la propiedad periodicity.
     * 
     */
    public void setPERIODICITY(int value) {
        this.periodicity = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMONEYORDER() {
        return moneyorder;
    }

    /**
     * Define el valor de la propiedad moneyorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMONEYORDER(String value) {
        this.moneyorder = value;
    }

    /**
     * Obtiene el valor de la propiedad partyrol.
     * 
     * @return
     *     possible object is
     *     {@link PartyRol }
     *     
     */
    public PartyRol getPartyrol() {
        return partyrol;
    }

    /**
     * Define el valor de la propiedad partyrol.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRol }
     *     
     */
    public void setPartyrol(PartyRol value) {
        this.partyrol = value;
    }

}
