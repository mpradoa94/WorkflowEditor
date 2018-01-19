
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DCTO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CTAB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_DCTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_DCTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_VENC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CNY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TIPO_DCTO_BANC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iddestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_TRAN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="icd" type="{http://Webmet.core/}inventoryControlDocument" minOccurs="0"/>
 *         &lt;element name="listAPRBL" type="{http://Webmet.core/}accountsPayRecBanLedgerLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="docpay" type="{http://Webmet.core/}documentPayable" minOccurs="0"/>
 *         &lt;element name="formatDcDocto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatDcVence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "document", propOrder = {
    "idstrrt",
    "iddcto",
    "idctab",
    "tydcto",
    "dcdcto",
    "dcvenc",
    "descripcion",
    "referencia",
    "idcny",
    "value",
    "balance",
    "tipodctobanc",
    "iddestino",
    "mes",
    "anio",
    "idtran",
    "idicd",
    "icd",
    "listAPRBL",
    "docpay",
    "formatDcDocto",
    "formatDcVence"
})
@XmlSeeAlso({
    DocumentoXPagar.class
})
public class Document {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_DCTO")
    protected int iddcto;
    @XmlElement(name = "ID_CTAB")
    protected int idctab;
    @XmlElement(name = "TY_DCTO")
    protected String tydcto;
    @XmlElement(name = "DC_DCTO")
    protected String dcdcto;
    @XmlElement(name = "DC_VENC")
    protected String dcvenc;
    @XmlElement(name = "DESCRIPCION")
    protected String descripcion;
    @XmlElement(name = "REFERENCIA")
    protected String referencia;
    @XmlElement(name = "ID_CNY")
    protected int idcny;
    @XmlElement(name = "VALUE")
    protected double value;
    @XmlElement(name = "BALANCE")
    protected double balance;
    @XmlElement(name = "TIPO_DCTO_BANC")
    protected String tipodctobanc;
    protected int iddestino;
    @XmlElement(name = "MES")
    protected String mes;
    @XmlElement(name = "ANIO")
    protected String anio;
    @XmlElement(name = "ID_TRAN")
    protected int idtran;
    @XmlElement(name = "ID_ICD")
    protected int idicd;
    protected InventoryControlDocument icd;
    @XmlElement(nillable = true)
    protected List<AccountsPayRecBanLedgerLine> listAPRBL;
    protected DocumentPayable docpay;
    protected String formatDcDocto;
    protected String formatDcVence;

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
     * Obtiene el valor de la propiedad idctab.
     * 
     */
    public int getIDCTAB() {
        return idctab;
    }

    /**
     * Define el valor de la propiedad idctab.
     * 
     */
    public void setIDCTAB(int value) {
        this.idctab = value;
    }

    /**
     * Obtiene el valor de la propiedad tydcto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYDCTO() {
        return tydcto;
    }

    /**
     * Define el valor de la propiedad tydcto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYDCTO(String value) {
        this.tydcto = value;
    }

    /**
     * Obtiene el valor de la propiedad dcdcto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDCTO() {
        return dcdcto;
    }

    /**
     * Define el valor de la propiedad dcdcto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDCTO(String value) {
        this.dcdcto = value;
    }

    /**
     * Obtiene el valor de la propiedad dcvenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCVENC() {
        return dcvenc;
    }

    /**
     * Define el valor de la propiedad dcvenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCVENC(String value) {
        this.dcvenc = value;
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
     * Obtiene el valor de la propiedad value.
     * 
     */
    public double getVALUE() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setVALUE(double value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad balance.
     * 
     */
    public double getBALANCE() {
        return balance;
    }

    /**
     * Define el valor de la propiedad balance.
     * 
     */
    public void setBALANCE(double value) {
        this.balance = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodctobanc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODCTOBANC() {
        return tipodctobanc;
    }

    /**
     * Define el valor de la propiedad tipodctobanc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODCTOBANC(String value) {
        this.tipodctobanc = value;
    }

    /**
     * Obtiene el valor de la propiedad iddestino.
     * 
     */
    public int getIddestino() {
        return iddestino;
    }

    /**
     * Define el valor de la propiedad iddestino.
     * 
     */
    public void setIddestino(int value) {
        this.iddestino = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMES() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMES(String value) {
        this.mes = value;
    }

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIO() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIO(String value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad idtran.
     * 
     */
    public int getIDTRAN() {
        return idtran;
    }

    /**
     * Define el valor de la propiedad idtran.
     * 
     */
    public void setIDTRAN(int value) {
        this.idtran = value;
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
     * Obtiene el valor de la propiedad icd.
     * 
     * @return
     *     possible object is
     *     {@link InventoryControlDocument }
     *     
     */
    public InventoryControlDocument getIcd() {
        return icd;
    }

    /**
     * Define el valor de la propiedad icd.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryControlDocument }
     *     
     */
    public void setIcd(InventoryControlDocument value) {
        this.icd = value;
    }

    /**
     * Gets the value of the listAPRBL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAPRBL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAPRBL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountsPayRecBanLedgerLine }
     * 
     * 
     */
    public List<AccountsPayRecBanLedgerLine> getListAPRBL() {
        if (listAPRBL == null) {
            listAPRBL = new ArrayList<AccountsPayRecBanLedgerLine>();
        }
        return this.listAPRBL;
    }

    /**
     * Obtiene el valor de la propiedad docpay.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPayable }
     *     
     */
    public DocumentPayable getDocpay() {
        return docpay;
    }

    /**
     * Define el valor de la propiedad docpay.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPayable }
     *     
     */
    public void setDocpay(DocumentPayable value) {
        this.docpay = value;
    }

    /**
     * Obtiene el valor de la propiedad formatDcDocto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatDcDocto() {
        return formatDcDocto;
    }

    /**
     * Define el valor de la propiedad formatDcDocto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatDcDocto(String value) {
        this.formatDcDocto = value;
    }

    /**
     * Obtiene el valor de la propiedad formatDcVence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatDcVence() {
        return formatDcVence;
    }

    /**
     * Define el valor de la propiedad formatDcVence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatDcVence(String value) {
        this.formatDcVence = value;
    }

}
