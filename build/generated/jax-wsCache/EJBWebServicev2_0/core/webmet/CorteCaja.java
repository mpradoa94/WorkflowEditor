
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para corteCaja complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="corteCaja">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cajero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineasVenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineasVentaAnuladas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineasVentaCanceladas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineasArticulosDevueltos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineasArticulosServicios" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalTransacciones" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="transaccionesSinVenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="transaccionesCanceladas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impVentasArticulos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxArticulos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impVentasAnuladas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxVentasAnuladas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impVentasCanceladas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxVentasCanceladas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impArticulosDevueltos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxArticulosDevueltos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impArticulosServicio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxArticulosServicio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalSeccionVentas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="baseGrabableSecImp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impuestosSecImp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bGFoodStampEx" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impFoodStampEx" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bGClienteEx" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impClienteEx" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalDepositos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalIngresos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="subEntradas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalRetiros" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalCambios" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalPagos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalPagosMenores" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalCobrosMenores" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="subSalidas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalDinero" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corteCaja", propOrder = {
    "folio",
    "caja",
    "cajero",
    "fecha",
    "lineasVenta",
    "lineasVentaAnuladas",
    "lineasVentaCanceladas",
    "lineasArticulosDevueltos",
    "lineasArticulosServicios",
    "totalTransacciones",
    "transaccionesSinVenta",
    "transaccionesCanceladas",
    "impVentasArticulos",
    "taxArticulos",
    "impVentasAnuladas",
    "taxVentasAnuladas",
    "impVentasCanceladas",
    "taxVentasCanceladas",
    "impArticulosDevueltos",
    "taxArticulosDevueltos",
    "impArticulosServicio",
    "taxArticulosServicio",
    "totalSeccionVentas",
    "baseGrabableSecImp",
    "impuestosSecImp",
    "bgFoodStampEx",
    "impFoodStampEx",
    "bgClienteEx",
    "impClienteEx",
    "totalDepositos",
    "totalIngresos",
    "subEntradas",
    "totalRetiros",
    "totalCambios",
    "totalPagos",
    "totalPagosMenores",
    "totalCobrosMenores",
    "subSalidas",
    "balance",
    "totalDinero"
})
public class CorteCaja {

    protected String folio;
    protected String caja;
    protected String cajero;
    protected String fecha;
    protected double lineasVenta;
    protected double lineasVentaAnuladas;
    protected double lineasVentaCanceladas;
    protected double lineasArticulosDevueltos;
    protected double lineasArticulosServicios;
    protected double totalTransacciones;
    protected double transaccionesSinVenta;
    protected double transaccionesCanceladas;
    protected double impVentasArticulos;
    protected double taxArticulos;
    protected double impVentasAnuladas;
    protected double taxVentasAnuladas;
    protected double impVentasCanceladas;
    protected double taxVentasCanceladas;
    protected double impArticulosDevueltos;
    protected double taxArticulosDevueltos;
    protected double impArticulosServicio;
    protected double taxArticulosServicio;
    protected double totalSeccionVentas;
    protected double baseGrabableSecImp;
    protected double impuestosSecImp;
    @XmlElement(name = "bGFoodStampEx")
    protected double bgFoodStampEx;
    protected double impFoodStampEx;
    @XmlElement(name = "bGClienteEx")
    protected double bgClienteEx;
    protected double impClienteEx;
    protected double totalDepositos;
    protected double totalIngresos;
    protected double subEntradas;
    protected double totalRetiros;
    protected double totalCambios;
    protected double totalPagos;
    protected double totalPagosMenores;
    protected double totalCobrosMenores;
    protected double subSalidas;
    protected double balance;
    protected double totalDinero;

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad caja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaja() {
        return caja;
    }

    /**
     * Define el valor de la propiedad caja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaja(String value) {
        this.caja = value;
    }

    /**
     * Obtiene el valor de la propiedad cajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCajero() {
        return cajero;
    }

    /**
     * Define el valor de la propiedad cajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCajero(String value) {
        this.cajero = value;
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
     * Obtiene el valor de la propiedad lineasVenta.
     * 
     */
    public double getLineasVenta() {
        return lineasVenta;
    }

