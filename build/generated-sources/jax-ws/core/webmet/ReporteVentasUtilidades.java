
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteVentasUtilidades complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteVentasUtilidades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="utilidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteVentasUtilidades", propOrder = {
    "categoria",
    "venta",
    "utilidad",
    "producto"
})
public class ReporteVentasUtilidades {

    protected String categoria;
    protected double venta;
    protected double utilidad;
    protected String producto;

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
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
     * Obtiene el valor de la propiedad utilidad.
     * 
     */
    public double getUtilidad() {
        return utilidad;
    }

    /**
     * Define el valor de la propiedad utilidad.
     * 
     */
    public void setUtilidad(double value) {
        this.utilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

}
