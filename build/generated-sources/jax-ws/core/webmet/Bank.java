
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bank complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_BN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_BN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyrol" type="{http://Webmet.core/}partyRol" minOccurs="0"/>
 *         &lt;element name="cuentas" type="{http://Webmet.core/}bankAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bank", propOrder = {
    "idbn",
    "idprty",
    "tyroprty",
    "nmbn",
    "partyrol",
    "cuentas"
})
public class Bank {

    @XmlElement(name = "ID_BN")
    protected int idbn;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "NM_BN")
    protected String nmbn;
    protected PartyRol partyrol;
    @XmlElement(nillable = true)
    protected List<BankAccount> cuentas;

    /**
     * Obtiene el valor de la propiedad idbn.
     * 
     */
    public int getIDBN() {
        return idbn;
    }

    /**
     * Define el valor de la propiedad idbn.
     * 
     */
    public void setIDBN(int value) {
        this.idbn = value;
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
     * Obtiene el valor de la propiedad nmbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMBN() {
        return nmbn;
    }

    /**
     * Define el valor de la propiedad nmbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMBN(String value) {
        this.nmbn = value;
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

    /**
     * Gets the value of the cuentas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuentas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuentas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAccount }
     * 
     * 
     */
    public List<BankAccount> getCuentas() {
        if (cuentas == null) {
            cuentas = new ArrayList<BankAccount>();
        }
        return this.cuentas;
    }

}
