
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AI_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TS_TM_STR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_TRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_TRN_BGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_TRN_END" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_CNCL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_VD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_TRG_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_KEY_OFL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="retailTran" type="{http://Webmet.core/}retailTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction", propOrder = {
    "idstrrt",
    "idws",
    "dcdybsn",
    "aitrn",
    "idopr",
    "tstmstr",
    "tytrn",
    "tstrnbgn",
    "tstrnend",
    "flcncl",
    "flvd",
    "fltrgtrn",
    "flkeyofl",
    "retailTran"
})
public class Transaction {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_WS")
    protected int idws;
    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "AI_TRN")
    protected int aitrn;
    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(name = "TS_TM_STR")
    protected String tstmstr;
    @XmlElement(name = "TY_TRN")
    protected String tytrn;
    @XmlElement(name = "TS_TRN_BGN")
    protected String tstrnbgn;
    @XmlElement(name = "TS_TRN_END")
    protected String tstrnend;
    @XmlElement(name = "FL_CNCL")
    protected int flcncl;
    @XmlElement(name = "FL_VD")
    protected int flvd;
    @XmlElement(name = "FL_TRG_TRN")
    protected int fltrgtrn;
    @XmlElement(name = "FL_KEY_OFL")
    protected int flkeyofl;
    protected RetailTransaction retailTran;

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
     * Obtiene el valor de la propiedad idws.
     * 
     */
    public int getIDWS() {
        return idws;
    }

    /**
     * Define el valor de la propiedad idws.
     * 
     */
    public void setIDWS(int value) {
        this.idws = value;
    }

    /**
     * Obtiene el valor de la propiedad dcdybsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDYBSN() {
        return dcdybsn;
    }

    /**
     * Define el valor de la propiedad dcdybsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDYBSN(String value) {
        this.dcdybsn = value;
    }

    /**
     * Obtiene el valor de la propiedad aitrn.
     * 
     */
    public int getAITRN() {
        return aitrn;
    }

    /**
     * Define el valor de la propiedad aitrn.
     * 
     */
    public void setAITRN(int value) {
        this.aitrn = value;
    }

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

    /**
     * Obtiene el valor de la propiedad tstmstr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSTMSTR() {
        return tstmstr;
    }

    /**
     * Define el valor de la propiedad tstmstr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSTMSTR(String value) {
        this.tstmstr = value;
    }

    /**
     * Obtiene el valor de la propiedad tytrn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTRN() {
        return tytrn;
    }

    /**
     * Define el valor de la propiedad tytrn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTRN(String value) {
        this.tytrn = value;
    }

    /**
     * Obtiene el valor de la propiedad tstrnbgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSTRNBGN() {
        return tstrnbgn;
    }

    /**
     * Define el valor de la propiedad tstrnbgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSTRNBGN(String value) {
        this.tstrnbgn = value;
    }

    /**
     * Obtiene el valor de la propiedad tstrnend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSTRNEND() {
        return tstrnend;
    }

    /**
     * Define el valor de la propiedad tstrnend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSTRNEND(String value) {
        this.tstrnend = value;
    }

    /**
     * Obtiene el valor de la propiedad flcncl.
     * 
     */
    public int getFLCNCL() {
        return flcncl;
    }

    /**
     * Define el valor de la propiedad flcncl.
     * 
     */
    public void setFLCNCL(int value) {
        this.flcncl = value;
    }

    /**
     * Obtiene el valor de la propiedad flvd.
     * 
     */
    public int getFLVD() {
        return flvd;
    }

    /**
     * Define el valor de la propiedad flvd.
     * 
     */
    public void setFLVD(int value) {
        this.flvd = value;
    }

    /**
     * Obtiene el valor de la propiedad fltrgtrn.
     * 
     */
    public int getFLTRGTRN() {
        return fltrgtrn;
    }

    /**
     * Define el valor de la propiedad fltrgtrn.
     * 
     */
    public void setFLTRGTRN(int value) {
        this.fltrgtrn = value;
    }

    /**
     * Obtiene el valor de la propiedad flkeyofl.
     * 
     */
    public int getFLKEYOFL() {
        return flkeyofl;
    }

    /**
     * Define el valor de la propiedad flkeyofl.
     * 
     */
    public void setFLKEYOFL(int value) {
        this.flkeyofl = value;
    }

    /**
     * Obtiene el valor de la propiedad retailTran.
     * 
     * @return
     *     possible object is
     *     {@link RetailTransaction }
     *     
     */
    public RetailTransaction getRetailTran() {
        return retailTran;
    }

    /**
     * Define el valor de la propiedad retailTran.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailTransaction }
     *     
     */
    public void setRetailTran(RetailTransaction value) {
        this.retailTran = value;
    }

}
