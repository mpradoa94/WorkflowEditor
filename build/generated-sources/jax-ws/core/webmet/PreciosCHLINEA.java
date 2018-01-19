
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preciosCHLINEA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preciosCHLINEA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DCTO_PR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DCTO_PR_LN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_GRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS_QFR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_LINEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COSTO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PR_PROFIT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SELL_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PRICE_LIST" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OFER_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NSELL_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NPRICE_LIST" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NOFER_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FL_VL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITEMSELLPRICE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="item" type="{http://Webmet.core/}item" minOccurs="0"/>
 *         &lt;element name="pclv" type="{http://Webmet.core/}preciosCHLINEAVOLUMEN" minOccurs="0"/>
 *         &lt;element name="artAlma" type="{http://Webmet.core/}listaMovAlmacen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preciosCHLINEA", propOrder = {
    "iddctopr",
    "iddctoprln",
    "iditm",
    "idstrgrp",
    "iditmps",
    "iditmpsqfr",
    "tylinea",
    "ucosto",
    "prprofit",
    "sellprice",
    "pricelist",
    "oferprice",
    "nsellprice",
    "npricelist",
    "noferprice",
    "flvlprice",
    "iditemsellprice",
    "item",
    "pclv",
    "artAlma"
})
public class PreciosCHLINEA {

    @XmlElement(name = "ID_DCTO_PR")
    protected int iddctopr;
    @XmlElement(name = "ID_DCTO_PR_LN")
    protected int iddctoprln;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_STR_GRP")
    protected int idstrgrp;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "ID_ITM_PS_QFR")
    protected int iditmpsqfr;
    @XmlElement(name = "TY_LINEA")
    protected String tylinea;
    @XmlElement(name = "U_COSTO")
    protected double ucosto;
    @XmlElement(name = "PR_PROFIT")
    protected double prprofit;
    @XmlElement(name = "SELL_PRICE")
    protected double sellprice;
    @XmlElement(name = "PRICE_LIST")
    protected double pricelist;
    @XmlElement(name = "OFER_PRICE")
    protected double oferprice;
    @XmlElement(name = "NSELL_PRICE")
    protected double nsellprice;
    @XmlElement(name = "NPRICE_LIST")
    protected double npricelist;
    @XmlElement(name = "NOFER_PRICE")
    protected double noferprice;
    @XmlElement(name = "FL_VL_PRICE")
    protected String flvlprice;
    @XmlElement(name = "ID_ITEMSELLPRICE")
    protected int iditemsellprice;
    protected Item item;
    protected PreciosCHLINEAVOLUMEN pclv;
    protected ListaMovAlmacen artAlma;

    /**
     * Obtiene el valor de la propiedad iddctopr.
     * 
     */
    public int getIDDCTOPR() {
        return iddctopr;
    }

    /**
     * Define el valor de la propiedad iddctopr.
     * 
     */
    public void setIDDCTOPR(int value) {
        this.iddctopr = value;
    }

    /**
     * Obtiene el valor de la propiedad iddctoprln.
     * 
     */
    public int getIDDCTOPRLN() {
        return iddctoprln;
    }

    /**
     * Define el valor de la propiedad iddctoprln.
     * 
     */
    public void setIDDCTOPRLN(int value) {
        this.iddctoprln = value;
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
     * Obtiene el valor de la propiedad tylinea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYLINEA() {
        return tylinea;
    }

    /**
     * Define el valor de la propiedad tylinea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYLINEA(String value) {
        this.tylinea = value;
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
     * Obtiene el valor de la propiedad prprofit.
     * 
     */
    public double getPRPROFIT() {
        return prprofit;
    }

    /**
     * Define el valor de la propiedad prprofit.
     * 
     */
    public void setPRPROFIT(double value) {
        this.prprofit = value;
    }

    /**
     * Obtiene el valor de la propiedad sellprice.
     * 
     */
    public double getSELLPRICE() {
        return sellprice;
    }

    /**
     * Define el valor de la propiedad sellprice.
     * 
     */
    public void setSELLPRICE(double value) {
        this.sellprice = value;
    }

    /**
     * Obtiene el valor de la propiedad pricelist.
     * 
     */
    public double getPRICELIST() {
        return pricelist;
    }

    /**
     * Define el valor de la propiedad pricelist.
     * 
     */
    public void setPRICELIST(double value) {
        this.pricelist = value;
    }

    /**
     * Obtiene el valor de la propiedad oferprice.
     * 
     */
    public double getOFERPRICE() {
        return oferprice;
    }

    /**
     * Define el valor de la propiedad oferprice.
     * 
     */
    public void setOFERPRICE(double value) {
        this.oferprice = value;
    }

    /**
     * Obtiene el valor de la propiedad nsellprice.
     * 
     */
    public double getNSELLPRICE() {
        return nsellprice;
    }

    /**
     * Define el valor de la propiedad nsellprice.
     * 
     */
    public void setNSELLPRICE(double value) {
        this.nsellprice = value;
    }

    /**
     * Obtiene el valor de la propiedad npricelist.
     * 
     */
    public double getNPRICELIST() {
        return npricelist;
    }

    /**
     * Define el valor de la propiedad npricelist.
     * 
     */
    public void setNPRICELIST(double value) {
        this.npricelist = value;
    }

    /**
     * Obtiene el valor de la propiedad noferprice.
     * 
     */
    public double getNOFERPRICE() {
        return noferprice;
    }

    /**
     * Define el valor de la propiedad noferprice.
     * 
     */
    public void setNOFERPRICE(double value) {
        this.noferprice = value;
    }

    /**
     * Obtiene el valor de la propiedad flvlprice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLVLPRICE() {
        return flvlprice;
    }

    /**
     * Define el valor de la propiedad flvlprice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLVLPRICE(String value) {
        this.flvlprice = value;
    }

    /**
     * Obtiene el valor de la propiedad iditemsellprice.
     * 
     */
    public int getIDITEMSELLPRICE() {
        return iditemsellprice;
    }

    /**
     * Define el valor de la propiedad iditemsellprice.
     * 
     */
    public void setIDITEMSELLPRICE(int value) {
        this.iditemsellprice = value;
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
     * Obtiene el valor de la propiedad pclv.
     * 
     * @return
     *     possible object is
     *     {@link PreciosCHLINEAVOLUMEN }
     *     
     */
    public PreciosCHLINEAVOLUMEN getPclv() {
        return pclv;
    }

    /**
     * Define el valor de la propiedad pclv.
     * 
     * @param value
     *     allowed object is
     *     {@link PreciosCHLINEAVOLUMEN }
     *     
     */
    public void setPclv(PreciosCHLINEAVOLUMEN value) {
        this.pclv = value;
    }

    /**
     * Obtiene el valor de la propiedad artAlma.
     * 
     * @return
     *     possible object is
     *     {@link ListaMovAlmacen }
     *     
     */
    public ListaMovAlmacen getArtAlma() {
        return artAlma;
    }

    /**
     * Define el valor de la propiedad artAlma.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMovAlmacen }
     *     
     */
    public void setArtAlma(ListaMovAlmacen value) {
        this.artAlma = value;
    }

}
