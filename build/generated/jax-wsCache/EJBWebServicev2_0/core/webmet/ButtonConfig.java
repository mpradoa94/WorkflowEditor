
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buttonConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buttonConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BTNSET" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BTN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BTN_PRNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_BTN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BTN_WT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_BTN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DE_BTN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ICON_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_STRGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS_QFR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEB_SERV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARAMS_LIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buttonConfig", propOrder = {
    "idstrrt",
    "idbtnset",
    "idbtn",
    "idbtnprnt",
    "tybtn",
    "btnwt",
    "nmbtn",
    "debtn",
    "pic",
    "iditm",
    "iconaddress",
    "idstrgrp",
    "iditmps",
    "iditmpsqfr",
    "url",
    "webserv",
    "paramslist",
    "position"
})
public class ButtonConfig {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_BTNSET")
    protected int idbtnset;
    @XmlElement(name = "ID_BTN")
    protected int idbtn;
    @XmlElement(name = "ID_BTN_PRNT")
    protected int idbtnprnt;
    @XmlElement(name = "TY_BTN", required = true)
    protected String tybtn;
    @XmlElement(name = "BTN_WT")
    protected int btnwt;
    @XmlElement(name = "NM_BTN", required = true)
    protected String nmbtn;
    @XmlElement(name = "DE_BTN", required = true)
    protected String debtn;
    @XmlElement(name = "PIC")
    protected String pic;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ICON_ADDRESS")
    protected String iconaddress;
    @XmlElement(name = "ID_STRGRP")
    protected int idstrgrp;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "ID_ITM_PS_QFR")
    protected int iditmpsqfr;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "WEB_SERV")
    protected String webserv;
    @XmlElement(name = "PARAMS_LIST")
    protected String paramslist;
    @XmlElement(name = "POSITION")
    protected int position;

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad idbtnset.
     * 
     */
    public int getIDBTNSET() {
        return idbtnset;
    }

    /**
     * Define el valor de la propiedad idbtnset.
     * 
     */
    public void setIDBTNSET(int value) {
        this.idbtnset = value;
    }

    /**
     * Obtiene el valor de la propiedad idbtn.
     * 
     */
    public int getIDBTN() {
        return idbtn;
    }

    /**
     * Define el valor de la propiedad idbtn.
     * 
     */
    public void setIDBTN(int value) {
        this.idbtn = value;
    }

    /**
     * Obtiene el valor de la propiedad idbtnprnt.
     * 
     */
    public int getIDBTNPRNT() {
        return idbtnprnt;
    }

    /**
     * Define el valor de la propiedad idbtnprnt.
     * 
     */
    public void setIDBTNPRNT(int value) {
        this.idbtnprnt = value;
    }

    /**
     * Obtiene el valor de la propiedad tybtn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYBTN() {
        return tybtn;
    }

    /**
     * Define el valor de la propiedad tybtn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYBTN(String value) {
        this.tybtn = value;
    }

    /**
     * Obtiene el valor de la propiedad btnwt.
     * 
     */
    public int getBTNWT() {
        return btnwt;
    }

    /**
     * Define el valor de la propiedad btnwt.
     * 
     */
    public void setBTNWT(int value) {
        this.btnwt = value;
    }

    /**
     * Obtiene el valor de la propiedad nmbtn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMBTN() {
        return nmbtn;
    }

    /**
     * Define el valor de la propiedad nmbtn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMBTN(String value) {
        this.nmbtn = value;
    }

    /**
     * Obtiene el valor de la propiedad debtn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBTN() {
        return debtn;
    }

    /**
     * Define el valor de la propiedad debtn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBTN(String value) {
        this.debtn = value;
    }

    /**
     * Obtiene el valor de la propiedad pic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIC() {
        return pic;
    }

    /**
     * Define el valor de la propiedad pic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIC(String value) {
        this.pic = value;
    }

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
     * Obtiene el valor de la propiedad iconaddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICONADDRESS() {
        return iconaddress;
    }

    /**
     * Define el valor de la propiedad iconaddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICONADDRESS(String value) {
        this.iconaddress = value;
    }

    /**
     * Obtiene el valor de la propiedad idstrgrp.
     * 
     */
    public int getIDSTRGRP() {
        return idstrgrp;
    }

    /**
     * Define el valor de la propiedad idstrgrp.
     * 
     */
    public void setIDSTRGRP(int value) {
        this.idstrgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDITMPS() {
        return iditmps;
    }

    /**
     * Define el valor de la propiedad iditmps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDITMPS(String value) {
        this.iditmps = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmpsqfr.
     * 
     */
    public int getIDITMPSQFR() {
        return iditmpsqfr;
    }

    /**
     * Define el valor de la propiedad iditmpsqfr.
     * 
     */
    public void setIDITMPSQFR(int value) {
        this.iditmpsqfr = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad webserv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBSERV() {
        return webserv;
    }

    /**
     * Define el valor de la propiedad webserv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBSERV(String value) {
        this.webserv = value;
    }

    /**
     * Obtiene el valor de la propiedad paramslist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAMSLIST() {
        return paramslist;
    }

    /**
     * Define el valor de la propiedad paramslist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAMSLIST(String value) {
        this.paramslist = value;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     */
    public int getPOSITION() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     */
    public void setPOSITION(int value) {
        this.position = value;
    }

}
