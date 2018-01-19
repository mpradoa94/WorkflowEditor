
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteInventarioDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteInventarioDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DE_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INVENTARIO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ENTRADAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AJUSTEE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VENDIDA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SALIDAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AJUSTES" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NM_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP_UN_SL_LS_RSV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SELL_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteInventarioDTO", propOrder = {
    "iditmps",
    "deitm",
    "inventario",
    "entradas",
    "ajustee",
    "vendida",
    "salidas",
    "ajustes",
    "nmmrhrcgp",
    "cpunsllsrsv",
    "sellprice"
})
public class ReporteInventarioDTO {

    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "DE_ITM")
    protected String deitm;
    @XmlElement(name = "INVENTARIO")
    protected double inventario;
    @XmlElement(name = "ENTRADAS")
    protected double entradas;
    @XmlElement(name = "AJUSTEE")
    protected double ajustee;
    @XmlElement(name = "VENDIDA")
    protected double vendida;
    @XmlElement(name = "SALIDAS")
    protected double salidas;
    @XmlElement(name = "AJUSTES")
    protected double ajustes;
    @XmlElement(name = "NM_MRHRC_GP")
    protected String nmmrhrcgp;
    @XmlElement(name = "CP_UN_SL_LS_RSV")
    protected double cpunsllsrsv;
    @XmlElement(name = "SELL_PRICE")
    protected double sellprice;

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
     * Obtiene el valor de la propiedad deitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEITM() {
        return deitm;
    }

    /**
     * Define el valor de la propiedad deitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEITM(String value) {
        this.deitm = value;
    }

    /**
     * Obtiene el valor de la propiedad inventario.
     * 
     */
    public double getINVENTARIO() {
        return inventario;
    }

    /**
     * Define el valor de la propiedad inventario.
     * 
     */
    public void setINVENTARIO(double value) {
        this.inventario = value;
    }

    /**
     * Obtiene el valor de la propiedad entradas.
     * 
     */
    public double getENTRADAS() {
        return entradas;
    }

    /**
     * Define el valor de la propiedad entradas.
     * 
     */
    public void setENTRADAS(double value) {
        this.entradas = value;
    }

    /**
     * Obtiene el valor de la propiedad ajustee.
     * 
     */
    public double getAJUSTEE() {
        return ajustee;
    }

    /**
     * Define el valor de la propiedad ajustee.
     * 
     */
    public void setAJUSTEE(double value) {
        this.ajustee = value;
    }

    /**
     * Obtiene el valor de la propiedad vendida.
     * 
     */
    public double getVENDIDA() {
        return vendida;
    }

    /**
     * Define el valor de la propiedad vendida.
     * 
     */
    public void setVENDIDA(double value) {
        this.vendida = value;
    }

    /**
     * Obtiene el valor de la propiedad salidas.
     * 
     */
    public double getSALIDAS() {
        return salidas;
    }

    /**
     * Define el valor de la propiedad salidas.
     * 
     */
    public void setSALIDAS(double value) {
        this.salidas = value;
    }

    /**
     * Obtiene el valor de la propiedad ajustes.
     * 
     */
    public double getAJUSTES() {
        return ajustes;
    }

    /**
     * Define el valor de la propiedad ajustes.
     * 
     */
    public void setAJUSTES(double value) {
        this.ajustes = value;
    }

    /**
     * Obtiene el valor de la propiedad nmmrhrcgp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMMRHRCGP() {
        return nmmrhrcgp;
    }

    /**
     * Define el valor de la propiedad nmmrhrcgp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMMRHRCGP(String value) {
        this.nmmrhrcgp = value;
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
     * Obtiene el valor de la propiedad sellprice.
     * 
     */
    public double getSELLPRICE() {
        return sellprice;
    }

    /**
     * Define el valor de la propiedad sellprice.
     * 
     */
    public void setSELLPRICE(double value) {
        this.sellprice = value;
    }

}
