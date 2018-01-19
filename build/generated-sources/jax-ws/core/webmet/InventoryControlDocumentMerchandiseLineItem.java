
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inventoryControlDocumentMerchandiseLineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inventoryControlDocumentMerchandiseLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LCN_DES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IC_LN_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LU_CN_INV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QU_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QU_UN_DM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QU_UN_SHP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TC_UN_BS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CP_UN_NT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RC_CHN_IDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_ITM_PRPTD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MULT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TC_BS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CP_NT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ID_ITM_EQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inventorycontroldocumentmerchandisetaxlineitem" type="{http://Webmet.core/}inventoryControlDocumentMerchandiseTaxLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LCN" type="{http://Webmet.core/}inventoryLocation" minOccurs="0"/>
 *         &lt;element name="item" type="{http://Webmet.core/}item" minOccurs="0"/>
 *         &lt;element name="stk" type="{http://Webmet.core/}stockLedgerAccount" minOccurs="0"/>
 *         &lt;element name="itemmov" type="{http://Webmet.core/}listaMovAlmacen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventoryControlDocumentMerchandiseLineItem", propOrder = {
    "idlcn",
    "idlcndes",
    "idicd",
    "iclnicd",
    "lucninv",
    "iditm",
    "quitm",
    "quundm",
    "quunshp",
    "tcunbs",
    "cpunnt",
    "rcchnidc",
    "flitmprptd",
    "mult",
    "tcbs",
    "cpnt",
    "iditmeq",
    "idstrrt",
    "inventorycontroldocumentmerchandisetaxlineitem",
    "lcn",
    "item",
    "stk",
    "itemmov"
})
public class InventoryControlDocumentMerchandiseLineItem {

    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "ID_LCN_DES")
    protected int idlcndes;
    @XmlElement(name = "ID_ICD")
    protected int idicd;
    @XmlElement(name = "IC_LN_ICD")
    protected int iclnicd;
    @XmlElement(name = "LU_CN_INV")
    protected String lucninv;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "QU_ITM")
    protected double quitm;
    @XmlElement(name = "QU_UN_DM")
    protected double quundm;
    @XmlElement(name = "QU_UN_SHP")
    protected double quunshp;
    @XmlElement(name = "TC_UN_BS")
    protected double tcunbs;
    @XmlElement(name = "CP_UN_NT")
    protected double cpunnt;
    @XmlElement(name = "RC_CHN_IDC")
    protected String rcchnidc;
    @XmlElement(name = "FL_ITM_PRPTD")
    protected int flitmprptd;
    @XmlElement(name = "MULT")
    protected double mult;
    @XmlElement(name = "TC_BS")
    protected double tcbs;
    @XmlElement(name = "CP_NT")
    protected double cpnt;
    @XmlElement(name = "ID_ITM_EQ")
    protected int iditmeq;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(nillable = true)
    protected List<InventoryControlDocumentMerchandiseTaxLineItem> inventorycontroldocumentmerchandisetaxlineitem;
    @XmlElement(name = "LCN")
    protected InventoryLocation lcn;
    protected Item item;
    protected StockLedgerAccount stk;
    protected ListaMovAlmacen itemmov;

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
     * Obtiene el valor de la propiedad idlcndes.
     * 
     */
    public int getIDLCNDES() {
        return idlcndes;
    }

    /**
     * Define el valor de la propiedad idlcndes.
     * 
     */
    public void setIDLCNDES(int value) {
        this.idlcndes = value;
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
     * Obtiene el valor de la propiedad lucninv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLUCNINV() {
        return lucninv;
    }

    /**
     * Define el valor de la propiedad lucninv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLUCNINV(String value) {
        this.lucninv = value;
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
     * Obtiene el valor de la propiedad quitm.
     * 
     */
    public double getQUITM() {
        return quitm;
    }

    /**
     * Define el valor de la propiedad quitm.
     * 
     */
    public void setQUITM(double value) {
        this.quitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quundm.
     * 
     */
    public double getQUUNDM() {
        return quundm;
    }

    /**
     * Define el valor de la propiedad quundm.
     * 
     */
    public void setQUUNDM(double value) {
        this.quundm = value;
    }

    /**
     * Obtiene el valor de la propiedad quunshp.
     * 
     */
    public double getQUUNSHP() {
        return quunshp;
    }

    /**
     * Define el valor de la propiedad quunshp.
     * 
     */
    public void setQUUNSHP(double value) {
        this.quunshp = value;
    }

    /**
     * Obtiene el valor de la propiedad tcunbs.
     * 
     */
    public double getTCUNBS() {
        return tcunbs;
    }

    /**
     * Define el valor de la propiedad tcunbs.
     * 
     */
    public void setTCUNBS(double value) {
        this.tcunbs = value;
    }

    /**
     * Obtiene el valor de la propiedad cpunnt.
     * 
     */
    public double getCPUNNT() {
        return cpunnt;
    }

    /**
     * Define el valor de la propiedad cpunnt.
     * 
     */
    public void setCPUNNT(double value) {
        this.cpunnt = value;
    }

    /**
     * Obtiene el valor de la propiedad rcchnidc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCCHNIDC() {
        return rcchnidc;
    }

    /**
     * Define el valor de la propiedad rcchnidc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCCHNIDC(String value) {
        this.rcchnidc = value;
    }

    /**
     * Obtiene el valor de la propiedad flitmprptd.
     * 
     */
    public int getFLITMPRPTD() {
        return flitmprptd;
    }

    /**
     * Define el valor de la propiedad flitmprptd.
     * 
     */
    public void setFLITMPRPTD(int value) {
        this.flitmprptd = value;
    }

    /**
     * Obtiene el valor de la propiedad mult.
     * 
     */
    public double getMULT() {
        return mult;
    }

    /**
     * Define el valor de la propiedad mult.
     * 
     */
    public void setMULT(double value) {
        this.mult = value;
    }

    /**
     * Obtiene el valor de la propiedad tcbs.
     * 
     */
    public double getTCBS() {
        return tcbs;
    }

    /**
     * Define el valor de la propiedad tcbs.
     * 
     */
    public void setTCBS(double value) {
        this.tcbs = value;
    }

    /**
     * Obtiene el valor de la propiedad cpnt.
     * 
     */
    public double getCPNT() {
        return cpnt;
    }

    /**
     * Define el valor de la propiedad cpnt.
     * 
     */
    public void setCPNT(double value) {
        this.cpnt = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmeq.
     * 
     */
    public int getIDITMEQ() {
        return iditmeq;
    }

    /**
     * Define el valor de la propiedad iditmeq.
     * 
     */
    public void setIDITMEQ(int value) {
        this.iditmeq = value;
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
     * Gets the value of the inventorycontroldocumentmerchandisetaxlineitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventorycontroldocumentmerchandisetaxlineitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventorycontroldocumentmerchandisetaxlineitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryControlDocumentMerchandiseTaxLineItem }
     * 
     * 
     */
    public List<InventoryControlDocumentMerchandiseTaxLineItem> getInventorycontroldocumentmerchandisetaxlineitem() {
        if (inventorycontroldocumentmerchandisetaxlineitem == null) {
            inventorycontroldocumentmerchandisetaxlineitem = new ArrayList<InventoryControlDocumentMerchandiseTaxLineItem>();
        }
        return this.inventorycontroldocumentmerchandisetaxlineitem;
    }

    /**
     * Obtiene el valor de la propiedad lcn.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocation }
     *     
     */
    public InventoryLocation getLCN() {
        return lcn;
    }

    /**
     * Define el valor de la propiedad lcn.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocation }
     *     
     */
    public void setLCN(InventoryLocation value) {
        this.lcn = value;
    }

    /**
     * Obtiene el valor de la propiedad item.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItem(Item value) {
        this.item = value;
    }

    /**
     * Obtiene el valor de la propiedad stk.
     * 
     * @return
     *     possible object is
     *     {@link StockLedgerAccount }
     *     
     */
    public StockLedgerAccount getStk() {
        return stk;
    }

    /**
     * Define el valor de la propiedad stk.
     * 
     * @param value
     *     allowed object is
     *     {@link StockLedgerAccount }
     *     
     */
    public void setStk(StockLedgerAccount value) {
        this.stk = value;
    }

    /**
     * Obtiene el valor de la propiedad itemmov.
     * 
     * @return
     *     possible object is
     *     {@link ListaMovAlmacen }
     *     
     */
    public ListaMovAlmacen getItemmov() {
        return itemmov;
    }

    /**
     * Define el valor de la propiedad itemmov.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMovAlmacen }
     *     
     */
    public void setItemmov(ListaMovAlmacen value) {
        this.itemmov = value;
    }

}
