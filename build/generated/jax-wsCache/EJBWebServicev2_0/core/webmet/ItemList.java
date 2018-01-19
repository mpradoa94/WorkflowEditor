
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DE_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE_PROFIT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PROMEDIO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM_SL_PRC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxgrouprule" type="{http://Webmet.core/}taxGroupRule" minOccurs="0"/>
 *         &lt;element name="itemsellprice" type="{http://Webmet.core/}itemSellPrice" minOccurs="0"/>
 *         &lt;element name="stockitem" type="{http://Webmet.core/}stockItem" minOccurs="0"/>
 *         &lt;element name="posidentity" type="{http://Webmet.core/}posIdentity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemList", propOrder = {
    "iditm",
    "nmitm",
    "deitm",
    "peprofit",
    "promedio",
    "idgptx",
    "iditmslprc",
    "idbrn",
    "idmrhrcgp",
    "taxgrouprule",
    "itemsellprice",
    "stockitem",
    "posidentity"
})
public class ItemList {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "DE_ITM")
    protected String deitm;
    @XmlElement(name = "PE_PROFIT")
    protected double peprofit;
    @XmlElement(name = "PROMEDIO")
    protected double promedio;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "ID_ITM_SL_PRC")
    protected int iditmslprc;
    @XmlElement(name = "ID_BRN")
    protected int idbrn;
    @XmlElement(name = "ID_MRHRC_GP")
    protected int idmrhrcgp;
    protected TaxGroupRule taxgrouprule;
    protected ItemSellPrice itemsellprice;
    protected StockItem stockitem;
    protected PosIdentity posidentity;

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
     * Obtiene el valor de la propiedad nmitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMITM() {
        return nmitm;
    }

    /**
     * Define el valor de la propiedad nmitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMITM(String value) {
        this.nmitm = value;
    }

    /**
     * Obtiene el valor de la propiedad deitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEITM() {
        return deitm;
    }

    /**
     * Define el valor de la propiedad deitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEITM(String value) {
        this.deitm = value;
    }

    /**
     * Obtiene el valor de la propiedad peprofit.
     * 
     */
    public double getPEPROFIT() {
        return peprofit;
    }

    /**
     * Define el valor de la propiedad peprofit.
     * 
     */
    public void setPEPROFIT(double value) {
        this.peprofit = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio.
     * 
     */
    public double getPROMEDIO() {
        return promedio;
    }

    /**
     * Define el valor de la propiedad promedio.
     * 
     */
    public void setPROMEDIO(double value) {
        this.promedio = value;
    }

    /**
     * Obtiene el valor de la propiedad idgptx.
     * 
     */
    public int getIDGPTX() {
        return idgptx;
    }

    /**
     * Define el valor de la propiedad idgptx.
     * 
     */
    public void setIDGPTX(int value) {
        this.idgptx = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmslprc.
     * 
     */
    public int getIDITMSLPRC() {
        return iditmslprc;
    }

    /**
     * Define el valor de la propiedad iditmslprc.
     * 
     */
    public void setIDITMSLPRC(int value) {
        this.iditmslprc = value;
    }

    /**
     * Obtiene el valor de la propiedad idbrn.
     * 
     */
    public int getIDBRN() {
        return idbrn;
    }

    /**
     * Define el valor de la propiedad idbrn.
     * 
     */
    public void setIDBRN(int value) {
        this.idbrn = value;
    }

    /**
     * Obtiene el valor de la propiedad idmrhrcgp.
     * 
     */
    public int getIDMRHRCGP() {
        return idmrhrcgp;
    }

    /**
     * Define el valor de la propiedad idmrhrcgp.
     * 
     */
    public void setIDMRHRCGP(int value) {
        this.idmrhrcgp = value;
    }

    /**
     * Obtiene el valor de la propiedad taxgrouprule.
     * 
     * @return
     *     possible object is
     *     {@link TaxGroupRule }
     *     
     */
    public TaxGroupRule getTaxgrouprule() {
        return taxgrouprule;
    }

    /**
     * Define el valor de la propiedad taxgrouprule.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxGroupRule }
     *     
     */
    public void setTaxgrouprule(TaxGroupRule value) {
        this.taxgrouprule = value;
    }

    /**
     * Obtiene el valor de la propiedad itemsellprice.
     * 
     * @return
     *     possible object is
     *     {@link ItemSellPrice }
     *     
     */
    public ItemSellPrice getItemsellprice() {
        return itemsellprice;
    }

    /**
     * Define el valor de la propiedad itemsellprice.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSellPrice }
     *     
     */
    public void setItemsellprice(ItemSellPrice value) {
        this.itemsellprice = value;
    }

    /**
     * Obtiene el valor de la propiedad stockitem.
     * 
     * @return
     *     possible object is
     *     {@link StockItem }
     *     
     */
    public StockItem getStockitem() {
        return stockitem;
    }

    /**
     * Define el valor de la propiedad stockitem.
     * 
     * @param value
     *     allowed object is
     *     {@link StockItem }
     *     
     */
    public void setStockitem(StockItem value) {
        this.stockitem = value;
    }

    /**
     * Obtiene el valor de la propiedad posidentity.
     * 
     * @return
     *     possible object is
     *     {@link PosIdentity }
     *     
     */
    public PosIdentity getPosidentity() {
        return posidentity;
    }

    /**
     * Define el valor de la propiedad posidentity.
     * 
     * @param value
     *     allowed object is
     *     {@link PosIdentity }
     *     
     */
    public void setPosidentity(PosIdentity value) {
        this.posidentity = value;
    }

}