    /**
     * Define el valor de la propiedad lineasVenta.
     * 
     */
    public void setLineasVenta(double value) {
        this.lineasVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasVentaAnuladas.
     * 
     */
    public double getLineasVentaAnuladas() {
        return lineasVentaAnuladas;
    }

    /**
     * Define el valor de la propiedad lineasVentaAnuladas.
     * 
     */
    public void setLineasVentaAnuladas(double value) {
        this.lineasVentaAnuladas = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasVentaCanceladas.
     * 
     */
    public double getLineasVentaCanceladas() {
        return lineasVentaCanceladas;
    }

    /**
     * Define el valor de la propiedad lineasVentaCanceladas.
     * 
     */
    public void setLineasVentaCanceladas(double value) {
        this.lineasVentaCanceladas = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasArticulosDevueltos.
     * 
     */
    public double getLineasArticulosDevueltos() {
        return lineasArticulosDevueltos;
    }

    /**
     * Define el valor de la propiedad lineasArticulosDevueltos.
     * 
     */
    public void setLineasArticulosDevueltos(double value) {
        this.lineasArticulosDevueltos = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasArticulosServicios.
     * 
     */
    public double getLineasArticulosServicios() {
        return lineasArticulosServicios;
    }

    /**
     * Define el valor de la propiedad lineasArticulosServicios.
     * 
     */
    public void setLineasArticulosServicios(double value) {
        this.lineasArticulosServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTransacciones.
     * 
     */
    public double getTotalTransacciones() {
        return totalTransacciones;
    }

    /**
     * Define el valor de la propiedad totalTransacciones.
     * 
     */
    public void setTotalTransacciones(double value) {
        this.totalTransacciones = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccionesSinVenta.
     * 
     */
    public double getTransaccionesSinVenta() {
        return transaccionesSinVenta;
    }

    /**
     * Define el valor de la propiedad transaccionesSinVenta.
     * 
     */
    public void setTransaccionesSinVenta(double value) {
        this.transaccionesSinVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccionesCanceladas.
     * 
     */
    public double getTransaccionesCanceladas() {
        return transaccionesCanceladas;
    }

    /**
     * Define el valor de la propiedad transaccionesCanceladas.
     * 
     */
    public void setTransaccionesCanceladas(double value) {
        this.transaccionesCanceladas = value;
    }

    /**
     * Obtiene el valor de la propiedad impVentasArticulos.
     * 
     */
    public double getImpVentasArticulos() {
        return impVentasArticulos;
    }

    /**
     * Define el valor de la propiedad impVentasArticulos.
     * 
     */
    public void setImpVentasArticulos(double value) {
        this.impVentasArticulos = value;
    }

    /**
     * Obtiene el valor de la propiedad taxArticulos.
     * 
     */
    public double getTaxArticulos() {
        return taxArticulos;
    }

    /**
     * Define el valor de la propiedad taxArticulos.
     * 
     */
    public void setTaxArticulos(double value) {
        this.taxArticulos = value;
    }

    /**
     * Obtiene el valor de la propiedad impVentasAnuladas.
     * 
     */
    public double getImpVentasAnuladas() {
        return impVentasAnuladas;
    }

    /**
     * Define el valor de la propiedad impVentasAnuladas.
     * 
     */
    public void setImpVentasAnuladas(double value) {
        this.impVentasAnuladas = value;
    }

    /**
     * Obtiene el valor de la propiedad taxVentasAnuladas.
     * 
     */
    public double getTaxVentasAnuladas() {
        return taxVentasAnuladas;
    }

    /**
     * Define el valor de la propiedad taxVentasAnuladas.
     * 
     */
    public void setTaxVentasAnuladas(double value) {
        this.taxVentasAnuladas = value;
    }

    /**
     * Obtiene el valor de la propiedad impVentasCanceladas.
     * 
     */
    public double getImpVentasCanceladas() {
        return impVentasCanceladas;
    }

    /**
     * Define el valor de la propiedad impVentasCanceladas.
     * 
     */
    public void setImpVentasCanceladas(double value) {
        this.impVentasCanceladas = value;
    }

    /**
     * Obtiene el valor de la propiedad taxVentasCanceladas.
     * 
     */
    public double getTaxVentasCanceladas() {
        return taxVentasCanceladas;
    }

    /**
     * Define el valor de la propiedad taxVentasCanceladas.
     * 
     */
    public void setTaxVentasCanceladas(double value) {
        this.taxVentasCanceladas = value;
    }

    /**
     * Obtiene el valor de la propiedad impArticulosDevueltos.
     * 
     */
    public double getImpArticulosDevueltos() {
        return impArticulosDevueltos;
    }

    /**
     * Define el valor de la propiedad impArticulosDevueltos.
     * 
     */
    public void setImpArticulosDevueltos(double value) {
        this.impArticulosDevueltos = value;
    }

    /**
     * Obtiene el valor de la propiedad taxArticulosDevueltos.
     * 
     */
    public double getTaxArticulosDevueltos() {
        return taxArticulosDevueltos;
    }

    /**
     * Define el valor de la propiedad taxArticulosDevueltos.
     * 
     */
    public void setTaxArticulosDevueltos(double value) {
        this.taxArticulosDevueltos = value;
    }

    /**
     * Obtiene el valor de la propiedad impArticulosServicio.
     * 
     */
    public double getImpArticulosServicio() {
        return impArticulosServicio;
    }

    /**
     * Define el valor de la propiedad impArticulosServicio.
     * 
     */
    public void setImpArticulosServicio(double value) {
        this.impArticulosServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad taxArticulosServicio.
     * 
     */
    public double getTaxArticulosServicio() {
        return taxArticulosServicio;
    }

    /**
     * Define el valor de la propiedad taxArticulosServicio.
     * 
     */
    public void setTaxArticulosServicio(double value) {
        this.taxArticulosServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSeccionVentas.
     * 
     */
    public double getTotalSeccionVentas() {
        return totalSeccionVentas;
    }

    /**
     * Define el valor de la propiedad totalSeccionVentas.
     * 
     */
    public void setTotalSeccionVentas(double value) {
        this.totalSeccionVentas = value;
    }

    /**
     * Obtiene el valor de la propiedad baseGrabableSecImp.
     * 
     */
    public double getBaseGrabableSecImp() {
        return baseGrabableSecImp;
    }

    /**
     * Define el valor de la propiedad baseGrabableSecImp.
     * 
     */
    public void setBaseGrabableSecImp(double value) {
        this.baseGrabableSecImp = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosSecImp.
     * 
     */
    public double getImpuestosSecImp() {
        return impuestosSecImp;
    }

    /**
     * Define el valor de la propiedad impuestosSecImp.
     * 
     */
    public void setImpuestosSecImp(double value) {
        this.impuestosSecImp = value;
    }

    /**
     * Obtiene el valor de la propiedad bgFoodStampEx.
     * 
     */
    public double getBGFoodStampEx() {
        return bgFoodStampEx;
    }

    /**
     * Define el valor de la propiedad bgFoodStampEx.
     * 
     */
    public void setBGFoodStampEx(double value) {
        this.bgFoodStampEx = value;
    }

    /**
     * Obtiene el valor de la propiedad impFoodStampEx.
     * 
     */
    public double getImpFoodStampEx() {
        return impFoodStampEx;
    }

    /**
     * Define el valor de la propiedad impFoodStampEx.
     * 
     */
    public void setImpFoodStampEx(double value) {
        this.impFoodStampEx = value;
    }

    /**
     * Obtiene el valor de la propiedad bgClienteEx.
     * 
     */
    public double getBGClienteEx() {
        return bgClienteEx;
    }

    /**
     * Define el valor de la propiedad bgClienteEx.
     * 
     */
    public void setBGClienteEx(double value) {
        this.bgClienteEx = value;
    }

    /**
     * Obtiene el valor de la propiedad impClienteEx.
     * 
     */
    public double getImpClienteEx() {
        return impClienteEx;
    }

    /**
     * Define el valor de la propiedad impClienteEx.
     * 
     */
    public void setImpClienteEx(double value) {
        this.impClienteEx = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDepositos.
     * 
     */
    public double getTotalDepositos() {
        return totalDepositos;
    }

    /**
     * Define el valor de la propiedad totalDepositos.
     * 
     */
    public void setTotalDepositos(double value) {
        this.totalDepositos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalIngresos.
     * 
     */
    public double getTotalIngresos() {
        return totalIngresos;
    }

    /**
     * Define el valor de la propiedad totalIngresos.
     * 
     */
    public void setTotalIngresos(double value) {
        this.totalIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad subEntradas.
     * 
     */
    public double getSubEntradas() {
        return subEntradas;
    }

    /**
     * Define el valor de la propiedad subEntradas.
     * 
     */
    public void setSubEntradas(double value) {
        this.subEntradas = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetiros.
     * 
     */
    public double getTotalRetiros() {
        return totalRetiros;
    }

    /**
     * Define el valor de la propiedad totalRetiros.
     * 
     */
    public void setTotalRetiros(double value) {
        this.totalRetiros = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCambios.
     * 
     */
    public double getTotalCambios() {
        return totalCambios;
    }

    /**
     * Define el valor de la propiedad totalCambios.
     * 
     */
    public void setTotalCambios(double value) {
        this.totalCambios = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPagos.
     * 
     */
    public double getTotalPagos() {
        return totalPagos;
    }

    /**
     * Define el valor de la propiedad totalPagos.
     * 
     */
    public void setTotalPagos(double value) {
        this.totalPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPagosMenores.
     * 
     */
    public double getTotalPagosMenores() {
        return totalPagosMenores;
    }

    /**
     * Define el valor de la propiedad totalPagosMenores.
     * 
     */
    public void setTotalPagosMenores(double value) {
        this.totalPagosMenores = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCobrosMenores.
     * 
     */
    public double getTotalCobrosMenores() {
        return totalCobrosMenores;
    }

    /**
     * Define el valor de la propiedad totalCobrosMenores.
     * 
     */
    public void setTotalCobrosMenores(double value) {
        this.totalCobrosMenores = value;
    }

    /**
     * Obtiene el valor de la propiedad subSalidas.
     * 
     */
    public double getSubSalidas() {
        return subSalidas;
    }

    /**
     * Define el valor de la propiedad subSalidas.
     * 
     */
    public void setSubSalidas(double value) {
        this.subSalidas = value;
    }

    /**
     * Obtiene el valor de la propiedad balance.
     * 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Define el valor de la propiedad balance.
     * 
     */
    public void setBalance(double value) {
        this.balance = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDinero.
     * 
     */
    public double getTotalDinero() {
        return totalDinero;
    }

    /**
     * Define el valor de la propiedad totalDinero.
     * 
     */
    public void setTotalDinero(double value) {
        this.totalDinero = value;
    }

}
