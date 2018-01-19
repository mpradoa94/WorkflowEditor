
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemSellPrice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemSellPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_SL_PRC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SELL_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PRICE_LIST" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OFER_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FL_VL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_REVIEWED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemSellPrice", propOrder = {
    "iditmslprc",
    "sellprice",
    "pricelist",
    "oferprice",
    "flvlprice",
    "flreviewed"
})
public class ItemSellPrice {

    @XmlElement(name = "ID_ITM_SL_PRC")
    protected int iditmslprc;
    @XmlElement(name = "SELL_PRICE")
    protected double sellprice;
    @XmlElement(name = "PRICE_LIST")
    protected double pricelist;
    @XmlElement(name = "OFER_PRICE")
    protected double oferprice;
    @XmlElement(name = "FL_VL_PRICE")
    protected String flvlprice;
    @XmlElement(name = "FL_REVIEWED")
    protected String flreviewed;

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
     * Obtiene el valor de la propiedad flreviewed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLREVIEWED() {
        return flreviewed;
    }

    /**
     * Define el valor de la propiedad flreviewed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLREVIEWED(String value) {
        this.flreviewed = value;
    }

}
