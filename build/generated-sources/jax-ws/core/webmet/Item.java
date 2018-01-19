
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para item complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM_SL_PRC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LU_EXM_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DE_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_ITEM_UNICO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_BORRABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PE_PROFIT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FOOD_STAMP_EX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockitem" type="{http://Webmet.core/}stockItem" minOccurs="0"/>
 *         &lt;element name="serviceitem" type="{http://Webmet.core/}serviceItem" minOccurs="0"/>
 *         &lt;element name="itemcollection" type="{http://Webmet.core/}itemCollection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemsellprice" type="{http://Webmet.core/}itemSellPrice" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://Webmet.core/}brand" minOccurs="0"/>
 *         &lt;element name="merchandisehierarchygroup" type="{http://Webmet.core/}merchandiseHierarchyGroup" minOccurs="0"/>
 *         &lt;element name="retailstoregroupitem" type="{http://Webmet.core/}retailStoreGroupItem" minOccurs="0"/>
 *         &lt;element name="posidentity" type="{http://Webmet.core/}posIdentity" minOccurs="0"/>
 *         &lt;element name="itempictures" type="{http://Webmet.core/}itemPictures" minOccurs="0"/>
 *         &lt;element name="stka" type="{http://Webmet.core/}stockLedgerAccount" minOccurs="0"/>
 *         &lt;element name="gservicio" type="{http://Webmet.core/}gServicio" minOccurs="0"/>
 *         &lt;element name="equivalentitem" type="{http://Webmet.core/}equivalentItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "iditm",
    "iditmslprc",
    "idmrhrcgp",
    "idbrn",
    "luexmtx",
    "nmitm",
    "deitm",
    "tyitm",
    "flitemunico",
    "flborrable",
    "iditmps",
    "peprofit",
    "foodstampex",
    "stockitem",
    "serviceitem",
    "itemcollection",
    "itemsellprice",
    "brand",
    "merchandisehierarchygroup",
    "retailstoregroupitem",
    "posidentity",
    "itempictures",
    "stka",
    "gservicio",
    "equivalentitem"
})
public class Item {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_ITM_SL_PRC")
    protected int iditmslprc;
    @XmlElement(name = "ID_MRHRC_GP")
    protected int idmrhrcgp;
    @XmlElement(name = "ID_BRN")
    protected int idbrn;
    @XmlElement(name = "LU_EXM_TX")
    protected int luexmtx;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "DE_ITM")
    protected String deitm;
    @XmlElement(name = "TY_ITM")
    protected String tyitm;
    @XmlElement(name = "FL_ITEM_UNICO")
    protected String flitemunico;
    @XmlElement(name = "FL_BORRABLE")
    protected String flborrable;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "PE_PROFIT")
    protected double peprofit;
    @XmlElement(name = "FOOD_STAMP_EX")
    protected String foodstampex;
    protected StockItem stockitem;
    protected ServiceItem serviceitem;
    @XmlElement(nillable = true)
    protected List<ItemCollection> itemcollection;
    protected ItemSellPrice itemsellprice;
    protected Brand brand;
    protected MerchandiseHierarchyGroup merchandisehierarchygroup;
    protected RetailStoreGroupItem retailstoregroupitem;
    protected PosIdentity posidentity;
    protected ItemPictures itempictures;
    protected StockLedgerAccount stka;
    protected GServicio gservicio;
    protected EquivalentItem equivalentitem;

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
     * Obtiene el valor de la propiedad luexmtx.
     * 
     */
    public int getLUEXMTX() {
        return luexmtx;
    }

    /**
     * Define el valor de la propiedad luexmtx.
     * 
     */
    public void setLUEXMTX(int value) {
        this.luexmtx = value;
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
     * Obtiene el valor de la propiedad tyitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYITM() {
        return tyitm;
    }

    /**
     * Define el valor de la propiedad tyitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYITM(String value) {
        this.tyitm = value;
    }

    /**
     * Obtiene el valor de la propiedad flitemunico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLITEMUNICO() {
        return flitemunico;
    }

    /**
     * Define el valor de la propiedad flitemunico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLITEMUNICO(String value) {
        this.flitemunico = value;
    }

    /**
     * Obtiene el valor de la propiedad flborrable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLBORRABLE() {
        return flborrable;
    }

    /**
     * Define el valor de la propiedad flborrable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLBORRABLE(String value) {
        this.flborrable = value;
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
     * Obtiene el valor de la propiedad serviceitem.
     * 
     * @return
     *     possible object is
     *     {@link ServiceItem }
     *     
     */
    public ServiceItem getServiceitem() {
        return serviceitem;
    }

    /**
     * Define el valor de la propiedad serviceitem.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceItem }
     *     
     */
    public void setServiceitem(ServiceItem value) {
        this.serviceitem = value;
    }

    /**
     * Gets the value of the itemcollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemcollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemcollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCollection }
     * 
     * 
     */
    public List<ItemCollection> getItemcollection() {
        if (itemcollection == null) {
            itemcollection = new ArrayList<ItemCollection>();
        }
        return this.itemcollection;
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
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link Brand }
     *     
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link Brand }
     *     
     */
    public void setBrand(Brand value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad merchandisehierarchygroup.
     * 
     * @return
     *     possible object is
     *     {@link MerchandiseHierarchyGroup }
     *     
     */
    public MerchandiseHierarchyGroup getMerchandisehierarchygroup() {
        return merchandisehierarchygroup;
    }

    /**
     * Define el valor de la propiedad merchandisehierarchygroup.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandiseHierarchyGroup }
     *     
     */
    public void setMerchandisehierarchygroup(MerchandiseHierarchyGroup value) {
        this.merchandisehierarchygroup = value;
    }

    /**
     * Obtiene el valor de la propiedad retailstoregroupitem.
     * 
     * @return
     *     possible object is
     *     {@link RetailStoreGroupItem }
     *     
     */
    public RetailStoreGroupItem getRetailstoregroupitem() {
        return retailstoregroupitem;
    }

    /**
     * Define el valor de la propiedad retailstoregroupitem.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStoreGroupItem }
     *     
     */
    public void setRetailstoregroupitem(RetailStoreGroupItem value) {
        this.retailstoregroupitem = value;
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

    /**
     * Obtiene el valor de la propiedad itempictures.
     * 
     * @return
     *     possible object is
     *     {@link ItemPictures }
     *     
     */
    public ItemPictures getItempictures() {
        return itempictures;
    }

    /**
     * Define el valor de la propiedad itempictures.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPictures }
     *     
     */
    public void setItempictures(ItemPictures value) {
        this.itempictures = value;
    }

    /**
     * Obtiene el valor de la propiedad stka.
     * 
     * @return
     *     possible object is
     *     {@link StockLedgerAccount }
     *     
     */
    public StockLedgerAccount getStka() {
        return stka;
    }

    /**
     * Define el valor de la propiedad stka.
     * 
     * @param value
     *     allowed object is
     *     {@link StockLedgerAccount }
     *     
     */
    public void setStka(StockLedgerAccount value) {
        this.stka = value;
    }

    /**
     * Obtiene el valor de la propiedad gservicio.
     * 
     * @return
     *     possible object is
     *     {@link GServicio }
     *     
     */
    public GServicio getGservicio() {
        return gservicio;
    }

    /**
     * Define el valor de la propiedad gservicio.
     * 
     * @param value
     *     allowed object is
     *     {@link GServicio }
     *     
     */
    public void setGservicio(GServicio value) {
        this.gservicio = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalentitem.
     * 
     * @return
     *     possible object is
     *     {@link EquivalentItem }
     *     
     */
    public EquivalentItem getEquivalentitem() {
        return equivalentitem;
    }

    /**
     * Define el valor de la propiedad equivalentitem.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivalentItem }
     *     
     */
    public void setEquivalentitem(EquivalentItem value) {
        this.equivalentitem = value;
    }

}
