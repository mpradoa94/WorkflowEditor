
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inventoryTransactionJournalEntry complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inventoryTransactionJournalEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ANIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_JR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_ENR_JR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AI_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RPSTY_TND" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IC_CNT_PHY_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DCM_PHY_CNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IC_LN_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QU_UN_RT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RP_SLC_CRT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UCOSTO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ID_PID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LC_LCN_PID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_SRZ_FRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AJ_COSTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventoryTransactionJournalEntry", propOrder = {
    "idlcn",
    "anio",
    "mes",
    "idstrrt",
    "idjr",
    "dcenrjr",
    "iditm",
    "idws",
    "dcdybsn",
    "aitrn",
    "idrpstytnd",
    "iccntphyitm",
    "iddcmphycnt",
    "idicd",
    "iclnicd",
    "quunrt",
    "rpslccrt",
    "ucosto",
    "idpid",
    "lclcnpid",
    "tyicd",
    "referencia",
    "idsrzfrm",
    "ajcosto",
    "movimiento"
})
public class InventoryTransactionJournalEntry {

    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "ANIO")
    protected String anio;
    @XmlElement(name = "MES")
    protected String mes;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_JR")
    protected int idjr;
    @XmlElement(name = "DC_ENR_JR")
    protected String dcenrjr;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_WS")
    protected int idws;
    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "AI_TRN")
    protected int aitrn;
    @XmlElement(name = "ID_RPSTY_TND")
    protected int idrpstytnd;
    @XmlElement(name = "IC_CNT_PHY_ITM")
    protected int iccntphyitm;
    @XmlElement(name = "ID_DCM_PHY_CNT")
    protected int iddcmphycnt;
    @XmlElement(name = "ID_ICD")
    protected int idicd;
    @XmlElement(name = "IC_LN_ICD")
    protected int iclnicd;
    @XmlElement(name = "QU_UN_RT")
    protected double quunrt;
    @XmlElement(name = "RP_SLC_CRT")
    protected double rpslccrt;
    @XmlElement(name = "UCOSTO")
    protected double ucosto;
    @XmlElement(name = "ID_PID")
    protected int idpid;
    @XmlElement(name = "LC_LCN_PID")
    protected int lclcnpid;
    @XmlElement(name = "TY_ICD")
    protected String tyicd;
    @XmlElement(name = "REFERENCIA")
    protected String referencia;
    @XmlElement(name = "ID_SRZ_FRM")
    protected String idsrzfrm;
    @XmlElement(name = "AJ_COSTO")
    protected String ajcosto;
    protected String movimiento;

    /**
     * Obtiene el valor de la propiedad idlcn.
     * 
     */
    public int getIDLCN() {
        return idlcn;
    }

    /**
     * Define el valor de la propiedad idlcn.
     * 
     */
    public void setIDLCN(int value) {
        this.idlcn = value;
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
     * Obtiene el valor de la propiedad idjr.
     * 
     */
    public int getIDJR() {
        return idjr;
    }

    /**
     * Define el valor de la propiedad idjr.
     * 
     */
    public void setIDJR(int value) {
        this.idjr = value;
    }

    /**
     * Obtiene el valor de la propiedad dcenrjr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCENRJR() {
        return dcenrjr;
    }

    /**
     * Define el valor de la propiedad dcenrjr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCENRJR(String value) {
        this.dcenrjr = value;
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
     * Obtiene el valor de la propiedad idrpstytnd.
     * 
     */
    public int getIDRPSTYTND() {
        return idrpstytnd;
    }

    /**
     * Define el valor de la propiedad idrpstytnd.
     * 
     */
    public void setIDRPSTYTND(int value) {
        this.idrpstytnd = value;
    }

    /**
     * Obtiene el valor de la propiedad iccntphyitm.
     * 
     */
    public int getICCNTPHYITM() {
        return iccntphyitm;
    }

    /**
     * Define el valor de la propiedad iccntphyitm.
     * 
     */
    public void setICCNTPHYITM(int value) {
        this.iccntphyitm = value;
    }

    /**
     * Obtiene el valor de la propiedad iddcmphycnt.
     * 
     */
    public int getIDDCMPHYCNT() {
        return iddcmphycnt;
    }

    /**
     * Define el valor de la propiedad iddcmphycnt.
     * 
     */
    public void setIDDCMPHYCNT(int value) {
        this.iddcmphycnt = value;
    }

    /**
     * Obtiene el valor de la propiedad idicd.
     * 
     */
    public int getIDICD() {
        return idicd;
    }

    /**
     * Define el valor de la propiedad idicd.
     * 
     */
    public void setIDICD(int value) {
        this.idicd = value;
    }

    /**
     * Obtiene el valor de la propiedad iclnicd.
     * 
     */
    public int getICLNICD() {
        return iclnicd;
    }

    /**
     * Define el valor de la propiedad iclnicd.
     * 
     */
    public void setICLNICD(int value) {
        this.iclnicd = value;
    }

    /**
     * Obtiene el valor de la propiedad quunrt.
     * 
     */
    public double getQUUNRT() {
        return quunrt;
    }

    /**
     * Define el valor de la propiedad quunrt.
     * 
     */
    public void setQUUNRT(double value) {
        this.quunrt = value;
    }

    /**
     * Obtiene el valor de la propiedad rpslccrt.
     * 
     */
    public double getRPSLCCRT() {
        return rpslccrt;
    }

    /**
     * Define el valor de la propiedad rpslccrt.
     * 
     */
    public void setRPSLCCRT(double value) {
        this.rpslccrt = value;
    }

    /**
     * Obtiene el valor de la propiedad ucosto.
     * 
     */
    public double getUCOSTO() {
        return ucosto;
    }

    /**
     * Define el valor de la propiedad ucosto.
     * 
     */
    public void setUCOSTO(double value) {
        this.ucosto = value;
    }

    /**
     * Obtiene el valor de la propiedad idpid.
     * 
     */
    public int getIDPID() {
        return idpid;
    }

    /**
     * Define el valor de la propiedad idpid.
     * 
     */
    public void setIDPID(int value) {
        this.idpid = value;
    }

    /**
     * Obtiene el valor de la propiedad lclcnpid.
     * 
     */
    public int getLCLCNPID() {
        return lclcnpid;
    }

    /**
     * Define el valor de la propiedad lclcnpid.
     * 
     */
    public void setLCLCNPID(int value) {
        this.lclcnpid = value;
    }

    /**
     * Obtiene el valor de la propiedad tyicd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYICD() {
        return tyicd;
    }

    /**
     * Define el valor de la propiedad tyicd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYICD(String value) {
        this.tyicd = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCIA() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCIA(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idsrzfrm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSRZFRM() {
        return idsrzfrm;
    }

    /**
     * Define el valor de la propiedad idsrzfrm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSRZFRM(String value) {
        this.idsrzfrm = value;
    }

    /**
     * Obtiene el valor de la propiedad ajcosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAJCOSTO() {
        return ajcosto;
    }

    /**
     * Define el valor de la propiedad ajcosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAJCOSTO(String value) {
        this.ajcosto = value;
    }

    /**
     * Obtiene el valor de la propiedad movimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovimiento() {
        return movimiento;
    }

    /**
     * Define el valor de la propiedad movimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovimiento(String value) {
        this.movimiento = value;
    }

}
