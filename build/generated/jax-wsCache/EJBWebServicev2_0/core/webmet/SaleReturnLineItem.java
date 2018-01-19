
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saleReturnLineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saleReturnLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idStrRt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idWs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dcDyBsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aiTrn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aiLnItem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idStrGpr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idItm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idItmPs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idItmPsQfr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idGpTx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tyItm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tyItmSv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moPrcReg" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moPrcAct" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moExtnd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="quItmLmRtnSls" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moTxblRtnSls" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moTxRtnSls" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saleReturnLineItem", propOrder = {
    "idStrRt",
    "idWs",
    "dcDyBsn",
    "aiTrn",
    "aiLnItem",
    "idStrGpr",
    "idItm",
    "idItmPs",
    "idItmPsQfr",
    "idGpTx",
    "tyItm",
    "tyItmSv",
    "moPrcReg",
    "moPrcAct",
    "moExtnd",
    "quItmLmRtnSls",
    "moTxblRtnSls",
    "moTxRtnSls"
})
public class SaleReturnLineItem {

    protected int idStrRt;
    protected int idWs;
    protected String dcDyBsn;
    protected int aiTrn;
    protected int aiLnItem;
    protected int idStrGpr;
    protected int idItm;
    protected String idItmPs;
    protected int idItmPsQfr;
    protected int idGpTx;
    protected String tyItm;
    protected String tyItmSv;
    protected double moPrcReg;
    protected double moPrcAct;
    protected double moExtnd;
    protected double quItmLmRtnSls;
    protected double moTxblRtnSls;
    protected double moTxRtnSls;

    /**
     * Obtiene el valor de la propiedad idStrRt.
     * 
     */
    public int getIdStrRt() {
        return idStrRt;
    }

    /**
     * Define el valor de la propiedad idStrRt.
     * 
     */
    public void setIdStrRt(int value) {
        this.idStrRt = value;
    }

    /**
     * Obtiene el valor de la propiedad idWs.
     * 
     */
    public int getIdWs() {
        return idWs;
    }

    /**
     * Define el valor de la propiedad idWs.
     * 
     */
    public void setIdWs(int value) {
        this.idWs = value;
    }

    /**
     * Obtiene el valor de la propiedad dcDyBsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcDyBsn() {
        return dcDyBsn;
    }

    /**
     * Define el valor de la propiedad dcDyBsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcDyBsn(String value) {
        this.dcDyBsn = value;
    }

    /**
     * Obtiene el valor de la propiedad aiTrn.
     * 
     */
    public int getAiTrn() {
        return aiTrn;
    }

    /**
     * Define el valor de la propiedad aiTrn.
     * 
     */
    public void setAiTrn(int value) {
        this.aiTrn = value;
    }

    /**
     * Obtiene el valor de la propiedad aiLnItem.
     * 
     */
    public int getAiLnItem() {
        return aiLnItem;
    }

    /**
     * Define el valor de la propiedad aiLnItem.
     * 
     */
    public void setAiLnItem(int value) {
        this.aiLnItem = value;
    }

    /**
     * Obtiene el valor de la propiedad idStrGpr.
     * 
     */
    public int getIdStrGpr() {
        return idStrGpr;
    }

    /**
     * Define el valor de la propiedad idStrGpr.
     * 
     */
    public void setIdStrGpr(int value) {
        this.idStrGpr = value;
    }

    /**
     * Obtiene el valor de la propiedad idItm.
     * 
     */
    public int getIdItm() {
        return idItm;
    }

    /**
     * Define el valor de la propiedad idItm.
     * 
     */
    public void setIdItm(int value) {
        this.idItm = value;
    }

    /**
     * Obtiene el valor de la propiedad idItmPs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdItmPs() {
        return idItmPs;
    }

    /**
     * Define el valor de la propiedad idItmPs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdItmPs(String value) {
        this.idItmPs = value;
    }

    /**
     * Obtiene el valor de la propiedad idItmPsQfr.
     * 
     */
    public int getIdItmPsQfr() {
        return idItmPsQfr;
    }

    /**
     * Define el valor de la propiedad idItmPsQfr.
     * 
     */
    public void setIdItmPsQfr(int value) {
        this.idItmPsQfr = value;
    }

    /**
     * Obtiene el valor de la propiedad idGpTx.
     * 
     */
    public int getIdGpTx() {
        return idGpTx;
    }

    /**
     * Define el valor de la propiedad idGpTx.
     * 
     */
    public void setIdGpTx(int value) {
        this.idGpTx = value;
    }

    /**
     * Obtiene el valor de la propiedad tyItm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyItm() {
        return tyItm;
    }

    /**
     * Define el valor de la propiedad tyItm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyItm(String value) {
        this.tyItm = value;
    }

    /**
     * Obtiene el valor de la propiedad tyItmSv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyItmSv() {
        return tyItmSv;
    }

    /**
     * Define el valor de la propiedad tyItmSv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyItmSv(String value) {
        this.tyItmSv = value;
    }

    /**
     * Obtiene el valor de la propiedad moPrcReg.
     * 
     */
    public double getMoPrcReg() {
        return moPrcReg;
    }

    /**
     * Define el valor de la propiedad moPrcReg.
     * 
     */
    public void setMoPrcReg(double value) {
        this.moPrcReg = value;
    }

    /**
     * Obtiene el valor de la propiedad moPrcAct.
     * 
     */
    public double getMoPrcAct() {
        return moPrcAct;
    }

    /**
     * Define el valor de la propiedad moPrcAct.
     * 
     */
    public void setMoPrcAct(double value) {
        this.moPrcAct = value;
    }

    /**
     * Obtiene el valor de la propiedad moExtnd.
     * 
     */
    public double getMoExtnd() {
        return moExtnd;
    }

    /**
     * Define el valor de la propiedad moExtnd.
     * 
     */
    public void setMoExtnd(double value) {
        this.moExtnd = value;
    }

    /**
     * Obtiene el valor de la propiedad quItmLmRtnSls.
     * 
     */
    public double getQuItmLmRtnSls() {
        return quItmLmRtnSls;
    }

    /**
     * Define el valor de la propiedad quItmLmRtnSls.
     * 
     */
    public void setQuItmLmRtnSls(double value) {
        this.quItmLmRtnSls = value;
    }

    /**
     * Obtiene el valor de la propiedad moTxblRtnSls.
     * 
     */
    public double getMoTxblRtnSls() {
        return moTxblRtnSls;
    }

    /**
     * Define el valor de la propiedad moTxblRtnSls.
     * 
     */
    public void setMoTxblRtnSls(double value) {
        this.moTxblRtnSls = value;
    }

    /**
     * Obtiene el valor de la propiedad moTxRtnSls.
     * 
     */
    public double getMoTxRtnSls() {
        return moTxRtnSls;
    }

    /**
     * Define el valor de la propiedad moTxRtnSls.
     * 
     */
    public void setMoTxRtnSls(double value) {
        this.moTxRtnSls = value;
    }

}
