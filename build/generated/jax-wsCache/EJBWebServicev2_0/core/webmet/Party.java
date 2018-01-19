
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para party complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="party">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_PARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LU_ORG_LG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="person" type="{http://Webmet.core/}person" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://Webmet.core/}organization" minOccurs="0"/>
 *         &lt;element name="telephone1" type="{http://Webmet.core/}telephone" minOccurs="0"/>
 *         &lt;element name="telephone2" type="{http://Webmet.core/}telephone" minOccurs="0"/>
 *         &lt;element name="emailaddress" type="{http://Webmet.core/}emailAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "party", propOrder = {
    "idprty",
    "typarty",
    "luorglg",
    "person",
    "organization",
    "telephone1",
    "telephone2",
    "emailaddress"
})
public class Party {

    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_PARTY")
    protected String typarty;
    @XmlElement(name = "LU_ORG_LG")
    protected String luorglg;
    protected Person person;
    protected Organization organization;
    protected Telephone telephone1;
    protected Telephone telephone2;
    @XmlElement(nillable = true)
    protected List<EmailAddress> emailaddress;

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
     * Obtiene el valor de la propiedad typarty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPARTY() {
        return typarty;
    }

    /**
     * Define el valor de la propiedad typarty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPARTY(String value) {
        this.typarty = value;
    }

    /**
     * Obtiene el valor de la propiedad luorglg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLUORGLG() {
        return luorglg;
    }

    /**
     * Define el valor de la propiedad luorglg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLUORGLG(String value) {
        this.luorglg = value;
    }

    /**
     * Obtiene el valor de la propiedad person.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Define el valor de la propiedad person.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Obtiene el valor de la propiedad organization.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Define el valor de la propiedad organization.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Obtiene el valor de la propiedad telephone1.
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone1() {
        return telephone1;
    }

    /**
     * Define el valor de la propiedad telephone1.
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone1(Telephone value) {
        this.telephone1 = value;
    }

    /**
     * Obtiene el valor de la propiedad telephone2.
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone2() {
        return telephone2;
    }

    /**
     * Define el valor de la propiedad telephone2.
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone2(Telephone value) {
        this.telephone2 = value;
    }

    /**
     * Gets the value of the emailaddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailaddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailaddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddress }
     * 
     * 
     */
    public List<EmailAddress> getEmailaddress() {
        if (emailaddress == null) {
            emailaddress = new ArrayList<EmailAddress>();
        }
        return this.emailaddress;
    }

}
