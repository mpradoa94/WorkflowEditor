
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteLiquidacionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteLiquidacionDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inv_inicial" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="entrada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="inv_final" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ts_pid_crd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_itm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_itm_ps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="de_itm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sell_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conteo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conteo1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conteo2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conteo3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="qu_itm" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mo_sls_itm" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="qu_sls_itm" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ajuste" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conteo_inv_final" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conteo_ajuste" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="equivalentes" type="{http://Webmet.core/}reporteLiquidacionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteLiquidacionDTO", propOrder = {
    "invInicial",
    "entrada",
    "venta",
    "invFinal",
    "tsPidCrd",
    "idItm",
    "idItmPs",
    "deItm",
    "sellPrice",
    "conteo",
    "conteo1",
    "conteo2",
    "conteo3",
    "quItm",
    "moSlsItm",
    "quSlsItm",
    "ajuste",
    "conteoInvFinal",
    "conteoAjuste",
    "equivalentes"
})
public class ReporteLiquidacionDTO {

    @XmlElement(name = "inv_inicial")
    protected double invInicial;
    protected double entrada;
    protected double venta;
    @XmlElement(name = "inv_final")
    protected double invFinal;
    @XmlElement(name = "ts_pid_crd")
    protected String tsPidCrd;
    @XmlElement(name = "id_itm")
    protected int idItm;
    @XmlElement(name = "id_itm_ps")
    protected String idItmPs;
    @XmlElement(name = "de_itm")
    protected String deItm;
    @XmlElement(name = "sell_price")
    protected double sellPrice;
    protected double conteo;
    protected double conteo1;
    protected double conteo2;
    protected double conteo3;
    @XmlElement(name = "qu_itm")
    protected double quItm;
    @XmlElement(name = "mo_sls_itm")
    protected double moSlsItm;
    @XmlElement(name = "qu_sls_itm")
    protected double quSlsItm;
    protected double ajuste;
    @XmlElement(name = "conteo_inv_final")
    protected double conteoInvFinal;
    @XmlElement(name = "conteo_ajuste")
    protected double conteoAjuste;
    @XmlElement(nillable = true)
    protected List<ReporteLiquidacionDTO> equivalentes;

    /**
     * Obtiene el valor de la propiedad invInicial.
     * 
     */
    public double getInvInicial() {
        return invInicial;
    }

    /**
     * Define el valor de la propiedad invInicial.
     * 
     */
    public void setInvInicial(double value) {
        this.invInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad entrada.
     * 
     */
    public double getEntrada() {
        return entrada;
    }

    /**
     * Define el valor de la propiedad entrada.
     * 
     */
    public void setEntrada(double value) {
        this.entrada = value;
    }

    /**
     * Obtiene el valor de la propiedad venta.
     * 
     */
    public double getVenta() {
        return venta;
    }

    /**
     * Define el valor de la propiedad venta.
     * 
     */
    public void setVenta(double value) {
        this.venta = value;
    }

    /**
     * Obtiene el valor de la propiedad invFinal.
     * 
     */
    public double getInvFinal() {
        return invFinal;
    }

    /**
     * Define el valor de la propiedad invFinal.
     * 
     */
    public void setInvFinal(double value) {
        this.invFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad tsPidCrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsPidCrd() {
        return tsPidCrd;
    }

    /**
     * Define el valor de la propiedad tsPidCrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsPidCrd(String value) {
        this.tsPidCrd = value;
    }

    /**
     * Obtiene el valor de la propiedad idItm.
     * 
     */
    public int getIdItm() {
        return idItm;
    }

    /**
     * Define el valor de la propiedad idItm.
     * 
     */
    public void setIdItm(int value) {
        this.idItm = value;
    }

    /**
     * Obtiene el valor de la propiedad idItmPs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdItmPs() {
        return idItmPs;
    }

    /**
     * Define el valor de la propiedad idItmPs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdItmPs(String value) {
        this.idItmPs = value;
    }

    /**
     * Obtiene el valor de la propiedad deItm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeItm() {
        return deItm;
    }

    /**
     * Define el valor de la propiedad deItm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeItm(String value) {
        this.deItm = value;
    }

    /**
     * Obtiene el valor de la propiedad sellPrice.
     * 
     */
    public double getSellPrice() {
        return sellPrice;
    }

    /**
     * Define el valor de la propiedad sellPrice.
     * 
     */
    public void setSellPrice(double value) {
        this.sellPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad conteo.
     * 
     */
    public double getConteo() {
        return conteo;
    }

    /**
     * Define el valor de la propiedad conteo.
     * 
     */
    public void setConteo(double value) {
        this.conteo = value;
    }

    /**
     * Obtiene el valor de la propiedad conteo1.
     * 
     */
    public double getConteo1() {
        return conteo1;
    }

    /**
     * Define el valor de la propiedad conteo1.
     * 
     */
    public void setConteo1(double value) {
        this.conteo1 = value;
    }

    /**
     * Obtiene el valor de la propiedad conteo2.
     * 
     */
    public double getConteo2() {
        return conteo2;
    }

    /**
     * Define el valor de la propiedad conteo2.
     * 
     */
    public void setConteo2(double value) {
        this.conteo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad conteo3.
     * 
     */
    public double getConteo3() {
        return conteo3;
    }

    /**
     * Define el valor de la propiedad conteo3.
     * 
     */
    public void setConteo3(double value) {
        this.conteo3 = value;
    }

    /**
     * Obtiene el valor de la propiedad quItm.
     * 
     */
    public double getQuItm() {
        return quItm;
    }

    /**
     * Define el valor de la propiedad quItm.
     * 
     */
    public void setQuItm(double value) {
        this.quItm = value;
    }

    /**
     * Obtiene el valor de la propiedad moSlsItm.
     * 
     */
    public double getMoSlsItm() {
        return moSlsItm;
    }

    /**
     * Define el valor de la propiedad moSlsItm.
     * 
     */
    public void setMoSlsItm(double value) {
        this.moSlsItm = value;
    }

    /**
     * Obtiene el valor de la propiedad quSlsItm.
     * 
     */
    public double getQuSlsItm() {
        return quSlsItm;
    }

    /**
     * Define el valor de la propiedad quSlsItm.
     * 
     */
    public void setQuSlsItm(double value) {
        this.quSlsItm = value;
    }

    /**
     * Obtiene el valor de la propiedad ajuste.
     * 
     */
    public double getAjuste() {
        return ajuste;
    }

    /**
     * Define el valor de la propiedad ajuste.
     * 
     */
    public void setAjuste(double value) {
        this.ajuste = value;
    }

    /**
     * Obtiene el valor de la propiedad conteoInvFinal.
     * 
     */
    public double getConteoInvFinal() {
        return conteoInvFinal;
    }

    /**
     * Define el valor de la propiedad conteoInvFinal.
     * 
     */
    public void setConteoInvFinal(double value) {
        this.conteoInvFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad conteoAjuste.
     * 
     */
    public double getConteoAjuste() {
        return conteoAjuste;
    }

    /**
     * Define el valor de la propiedad conteoAjuste.
     * 
     */
    public void setConteoAjuste(double value) {
        this.conteoAjuste = value;
    }

    /**
     * Gets the value of the equivalentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivalentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivalentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReporteLiquidacionDTO }
     * 
     * 
     */
    public List<ReporteLiquidacionDTO> getEquivalentes() {
        if (equivalentes == null) {
            equivalentes = new ArrayList<ReporteLiquidacionDTO>();
        }
        return this.equivalentes;
    }

}
