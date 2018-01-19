
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inventoryControlDocumentLineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inventoryControlDocumentLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IC_LN_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_ITM_DCM_LN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inventorycontroldocumentmerchandiselineitem" type="{http://Webmet.core/}inventoryControlDocumentMerchandiseLineItem" minOccurs="0"/>
 *         &lt;element name="itemalm" type="{http://Webmet.core/}listaMovAlmacen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventoryControlDocumentLineItem", propOrder = {
    "idicd",
    "iclnicd",
    "tyitmdcmln",
    "inventorycontroldocumentmerchandiselineitem",
    "itemalm"
})
public class InventoryControlDocumentLineItem {

    @XmlElement(name = "ID_ICD")
    protected int idicd;
    @XmlElement(name = "IC_LN_ICD")
    protected int iclnicd;
    @XmlElement(name = "TY_ITM_DCM_LN")
    protected String tyitmdcmln;
    protected InventoryControlDocumentMerchandiseLineItem inventorycontroldocumentmerchandiselineitem;
    protected ListaMovAlmacen itemalm;

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
     * Obtiene el valor de la propiedad tyitmdcmln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYITMDCMLN() {
        return tyitmdcmln;
    }

    /**
     * Define el valor de la propiedad tyitmdcmln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYITMDCMLN(String value) {
        this.tyitmdcmln = value;
    }

    /**
     * Obtiene el valor de la propiedad inventorycontroldocumentmerchandiselineitem.
     * 
     * @return
     *     possible object is
     *     {@link InventoryControlDocumentMerchandiseLineItem }
     *     
     */
    public InventoryControlDocumentMerchandiseLineItem getInventorycontroldocumentmerchandiselineitem() {
        return inventorycontroldocumentmerchandiselineitem;
    }

    /**
     * Define el valor de la propiedad inventorycontroldocumentmerchandiselineitem.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryControlDocumentMerchandiseLineItem }
     *     
     */
    public void setInventorycontroldocumentmerchandiselineitem(InventoryControlDocumentMerchandiseLineItem value) {
        this.inventorycontroldocumentmerchandiselineitem = value;
    }

    /**
     * Obtiene el valor de la propiedad itemalm.
     * 
     * @return
     *     possible object is
     *     {@link ListaMovAlmacen }
     *     
     */
    public ListaMovAlmacen getItemalm() {
        return itemalm;
    }

    /**
     * Define el valor de la propiedad itemalm.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMovAlmacen }
     *     
     */
    public void setItemalm(ListaMovAlmacen value) {
        this.itemalm = value;
    }

}
