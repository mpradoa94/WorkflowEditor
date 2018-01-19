
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteInventarioPerpetuo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteInventarioPerpetuo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saldoini" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="compras" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="devolucion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="entradas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tentradas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ajustee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vendidas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="salidas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ajustess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tsalidas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteInventarioPerpetuo", propOrder = {
    "clave",
    "descripcion",
    "saldoini",
    "compras",
    "devolucion",
    "entradas",
    "tentradas",
    "ajustee",
    "vendidas",
    "salidas",
    "ajustess",
    "tsalidas"
})
public class ReporteInventarioPerpetuo {

    protected String clave;
    protected String descripcion;
    protected double saldoini;
    protected double compras;
    protected double devolucion;
    protected double entradas;
    protected double tentradas;
    protected double ajustee;
    protected double vendidas;
    protected double salidas;
    protected double ajustess;
    protected double tsalidas;

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
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
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoini.
     * 
     */
    public double getSaldoini() {
        return saldoini;
    }

    /**
     * Define el valor de la propiedad saldoini.
     * 
     */
    public void setSaldoini(double value) {
        this.saldoini = value;
    }

    /**
     * Obtiene el valor de la propiedad compras.
     * 
     */
    public double getCompras() {
        return compras;
    }

    /**
     * Define el valor de la propiedad compras.
     * 
     */
    public void setCompras(double value) {
        this.compras = value;
    }

    /**
     * Obtiene el valor de la propiedad devolucion.
     * 
     */
    public double getDevolucion() {
        return devolucion;
    }

    /**
     * Define el valor de la propiedad devolucion.
     * 
     */
    public void setDevolucion(double value) {
        this.devolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad entradas.
     * 
     */
    public double getEntradas() {
        return entradas;
    }

    /**
     * Define el valor de la propiedad entradas.
     * 
     */
    public void setEntradas(double value) {
        this.entradas = value;
    }

    /**
     * Obtiene el valor de la propiedad tentradas.
     * 
     */
    public double getTentradas() {
        return tentradas;
    }

    /**
     * Define el valor de la propiedad tentradas.
     * 
     */
    public void setTentradas(double value) {
        this.tentradas = value;
    }

    /**
     * Obtiene el valor de la propiedad ajustee.
     * 
     */
    public double getAjustee() {
        return ajustee;
    }

    /**
     * Define el valor de la propiedad ajustee.
     * 
     */
    public void setAjustee(double value) {
        this.ajustee = value;
    }

    /**
     * Obtiene el valor de la propiedad vendidas.
     * 
     */
    public double getVendidas() {
        return vendidas;
    }

    /**
     * Define el valor de la propiedad vendidas.
     * 
     */
    public void setVendidas(double value) {
        this.vendidas = value;
    }

    /**
     * Obtiene el valor de la propiedad salidas.
     * 
     */
    public double getSalidas() {
        return salidas;
    }

    /**
     * Define el valor de la propiedad salidas.
     * 
     */
    public void setSalidas(double value) {
        this.salidas = value;
    }

    /**
     * Obtiene el valor de la propiedad ajustess.
     * 
     */
    public double getAjustess() {
        return ajustess;
    }

    /**
     * Define el valor de la propiedad ajustess.
     * 
     */
    public void setAjustess(double value) {
        this.ajustess = value;
    }

    /**
     * Obtiene el valor de la propiedad tsalidas.
     * 
     */
    public double getTsalidas() {
        return tsalidas;
    }

    /**
     * Define el valor de la propiedad tsalidas.
     * 
     */
    public void setTsalidas(double value) {
        this.tsalidas = value;
    }

}
