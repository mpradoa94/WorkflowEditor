
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ghistCobros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ghistCobros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_HIST_PAGOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DET_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PAGO_VENTA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AI_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PAGO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DC_DEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_AL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_TRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ghistCobros", propOrder = {
    "idhistpagos",
    "idversion",
    "iddetcontrato",
    "idpagoventa",
    "idstrrt",
    "idws",
    "dcdybsn",
    "aitrn",
    "ailnitem",
    "pago",
    "dcdel",
    "dcal",
    "tytrn",
    "tylnitem",
    "titular"
})
public class GhistCobros {

    @XmlElement(name = "ID_HIST_PAGOS")
    protected int idhistpagos;
    @XmlElement(name = "ID_VERSION")
    protected int idversion;
    @XmlElement(name = "ID_DET_CONTRATO")
    protected int iddetcontrato;
    @XmlElement(name = "ID_PAGO_VENTA")
    protected int idpagoventa;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_WS")
    protected int idws;
    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "AI_TRN")
    protected int aitrn;
    @XmlElement(name = "AI_LN_ITEM")
    protected int ailnitem;
    @XmlElement(name = "PAGO")
    protected double pago;
    @XmlElement(name = "DC_DEL")
    protected String dcdel;
    @XmlElement(name = "DC_AL")
    protected String dcal;
    @XmlElement(name = "TY_TRN")
    protected String tytrn;
    @XmlElement(name = "TY_LN_ITEM")
    protected String tylnitem;
    @XmlElement(name = "Titular")
    protected String titular;

    /**
     * Obtiene el valor de la propiedad idhistpagos.
     * 
     */
    public int getIDHISTPAGOS() {
        return idhistpagos;
    }

    /**
     * Define el valor de la propiedad idhistpagos.
     * 
     */
    public void setIDHISTPAGOS(int value) {
        this.idhistpagos = value;
    }

    /**
     * Obtiene el valor de la propiedad idversion.
     * 
     */
    public int getIDVERSION() {
        return idversion;
    }

    /**
     * Define el valor de la propiedad idversion.
     * 
     */
    public void setIDVERSION(int value) {
        this.idversion = value;
    }

    /**
     * Obtiene el valor de la propiedad iddetcontrato.
     * 
     */
    public int getIDDETCONTRATO() {
        return iddetcontrato;
    }

    /**
     * Define el valor de la propiedad iddetcontrato.
     * 
     */
    public void setIDDETCONTRATO(int value) {
        this.iddetcontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad idpagoventa.
     * 
     */
    public int getIDPAGOVENTA() {
        return idpagoventa;
    }

    /**
     * Define el valor de la propiedad idpagoventa.
     * 
     */
    public void setIDPAGOVENTA(int value) {
        this.idpagoventa = value;
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
     * Obtiene el valor de la propiedad idws.
     * 
     */
    public int getIDWS() {
        return idws;
    }

    /**
     * Define el valor de la propiedad idws.
     * 
     */
    public void setIDWS(int value) {
        this.idws = value;
    }

    /**
     * Obtiene el valor de la propiedad dcdybsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDYBSN() {
        return dcdybsn;
    }

    /**
     * Define el valor de la propiedad dcdybsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDYBSN(String value) {
        this.dcdybsn = value;
    }

    /**
     * Obtiene el valor de la propiedad aitrn.
     * 
     */
    public int getAITRN() {
        return aitrn;
    }

    /**
     * Define el valor de la propiedad aitrn.
     * 
     */
    public void setAITRN(int value) {
        this.aitrn = value;
    }

    /**
     * Obtiene el valor de la propiedad ailnitem.
     * 
     */
    public int getAILNITEM() {
        return ailnitem;
    }

    /**
     * Define el valor de la propiedad ailnitem.
     * 
     */
    public void setAILNITEM(int value) {
        this.ailnitem = value;
    }

    /**
     * Obtiene el valor de la propiedad pago.
     * 
     */
    public double getPAGO() {
        return pago;
    }

    /**
     * Define el valor de la propiedad pago.
     * 
     */
    public void setPAGO(double value) {
        this.pago = value;
    }

    /**
     * Obtiene el valor de la propiedad dcdel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDEL() {
        return dcdel;
    }

    /**
     * Define el valor de la propiedad dcdel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDEL(String value) {
        this.dcdel = value;
    }

    /**
     * Obtiene el valor de la propiedad dcal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCAL() {
        return dcal;
    }

    /**
     * Define el valor de la propiedad dcal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCAL(String value) {
        this.dcal = value;
    }

    /**
     * Obtiene el valor de la propiedad tytrn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTRN() {
        return tytrn;
    }

    /**
     * Define el valor de la propiedad tytrn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTRN(String value) {
        this.tytrn = value;
    }

    /**
     * Obtiene el valor de la propiedad tylnitem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYLNITEM() {
        return tylnitem;
    }

    /**
     * Define el valor de la propiedad tylnitem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYLNITEM(String value) {
        this.tylnitem = value;
    }

    /**
     * Obtiene el valor de la propiedad titular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Define el valor de la propiedad titular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitular(String value) {
        this.titular = value;
    }

}
