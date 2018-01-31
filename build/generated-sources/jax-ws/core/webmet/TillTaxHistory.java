
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tillTaxHistory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tillTaxHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_LN_TAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MO_TXBL_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "tillTaxHistory", propOrder = {
    "idathytx",
    "idgptx",
    "ailntax",
    "motxblrtnsls",
    "motxrtnsls",
    "moexmtxbl",
    "moexmtx"
})
public class TillTaxHistory {

    @XmlElement(name = "ID_ATHY_TX")
    protected int idathytx;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "AI_LN_TAX")
    protected int ailntax;
    @XmlElement(name = "MO_TXBL_RTN_SLS")
    protected float motxblrtnsls;
    @XmlElement(name = "MO_TX_RTN_SLS")
    protected float motxrtnsls;
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
     * Obtiene el valor de la propiedad ailntax.
     * 
     */
    public int getAILNTAX() {
        return ailntax;
    }

    /**
     * Define el valor de la propiedad ailntax.
     * 
     */
    public void setAILNTAX(int value) {
        this.ailntax = value;
    }

    /**
     * Obtiene el valor de la propiedad motxblrtnsls.
     * 
     */
    public float getMOTXBLRTNSLS() {
        return motxblrtnsls;
    }

    /**
     * Define el valor de la propiedad motxblrtnsls.
     * 
     */
    public void setMOTXBLRTNSLS(float value) {
        this.motxblrtnsls = value;
    }

    /**
     * Obtiene el valor de la propiedad motxrtnsls.
     * 
     */
    public float getMOTXRTNSLS() {
        return motxrtnsls;
    }

    /**
     * Define el valor de la propiedad motxrtnsls.
     * 
     */
    public void setMOTXRTNSLS(float value) {
        this.motxrtnsls = value;
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