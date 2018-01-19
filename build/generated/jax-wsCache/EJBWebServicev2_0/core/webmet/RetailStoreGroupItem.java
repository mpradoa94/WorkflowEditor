
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retailStoreGroupItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retailStoreGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STRGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_TX_BUY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="retailstoregroup" type="{http://Webmet.core/}retailStoreGroup" minOccurs="0"/>
 *         &lt;element name="taxablegroup" type="{http://Webmet.core/}taxableGroup" minOccurs="0"/>
 *         &lt;element name="taxablegroupbuy" type="{http://Webmet.core/}taxableGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retailStoreGroupItem", propOrder = {
    "idstrgrp",
    "iditm",
    "idgptx",
    "idgptxbuy",
    "retailstoregroup",
    "taxablegroup",
    "taxablegroupbuy"
})
public class RetailStoreGroupItem {

    @XmlElement(name = "ID_STRGRP")
    protected int idstrgrp;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "ID_GP_TX_BUY")
    protected int idgptxbuy;
    protected RetailStoreGroup retailstoregroup;
    protected TaxableGroup taxablegroup;
    protected TaxableGroup taxablegroupbuy;

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
     * Obtiene el valor de la propiedad idgptxbuy.
     * 
     */
    public int getIDGPTXBUY() {
        return idgptxbuy;
    }

    /**
     * Define el valor de la propiedad idgptxbuy.
     * 
     */
    public void setIDGPTXBUY(int value) {
        this.idgptxbuy = value;
    }

    /**
     * Obtiene el valor de la propiedad retailstoregroup.
     * 
     * @return
     *     possible object is
     *     {@link RetailStoreGroup }
     *     
     */
    public RetailStoreGroup getRetailstoregroup() {
        return retailstoregroup;
    }

    /**
     * Define el valor de la propiedad retailstoregroup.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStoreGroup }
     *     
     */
    public void setRetailstoregroup(RetailStoreGroup value) {
        this.retailstoregroup = value;
    }

    /**
     * Obtiene el valor de la propiedad taxablegroup.
     * 
     * @return
     *     possible object is
     *     {@link TaxableGroup }
     *     
     */
    public TaxableGroup getTaxablegroup() {
        return taxablegroup;
    }

    /**
     * Define el valor de la propiedad taxablegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableGroup }
     *     
     */
    public void setTaxablegroup(TaxableGroup value) {
        this.taxablegroup = value;
    }

    /**
     * Obtiene el valor de la propiedad taxablegroupbuy.
     * 
     * @return
     *     possible object is
     *     {@link TaxableGroup }
     *     
     */
    public TaxableGroup getTaxablegroupbuy() {
        return taxablegroupbuy;
    }

    /**
     * Define el valor de la propiedad taxablegroupbuy.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableGroup }
     *     
     */
    public void setTaxablegroupbuy(TaxableGroup value) {
        this.taxablegroupbuy = value;
    }

}
