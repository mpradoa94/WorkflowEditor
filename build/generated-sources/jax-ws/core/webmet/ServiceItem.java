
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para serviceItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CP_BS_SV_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CP_NT_SV_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PE_BS_SV_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PE_NT_SV_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TY_CLC_SV_ITEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_CST_EST_SV_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_ITM_SV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_CLC_PRICE_ITEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_PE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="WEB_FL_REFR_ST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_USR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_USR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_TY_TDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_TY_TDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_VENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_VENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_SEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_SEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_IMPORTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_LBL_REF_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQ_AUT_SFTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externaluser" type="{http://Webmet.core/}externalUser" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://Webmet.core/}supplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceItem", propOrder = {
    "iditm",
    "idspr",
    "cpbssvitm",
    "cpntsvitm",
    "pebssvitm",
    "pentsvitm",
    "tyclcsvitem",
    "dccstestsvitm",
    "tyitmsv",
    "weburl",
    "webclcpriceitem",
    "webpe",
    "webflrefrst",
    "weblblusr",
    "webusr",
    "weblblpwd",
    "webpwd",
    "weblbltytdc",
    "webtytdc",
    "weblblvence",
    "webvence",
    "weblblsec",
    "websec",
    "weblblimporte",
    "weblblpost",
    "weblblref1",
    "weblblref2",
    "weblblref3",
    "weblblref4",
    "weblblref5",
    "weblblref6",
    "weblblref7",
    "weblblref8",
    "weblblref9",
    "weblblref10",
    "reqautsfty",
    "externaluser",
    "supplier"
})
public class ServiceItem {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_SPR")
    protected int idspr;
    @XmlElement(name = "CP_BS_SV_ITM")
    protected double cpbssvitm;
    @XmlElement(name = "CP_NT_SV_ITM")
    protected double cpntsvitm;
    @XmlElement(name = "PE_BS_SV_ITM")
    protected double pebssvitm;
    @XmlElement(name = "PE_NT_SV_ITM")
    protected double pentsvitm;
    @XmlElement(name = "TY_CLC_SV_ITEM")
    protected String tyclcsvitem;
    @XmlElement(name = "DC_CST_EST_SV_ITM")
    protected String dccstestsvitm;
    @XmlElement(name = "TY_ITM_SV")
    protected String tyitmsv;
    @XmlElement(name = "WEB_URL")
    protected String weburl;
    @XmlElement(name = "WEB_CLC_PRICE_ITEM")
    protected String webclcpriceitem;
    @XmlElement(name = "WEB_PE")
    protected double webpe;
    @XmlElement(name = "WEB_FL_REFR_ST")
    protected String webflrefrst;
    @XmlElement(name = "WEB_LBL_USR")
    protected String weblblusr;
    @XmlElement(name = "WEB_USR")
    protected String webusr;
    @XmlElement(name = "WEB_LBL_PWD")
    protected String weblblpwd;
    @XmlElement(name = "WEB_PWD")
    protected String webpwd;
    @XmlElement(name = "WEB_LBL_TY_TDC")
    protected String weblbltytdc;
    @XmlElement(name = "WEB_TY_TDC")
    protected String webtytdc;
    @XmlElement(name = "WEB_LBL_VENCE")
    protected String weblblvence;
    @XmlElement(name = "WEB_VENCE")
    protected String webvence;
    @XmlElement(name = "WEB_LBL_SEC")
    protected String weblblsec;
    @XmlElement(name = "WEB_SEC")
    protected String websec;
    @XmlElement(name = "WEB_LBL_IMPORTE")
    protected String weblblimporte;
    @XmlElement(name = "WEB_LBL_POST")
    protected String weblblpost;
    @XmlElement(name = "WEB_LBL_REF_1")
    protected String weblblref1;
    @XmlElement(name = "WEB_LBL_REF_2")
    protected String weblblref2;
    @XmlElement(name = "WEB_LBL_REF_3")
    protected String weblblref3;
    @XmlElement(name = "WEB_LBL_REF_4")
    protected String weblblref4;
    @XmlElement(name = "WEB_LBL_REF_5")
    protected String weblblref5;
    @XmlElement(name = "WEB_LBL_REF_6")
    protected String weblblref6;
    @XmlElement(name = "WEB_LBL_REF_7")
    protected String weblblref7;
    @XmlElement(name = "WEB_LBL_REF_8")
    protected String weblblref8;
    @XmlElement(name = "WEB_LBL_REF_9")
    protected String weblblref9;
    @XmlElement(name = "WEB_LBL_REF_10")
    protected String weblblref10;
    @XmlElement(name = "REQ_AUT_SFTY")
    protected String reqautsfty;
    protected ExternalUser externaluser;
    protected Supplier supplier;

