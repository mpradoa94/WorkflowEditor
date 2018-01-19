
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tillSalesTaxExemptionModifier complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tillSalesTaxExemptionModifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RC_EXM_TX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MO_EXM_TXBL" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="MO_EXM_TX" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tillSalesTaxExemptionModifier", propOrder = {
    "idathytx",
    "idgptx",
    "rcexmtx",
    "iditm",
    "moexmtxbl",
    "moexmtx"
})
public class TillSalesTaxExemptionModifier {

    @XmlElement(name = "ID_ATHY_TX")
    protected int idathytx;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "RC_EXM_TX")
    protected String rcexmtx;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "MO_EXM_TXBL")
    protected float moexmtxbl;
    @XmlElement(name = "MO_EXM_TX")
    protected float moexmtx;

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
     * Obtiene el valor de la propiedad rcexmtx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCEXMTX() {
        return rcexmtx;
    }

    /**
     * Define el valor de la propiedad rcexmtx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCEXMTX(String value) {
        this.rcexmtx = value;
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
     * Obtiene el valor de la propiedad moexmtxbl.
     * 
     */
    public float getMOEXMTXBL() {
        return moexmtxbl;
    }

    /**
     * Define el valor de la propiedad moexmtxbl.
     * 
     */
    public void setMOEXMTXBL(float value) {
        this.moexmtxbl = value;
    }

    /**
     * Obtiene el valor de la propiedad moexmtx.
     * 
     */
    public float getMOEXMTX() {
        return moexmtx;
    }

    /**
     * Define el valor de la propiedad moexmtx.
     * 
     */
    public void setMOEXMTX(float value) {
        this.moexmtx = value;
    }

}
