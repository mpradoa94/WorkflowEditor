
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para inventario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inventario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_str_rt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transaction" type="{http://Webmet.core/}transaction" minOccurs="0"/>
 *         &lt;element name="stock" type="{http://Webmet.core/}stock" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="xmlTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="writeTrans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Oper" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="RetailTransaction">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Cliente">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="id_ct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CV_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="organizacion">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RFC_TAXID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FAddress">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Transaction">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AI_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="TS_TM_STR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TY_TRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TS_TRN_BGN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TS_TRN_END" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FL_CNCL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="FL_VD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="FL_TRG_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="FL_KEY_OFL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="IN_TND_ELPSD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="FL_SPN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="QU_UN_RTL_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="QU_ITM_LN_SC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PE_ITM_LN_SC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="QU_ITM_LN_KY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ID_FACTURA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RetailTrsansactionLineItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AI_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="AI_LN_ITEM_VD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="TY_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FL_VD_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="LU_MTH_LTM_RTL_TRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RetailTransactionLineItemOverride" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="TS_LTM_RTL_TRN_OVR" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                                       &lt;element name="RC_LTM_RTL_TRN_OVR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SaleReturnLineItem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="TY_ITM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TY_ITM_SV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="MO_PRC_REG" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="FOOD_STAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CLIENTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="MO_PRC_ACT" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="MO_EXTND" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="QU_ITM_LM_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="QTY_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="TaxGroupRule">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="AI_CMPND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="TaxRateRule">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="AI_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="TY_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="MO_TXBM_MNM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="MO_TXBL_MXM" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                           &lt;element name="MO_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="PE_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SaleReturnTaxLineItem">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="MO_TXBL_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                                 &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TenderLineItem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="MO_FRG_CY" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="MO_ITM_LN_TND" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TenderChangeLineItem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="MO_TND_FN_TRN" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventario", propOrder = {
    "idInstancia",
    "idStrRt",
    "transaction",
    "stock",
    "xmlTransaction",
    "writeTrans"
})
public class Inventario {

    @XmlElement(name = "id_Instancia")
    protected int idInstancia;
    @XmlElement(name = "id_str_rt")
    protected int idStrRt;
    protected core.webmet.Transaction transaction;
    @XmlElement(nillable = true)
    protected List<Stock> stock;
    protected String xmlTransaction;
    protected Inventario.WriteTrans writeTrans;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad idStrRt.
     * 
     */
    public int getIdStrRt() {
        return idStrRt;
    }

    /**
     * Define el valor de la propiedad idStrRt.
     * 
     */
    public void setIdStrRt(int value) {
        this.idStrRt = value;
    }

