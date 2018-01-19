
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nivelServicio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nivelServicio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numProveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="variedad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sumaArticulosPedidos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sumaArticulosComprados" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sumaMontosPedidos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sumaMontosComprados" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dias" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numCompras" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nivelServicio", propOrder = {
    "proveedor",
    "numProveedor",
    "variedad",
    "sumaArticulosPedidos",
    "sumaArticulosComprados",
    "sumaMontosPedidos",
    "sumaMontosComprados",
    "dias",
    "volumen",
    "tiempo",
    "numCompras"
})
public class NivelServicio {

    protected String proveedor;
    protected int numProveedor;
    protected double variedad;
    protected double sumaArticulosPedidos;
    protected double sumaArticulosComprados;
    protected double sumaMontosPedidos;
    protected double sumaMontosComprados;
    protected double dias;
    protected double volumen;
    protected double tiempo;
    protected int numCompras;

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedor(String value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad numProveedor.
     * 
     */
    public int getNumProveedor() {
        return numProveedor;
    }

    /**
     * Define el valor de la propiedad numProveedor.
     * 
     */
    public void setNumProveedor(int value) {
        this.numProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad variedad.
     * 
     */
    public double getVariedad() {
        return variedad;
    }

    /**
     * Define el valor de la propiedad variedad.
     * 
     */
    public void setVariedad(double value) {
        this.variedad = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaArticulosPedidos.
     * 
     */
    public double getSumaArticulosPedidos() {
        return sumaArticulosPedidos;
    }

    /**
     * Define el valor de la propiedad sumaArticulosPedidos.
     * 
     */
    public void setSumaArticulosPedidos(double value) {
        this.sumaArticulosPedidos = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaArticulosComprados.
     * 
     */
    public double getSumaArticulosComprados() {
        return sumaArticulosComprados;
    }

    /**
     * Define el valor de la propiedad sumaArticulosComprados.
     * 
     */
    public void setSumaArticulosComprados(double value) {
        this.sumaArticulosComprados = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaMontosPedidos.
     * 
     */
    public double getSumaMontosPedidos() {
        return sumaMontosPedidos;
    }

    /**
     * Define el valor de la propiedad sumaMontosPedidos.
     * 
     */
    public void setSumaMontosPedidos(double value) {
        this.sumaMontosPedidos = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaMontosComprados.
     * 
     */
    public double getSumaMontosComprados() {
        return sumaMontosComprados;
    }

    /**
     * Define el valor de la propiedad sumaMontosComprados.
     * 
     */
    public void setSumaMontosComprados(double value) {
        this.sumaMontosComprados = value;
    }

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     */
    public double getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     */
    public void setDias(double value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     */
    public void setVolumen(double value) {
        this.volumen = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     */
    public double getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     */
    public void setTiempo(double value) {
        this.tiempo = value;
    }

    /**
     * Obtiene el valor de la propiedad numCompras.
     * 
     */
    public int getNumCompras() {
        return numCompras;
    }

    /**
     * Define el valor de la propiedad numCompras.
     * 
     */
    public void setNumCompras(int value) {
        this.numCompras = value;
    }

}
