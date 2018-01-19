
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para informeDia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="informeDia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="utilidadBruta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gasto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="utilidadNeta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impuesto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informeDia", propOrder = {
    "venta",
    "costo",
    "utilidadBruta",
    "gasto",
    "utilidadNeta",
    "impuesto"
})
public class InformeDia {

    protected double venta;
    protected double costo;
    protected double utilidadBruta;
    protected double gasto;
    protected double utilidadNeta;
    protected double impuesto;

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
     * Obtiene el valor de la propiedad costo.
     * 
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Define el valor de la propiedad costo.
     * 
     */
    public void setCosto(double value) {
        this.costo = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidadBruta.
     * 
     */
    public double getUtilidadBruta() {
        return utilidadBruta;
    }

    /**
     * Define el valor de la propiedad utilidadBruta.
     * 
     */
    public void setUtilidadBruta(double value) {
        this.utilidadBruta = value;
    }

    /**
     * Obtiene el valor de la propiedad gasto.
     * 
     */
    public double getGasto() {
        return gasto;
    }

    /**
     * Define el valor de la propiedad gasto.
     * 
     */
    public void setGasto(double value) {
        this.gasto = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidadNeta.
     * 
     */
    public double getUtilidadNeta() {
        return utilidadNeta;
    }

    /**
     * Define el valor de la propiedad utilidadNeta.
     * 
     */
    public void setUtilidadNeta(double value) {
        this.utilidadNeta = value;
    }

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     */
    public void setImpuesto(double value) {
        this.impuesto = value;
    }

}
