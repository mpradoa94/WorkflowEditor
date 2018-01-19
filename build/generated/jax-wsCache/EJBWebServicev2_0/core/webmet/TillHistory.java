
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tillHistory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tillHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RPSTY_TND" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QU_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_VOID_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_VOID_ITM_TR" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_RTN_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_SLS_SVC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_TRAN" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_TRAN_NO_SALE" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_TRAN_VOID" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_VOID_ITEM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_RTN_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_VOID_ITM_TR" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_SLS_SVC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_SLS_TX_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_VOID_TX_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_RTN_TX_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_VOID_TX_ITM_TR" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CU_SLS_TX_SVC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TillSalesSummary" type="{http://Webmet.core/}tillSalesSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TillSalesTaxSummary" type="{http://Webmet.core/}tillSalesTaxSumary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TillSalesTaxExemptionModifier" type="{http://Webmet.core/}tillSalesTaxExemptionModifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TillTenderHistory" type="{http://Webmet.core/}tillTenderHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TillTaxHistory" type="{http://Webmet.core/}tillTaxHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TillDisburment" type="{http://Webmet.core/}tillDisbursementFundsReceiptTransactionSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tillHistory", propOrder = {
    "idrpstytnd",
    "quslsitm",
    "quvoiditm",
    "quvoiditmtr",
    "qurtnitm",
    "quslssvc",
    "qutran",
    "qutrannosale",
    "qutranvoid",
    "cuslsitm",
    "cuvoiditem",
    "curtnitm",
    "cuvoiditmtr",
    "cuslssvc",
    "cuslstxitm",
    "cuvoidtxitm",
    "curtntxitm",
    "cuvoidtxitmtr",
    "cuslstxsvc",
    "tillSalesSummary",
    "tillSalesTaxSummary",
    "tillSalesTaxExemptionModifier",
    "tillTenderHistory",
    "tillTaxHistory",
    "tillDisburment"
})
public class TillHistory {

    @XmlElement(name = "ID_RPSTY_TND")
    protected int idrpstytnd;
    @XmlElement(name = "QU_SLS_ITM")
    protected float quslsitm;
    @XmlElement(name = "QU_VOID_ITM")
    protected float quvoiditm;
    @XmlElement(name = "QU_VOID_ITM_TR")
    protected float quvoiditmtr;
    @XmlElement(name = "QU_RTN_ITM")
    protected float qurtnitm;
    @XmlElement(name = "QU_SLS_SVC")
    protected float quslssvc;
    @XmlElement(name = "QU_TRAN")
    protected float qutran;
    @XmlElement(name = "QU_TRAN_NO_SALE")
    protected float qutrannosale;
    @XmlElement(name = "QU_TRAN_VOID")
    protected float qutranvoid;
    @XmlElement(name = "CU_SLS_ITM")
    protected float cuslsitm;
    @XmlElement(name = "CU_VOID_ITEM")
    protected float cuvoiditem;
    @XmlElement(name = "CU_RTN_ITM")
    protected float curtnitm;
    @XmlElement(name = "CU_VOID_ITM_TR")
    protected float cuvoiditmtr;
    @XmlElement(name = "CU_SLS_SVC")
    protected float cuslssvc;
    @XmlElement(name = "CU_SLS_TX_ITM")
    protected float cuslstxitm;
    @XmlElement(name = "CU_VOID_TX_ITM")
    protected float cuvoidtxitm;
    @XmlElement(name = "CU_RTN_TX_ITM")
    protected float curtntxitm;
    @XmlElement(name = "CU_VOID_TX_ITM_TR")
    protected float cuvoidtxitmtr;
    @XmlElement(name = "CU_SLS_TX_SVC")
    protected float cuslstxsvc;
    @XmlElement(name = "TillSalesSummary", nillable = true)
    protected List<TillSalesSummary> tillSalesSummary;
    @XmlElement(name = "TillSalesTaxSummary", nillable = true)
    protected List<TillSalesTaxSumary> tillSalesTaxSummary;
    @XmlElement(name = "TillSalesTaxExemptionModifier", nillable = true)
    protected List<TillSalesTaxExemptionModifier> tillSalesTaxExemptionModifier;
    @XmlElement(name = "TillTenderHistory", nillable = true)
    protected List<TillTenderHistory> tillTenderHistory;
    @XmlElement(name = "TillTaxHistory", nillable = true)
    protected List<TillTaxHistory> tillTaxHistory;
    @XmlElement(name = "TillDisburment", nillable = true)
    protected List<TillDisbursementFundsReceiptTransactionSummary> tillDisburment;

