
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para partyRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="partyRol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_RO_PRTY_EF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_RD_PRTY_EP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="party" type="{http://Webmet.core/}party" minOccurs="0"/>
 *         &lt;element name="partyaddress" type="{http://Webmet.core/}partyAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyRol", propOrder = {
    "idprty",
    "tyroprty",
    "dcroprtyef",
    "dcrdprtyep",
    "party",
    "partyaddress"
})
public class PartyRol {

    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "DC_RO_PRTY_EF")
    protected String dcroprtyef;
    @XmlElement(name = "DC_RD_PRTY_EP")
    protected String dcrdprtyep;
    protected Party party;
    @XmlElement(nillable = true)
    protected List<PartyAddress> partyaddress;

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
     * Obtiene el valor de la propiedad dcroprtyef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCROPRTYEF() {
        return dcroprtyef;
    }

    /**
     * Define el valor de la propiedad dcroprtyef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCROPRTYEF(String value) {
        this.dcroprtyef = value;
    }

    /**
     * Obtiene el valor de la propiedad dcrdprtyep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCRDPRTYEP() {
        return dcrdprtyep;
    }

    /**
     * Define el valor de la propiedad dcrdprtyep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCRDPRTYEP(String value) {
        this.dcrdprtyep = value;
    }

    /**
     * Obtiene el valor de la propiedad party.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Define el valor de la propiedad party.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

    /**
     * Gets the value of the partyaddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyaddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyaddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAddress }
     * 
     * 
     */
    public List<PartyAddress> getPartyaddress() {
        if (partyaddress == null) {
            partyaddress = new ArrayList<PartyAddress>();
        }
        return this.partyaddress;
    }

}
