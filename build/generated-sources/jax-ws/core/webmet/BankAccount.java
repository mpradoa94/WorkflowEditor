
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bankAccount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bankAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CTAB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACT_ESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ACNT_LDG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MO_SALDO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ID_FORMATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankAccount", propOrder = {
    "idctab",
    "idbn",
    "account",
    "actestatus",
    "idacntldg",
    "mosaldo",
    "idformato"
})
public class BankAccount {

    @XmlElement(name = "ID_CTAB")
    protected int idctab;
    @XmlElement(name = "ID_BN")
    protected int idbn;
    @XmlElement(name = "ACCOUNT")
    protected String account;
    @XmlElement(name = "ACT_ESTATUS")
    protected String actestatus;
    @XmlElement(name = "ID_ACNT_LDG")
    protected int idacntldg;
    @XmlElement(name = "MO_SALDO")
    protected double mosaldo;
    @XmlElement(name = "ID_FORMATO")
    protected int idformato;

    /**
     * Obtiene el valor de la propiedad idctab.
     * 
     */
    public int getIDCTAB() {
        return idctab;
    }

    /**
     * Define el valor de la propiedad idctab.
     * 
     */
    public void setIDCTAB(int value) {
        this.idctab = value;
    }

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
     * Obtiene el valor de la propiedad account.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNT() {
        return account;
    }

    /**
     * Define el valor de la propiedad account.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNT(String value) {
        this.account = value;
    }

    /**
     * Obtiene el valor de la propiedad actestatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTESTATUS() {
        return actestatus;
    }

    /**
     * Define el valor de la propiedad actestatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTESTATUS(String value) {
        this.actestatus = value;
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
     * Obtiene el valor de la propiedad mosaldo.
     * 
     */
    public double getMOSALDO() {
        return mosaldo;
    }

    /**
     * Define el valor de la propiedad mosaldo.
     * 
     */
    public void setMOSALDO(double value) {
        this.mosaldo = value;
    }

    /**
     * Obtiene el valor de la propiedad idformato.
     * 
     */
    public int getIDFORMATO() {
        return idformato;
    }

    /**
     * Define el valor de la propiedad idformato.
     * 
     */
    public void setIDFORMATO(int value) {
        this.idformato = value;
    }

}
