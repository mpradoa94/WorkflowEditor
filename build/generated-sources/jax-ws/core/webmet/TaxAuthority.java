
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para taxAuthority complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="taxAuthority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SC_RND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QU_DGT_RND" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "taxAuthority", propOrder = {
    "idathytx",
    "idprty",
    "tyroprty",
    "nmathytx",
    "scrnd",
    "qudgtrnd",
    "partyrol"
})
public class TaxAuthority {

    @XmlElement(name = "ID_ATHY_TX")
    protected int idathytx;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "NM_ATHY_TX")
    protected String nmathytx;
    @XmlElement(name = "SC_RND")
    protected String scrnd;
    @XmlElement(name = "QU_DGT_RND")
    protected double qudgtrnd;
    protected PartyRol partyrol;

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
     * Obtiene el valor de la propiedad nmathytx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMATHYTX() {
        return nmathytx;
    }

    /**
     * Define el valor de la propiedad nmathytx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMATHYTX(String value) {
        this.nmathytx = value;
    }

    /**
     * Obtiene el valor de la propiedad scrnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCRND() {
        return scrnd;
    }

    /**
     * Define el valor de la propiedad scrnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCRND(String value) {
        this.scrnd = value;
    }

    /**
     * Obtiene el valor de la propiedad qudgtrnd.
     * 
     */
    public double getQUDGTRND() {
        return qudgtrnd;
    }

    /**
     * Define el valor de la propiedad qudgtrnd.
     * 
     */
    public void setQUDGTRND(double value) {
        this.qudgtrnd = value;
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
