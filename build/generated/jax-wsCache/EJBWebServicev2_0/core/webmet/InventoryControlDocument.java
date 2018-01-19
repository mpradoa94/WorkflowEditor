
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inventoryControlDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inventoryControlDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LCN_DES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CNY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TS_CMPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_CRT_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_UPDT_LS_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_PYM_DFR_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_DV_EXP_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_DV_ACT_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_SPR_EXP_SHP_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_SPR_ACT_SHP_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QU_DSCP_ICD" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ID_ORGR_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_CHG_FRGT_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CNTRT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SRZ_FRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_PYM_DFR_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCN" type="{http://Webmet.core/}inventoryLocation" minOccurs="0"/>
 *         &lt;element name="sup" type="{http://Webmet.core/}supplier" minOccurs="0"/>
 *         &lt;element name="ID_DCTO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ICDLI" type="{http://Webmet.core/}inventoryControlDocumentLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventoryControlDocument", propOrder = {
    "idlcn",
    "idlcndes",
    "idicd",
    "idspr",
    "idcny",
    "tscmpl",
    "tyicd",
    "tscrticd",
    "dcupdtlsicd",
    "dcpymdfricd",
    "dcdvexpicd",
    "dcdvacticd",
    "dcsprexpshpicd",
    "dcspractshpicd",
    "qudscpicd",
    "idorgricd",
    "dcchgfrgticd",
    "idcntrt",
    "idsrzfrm",
    "idopr",
    "typymdfricd",
    "status",
    "referencia",
    "descripcion",
    "lcn",
    "sup",
    "iddcto",
    "idstrrt",
    "icdli"
})
public class InventoryControlDocument {

    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "ID_LCN_DES")
    protected int idlcndes;
    @XmlElement(name = "ID_ICD")
    protected int idicd;
    @XmlElement(name = "ID_SPR")
    protected int idspr;
    @XmlElement(name = "ID_CNY")
    protected int idcny;
    @XmlElement(name = "TS_CMPL")
    protected String tscmpl;
    @XmlElement(name = "TY_ICD")
    protected String tyicd;
    @XmlElement(name = "TS_CRT_ICD")
    protected String tscrticd;
    @XmlElement(name = "DC_UPDT_LS_ICD")
    protected String dcupdtlsicd;
    @XmlElement(name = "DC_PYM_DFR_ICD")
    protected String dcpymdfricd;
    @XmlElement(name = "DC_DV_EXP_ICD")
    protected String dcdvexpicd;
    @XmlElement(name = "DC_DV_ACT_ICD")
    protected String dcdvacticd;
    @XmlElement(name = "DC_SPR_EXP_SHP_ICD")
    protected String dcsprexpshpicd;
    @XmlElement(name = "DC_SPR_ACT_SHP_ICD")
    protected String dcspractshpicd;
    @XmlElement(name = "QU_DSCP_ICD")
    protected double qudscpicd;
    @XmlElement(name = "ID_ORGR_ICD")
    protected int idorgricd;
    @XmlElement(name = "DC_CHG_FRGT_ICD")
    protected String dcchgfrgticd;
    @XmlElement(name = "ID_CNTRT")
    protected int idcntrt;
    @XmlElement(name = "ID_SRZ_FRM")
    protected String idsrzfrm;
    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(name = "TY_PYM_DFR_ICD")
    protected int typymdfricd;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "REFERENCIA")
    protected String referencia;
    @XmlElement(name = "DESCRIPCION")
    protected String descripcion;
    @XmlElement(name = "LCN")
    protected InventoryLocation lcn;
    protected Supplier sup;
    @XmlElement(name = "ID_DCTO")
    protected int iddcto;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ICDLI", nillable = true)
    protected List<InventoryControlDocumentLineItem> icdli;

    /**
     * Obtiene el valor de la propiedad idlcn.
     * 
     */
    public int getIDLCN() {
        return idlcn;
    }

    /**
     * Define el valor de la propiedad idlcn.
     * 
     */
    public void setIDLCN(int value) {
        this.idlcn = value;
    }

    /**
     * Obtiene el valor de la propiedad idlcndes.
     * 
     */
    public int getIDLCNDES() {
        return idlcndes;
    }

    /**
     * Define el valor de la propiedad idlcndes.
     * 
     */
    public void setIDLCNDES(int value) {
        this.idlcndes = value;
    }

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
     * Obtiene el valor de la propiedad idspr.
     * 
     */
    public int getIDSPR() {
        return idspr;
    }

    /**
     * Define el valor de la propiedad idspr.
     * 
     */
    public void setIDSPR(int value) {
        this.idspr = value;
    }

    /**
     * Obtiene el valor de la propiedad idcny.
     * 
     */
    public int getIDCNY() {
        return idcny;
    }

    /**
     * Define el valor de la propiedad idcny.
     * 
     */
    public void setIDCNY(int value) {
        this.idcny = value;
    }

    /**
     * Obtiene el valor de la propiedad tscmpl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCMPL() {
        return tscmpl;
    }

    /**
     * Define el valor de la propiedad tscmpl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCMPL(String value) {
        this.tscmpl = value;
    }

    /**
     * Obtiene el valor de la propiedad tyicd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYICD() {
        return tyicd;
    }

    /**
     * Define el valor de la propiedad tyicd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYICD(String value) {
        this.tyicd = value;
    }

    /**
     * Obtiene el valor de la propiedad tscrticd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCRTICD() {
        return tscrticd;
    }

    /**
     * Define el valor de la propiedad tscrticd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCRTICD(String value) {
        this.tscrticd = value;
    }

    /**
     * Obtiene el valor de la propiedad dcupdtlsicd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCUPDTLSICD() {
        return dcupdtlsicd;
    }

    /**
     * Define el valor de la propiedad dcupdtlsicd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCUPDTLSICD(String value) {
        this.dcupdtlsicd = value;
    }

    /**
     * Obtiene el valor de la propiedad dcpymdfricd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCPYMDFRICD() {
        return dcpymdfricd;
    }

    /**
     * Define el valor de la propiedad dcpymdfricd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCPYMDFRICD(String value) {
        this.dcpymdfricd = value;
    }

    /**
     * Obtiene el valor de la propiedad dcdvexpicd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDVEXPICD() {
        return dcdvexpicd;
    }

    /**
     * Define el valor de la propiedad dcdvexpicd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDVEXPICD(String value) {
        this.dcdvexpicd = value;
    }

    /**
     * Obtiene el valor de la propiedad dcdvacticd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDVACTICD() {
        return dcdvacticd;
    }

    /**
     * Define el valor de la propiedad dcdvacticd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDVACTICD(String value) {
        this.dcdvacticd = value;
    }

    /**
     * Obtiene el valor de la propiedad dcsprexpshpicd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSPREXPSHPICD() {
        return dcsprexpshpicd;
    }

    /**
     * Define el valor de la propiedad dcsprexpshpicd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSPREXPSHPICD(String value) {
        this.dcsprexpshpicd = value;
    }

    /**
     * Obtiene el valor de la propiedad dcspractshpicd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSPRACTSHPICD() {
        return dcspractshpicd;
    }

    /**
     * Define el valor de la propiedad dcspractshpicd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSPRACTSHPICD(String value) {
        this.dcspractshpicd = value;
    }

    /**
     * Obtiene el valor de la propiedad qudscpicd.
     * 
     */
    public double getQUDSCPICD() {
        return qudscpicd;
    }

    /**
     * Define el valor de la propiedad qudscpicd.
     * 
     */
    public void setQUDSCPICD(double value) {
        this.qudscpicd = value;
    }

    /**
     * Obtiene el valor de la propiedad idorgricd.
     * 
     */
    public int getIDORGRICD() {
        return idorgricd;
    }

    /**
     * Define el valor de la propiedad idorgricd.
     * 
     */
    public void setIDORGRICD(int value) {
        this.idorgricd = value;
    }

    /**
     * Obtiene el valor de la propiedad dcchgfrgticd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCHGFRGTICD() {
        return dcchgfrgticd;
    }

    /**
     * Define el valor de la propiedad dcchgfrgticd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCHGFRGTICD(String value) {
        this.dcchgfrgticd = value;
    }

    /**
     * Obtiene el valor de la propiedad idcntrt.
     * 
     */
    public int getIDCNTRT() {
        return idcntrt;
    }

    /**
     * Define el valor de la propiedad idcntrt.
     * 
     */
    public void setIDCNTRT(int value) {
        this.idcntrt = value;
    }

    /**
     * Obtiene el valor de la propiedad idsrzfrm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSRZFRM() {
        return idsrzfrm;
    }

    /**
     * Define el valor de la propiedad idsrzfrm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSRZFRM(String value) {
        this.idsrzfrm = value;
    }

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

    /**
     * Obtiene el valor de la propiedad typymdfricd.
     * 
     */
    public int getTYPYMDFRICD() {
        return typymdfricd;
    }

    /**
     * Define el valor de la propiedad typymdfricd.
     * 
     */
    public void setTYPYMDFRICD(int value) {
        this.typymdfricd = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCIA() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCIA(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad lcn.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocation }
     *     
     */
    public InventoryLocation getLCN() {
        return lcn;
    }

    /**
     * Define el valor de la propiedad lcn.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocation }
     *     
     */
    public void setLCN(InventoryLocation value) {
        this.lcn = value;
    }

    /**
     * Obtiene el valor de la propiedad sup.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getSup() {
        return sup;
    }

    /**
     * Define el valor de la propiedad sup.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setSup(Supplier value) {
        this.sup = value;
    }

    /**
     * Obtiene el valor de la propiedad iddcto.
     * 
     */
    public int getIDDCTO() {
        return iddcto;
    }

    /**
     * Define el valor de la propiedad iddcto.
     * 
     */
    public void setIDDCTO(int value) {
        this.iddcto = value;
    }

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Gets the value of the icdli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icdli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getICDLI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryControlDocumentLineItem }
     * 
     * 
     */
    public List<InventoryControlDocumentLineItem> getICDLI() {
        if (icdli == null) {
            icdli = new ArrayList<InventoryControlDocumentLineItem>();
        }
        return this.icdli;
    }

}
