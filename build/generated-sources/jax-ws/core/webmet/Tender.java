
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tender complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ACT_LDG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CNY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_TND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_NMB_SRZ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_AZN_RQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LU_MTH_AZN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_DT_AZN_EP_RQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IN_WIT_AZN_MXM_ALOW" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_IDTN_RQ_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_ID_PRSL_RQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_AVLB_LCL_CNY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FL_SGNTR_CT_RQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MO_TH_TND_CHN" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FL_DRW_OPEN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MO_APVL_TNDCE_OFF" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FL_ENDSM_RQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PLAZOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BTN_ASIGNED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOOD_STAMP_EX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tender", propOrder = {
    "tytnd",
    "idactldg",
    "idcny",
    "detnd",
    "flnmbsrz",
    "flaznrq",
    "lumthazn",
    "fldtazneprq",
    "inwitaznmxmalow",
    "flidtnrqct",
    "flidprslrq",
    "flavlblclcny",
    "flsgntrctrq",
    "mothtndchn",
    "fldrwopen",
    "moapvltndceoff",
    "flendsmrq",
    "plazos",
    "iditm",
    "btnasigned",
    "foodstampex"
})
public class Tender {

    @XmlElement(name = "TY_TND")
    protected String tytnd;
    @XmlElement(name = "ID_ACT_LDG")
    protected int idactldg;
    @XmlElement(name = "ID_CNY")
    protected int idcny;
    @XmlElement(name = "DE_TND")
    protected String detnd;
    @XmlElement(name = "FL_NMB_SRZ")
    protected int flnmbsrz;
    @XmlElement(name = "FL_AZN_RQ")
    protected int flaznrq;
    @XmlElement(name = "LU_MTH_AZN")
    protected String lumthazn;
    @XmlElement(name = "FL_DT_AZN_EP_RQ")
    protected String fldtazneprq;
    @XmlElement(name = "IN_WIT_AZN_MXM_ALOW")
    protected int inwitaznmxmalow;
    @XmlElement(name = "FL_IDTN_RQ_CT")
    protected int flidtnrqct;
    @XmlElement(name = "FL_ID_PRSL_RQ")
    protected int flidprslrq;
    @XmlElement(name = "FL_AVLB_LCL_CNY")
    protected int flavlblclcny;
    @XmlElement(name = "FL_SGNTR_CT_RQ")
    protected int flsgntrctrq;
    @XmlElement(name = "MO_TH_TND_CHN")
    protected double mothtndchn;
    @XmlElement(name = "FL_DRW_OPEN")
    protected int fldrwopen;
    @XmlElement(name = "MO_APVL_TNDCE_OFF")
    protected double moapvltndceoff;
    @XmlElement(name = "FL_ENDSM_RQ")
    protected int flendsmrq;
    @XmlElement(name = "PLAZOS")
    protected String plazos;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "BTN_ASIGNED")
    protected String btnasigned;
    @XmlElement(name = "FOOD_STAMP_EX")
    protected String foodstampex;

    /**
     * Obtiene el valor de la propiedad tytnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTND() {
        return tytnd;
    }

    /**
     * Define el valor de la propiedad tytnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTND(String value) {
        this.tytnd = value;
    }

    /**
     * Obtiene el valor de la propiedad idactldg.
     * 
     */
    public int getIDACTLDG() {
        return idactldg;
    }

    /**
     * Define el valor de la propiedad idactldg.
     * 
     */
    public void setIDACTLDG(int value) {
        this.idactldg = value;
    }

    /**
     * Obtiene el valor de la propiedad idcny.
     * 
     */
    public int getIDCNY() {
        return idcny;
    }

    /**
     * Define el valor de la propiedad idcny.
     * 
     */
    public void setIDCNY(int value) {
        this.idcny = value;
    }

    /**
     * Obtiene el valor de la propiedad detnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDETND() {
        return detnd;
    }

    /**
     * Define el valor de la propiedad detnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDETND(String value) {
        this.detnd = value;
    }

    /**
     * Obtiene el valor de la propiedad flnmbsrz.
     * 
     */
    public int getFLNMBSRZ() {
        return flnmbsrz;
    }

    /**
     * Define el valor de la propiedad flnmbsrz.
     * 
     */
    public void setFLNMBSRZ(int value) {
        this.flnmbsrz = value;
    }

    /**
     * Obtiene el valor de la propiedad flaznrq.
     * 
     */
    public int getFLAZNRQ() {
        return flaznrq;
    }

    /**
     * Define el valor de la propiedad flaznrq.
     * 
     */
    public void setFLAZNRQ(int value) {
        this.flaznrq = value;
    }

    /**
     * Obtiene el valor de la propiedad lumthazn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLUMTHAZN() {
        return lumthazn;
    }

    /**
     * Define el valor de la propiedad lumthazn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLUMTHAZN(String value) {
        this.lumthazn = value;
    }

    /**
     * Obtiene el valor de la propiedad fldtazneprq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLDTAZNEPRQ() {
        return fldtazneprq;
    }

    /**
     * Define el valor de la propiedad fldtazneprq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLDTAZNEPRQ(String value) {
        this.fldtazneprq = value;
    }

    /**
     * Obtiene el valor de la propiedad inwitaznmxmalow.
     * 
     */
    public int getINWITAZNMXMALOW() {
        return inwitaznmxmalow;
    }

    /**
     * Define el valor de la propiedad inwitaznmxmalow.
     * 
     */
    public void setINWITAZNMXMALOW(int value) {
        this.inwitaznmxmalow = value;
    }

    /**
     * Obtiene el valor de la propiedad flidtnrqct.
     * 
     */
    public int getFLIDTNRQCT() {
        return flidtnrqct;
    }

    /**
     * Define el valor de la propiedad flidtnrqct.
     * 
     */
    public void setFLIDTNRQCT(int value) {
        this.flidtnrqct = value;
    }

    /**
     * Obtiene el valor de la propiedad flidprslrq.
     * 
     */
    public int getFLIDPRSLRQ() {
        return flidprslrq;
    }

    /**
     * Define el valor de la propiedad flidprslrq.
     * 
     */
    public void setFLIDPRSLRQ(int value) {
        this.flidprslrq = value;
    }

    /**
     * Obtiene el valor de la propiedad flavlblclcny.
     * 
     */
    public int getFLAVLBLCLCNY() {
        return flavlblclcny;
    }

    /**
     * Define el valor de la propiedad flavlblclcny.
     * 
     */
    public void setFLAVLBLCLCNY(int value) {
        this.flavlblclcny = value;
    }

    /**
     * Obtiene el valor de la propiedad flsgntrctrq.
     * 
     */
    public int getFLSGNTRCTRQ() {
        return flsgntrctrq;
    }

    /**
     * Define el valor de la propiedad flsgntrctrq.
     * 
     */
    public void setFLSGNTRCTRQ(int value) {
        this.flsgntrctrq = value;
    }

    /**
     * Obtiene el valor de la propiedad mothtndchn.
     * 
     */
    public double getMOTHTNDCHN() {
        return mothtndchn;
    }

    /**
     * Define el valor de la propiedad mothtndchn.
     * 
     */
    public void setMOTHTNDCHN(double value) {
        this.mothtndchn = value;
    }

    /**
     * Obtiene el valor de la propiedad fldrwopen.
     * 
     */
    public int getFLDRWOPEN() {
        return fldrwopen;
    }

    /**
     * Define el valor de la propiedad fldrwopen.
     * 
     */
    public void setFLDRWOPEN(int value) {
        this.fldrwopen = value;
    }

    /**
     * Obtiene el valor de la propiedad moapvltndceoff.
     * 
     */
    public double getMOAPVLTNDCEOFF() {
        return moapvltndceoff;
    }

    /**
     * Define el valor de la propiedad moapvltndceoff.
     * 
     */
    public void setMOAPVLTNDCEOFF(double value) {
        this.moapvltndceoff = value;
    }

    /**
     * Obtiene el valor de la propiedad flendsmrq.
     * 
     */
    public int getFLENDSMRQ() {
        return flendsmrq;
    }

    /**
     * Define el valor de la propiedad flendsmrq.
     * 
     */
    public void setFLENDSMRQ(int value) {
        this.flendsmrq = value;
    }

    /**
     * Obtiene el valor de la propiedad plazos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLAZOS() {
        return plazos;
    }

    /**
     * Define el valor de la propiedad plazos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLAZOS(String value) {
        this.plazos = value;
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
     * Obtiene el valor de la propiedad btnasigned.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTNASIGNED() {
        return btnasigned;
    }

    /**
     * Define el valor de la propiedad btnasigned.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTNASIGNED(String value) {
        this.btnasigned = value;
    }

    /**
     * Obtiene el valor de la propiedad foodstampex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOODSTAMPEX() {
        return foodstampex;
    }

    /**
     * Define el valor de la propiedad foodstampex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOODSTAMPEX(String value) {
        this.foodstampex = value;
    }

}