    /**
     * Obtiene el valor de la propiedad transaction.
     * 
     * @return
     *     possible object is
     *     {@link core.webmet.Transaction }
     *     
     */
    public core.webmet.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Define el valor de la propiedad transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link core.webmet.Transaction }
     *     
     */
    public void setTransaction(core.webmet.Transaction value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the stock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stock }
     * 
     * 
     */
    public List<Stock> getStock() {
        if (stock == null) {
            stock = new ArrayList<Stock>();
        }
        return this.stock;
    }

    /**
     * Obtiene el valor de la propiedad xmlTransaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlTransaction() {
        return xmlTransaction;
    }

    /**
     * Define el valor de la propiedad xmlTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlTransaction(String value) {
        this.xmlTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad writeTrans.
     * 
     * @return
     *     possible object is
     *     {@link Inventario.WriteTrans }
     *     
     */
    public Inventario.WriteTrans getWriteTrans() {
        return writeTrans;
    }

    /**
     * Define el valor de la propiedad writeTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link Inventario.WriteTrans }
     *     
     */
    public void setWriteTrans(Inventario.WriteTrans value) {
        this.writeTrans = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Oper" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="RetailTransaction">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Cliente">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="id_ct" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CV_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="organizacion">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RFC_TAXID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FAddress">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Transaction">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AI_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="TS_TM_STR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TY_TRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TS_TRN_BGN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TS_TRN_END" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FL_CNCL" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="FL_VD" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="FL_TRG_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="FL_KEY_OFL" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="IN_TND_ELPSD" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="FL_SPN" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="QU_UN_RTL_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="QU_ITM_LN_SC" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="PE_ITM_LN_SC" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="QU_ITM_LN_KY" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ID_FACTURA" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RetailTrsansactionLineItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AI_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="AI_LN_ITEM_VD" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="TY_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FL_VD_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="LU_MTH_LTM_RTL_TRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RetailTransactionLineItemOverride" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="TS_LTM_RTL_TRN_OVR" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                             &lt;element name="RC_LTM_RTL_TRN_OVR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SaleReturnLineItem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="TY_ITM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TY_ITM_SV" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="MO_PRC_REG" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="FOOD_STAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CLIENTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="MO_PRC_ACT" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="MO_EXTND" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="QU_ITM_LM_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="QTY_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="TaxGroupRule">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="AI_CMPND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="TaxRateRule">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="AI_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="TY_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="MO_TXBM_MNM" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="MO_TXBL_MXM" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                                 &lt;element name="MO_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="PE_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SaleReturnTaxLineItem">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="MO_TXBL_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                                       &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TenderLineItem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="MO_FRG_CY" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="MO_ITM_LN_TND" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TenderChangeLineItem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="MO_TND_FN_TRN" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oper",
        "idInstancia",
        "retailTransaction",
        "retailTrsansactionLineItem"
    })
    public static class WriteTrans {

        @XmlElement(name = "Oper", required = true)
        protected String oper;
        @XmlElement(name = "id_instancia")
        protected int idInstancia;
        @XmlElement(name = "RetailTransaction", required = true)
        protected Inventario.WriteTrans.RetailTransaction retailTransaction;
        @XmlElement(name = "RetailTrsansactionLineItem")
        protected List<Inventario.WriteTrans.RetailTrsansactionLineItem> retailTrsansactionLineItem;

        /**
         * Obtiene el valor de la propiedad oper.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOper() {
            return oper;
        }

        /**
         * Define el valor de la propiedad oper.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOper(String value) {
            this.oper = value;
        }

        /**
         * Obtiene el valor de la propiedad idInstancia.
         * 
         */
        public int getIdInstancia() {
            return idInstancia;
        }

        /**
         * Define el valor de la propiedad idInstancia.
         * 
         */
        public void setIdInstancia(int value) {
            this.idInstancia = value;
        }

        /**
         * Obtiene el valor de la propiedad retailTransaction.
         * 
         * @return
         *     possible object is
         *     {@link Inventario.WriteTrans.RetailTransaction }
         *     
         */
        public Inventario.WriteTrans.RetailTransaction getRetailTransaction() {
            return retailTransaction;
        }

        /**
         * Define el valor de la propiedad retailTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link Inventario.WriteTrans.RetailTransaction }
         *     
         */
        public void setRetailTransaction(Inventario.WriteTrans.RetailTransaction value) {
            this.retailTransaction = value;
        }

        /**
         * Gets the value of the retailTrsansactionLineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the retailTrsansactionLineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRetailTrsansactionLineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Inventario.WriteTrans.RetailTrsansactionLineItem }
         * 
         * 
         */
        public List<Inventario.WriteTrans.RetailTrsansactionLineItem> getRetailTrsansactionLineItem() {
            if (retailTrsansactionLineItem == null) {
                retailTrsansactionLineItem = new ArrayList<Inventario.WriteTrans.RetailTrsansactionLineItem>();
            }
            return this.retailTrsansactionLineItem;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Cliente">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="id_ct" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CV_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="organizacion">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="RFC_TAXID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FAddress">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Transaction">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AI_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="TS_TM_STR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TY_TRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TS_TRN_BGN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TS_TRN_END" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FL_CNCL" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="FL_VD" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="FL_TRG_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="FL_KEY_OFL" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="IN_TND_ELPSD" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="FL_SPN" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="QU_UN_RTL_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="QU_ITM_LN_SC" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="PE_ITM_LN_SC" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="QU_ITM_LN_KY" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ID_FACTURA" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cliente",
            "transaction",
            "idct",
            "intndelpsd",
            "flspn",
            "quunrtltrn",
            "quitmlnsc",
            "peitmlnsc",
            "quitmlnky",
            "idfactura"
        })
        public static class RetailTransaction {

            @XmlElement(name = "Cliente", required = true)
            protected Inventario.WriteTrans.RetailTransaction.Cliente cliente;
            @XmlElement(name = "Transaction", required = true)
            protected Inventario.WriteTrans.RetailTransaction.Transaction transaction;
            @XmlElement(name = "ID_CT")
            protected int idct;
            @XmlElement(name = "IN_TND_ELPSD")
            protected int intndelpsd;
            @XmlElement(name = "FL_SPN")
            protected int flspn;
            @XmlElement(name = "QU_UN_RTL_TRN")
            protected int quunrtltrn;
            @XmlElement(name = "QU_ITM_LN_SC")
            protected int quitmlnsc;
            @XmlElement(name = "PE_ITM_LN_SC")
            protected int peitmlnsc;
            @XmlElement(name = "QU_ITM_LN_KY")
            protected int quitmlnky;
            @XmlElement(name = "ID_FACTURA")
            protected int idfactura;

            /**
             * Obtiene el valor de la propiedad cliente.
             * 
             * @return
             *     possible object is
             *     {@link Inventario.WriteTrans.RetailTransaction.Cliente }
             *     
             */
            public Inventario.WriteTrans.RetailTransaction.Cliente getCliente() {
                return cliente;
            }

            /**
             * Define el valor de la propiedad cliente.
             * 
             * @param value
             *     allowed object is
             *     {@link Inventario.WriteTrans.RetailTransaction.Cliente }
             *     
             */
            public void setCliente(Inventario.WriteTrans.RetailTransaction.Cliente value) {
                this.cliente = value;
            }

            /**
             * Obtiene el valor de la propiedad transaction.
             * 
             * @return
             *     possible object is
             *     {@link Inventario.WriteTrans.RetailTransaction.Transaction }
             *     
             */
            public Inventario.WriteTrans.RetailTransaction.Transaction getTransaction() {
                return transaction;
            }

            /**
             * Define el valor de la propiedad transaction.
             * 
             * @param value
             *     allowed object is
             *     {@link Inventario.WriteTrans.RetailTransaction.Transaction }
             *     
             */
            public void setTransaction(Inventario.WriteTrans.RetailTransaction.Transaction value) {
                this.transaction = value;
            }

            /**
             * Obtiene el valor de la propiedad idct.
             * 
             */
            public int getIDCT() {
                return idct;
            }

            /**
             * Define el valor de la propiedad idct.
             * 
             */
            public void setIDCT(int value) {
                this.idct = value;
            }

            /**
             * Obtiene el valor de la propiedad intndelpsd.
             * 
             */
            public int getINTNDELPSD() {
                return intndelpsd;
            }

            /**
             * Define el valor de la propiedad intndelpsd.
             * 
             */
            public void setINTNDELPSD(int value) {
                this.intndelpsd = value;
            }

            /**
             * Obtiene el valor de la propiedad flspn.
             * 
             */
            public int getFLSPN() {
                return flspn;
            }

            /**
             * Define el valor de la propiedad flspn.
             * 
             */
            public void setFLSPN(int value) {
                this.flspn = value;
            }

            /**
             * Obtiene el valor de la propiedad quunrtltrn.
             * 
             */
            public int getQUUNRTLTRN() {
                return quunrtltrn;
            }

            /**
             * Define el valor de la propiedad quunrtltrn.
             * 
             */
            public void setQUUNRTLTRN(int value) {
                this.quunrtltrn = value;
            }

            /**
             * Obtiene el valor de la propiedad quitmlnsc.
             * 
             */
            public int getQUITMLNSC() {
                return quitmlnsc;
            }

            /**
             * Define el valor de la propiedad quitmlnsc.
             * 
             */
            public void setQUITMLNSC(int value) {
                this.quitmlnsc = value;
            }

            /**
             * Obtiene el valor de la propiedad peitmlnsc.
             * 
             */
            public int getPEITMLNSC() {
                return peitmlnsc;
            }

            /**
             * Define el valor de la propiedad peitmlnsc.
             * 
             */
            public void setPEITMLNSC(int value) {
                this.peitmlnsc = value;
            }

            /**
             * Obtiene el valor de la propiedad quitmlnky.
             * 
             */
            public int getQUITMLNKY() {
                return quitmlnky;
            }

            /**
             * Define el valor de la propiedad quitmlnky.
             * 
             */
            public void setQUITMLNKY(int value) {
                this.quitmlnky = value;
            }

            /**
             * Obtiene el valor de la propiedad idfactura.
             * 
             */
            public int getIDFACTURA() {
                return idfactura;
            }

            /**
             * Define el valor de la propiedad idfactura.
             * 
             */
            public void setIDFACTURA(int value) {
                this.idfactura = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="id_ct" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CV_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="organizacion">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="RFC_TAXID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FAddress">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "idCt",
                "cvct",
                "nmct",
                "organizacion",
                "fAddress"
            })
            public static class Cliente {

                @XmlElement(name = "id_ct", required = true)
                protected String idCt;
                @XmlElement(name = "CV_CT", required = true)
                protected String cvct;
                @XmlElement(name = "NM_CT", required = true)
                protected String nmct;
                @XmlElement(required = true)
                protected Inventario.WriteTrans.RetailTransaction.Cliente.Organizacion organizacion;
                @XmlElement(name = "FAddress", required = true)
                protected Inventario.WriteTrans.RetailTransaction.Cliente.FAddress fAddress;

                /**
                 * Obtiene el valor de la propiedad idCt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdCt() {
                    return idCt;
                }

                /**
                 * Define el valor de la propiedad idCt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdCt(String value) {
                    this.idCt = value;
                }

                /**
                 * Obtiene el valor de la propiedad cvct.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCVCT() {
                    return cvct;
                }

                /**
                 * Define el valor de la propiedad cvct.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCVCT(String value) {
                    this.cvct = value;
                }

                /**
                 * Obtiene el valor de la propiedad nmct.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNMCT() {
                    return nmct;
                }

                /**
                 * Define el valor de la propiedad nmct.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNMCT(String value) {
                    this.nmct = value;
                }

                /**
                 * Obtiene el valor de la propiedad organizacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Inventario.WriteTrans.RetailTransaction.Cliente.Organizacion }
                 *     
                 */
                public Inventario.WriteTrans.RetailTransaction.Cliente.Organizacion getOrganizacion() {
                    return organizacion;
                }

                /**
                 * Define el valor de la propiedad organizacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Inventario.WriteTrans.RetailTransaction.Cliente.Organizacion }
                 *     
                 */
                public void setOrganizacion(Inventario.WriteTrans.RetailTransaction.Cliente.Organizacion value) {
                    this.organizacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad fAddress.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Inventario.WriteTrans.RetailTransaction.Cliente.FAddress }
                 *     
                 */
                public Inventario.WriteTrans.RetailTransaction.Cliente.FAddress getFAddress() {
                    return fAddress;
                }

                /**
                 * Define el valor de la propiedad fAddress.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Inventario.WriteTrans.RetailTransaction.Cliente.FAddress }
                 *     
                 */
                public void setFAddress(Inventario.WriteTrans.RetailTransaction.Cliente.FAddress value) {
                    this.fAddress = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "domicilio",
                    "colonia",
                    "ciudad",
                    "estado",
                    "pais",
                    "cp"
                })
                public static class FAddress {

                    @XmlElement(name = "DOMICILIO", required = true)
                    protected String domicilio;
                    @XmlElement(name = "COLONIA", required = true)
                    protected String colonia;
                    @XmlElement(name = "CIUDAD", required = true)
                    protected String ciudad;
                    @XmlElement(name = "ESTADO", required = true)
                    protected String estado;
                    @XmlElement(name = "PAIS", required = true)
                    protected String pais;
                    @XmlElement(name = "CP", required = true)
                    protected String cp;

                    /**
                     * Obtiene el valor de la propiedad domicilio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDOMICILIO() {
                        return domicilio;
                    }

                    /**
                     * Define el valor de la propiedad domicilio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDOMICILIO(String value) {
                        this.domicilio = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad colonia.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOLONIA() {
                        return colonia;
                    }

                    /**
                     * Define el valor de la propiedad colonia.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOLONIA(String value) {
                        this.colonia = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad ciudad.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCIUDAD() {
                        return ciudad;
                    }

                    /**
                     * Define el valor de la propiedad ciudad.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCIUDAD(String value) {
                        this.ciudad = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad estado.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getESTADO() {
                        return estado;
                    }

                    /**
                     * Define el valor de la propiedad estado.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setESTADO(String value) {
                        this.estado = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad pais.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPAIS() {
                        return pais;
                    }

                    /**
                     * Define el valor de la propiedad pais.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPAIS(String value) {
                        this.pais = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCP() {
                        return cp;
                    }

                    /**
                     * Define el valor de la propiedad cp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCP(String value) {
                        this.cp = value;
                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="RFC_TAXID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "rfctaxid"
                })
                public static class Organizacion {

                    @XmlElement(name = "RFC_TAXID", required = true)
                    protected String rfctaxid;

                    /**
                     * Obtiene el valor de la propiedad rfctaxid.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFCTAXID() {
                        return rfctaxid;
                    }

                    /**
                     * Define el valor de la propiedad rfctaxid.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFCTAXID(String value) {
                        this.rfctaxid = value;
                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AI_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="TS_TM_STR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TY_TRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TS_TRN_BGN" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TS_TRN_END" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FL_CNCL" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="FL_VD" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="FL_TRG_TRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="FL_KEY_OFL" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "idstrrt",
                "idws",
                "dcdybsn",
                "aitrn",
                "idopr",
                "tstmstr",
                "tytrn",
                "tstrnbgn",
                "tstrnend",
                "flcncl",
                "flvd",
                "fltrgtrn",
                "flkeyofl"
            })
            public static class Transaction {

                @XmlElement(name = "ID_STR_RT")
                protected int idstrrt;
                @XmlElement(name = "ID_WS")
                protected int idws;
                @XmlElement(name = "DC_DY_BSN", required = true)
                protected String dcdybsn;
                @XmlElement(name = "AI_TRN")
                protected int aitrn;
                @XmlElement(name = "ID_OPR")
                protected int idopr;
                @XmlElement(name = "TS_TM_STR", required = true)
                protected String tstmstr;
                @XmlElement(name = "TY_TRN", required = true)
                protected String tytrn;
                @XmlElement(name = "TS_TRN_BGN", required = true)
                protected String tstrnbgn;
                @XmlElement(name = "TS_TRN_END", required = true)
                protected String tstrnend;
                @XmlElement(name = "FL_CNCL")
                protected int flcncl;
                @XmlElement(name = "FL_VD")
                protected int flvd;
                @XmlElement(name = "FL_TRG_TRN")
                protected int fltrgtrn;
                @XmlElement(name = "FL_KEY_OFL")
                protected int flkeyofl;

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
                 * Obtiene el valor de la propiedad tstmstr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTSTMSTR() {
                    return tstmstr;
                }

                /**
                 * Define el valor de la propiedad tstmstr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTSTMSTR(String value) {
                    this.tstmstr = value;
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
                 * Obtiene el valor de la propiedad tstrnbgn.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTSTRNBGN() {
                    return tstrnbgn;
                }

                /**
                 * Define el valor de la propiedad tstrnbgn.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTSTRNBGN(String value) {
                    this.tstrnbgn = value;
                }

                /**
                 * Obtiene el valor de la propiedad tstrnend.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTSTRNEND() {
                    return tstrnend;
                }

                /**
                 * Define el valor de la propiedad tstrnend.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTSTRNEND(String value) {
                    this.tstrnend = value;
                }

                /**
                 * Obtiene el valor de la propiedad flcncl.
                 * 
                 */
                public int getFLCNCL() {
                    return flcncl;
                }

                /**
                 * Define el valor de la propiedad flcncl.
                 * 
                 */
                public void setFLCNCL(int value) {
                    this.flcncl = value;
                }

                /**
                 * Obtiene el valor de la propiedad flvd.
                 * 
                 */
                public int getFLVD() {
                    return flvd;
                }

                /**
                 * Define el valor de la propiedad flvd.
                 * 
                 */
                public void setFLVD(int value) {
                    this.flvd = value;
                }

                /**
                 * Obtiene el valor de la propiedad fltrgtrn.
                 * 
                 */
                public int getFLTRGTRN() {
                    return fltrgtrn;
                }

                /**
                 * Define el valor de la propiedad fltrgtrn.
                 * 
                 */
                public void setFLTRGTRN(int value) {
                    this.fltrgtrn = value;
                }

                /**
                 * Obtiene el valor de la propiedad flkeyofl.
                 * 
                 */
                public int getFLKEYOFL() {
                    return flkeyofl;
                }

                /**
                 * Define el valor de la propiedad flkeyofl.
                 * 
                 */
                public void setFLKEYOFL(int value) {
                    this.flkeyofl = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AI_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="AI_LN_ITEM_VD" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="TY_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FL_VD_LN_ITEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="LU_MTH_LTM_RTL_TRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RetailTransactionLineItemOverride" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="TS_LTM_RTL_TRN_OVR" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *                   &lt;element name="RC_LTM_RTL_TRN_OVR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SaleReturnLineItem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="TY_ITM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TY_ITM_SV" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="MO_PRC_REG" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="FOOD_STAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CLIENTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="MO_PRC_ACT" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="MO_EXTND" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="QU_ITM_LM_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="QTY_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="TaxGroupRule">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="AI_CMPND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="TaxRateRule">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="AI_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="TY_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="MO_TXBM_MNM" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="MO_TXBL_MXM" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                                       &lt;element name="MO_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="PE_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SaleReturnTaxLineItem">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="MO_TXBL_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                             &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TenderLineItem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="MO_FRG_CY" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="MO_ITM_LN_TND" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TenderChangeLineItem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="MO_TND_FN_TRN" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ailnitem",
            "ailnitemvd",
            "tylnitem",
            "flvdlnitem",
            "lumthltmrtltrn",
            "retailTransactionLineItemOverride",
            "saleReturnLineItem",
            "tenderLineItem",
            "tenderChangeLineItem"
        })
        public static class RetailTrsansactionLineItem {

            @XmlElement(name = "AI_LN_ITEM")
            protected int ailnitem;
            @XmlElement(name = "AI_LN_ITEM_VD")
            protected int ailnitemvd;
            @XmlElement(name = "TY_LN_ITEM", required = true)
            protected String tylnitem;
            @XmlElement(name = "FL_VD_LN_ITEM")
            protected int flvdlnitem;
            @XmlElement(name = "LU_MTH_LTM_RTL_TRN", required = true)
            protected String lumthltmrtltrn;
            @XmlElement(name = "RetailTransactionLineItemOverride")
            protected Inventario.WriteTrans.RetailTrsansactionLineItem.RetailTransactionLineItemOverride retailTransactionLineItemOverride;
            @XmlElement(name = "SaleReturnLineItem")
            protected Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem saleReturnLineItem;
            @XmlElement(name = "TenderLineItem")
            protected Inventario.WriteTrans.RetailTrsansactionLineItem.TenderLineItem tenderLineItem;
            @XmlElement(name = "TenderChangeLineItem")
            protected Inventario.WriteTrans.RetailTrsansactionLineItem.TenderChangeLineItem tenderChangeLineItem;

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
             * Obtiene el valor de la propiedad ailnitemvd.
             * 
             */
            public int getAILNITEMVD() {
                return ailnitemvd;
            }

            /**
             * Define el valor de la propiedad ailnitemvd.
             * 
             */
            public void setAILNITEMVD(int value) {
                this.ailnitemvd = value;
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
             * Obtiene el valor de la propiedad flvdlnitem.
             * 
             */
            public int getFLVDLNITEM() {
                return flvdlnitem;
            }

            /**
             * Define el valor de la propiedad flvdlnitem.
             * 
             */
            public void setFLVDLNITEM(int value) {
                this.flvdlnitem = value;
            }

            /**
             * Obtiene el valor de la propiedad lumthltmrtltrn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLUMTHLTMRTLTRN() {
                return lumthltmrtltrn;
            }

            /**
             * Define el valor de la propiedad lumthltmrtltrn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLUMTHLTMRTLTRN(String value) {
                this.lumthltmrtltrn = value;
            }

            /**
             * Obtiene el valor de la propiedad retailTransactionLineItemOverride.
             * 
             * @return
             *     possible object is
             *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.RetailTransactionLineItemOverride }
             *     
             */
            public Inventario.WriteTrans.RetailTrsansactionLineItem.RetailTransactionLineItemOverride getRetailTransactionLineItemOverride() {
                return retailTransactionLineItemOverride;
            }

            /**
             * Define el valor de la propiedad retailTransactionLineItemOverride.
             * 
             * @param value
             *     allowed object is
             *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.RetailTransactionLineItemOverride }
             *     
             */
            public void setRetailTransactionLineItemOverride(Inventario.WriteTrans.RetailTrsansactionLineItem.RetailTransactionLineItemOverride value) {
                this.retailTransactionLineItemOverride = value;
            }

            /**
             * Obtiene el valor de la propiedad saleReturnLineItem.
             * 
             * @return
             *     possible object is
             *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem }
             *     
             */
            public Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem getSaleReturnLineItem() {
                return saleReturnLineItem;
            }

            /**
             * Define el valor de la propiedad saleReturnLineItem.
             * 
             * @param value
             *     allowed object is
             *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem }
             *     
             */
            public void setSaleReturnLineItem(Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem value) {
                this.saleReturnLineItem = value;
            }

            /**
             * Obtiene el valor de la propiedad tenderLineItem.
             * 
             * @return
             *     possible object is
             *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.TenderLineItem }
             *     
             */
            public Inventario.WriteTrans.RetailTrsansactionLineItem.TenderLineItem getTenderLineItem() {
                return tenderLineItem;
            }

            /**
             * Define el valor de la propiedad tenderLineItem.
             * 
             * @param value
             *     allowed object is
             *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.TenderLineItem }
             *     
             */
            public void setTenderLineItem(Inventario.WriteTrans.RetailTrsansactionLineItem.TenderLineItem value) {
                this.tenderLineItem = value;
            }

            /**
             * Obtiene el valor de la propiedad tenderChangeLineItem.
             * 
             * @return
             *     possible object is
             *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.TenderChangeLineItem }
             *     
             */
            public Inventario.WriteTrans.RetailTrsansactionLineItem.TenderChangeLineItem getTenderChangeLineItem() {
                return tenderChangeLineItem;
            }

            /**
             * Define el valor de la propiedad tenderChangeLineItem.
             * 
             * @param value
             *     allowed object is
             *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.TenderChangeLineItem }
             *     
             */
            public void setTenderChangeLineItem(Inventario.WriteTrans.RetailTrsansactionLineItem.TenderChangeLineItem value) {
                this.tenderChangeLineItem = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="TS_LTM_RTL_TRN_OVR" type="{http://www.w3.org/2001/XMLSchema}time"/>
             *         &lt;element name="RC_LTM_RTL_TRN_OVR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "idopr",
                "tsltmrtltrnovr",
                "rcltmrtltrnovr"
            })
            public static class RetailTransactionLineItemOverride {

                @XmlElement(name = "ID_OPR")
                protected int idopr;
                @XmlElement(name = "TS_LTM_RTL_TRN_OVR", required = true)
                @XmlSchemaType(name = "time")
                protected XMLGregorianCalendar tsltmrtltrnovr;
                @XmlElement(name = "RC_LTM_RTL_TRN_OVR", required = true)
                protected String rcltmrtltrnovr;

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
                 * Obtiene el valor de la propiedad tsltmrtltrnovr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getTSLTMRTLTRNOVR() {
                    return tsltmrtltrnovr;
                }

                /**
                 * Define el valor de la propiedad tsltmrtltrnovr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setTSLTMRTLTRNOVR(XMLGregorianCalendar value) {
                    this.tsltmrtltrnovr = value;
                }

                /**
                 * Obtiene el valor de la propiedad rcltmrtltrnovr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRCLTMRTLTRNOVR() {
                    return rcltmrtltrnovr;
                }

                /**
                 * Define el valor de la propiedad rcltmrtltrnovr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRCLTMRTLTRNOVR(String value) {
                    this.rcltmrtltrnovr = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="TY_ITM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TY_ITM_SV" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="MO_PRC_REG" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="FOOD_STAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CLIENTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="MO_PRC_ACT" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="MO_EXTND" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="QU_ITM_LM_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="QTY_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="TaxGroupRule">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="AI_CMPND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="TaxRateRule">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="AI_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="TY_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="MO_TXBM_MNM" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="MO_TXBL_MXM" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                             &lt;element name="MO_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="PE_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SaleReturnTaxLineItem">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="MO_TXBL_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *                   &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "iditm",
                "idgptx",
                "tyitm",
                "tyitmsv",
                "moprcreg",
                "foodstamp",
                "cliente",
                "moprcact",
                "moextnd",
                "quitmlmrtnsls",
                "qtyitm",
                "taxGroupRule",
                "saleReturnTaxLineItem"
            })
            public static class SaleReturnLineItem {

                @XmlElement(name = "ID_ITM")
                protected int iditm;
                @XmlElement(name = "ID_GP_TX")
                protected int idgptx;
                @XmlElement(name = "TY_ITM", required = true)
                protected String tyitm;
                @XmlElement(name = "TY_ITM_SV", required = true)
                protected String tyitmsv;
                @XmlElement(name = "MO_PRC_REG")
                protected float moprcreg;
                @XmlElement(name = "FOOD_STAMP", required = true)
                protected String foodstamp;
                @XmlElement(name = "CLIENTE", required = true)
                protected String cliente;
                @XmlElement(name = "MO_PRC_ACT")
                protected float moprcact;
                @XmlElement(name = "MO_EXTND")
                protected float moextnd;
                @XmlElement(name = "QU_ITM_LM_RTN_SLS")
                protected int quitmlmrtnsls;
                @XmlElement(name = "QTY_ITM")
                protected int qtyitm;
                @XmlElement(name = "TaxGroupRule", required = true)
                protected Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule taxGroupRule;
                @XmlElement(name = "SaleReturnTaxLineItem", required = true)
                protected Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.SaleReturnTaxLineItem saleReturnTaxLineItem;

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
                 * Obtiene el valor de la propiedad tyitm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTYITM() {
                    return tyitm;
                }

                /**
                 * Define el valor de la propiedad tyitm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTYITM(String value) {
                    this.tyitm = value;
                }

                /**
                 * Obtiene el valor de la propiedad tyitmsv.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTYITMSV() {
                    return tyitmsv;
                }

                /**
                 * Define el valor de la propiedad tyitmsv.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTYITMSV(String value) {
                    this.tyitmsv = value;
                }

                /**
                 * Obtiene el valor de la propiedad moprcreg.
                 * 
                 */
                public float getMOPRCREG() {
                    return moprcreg;
                }

                /**
                 * Define el valor de la propiedad moprcreg.
                 * 
                 */
                public void setMOPRCREG(float value) {
                    this.moprcreg = value;
                }

                /**
                 * Obtiene el valor de la propiedad foodstamp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFOODSTAMP() {
                    return foodstamp;
                }

                /**
                 * Define el valor de la propiedad foodstamp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFOODSTAMP(String value) {
                    this.foodstamp = value;
                }

                /**
                 * Obtiene el valor de la propiedad cliente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCLIENTE() {
                    return cliente;
                }

                /**
                 * Define el valor de la propiedad cliente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCLIENTE(String value) {
                    this.cliente = value;
                }

                /**
                 * Obtiene el valor de la propiedad moprcact.
                 * 
                 */
                public float getMOPRCACT() {
                    return moprcact;
                }

                /**
                 * Define el valor de la propiedad moprcact.
                 * 
                 */
                public void setMOPRCACT(float value) {
                    this.moprcact = value;
                }

                /**
                 * Obtiene el valor de la propiedad moextnd.
                 * 
                 */
                public float getMOEXTND() {
                    return moextnd;
                }

                /**
                 * Define el valor de la propiedad moextnd.
                 * 
                 */
                public void setMOEXTND(float value) {
                    this.moextnd = value;
                }

                /**
                 * Obtiene el valor de la propiedad quitmlmrtnsls.
                 * 
                 */
                public int getQUITMLMRTNSLS() {
                    return quitmlmrtnsls;
                }

                /**
                 * Define el valor de la propiedad quitmlmrtnsls.
                 * 
                 */
                public void setQUITMLMRTNSLS(int value) {
                    this.quitmlmrtnsls = value;
                }

                /**
                 * Obtiene el valor de la propiedad qtyitm.
                 * 
                 */
                public int getQTYITM() {
                    return qtyitm;
                }

                /**
                 * Define el valor de la propiedad qtyitm.
                 * 
                 */
                public void setQTYITM(int value) {
                    this.qtyitm = value;
                }

                /**
                 * Obtiene el valor de la propiedad taxGroupRule.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule }
                 *     
                 */
                public Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule getTaxGroupRule() {
                    return taxGroupRule;
                }

                /**
                 * Define el valor de la propiedad taxGroupRule.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule }
                 *     
                 */
                public void setTaxGroupRule(Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule value) {
                    this.taxGroupRule = value;
                }

                /**
                 * Obtiene el valor de la propiedad saleReturnTaxLineItem.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.SaleReturnTaxLineItem }
                 *     
                 */
                public Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.SaleReturnTaxLineItem getSaleReturnTaxLineItem() {
                    return saleReturnTaxLineItem;
                }

                /**
                 * Define el valor de la propiedad saleReturnTaxLineItem.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.SaleReturnTaxLineItem }
                 *     
                 */
                public void setSaleReturnTaxLineItem(Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.SaleReturnTaxLineItem value) {
                    this.saleReturnTaxLineItem = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="MO_TXBL_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
                 *         &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}float"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "idathytx",
                    "idgptx",
                    "motxblrtnsls",
                    "motxrtnsls"
                })
                public static class SaleReturnTaxLineItem {

                    @XmlElement(name = "ID_ATHY_TX")
                    protected int idathytx;
                    @XmlElement(name = "ID_GP_TX")
                    protected int idgptx;
                    @XmlElement(name = "MO_TXBL_RTN_SLS")
                    protected float motxblrtnsls;
                    @XmlElement(name = "MO_TX_RTN_SLS")
                    protected float motxrtnsls;

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

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="AI_CMPND" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="TaxRateRule">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="AI_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="TY_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="MO_TXBM_MNM" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="MO_TXBL_MXM" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *                   &lt;element name="MO_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="PE_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "idathytx",
                    "idgptx",
                    "aicmpnd",
                    "taxRateRule"
                })
                public static class TaxGroupRule {

                    @XmlElement(name = "ID_ATHY_TX")
                    protected int idathytx;
                    @XmlElement(name = "ID_GP_TX")
                    protected int idgptx;
                    @XmlElement(name = "AI_CMPND", required = true)
                    protected String aicmpnd;
                    @XmlElement(name = "TaxRateRule", required = true)
                    protected Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule.TaxRateRule taxRateRule;

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
                     * Obtiene el valor de la propiedad aicmpnd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAICMPND() {
                        return aicmpnd;
                    }

                    /**
                     * Define el valor de la propiedad aicmpnd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAICMPND(String value) {
                        this.aicmpnd = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxRateRule.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule.TaxRateRule }
                     *     
                     */
                    public Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule.TaxRateRule getTaxRateRule() {
                        return taxRateRule;
                    }

                    /**
                     * Define el valor de la propiedad taxRateRule.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule.TaxRateRule }
                     *     
                     */
                    public void setTaxRateRule(Inventario.WriteTrans.RetailTrsansactionLineItem.SaleReturnLineItem.TaxGroupRule.TaxRateRule value) {
                        this.taxRateRule = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ID_ATHY_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="AI_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="TY_TX_RT_RU" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="MO_TXBM_MNM" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="MO_TXBL_MXM" type="{http://www.w3.org/2001/XMLSchema}long"/>
                     *         &lt;element name="MO_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="PE_RT_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "idathytx",
                        "idgptx",
                        "aitxrtru",
                        "tytxrtru",
                        "motxbmmnm",
                        "motxblmxm",
                        "morttx",
                        "perttx"
                    })
                    public static class TaxRateRule {

                        @XmlElement(name = "ID_ATHY_TX")
                        protected int idathytx;
                        @XmlElement(name = "ID_GP_TX")
                        protected int idgptx;
                        @XmlElement(name = "AI_TX_RT_RU")
                        protected int aitxrtru;
                        @XmlElement(name = "TY_TX_RT_RU", required = true)
                        protected String tytxrtru;
                        @XmlElement(name = "MO_TXBM_MNM")
                        protected int motxbmmnm;
                        @XmlElement(name = "MO_TXBL_MXM")
                        protected long motxblmxm;
                        @XmlElement(name = "MO_RT_TX")
                        protected int morttx;
                        @XmlElement(name = "PE_RT_TX")
                        protected int perttx;

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
                         * Obtiene el valor de la propiedad aitxrtru.
                         * 
                         */
                        public int getAITXRTRU() {
                            return aitxrtru;
                        }

                        /**
                         * Define el valor de la propiedad aitxrtru.
                         * 
                         */
                        public void setAITXRTRU(int value) {
                            this.aitxrtru = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad tytxrtru.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTYTXRTRU() {
                            return tytxrtru;
                        }

                        /**
                         * Define el valor de la propiedad tytxrtru.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTYTXRTRU(String value) {
                            this.tytxrtru = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad motxbmmnm.
                         * 
                         */
                        public int getMOTXBMMNM() {
                            return motxbmmnm;
                        }

                        /**
                         * Define el valor de la propiedad motxbmmnm.
                         * 
                         */
                        public void setMOTXBMMNM(int value) {
                            this.motxbmmnm = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad motxblmxm.
                         * 
                         */
                        public long getMOTXBLMXM() {
                            return motxblmxm;
                        }

                        /**
                         * Define el valor de la propiedad motxblmxm.
                         * 
                         */
                        public void setMOTXBLMXM(long value) {
                            this.motxblmxm = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad morttx.
                         * 
                         */
                        public int getMORTTX() {
                            return morttx;
                        }

                        /**
                         * Define el valor de la propiedad morttx.
                         * 
                         */
                        public void setMORTTX(int value) {
                            this.morttx = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad perttx.
                         * 
                         */
                        public int getPERTTX() {
                            return perttx;
                        }

                        /**
                         * Define el valor de la propiedad perttx.
                         * 
                         */
                        public void setPERTTX(int value) {
                            this.perttx = value;
                        }

                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="MO_TND_FN_TRN" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tytnd",
                "motndfntrn"
            })
            public static class TenderChangeLineItem {

                @XmlElement(name = "TY_TND", required = true)
                protected String tytnd;
                @XmlElement(name = "MO_TND_FN_TRN")
                protected float motndfntrn;

                /**
                 * Obtiene el valor de la propiedad tytnd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTYTND() {
                    return tytnd;
                }

                /**
                 * Define el valor de la propiedad tytnd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTYTND(String value) {
                    this.tytnd = value;
                }

                /**
                 * Obtiene el valor de la propiedad motndfntrn.
                 * 
                 */
                public float getMOTNDFNTRN() {
                    return motndfntrn;
                }

                /**
                 * Define el valor de la propiedad motndfntrn.
                 * 
                 */
                public void setMOTNDFNTRN(float value) {
                    this.motndfntrn = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="MO_FRG_CY" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="MO_ITM_LN_TND" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tytnd",
                "mofrgcy",
                "moitmlntnd"
            })
            public static class TenderLineItem {

                @XmlElement(name = "TY_TND", required = true)
                protected String tytnd;
                @XmlElement(name = "MO_FRG_CY")
                protected float mofrgcy;
                @XmlElement(name = "MO_ITM_LN_TND")
                protected float moitmlntnd;

                /**
                 * Obtiene el valor de la propiedad tytnd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTYTND() {
                    return tytnd;
                }

                /**
                 * Define el valor de la propiedad tytnd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTYTND(String value) {
                    this.tytnd = value;
                }

                /**
                 * Obtiene el valor de la propiedad mofrgcy.
                 * 
                 */
                public float getMOFRGCY() {
                    return mofrgcy;
                }

                /**
                 * Define el valor de la propiedad mofrgcy.
                 * 
                 */
                public void setMOFRGCY(float value) {
                    this.mofrgcy = value;
                }

                /**
                 * Obtiene el valor de la propiedad moitmlntnd.
                 * 
                 */
                public float getMOITMLNTND() {
                    return moitmlntnd;
                }

                /**
                 * Define el valor de la propiedad moitmlntnd.
                 * 
                 */
                public void setMOITMLNTND(float value) {
                    this.moitmlntnd = value;
                }

            }

        }

    }

}