    /**
     * Obtiene el valor de la propiedad iditm.
     * 
     */
    public int getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     */
    public void setIDITM(int value) {
        this.iditm = value;
    }

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
     * Obtiene el valor de la propiedad cpbssvitm.
     * 
     */
    public double getCPBSSVITM() {
        return cpbssvitm;
    }

    /**
     * Define el valor de la propiedad cpbssvitm.
     * 
     */
    public void setCPBSSVITM(double value) {
        this.cpbssvitm = value;
    }

    /**
     * Obtiene el valor de la propiedad cpntsvitm.
     * 
     */
    public double getCPNTSVITM() {
        return cpntsvitm;
    }

    /**
     * Define el valor de la propiedad cpntsvitm.
     * 
     */
    public void setCPNTSVITM(double value) {
        this.cpntsvitm = value;
    }

    /**
     * Obtiene el valor de la propiedad pebssvitm.
     * 
     */
    public double getPEBSSVITM() {
        return pebssvitm;
    }

    /**
     * Define el valor de la propiedad pebssvitm.
     * 
     */
    public void setPEBSSVITM(double value) {
        this.pebssvitm = value;
    }

    /**
     * Obtiene el valor de la propiedad pentsvitm.
     * 
     */
    public double getPENTSVITM() {
        return pentsvitm;
    }

    /**
     * Define el valor de la propiedad pentsvitm.
     * 
     */
    public void setPENTSVITM(double value) {
        this.pentsvitm = value;
    }

    /**
     * Obtiene el valor de la propiedad tyclcsvitem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYCLCSVITEM() {
        return tyclcsvitem;
    }

    /**
     * Define el valor de la propiedad tyclcsvitem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYCLCSVITEM(String value) {
        this.tyclcsvitem = value;
    }

    /**
     * Obtiene el valor de la propiedad dccstestsvitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCSTESTSVITM() {
        return dccstestsvitm;
    }

    /**
     * Define el valor de la propiedad dccstestsvitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCSTESTSVITM(String value) {
        this.dccstestsvitm = value;
    }

    /**
     * Obtiene el valor de la propiedad tyitmsv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYITMSV() {
        return tyitmsv;
    }

    /**
     * Define el valor de la propiedad tyitmsv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYITMSV(String value) {
        this.tyitmsv = value;
    }

    /**
     * Obtiene el valor de la propiedad weburl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBURL() {
        return weburl;
    }

    /**
     * Define el valor de la propiedad weburl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBURL(String value) {
        this.weburl = value;
    }

    /**
     * Obtiene el valor de la propiedad webclcpriceitem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBCLCPRICEITEM() {
        return webclcpriceitem;
    }

    /**
     * Define el valor de la propiedad webclcpriceitem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBCLCPRICEITEM(String value) {
        this.webclcpriceitem = value;
    }

    /**
     * Obtiene el valor de la propiedad webpe.
     * 
     */
    public double getWEBPE() {
        return webpe;
    }

    /**
     * Define el valor de la propiedad webpe.
     * 
     */
    public void setWEBPE(double value) {
        this.webpe = value;
    }

