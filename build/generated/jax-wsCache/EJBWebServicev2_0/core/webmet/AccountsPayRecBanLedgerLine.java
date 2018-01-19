
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para accountsPayRecBanLedgerLine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accountsPayRecBanLedgerLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_TRAN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LINE_TRAN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SALDO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RTD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DCTOD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RTO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DCTOO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CAROABO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONCILIADO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aprbt" type="{http://Webmet.core/}accountsPayRecBancTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountsPayRecBanLedgerLine", propOrder = {
    "mes",
    "anio",
    "idtran",
    "idlinetran",
    "idsaldo",
    "idstrrtd",
    "iddctod",
    "idstrrto",
    "iddctoo",
    "amount",
    "caroabo",
    "reference",
    "conciliado",
    "aprbt"
})
public class AccountsPayRecBanLedgerLine {

    @XmlElement(name = "MES")
    protected String mes;
    @XmlElement(name = "ANIO")
    protected String anio;
    @XmlElement(name = "ID_TRAN")
    protected int idtran;
    @XmlElement(name = "ID_LINE_TRAN")
    protected int idlinetran;
    @XmlElement(name = "ID_SALDO")
    protected int idsaldo;
    @XmlElement(name = "ID_STR_RTD")
    protected int idstrrtd;
    @XmlElement(name = "ID_DCTOD")
    protected int iddctod;
    @XmlElement(name = "ID_STR_RTO")
    protected int idstrrto;
    @XmlElement(name = "ID_DCTOO")
    protected int iddctoo;
    @XmlElement(name = "AMOUNT")
    protected double amount;
    @XmlElement(name = "CAROABO")
    protected String caroabo;
    @XmlElement(name = "REFERENCE")
    protected String reference;
    @XmlElement(name = "CONCILIADO")
    protected int conciliado;
    protected AccountsPayRecBancTransaction aprbt;

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMES() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMES(String value) {
        this.mes = value;
    }

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIO() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIO(String value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad idtran.
     * 
     */
    public int getIDTRAN() {
        return idtran;
    }

    /**
     * Define el valor de la propiedad idtran.
     * 
     */
    public void setIDTRAN(int value) {
        this.idtran = value;
    }

    /**
     * Obtiene el valor de la propiedad idlinetran.
     * 
     */
    public int getIDLINETRAN() {
        return idlinetran;
    }

    /**
     * Define el valor de la propiedad idlinetran.
     * 
     */
    public void setIDLINETRAN(int value) {
        this.idlinetran = value;
    }

    /**
     * Obtiene el valor de la propiedad idsaldo.
     * 
     */
    public int getIDSALDO() {
        return idsaldo;
    }

    /**
     * Define el valor de la propiedad idsaldo.
     * 
     */
    public void setIDSALDO(int value) {
        this.idsaldo = value;
    }

    /**
     * Obtiene el valor de la propiedad idstrrtd.
     * 
     */
    public int getIDSTRRTD() {
        return idstrrtd;
    }

    /**
     * Define el valor de la propiedad idstrrtd.
     * 
     */
    public void setIDSTRRTD(int value) {
        this.idstrrtd = value;
    }

    /**
     * Obtiene el valor de la propiedad iddctod.
     * 
     */
    public int getIDDCTOD() {
        return iddctod;
    }

    /**
     * Define el valor de la propiedad iddctod.
     * 
     */
    public void setIDDCTOD(int value) {
        this.iddctod = value;
    }

    /**
     * Obtiene el valor de la propiedad idstrrto.
     * 
     */
    public int getIDSTRRTO() {
        return idstrrto;
    }

    /**
     * Define el valor de la propiedad idstrrto.
     * 
     */
    public void setIDSTRRTO(int value) {
        this.idstrrto = value;
    }

    /**
     * Obtiene el valor de la propiedad iddctoo.
     * 
     */
    public int getIDDCTOO() {
        return iddctoo;
    }

    /**
     * Define el valor de la propiedad iddctoo.
     * 
     */
    public void setIDDCTOO(int value) {
        this.iddctoo = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public double getAMOUNT() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAMOUNT(double value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad caroabo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAROABO() {
        return caroabo;
    }

    /**
     * Define el valor de la propiedad caroabo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAROABO(String value) {
        this.caroabo = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCE() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCE(String value) {
        this.reference = value;
    }

    /**
     * Obtiene el valor de la propiedad conciliado.
     * 
     */
    public int getCONCILIADO() {
        return conciliado;
    }

    /**
     * Define el valor de la propiedad conciliado.
     * 
     */
    public void setCONCILIADO(int value) {
        this.conciliado = value;
    }

    /**
     * Obtiene el valor de la propiedad aprbt.
     * 
     * @return
     *     possible object is
     *     {@link AccountsPayRecBancTransaction }
     *     
     */
    public AccountsPayRecBancTransaction getAprbt() {
        return aprbt;
    }

    /**
     * Define el valor de la propiedad aprbt.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountsPayRecBancTransaction }
     *     
     */
    public void setAprbt(AccountsPayRecBancTransaction value) {
        this.aprbt = value;
    }

}
