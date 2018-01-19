
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tablaInventarioDash complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tablaInventarioDash">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="compras" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cambio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tablaInventarioDash", propOrder = {
    "venta",
    "costo",
    "compras",
    "cambio",
    "tax"
})
public class TablaInventarioDash {

    protected double venta;
    protected double costo;
    protected double compras;
    protected double cambio;
    protected double tax;

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
     * Obtiene el valor de la propiedad cambio.
     * 
     */
    public double getCambio() {
        return cambio;
    }

    /**
     * Define el valor de la propiedad cambio.
     * 
     */
    public void setCambio(double value) {
        this.cambio = value;
    }

    /**
     * Obtiene el valor de la propiedad tax.
     * 
     */
    public double getTax() {
        return tax;
    }

    /**
     * Define el valor de la propiedad tax.
     * 
     */
    public void setTax(double value) {
        this.tax = value;
    }

}