    /**
     * Obtiene el valor de la propiedad idrpstytnd.
     * 
     */
    public int getIDRPSTYTND() {
        return idrpstytnd;
    }

    /**
     * Define el valor de la propiedad idrpstytnd.
     * 
     */
    public void setIDRPSTYTND(int value) {
        this.idrpstytnd = value;
    }

    /**
     * Obtiene el valor de la propiedad quslsitm.
     * 
     */
    public float getQUSLSITM() {
        return quslsitm;
    }

    /**
     * Define el valor de la propiedad quslsitm.
     * 
     */
    public void setQUSLSITM(float value) {
        this.quslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quvoiditm.
     * 
     */
    public float getQUVOIDITM() {
        return quvoiditm;
    }

    /**
     * Define el valor de la propiedad quvoiditm.
     * 
     */
    public void setQUVOIDITM(float value) {
        this.quvoiditm = value;
    }

    /**
     * Obtiene el valor de la propiedad quvoiditmtr.
     * 
     */
    public float getQUVOIDITMTR() {
        return quvoiditmtr;
    }

    /**
     * Define el valor de la propiedad quvoiditmtr.
     * 
     */
    public void setQUVOIDITMTR(float value) {
        this.quvoiditmtr = value;
    }

    /**
     * Obtiene el valor de la propiedad qurtnitm.
     * 
     */
    public float getQURTNITM() {
        return qurtnitm;
    }

    /**
     * Define el valor de la propiedad qurtnitm.
     * 
     */
    public void setQURTNITM(float value) {
        this.qurtnitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quslssvc.
     * 
     */
    public float getQUSLSSVC() {
        return quslssvc;
    }

    /**
     * Define el valor de la propiedad quslssvc.
     * 
     */
    public void setQUSLSSVC(float value) {
        this.quslssvc = value;
    }

    /**
     * Obtiene el valor de la propiedad qutran.
     * 
     */
    public float getQUTRAN() {
        return qutran;
    }

    /**
     * Define el valor de la propiedad qutran.
     * 
     */
    public void setQUTRAN(float value) {
        this.qutran = value;
    }

    /**
     * Obtiene el valor de la propiedad qutrannosale.
     * 
     */
    public float getQUTRANNOSALE() {
        return qutrannosale;
    }

    /**
     * Define el valor de la propiedad qutrannosale.
     * 
     */
    public void setQUTRANNOSALE(float value) {
        this.qutrannosale = value;
    }

    /**
     * Obtiene el valor de la propiedad qutranvoid.
     * 
     */
    public float getQUTRANVOID() {
        return qutranvoid;
    }

    /**
     * Define el valor de la propiedad qutranvoid.
     * 
     */
    public void setQUTRANVOID(float value) {
        this.qutranvoid = value;
    }

    /**
     * Obtiene el valor de la propiedad cuslsitm.
     * 
     */
    public float getCUSLSITM() {
        return cuslsitm;
    }

    /**
     * Define el valor de la propiedad cuslsitm.
     * 
     */
    public void setCUSLSITM(float value) {
        this.cuslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad cuvoiditem.
     * 
     */
    public float getCUVOIDITEM() {
        return cuvoiditem;
    }

    /**
     * Define el valor de la propiedad cuvoiditem.
     * 
     */
    public void setCUVOIDITEM(float value) {
        this.cuvoiditem = value;
    }

    /**
     * Obtiene el valor de la propiedad curtnitm.
     * 
     */
    public float getCURTNITM() {
        return curtnitm;
    }

    /**
     * Define el valor de la propiedad curtnitm.
     * 
     */
    public void setCURTNITM(float value) {
        this.curtnitm = value;
    }

    /**
     * Obtiene el valor de la propiedad cuvoiditmtr.
     * 
     */
    public float getCUVOIDITMTR() {
        return cuvoiditmtr;
    }

    /**
     * Define el valor de la propiedad cuvoiditmtr.
     * 
     */
    public void setCUVOIDITMTR(float value) {
        this.cuvoiditmtr = value;
    }

    /**
     * Obtiene el valor de la propiedad cuslssvc.
     * 
     */
    public float getCUSLSSVC() {
        return cuslssvc;
    }

    /**
     * Define el valor de la propiedad cuslssvc.
     * 
     */
    public void setCUSLSSVC(float value) {
        this.cuslssvc = value;
    }

    /**
     * Obtiene el valor de la propiedad cuslstxitm.
     * 
     */
    public float getCUSLSTXITM() {
        return cuslstxitm;
    }

    /**
     * Define el valor de la propiedad cuslstxitm.
     * 
     */
    public void setCUSLSTXITM(float value) {
        this.cuslstxitm = value;
    }

    /**
     * Obtiene el valor de la propiedad cuvoidtxitm.
     * 
     */
    public float getCUVOIDTXITM() {
        return cuvoidtxitm;
    }

    /**
     * Define el valor de la propiedad cuvoidtxitm.
     * 
     */
    public void setCUVOIDTXITM(float value) {
        this.cuvoidtxitm = value;
    }

    /**
     * Obtiene el valor de la propiedad curtntxitm.
     * 
     */
    public float getCURTNTXITM() {
        return curtntxitm;
    }

    /**
     * Define el valor de la propiedad curtntxitm.
     * 
     */
    public void setCURTNTXITM(float value) {
        this.curtntxitm = value;
    }

    /**
     * Obtiene el valor de la propiedad cuvoidtxitmtr.
     * 
     */
    public float getCUVOIDTXITMTR() {
        return cuvoidtxitmtr;
    }

    /**
     * Define el valor de la propiedad cuvoidtxitmtr.
     * 
     */
    public void setCUVOIDTXITMTR(float value) {
        this.cuvoidtxitmtr = value;
    }

    /**
     * Obtiene el valor de la propiedad cuslstxsvc.
     * 
     */
    public float getCUSLSTXSVC() {
        return cuslstxsvc;
    }

    /**
     * Define el valor de la propiedad cuslstxsvc.
     * 
     */
    public void setCUSLSTXSVC(float value) {
        this.cuslstxsvc = value;
    }

    /**
     * Gets the value of the tillSalesSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tillSalesSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTillSalesSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TillSalesSummary }
     * 
     * 
     */
    public List<TillSalesSummary> getTillSalesSummary() {
        if (tillSalesSummary == null) {
            tillSalesSummary = new ArrayList<TillSalesSummary>();
        }
        return this.tillSalesSummary;
    }

    /**
     * Gets the value of the tillSalesTaxSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tillSalesTaxSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTillSalesTaxSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TillSalesTaxSumary }
     * 
     * 
     */
    public List<TillSalesTaxSumary> getTillSalesTaxSummary() {
        if (tillSalesTaxSummary == null) {
            tillSalesTaxSummary = new ArrayList<TillSalesTaxSumary>();
        }
        return this.tillSalesTaxSummary;
    }

    /**
     * Gets the value of the tillSalesTaxExemptionModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tillSalesTaxExemptionModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTillSalesTaxExemptionModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TillSalesTaxExemptionModifier }
     * 
     * 
     */
    public List<TillSalesTaxExemptionModifier> getTillSalesTaxExemptionModifier() {
        if (tillSalesTaxExemptionModifier == null) {
            tillSalesTaxExemptionModifier = new ArrayList<TillSalesTaxExemptionModifier>();
        }
        return this.tillSalesTaxExemptionModifier;
    }

    /**
     * Gets the value of the tillTenderHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tillTenderHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTillTenderHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TillTenderHistory }
     * 
     * 
     */
    public List<TillTenderHistory> getTillTenderHistory() {
        if (tillTenderHistory == null) {
            tillTenderHistory = new ArrayList<TillTenderHistory>();
        }
        return this.tillTenderHistory;
    }

    /**
     * Gets the value of the tillTaxHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tillTaxHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTillTaxHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TillTaxHistory }
     * 
     * 
     */
    public List<TillTaxHistory> getTillTaxHistory() {
        if (tillTaxHistory == null) {
            tillTaxHistory = new ArrayList<TillTaxHistory>();
        }
        return this.tillTaxHistory;
    }

    /**
     * Gets the value of the tillDisburment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tillDisburment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTillDisburment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TillDisbursementFundsReceiptTransactionSummary }
     * 
     * 
     */
    public List<TillDisbursementFundsReceiptTransactionSummary> getTillDisburment() {
        if (tillDisburment == null) {
            tillDisburment = new ArrayList<TillDisbursementFundsReceiptTransactionSummary>();
        }
        return this.tillDisburment;
    }

}
