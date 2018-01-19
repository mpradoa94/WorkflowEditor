
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaMovAlmacen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaMovAlmacen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS_QFR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PE_PROFIT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QU_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LU_CNT_SLS_WT_UN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UCOSTO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CP_UN_SL_LS_RSV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ID_STR_GRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="existencia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="price" type="{http://Webmet.core/}itemSellPrice" minOccurs="0"/>
 *         &lt;element name="ID_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="categoriaGp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaMovAlmacen", propOrder = {
    "iditm",
    "idgptx",
    "nmitm",
    "iditmps",
    "iditmpsqfr",
    "peprofit",
    "quitm",
    "lucntslswtun",
    "ucosto",
    "cpunsllsrsv",
    "idstrgrp",
    "existencia",
    "price",
    "idmrhrcgp",
    "categoriaGp"
})
public class ListaMovAlmacen {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "ID_ITM_PS_QFR")
    protected int iditmpsqfr;
    @XmlElement(name = "PE_PROFIT")
    protected double peprofit;
    @XmlElement(name = "QU_ITM")
    protected int quitm;
    @XmlElement(name = "LU_CNT_SLS_WT_UN")
    protected String lucntslswtun;
    @XmlElement(name = "UCOSTO")
    protected double ucosto;
    @XmlElement(name = "CP_UN_SL_LS_RSV")
    protected double cpunsllsrsv;
    @XmlElement(name = "ID_STR_GRP")
    protected int idstrgrp;
    protected double existencia;
    protected ItemSellPrice price;
    @XmlElement(name = "ID_MRHRC_GP")
    protected int idmrhrcgp;
    protected String categoriaGp;

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
     * Obtiene el valor de la propiedad nmitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMITM() {
        return nmitm;
    }

    /**
     * Define el valor de la propiedad nmitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMITM(String value) {
        this.nmitm = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDITMPS() {
        return iditmps;
    }

    /**
     * Define el valor de la propiedad iditmps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDITMPS(String value) {
        this.iditmps = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmpsqfr.
     * 
     */
    public int getIDITMPSQFR() {
        return iditmpsqfr;
    }

    /**
     * Define el valor de la propiedad iditmpsqfr.
     * 
     */
    public void setIDITMPSQFR(int value) {
        this.iditmpsqfr = value;
    }

    /**
     * Obtiene el valor de la propiedad peprofit.
     * 
     */
    public double getPEPROFIT() {
        return peprofit;
    }

    /**
     * Define el valor de la propiedad peprofit.
     * 
     */
    public void setPEPROFIT(double value) {
        this.peprofit = value;
    }

    /**
     * Obtiene el valor de la propiedad quitm.
     * 
     */
    public int getQUITM() {
        return quitm;
    }

    /**
     * Define el valor de la propiedad quitm.
     * 
     */
    public void setQUITM(int value) {
        this.quitm = value;
    }

    /**
     * Obtiene el valor de la propiedad lucntslswtun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLUCNTSLSWTUN() {
        return lucntslswtun;
    }

    /**
     * Define el valor de la propiedad lucntslswtun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLUCNTSLSWTUN(String value) {
        this.lucntslswtun = value;
    }

    /**
     * Obtiene el valor de la propiedad ucosto.
     * 
     */
    public double getUCOSTO() {
        return ucosto;
    }

    /**
     * Define el valor de la propiedad ucosto.
     * 
     */
    public void setUCOSTO(double value) {
        this.ucosto = value;
    }

    /**
     * Obtiene el valor de la propiedad cpunsllsrsv.
     * 
     */
    public double getCPUNSLLSRSV() {
        return cpunsllsrsv;
    }

    /**
     * Define el valor de la propiedad cpunsllsrsv.
     * 
     */
    public void setCPUNSLLSRSV(double value) {
        this.cpunsllsrsv = value;
    }

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
     * Obtiene el valor de la propiedad existencia.
     * 
     */
    public double getExistencia() {
        return existencia;
    }

    /**
     * Define el valor de la propiedad existencia.
     * 
     */
    public void setExistencia(double value) {
        this.existencia = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link ItemSellPrice }
     *     
     */
    public ItemSellPrice getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSellPrice }
     *     
     */
    public void setPrice(ItemSellPrice value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad idmrhrcgp.
     * 
     */
    public int getIDMRHRCGP() {
        return idmrhrcgp;
    }

    /**
     * Define el valor de la propiedad idmrhrcgp.
     * 
     */
    public void setIDMRHRCGP(int value) {
        this.idmrhrcgp = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaGp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaGp() {
        return categoriaGp;
    }

    /**
     * Define el valor de la propiedad categoriaGp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaGp(String value) {
        this.categoriaGp = value;
    }

}
