
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para facturas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idStrRt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idWs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idFactura" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idCt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idAds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idPrty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tyRoPrty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flClda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idTrn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flFacturaConc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tyFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tipoDeComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metodoDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarDeExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emisor" type="{http://Webmet.core/}facturasNombres" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://Webmet.core/}facturasNombres" minOccurs="0"/>
 *         &lt;element name="conceptos" type="{http://Webmet.core/}saleReturnLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalImpuestosTrasladados" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tipoImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="importeImpuestos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="facturar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="facturaXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yaFacturada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturas", propOrder = {
    "idStrRt",
    "idWs",
    "idFactura",
    "idCt",
    "idAds",
    "idPrty",
    "tyRoPrty",
    "prefijo",
    "folio",
    "flClda",
    "idTrn",
    "flFacturaConc",
    "tyFact",
    "fecha",
    "subtotal",
    "tipoCambio",
    "moneda",
    "total",
    "tipoDeComprobante",
    "metodoDePago",
    "lugarDeExpedicion",
    "emisor",
    "receptor",
    "conceptos",
    "totalImpuestosTrasladados",
    "tipoImpuesto",
    "tasa",
    "importeImpuestos",
    "facturar",
    "facturaXML",
    "yaFacturada"
})
public class Facturas {

    protected int idStrRt;
    protected int idWs;
    protected int idFactura;
    protected int idCt;
    protected int idAds;
    protected int idPrty;
    protected String tyRoPrty;
    protected String prefijo;
    protected int folio;
    protected int flClda;
    protected int idTrn;
    protected int flFacturaConc;
    protected String tyFact;
    protected String fecha;
    protected double subtotal;
    protected double tipoCambio;
    protected String moneda;
    protected double total;
    protected String tipoDeComprobante;
    protected String metodoDePago;
    protected String lugarDeExpedicion;
    protected FacturasNombres emisor;
    protected FacturasNombres receptor;
    @XmlElement(nillable = true)
    protected List<SaleReturnLineItem> conceptos;
    protected double totalImpuestosTrasladados;
    protected String tipoImpuesto;
    protected double tasa;
    protected double importeImpuestos;
    protected boolean facturar;
    protected String facturaXML;
    protected boolean yaFacturada;

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
     * Obtiene el valor de la propiedad idWs.
     * 
     */
    public int getIdWs() {
        return idWs;
    }

    /**
     * Define el valor de la propiedad idWs.
     * 
     */
    public void setIdWs(int value) {
        this.idWs = value;
    }

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     */
    public void setIdFactura(int value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad idCt.
     * 
     */
    public int getIdCt() {
        return idCt;
    }

    /**
     * Define el valor de la propiedad idCt.
     * 
     */
    public void setIdCt(int value) {
        this.idCt = value;
    }

    /**
     * Obtiene el valor de la propiedad idAds.
     * 
     */
    public int getIdAds() {
        return idAds;
    }

    /**
     * Define el valor de la propiedad idAds.
     * 
     */
    public void setIdAds(int value) {
        this.idAds = value;
    }

    /**
     * Obtiene el valor de la propiedad idPrty.
     * 
     */
    public int getIdPrty() {
        return idPrty;
    }

    /**
     * Define el valor de la propiedad idPrty.
     * 
     */
    public void setIdPrty(int value) {
        this.idPrty = value;
    }

    /**
     * Obtiene el valor de la propiedad tyRoPrty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyRoPrty() {
        return tyRoPrty;
    }

    /**
     * Define el valor de la propiedad tyRoPrty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyRoPrty(String value) {
        this.tyRoPrty = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Define el valor de la propiedad prefijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijo(String value) {
        this.prefijo = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     */
    public void setFolio(int value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad flClda.
     * 
     */
    public int getFlClda() {
        return flClda;
    }

    /**
     * Define el valor de la propiedad flClda.
     * 
     */
    public void setFlClda(int value) {
        this.flClda = value;
    }

    /**
     * Obtiene el valor de la propiedad idTrn.
     * 
     */
    public int getIdTrn() {
        return idTrn;
    }

    /**
     * Define el valor de la propiedad idTrn.
     * 
     */
    public void setIdTrn(int value) {
        this.idTrn = value;
    }

    /**
     * Obtiene el valor de la propiedad flFacturaConc.
     * 
     */
    public int getFlFacturaConc() {
        return flFacturaConc;
    }

    /**
     * Define el valor de la propiedad flFacturaConc.
     * 
     */
    public void setFlFacturaConc(int value) {
        this.flFacturaConc = value;
    }

    /**
     * Obtiene el valor de la propiedad tyFact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyFact() {
        return tyFact;
    }

    /**
     * Define el valor de la propiedad tyFact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyFact(String value) {
        this.tyFact = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     */
    public void setSubtotal(double value) {
        this.subtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     */
    public double getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     */
    public void setTipoCambio(double value) {
        this.tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Define el valor de la propiedad tipoDeComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeComprobante(String value) {
        this.tipoDeComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Define el valor de la propiedad metodoDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoDePago(String value) {
        this.metodoDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarDeExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarDeExpedicion() {
        return lugarDeExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarDeExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarDeExpedicion(String value) {
        this.lugarDeExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link FacturasNombres }
     *     
     */
    public FacturasNombres getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturasNombres }
     *     
     */
    public void setEmisor(FacturasNombres value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link FacturasNombres }
     *     
     */
    public FacturasNombres getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturasNombres }
     *     
     */
    public void setReceptor(FacturasNombres value) {
        this.receptor = value;
    }

    /**
     * Gets the value of the conceptos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleReturnLineItem }
     * 
     * 
     */
    public List<SaleReturnLineItem> getConceptos() {
        if (conceptos == null) {
            conceptos = new ArrayList<SaleReturnLineItem>();
        }
        return this.conceptos;
    }

    /**
     * Obtiene el valor de la propiedad totalImpuestosTrasladados.
     * 
     */
    public double getTotalImpuestosTrasladados() {
        return totalImpuestosTrasladados;
    }

    /**
     * Define el valor de la propiedad totalImpuestosTrasladados.
     * 
     */
    public void setTotalImpuestosTrasladados(double value) {
        this.totalImpuestosTrasladados = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImpuesto() {
        return tipoImpuesto;
    }

    /**
     * Define el valor de la propiedad tipoImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImpuesto(String value) {
        this.tipoImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     */
    public double getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     */
    public void setTasa(double value) {
        this.tasa = value;
    }

    /**
     * Obtiene el valor de la propiedad importeImpuestos.
     * 
     */
    public double getImporteImpuestos() {
        return importeImpuestos;
    }

    /**
     * Define el valor de la propiedad importeImpuestos.
     * 
     */
    public void setImporteImpuestos(double value) {
        this.importeImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad facturar.
     * 
     */
    public boolean isFacturar() {
        return facturar;
    }

    /**
     * Define el valor de la propiedad facturar.
     * 
     */
    public void setFacturar(boolean value) {
        this.facturar = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturaXML() {
        return facturaXML;
    }

    /**
     * Define el valor de la propiedad facturaXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturaXML(String value) {
        this.facturaXML = value;
    }

    /**
     * Obtiene el valor de la propiedad yaFacturada.
     * 
     */
    public boolean isYaFacturada() {
        return yaFacturada;
    }

    /**
     * Define el valor de la propiedad yaFacturada.
     * 
     */
    public void setYaFacturada(boolean value) {
        this.yaFacturada = value;
    }

}
