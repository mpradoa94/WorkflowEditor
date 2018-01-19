
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inventoryControlDocumentMerchandiseTaxLineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inventoryControlDocumentMerchandiseTaxLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IC_LN_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MO_TXBL" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MO_TX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventoryControlDocumentMerchandiseTaxLineItem", propOrder = {
    "idicd",
    "iclnicd",
    "idathytx",
    "idgptx",
    "motxbl",
    "motx"
})
public class InventoryControlDocumentMerchandiseTaxLineItem {

    @XmlElement(name = "ID_ICD")
    protected int idicd;
    @XmlElement(name = "IC_LN_ICD")
    protected int iclnicd;
    @XmlElement(name = "ID_ATHY_TX")
    protected int idathytx;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "MO_TXBL")
    protected double motxbl;
    @XmlElement(name = "MO_TX")
    protected double motx;

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
     * Obtiene el valor de la propiedad idathytx.
     * 
     */
    public int getIDATHYTX() {
        return idathytx;
    }

    /**
     * Define el valor de la propiedad idathytx.
     * 
     */
    public void setIDATHYTX(int value) {
        this.idathytx = value;
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
     * Obtiene el valor de la propiedad motxbl.
     * 
     */
    public double getMOTXBL() {
        return motxbl;
    }

    /**
     * Define el valor de la propiedad motxbl.
     * 
     */
    public void setMOTXBL(double value) {
        this.motxbl = value;
    }

    /**
     * Obtiene el valor de la propiedad motx.
     * 
     */
    public double getMOTX() {
        return motx;
    }

    /**
     * Define el valor de la propiedad motx.
     * 
     */
    public void setMOTX(double value) {
        this.motx = value;
    }

}