    /**
     * Obtiene el valor de la propiedad webflrefrst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBFLREFRST() {
        return webflrefrst;
    }

    /**
     * Define el valor de la propiedad webflrefrst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBFLREFRST(String value) {
        this.webflrefrst = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblusr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLUSR() {
        return weblblusr;
    }

    /**
     * Define el valor de la propiedad weblblusr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLUSR(String value) {
        this.weblblusr = value;
    }

    /**
     * Obtiene el valor de la propiedad webusr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBUSR() {
        return webusr;
    }

    /**
     * Define el valor de la propiedad webusr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBUSR(String value) {
        this.webusr = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblpwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLPWD() {
        return weblblpwd;
    }

    /**
     * Define el valor de la propiedad weblblpwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLPWD(String value) {
        this.weblblpwd = value;
    }

    /**
     * Obtiene el valor de la propiedad webpwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBPWD() {
        return webpwd;
    }

    /**
     * Define el valor de la propiedad webpwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBPWD(String value) {
        this.webpwd = value;
    }

    /**
     * Obtiene el valor de la propiedad weblbltytdc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLTYTDC() {
        return weblbltytdc;
    }

    /**
     * Define el valor de la propiedad weblbltytdc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLTYTDC(String value) {
        this.weblbltytdc = value;
    }

    /**
     * Obtiene el valor de la propiedad webtytdc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBTYTDC() {
        return webtytdc;
    }

    /**
     * Define el valor de la propiedad webtytdc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBTYTDC(String value) {
        this.webtytdc = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblvence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLVENCE() {
        return weblblvence;
    }

    /**
     * Define el valor de la propiedad weblblvence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLVENCE(String value) {
        this.weblblvence = value;
    }

    /**
     * Obtiene el valor de la propiedad webvence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBVENCE() {
        return webvence;
    }

    /**
     * Define el valor de la propiedad webvence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBVENCE(String value) {
        this.webvence = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblsec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLSEC() {
        return weblblsec;
    }

    /**
     * Define el valor de la propiedad weblblsec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLSEC(String value) {
        this.weblblsec = value;
    }

    /**
     * Obtiene el valor de la propiedad websec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBSEC() {
        return websec;
    }

    /**
     * Define el valor de la propiedad websec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBSEC(String value) {
        this.websec = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblimporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLIMPORTE() {
        return weblblimporte;
    }

    /**
     * Define el valor de la propiedad weblblimporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLIMPORTE(String value) {
        this.weblblimporte = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblpost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLPOST() {
        return weblblpost;
    }

    /**
     * Define el valor de la propiedad weblblpost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLPOST(String value) {
        this.weblblpost = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF1() {
        return weblblref1;
    }

    /**
     * Define el valor de la propiedad weblblref1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF1(String value) {
        this.weblblref1 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF2() {
        return weblblref2;
    }

    /**
     * Define el valor de la propiedad weblblref2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF2(String value) {
        this.weblblref2 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF3() {
        return weblblref3;
    }

    /**
     * Define el valor de la propiedad weblblref3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF3(String value) {
        this.weblblref3 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF4() {
        return weblblref4;
    }

    /**
     * Define el valor de la propiedad weblblref4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF4(String value) {
        this.weblblref4 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF5() {
        return weblblref5;
    }

    /**
     * Define el valor de la propiedad weblblref5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF5(String value) {
        this.weblblref5 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF6() {
        return weblblref6;
    }

    /**
     * Define el valor de la propiedad weblblref6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF6(String value) {
        this.weblblref6 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF7() {
        return weblblref7;
    }

    /**
     * Define el valor de la propiedad weblblref7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF7(String value) {
        this.weblblref7 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF8() {
        return weblblref8;
    }

    /**
     * Define el valor de la propiedad weblblref8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF8(String value) {
        this.weblblref8 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF9() {
        return weblblref9;
    }

    /**
     * Define el valor de la propiedad weblblref9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF9(String value) {
        this.weblblref9 = value;
    }

    /**
     * Obtiene el valor de la propiedad weblblref10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBLBLREF10() {
        return weblblref10;
    }

    /**
     * Define el valor de la propiedad weblblref10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBLBLREF10(String value) {
        this.weblblref10 = value;
    }

    /**
     * Obtiene el valor de la propiedad reqautsfty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQAUTSFTY() {
        return reqautsfty;
    }

    /**
     * Define el valor de la propiedad reqautsfty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQAUTSFTY(String value) {
        this.reqautsfty = value;
    }

    /**
     * Obtiene el valor de la propiedad externaluser.
     * 
     * @return
     *     possible object is
     *     {@link ExternalUser }
     *     
     */
    public ExternalUser getExternaluser() {
        return externaluser;
    }

    /**
     * Define el valor de la propiedad externaluser.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalUser }
     *     
     */
    public void setExternaluser(ExternalUser value) {
        this.externaluser = value;
    }

    /**
     * Obtiene el valor de la propiedad supplier.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Define el valor de la propiedad supplier.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

}
