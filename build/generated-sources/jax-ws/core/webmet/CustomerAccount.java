
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para customerAccount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customerAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CTAC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ACNT_LDG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_CTAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_IDN_CT_RQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_IDN_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QU_PNT_FQ_SHPR" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LIM_CRED" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ID_SALDO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PROX_VENC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE_VENC" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DIAS_GRACIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_VENC_FST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customeraccountcard" type="{http://Webmet.core/}customerAccountCard" minOccurs="0"/>
 *         &lt;element name="saldo" type="{http://Webmet.core/}saldos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerAccount", propOrder = {
    "idctac",
    "idct",
    "idacntldg",
    "tyctac",
    "flidnctrq",
    "tyidncd",
    "qupntfqshpr",
    "limcred",
    "idsaldo",
    "proxvenc",
    "balancevenc",
    "diasgracia",
    "dcvencfst",
    "customeraccountcard",
    "saldo"
})
public class CustomerAccount {

    @XmlElement(name = "ID_CTAC")
    protected int idctac;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "ID_ACNT_LDG")
    protected int idacntldg;
    @XmlElement(name = "TY_CTAC")
    protected String tyctac;
    @XmlElement(name = "FL_IDN_CT_RQ")
    protected String flidnctrq;
    @XmlElement(name = "TY_IDN_CD")
    protected String tyidncd;
    @XmlElement(name = "QU_PNT_FQ_SHPR")
    protected double qupntfqshpr;
    @XmlElement(name = "LIM_CRED")
    protected double limcred;
    @XmlElement(name = "ID_SALDO")
    protected int idsaldo;
    @XmlElement(name = "PROX_VENC")
    protected String proxvenc;
    @XmlElement(name = "BALANCE_VENC")
    protected double balancevenc;
    @XmlElement(name = "DIAS_GRACIA")
    protected int diasgracia;
    @XmlElement(name = "DC_VENC_FST")
    protected String dcvencfst;
    protected CustomerAccountCard customeraccountcard;
    protected Saldos saldo;

    /**
     * Obtiene el valor de la propiedad idctac.
     * 
     */
    public int getIDCTAC() {
        return idctac;
    }

    /**
     * Define el valor de la propiedad idctac.
     * 
     */
    public void setIDCTAC(int value) {
        this.idctac = value;
    }

    /**
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
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
     * Obtiene el valor de la propiedad tyctac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYCTAC() {
        return tyctac;
    }

    /**
     * Define el valor de la propiedad tyctac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYCTAC(String value) {
        this.tyctac = value;
    }

    /**
     * Obtiene el valor de la propiedad flidnctrq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIDNCTRQ() {
        return flidnctrq;
    }

    /**
     * Define el valor de la propiedad flidnctrq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIDNCTRQ(String value) {
        this.flidnctrq = value;
    }

    /**
     * Obtiene el valor de la propiedad tyidncd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYIDNCD() {
        return tyidncd;
    }

    /**
     * Define el valor de la propiedad tyidncd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYIDNCD(String value) {
        this.tyidncd = value;
    }

    /**
     * Obtiene el valor de la propiedad qupntfqshpr.
     * 
     */
    public double getQUPNTFQSHPR() {
        return qupntfqshpr;
    }

    /**
     * Define el valor de la propiedad qupntfqshpr.
     * 
     */
    public void setQUPNTFQSHPR(double value) {
        this.qupntfqshpr = value;
    }

    /**
     * Obtiene el valor de la propiedad limcred.
     * 
     */
    public double getLIMCRED() {
        return limcred;
    }

    /**
     * Define el valor de la propiedad limcred.
     * 
     */
    public void setLIMCRED(double value) {
        this.limcred = value;
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
     * Obtiene el valor de la propiedad proxvenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROXVENC() {
        return proxvenc;
    }

    /**
     * Define el valor de la propiedad proxvenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROXVENC(String value) {
        this.proxvenc = value;
    }

    /**
     * Obtiene el valor de la propiedad balancevenc.
     * 
     */
    public double getBALANCEVENC() {
        return balancevenc;
    }

    /**
     * Define el valor de la propiedad balancevenc.
     * 
     */
    public void setBALANCEVENC(double value) {
        this.balancevenc = value;
    }

    /**
     * Obtiene el valor de la propiedad diasgracia.
     * 
     */
    public int getDIASGRACIA() {
        return diasgracia;
    }

    /**
     * Define el valor de la propiedad diasgracia.
     * 
     */
    public void setDIASGRACIA(int value) {
        this.diasgracia = value;
    }

    /**
     * Obtiene el valor de la propiedad dcvencfst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCVENCFST() {
        return dcvencfst;
    }

    /**
     * Define el valor de la propiedad dcvencfst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCVENCFST(String value) {
        this.dcvencfst = value;
    }

    /**
     * Obtiene el valor de la propiedad customeraccountcard.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountCard }
     *     
     */
    public CustomerAccountCard getCustomeraccountcard() {
        return customeraccountcard;
    }

    /**
     * Define el valor de la propiedad customeraccountcard.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountCard }
     *     
     */
    public void setCustomeraccountcard(CustomerAccountCard value) {
        this.customeraccountcard = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     * @return
     *     possible object is
     *     {@link Saldos }
     *     
     */
    public Saldos getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     * @param value
     *     allowed object is
     *     {@link Saldos }
     *     
     */
    public void setSaldo(Saldos value) {
        this.saldo = value;
    }

}
