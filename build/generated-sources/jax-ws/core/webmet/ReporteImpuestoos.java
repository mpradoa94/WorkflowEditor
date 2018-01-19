
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteImpuestoos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteImpuestoos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="impuesto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="padre1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteImpuestoos", propOrder = {
    "venta",
    "impuesto",
    "hijo",
    "padre1",
    "padre",
    "excento"
})
public class ReporteImpuestoos {

    protected double venta;
    protected double impuesto;
    protected String hijo;
    protected String padre1;
    protected String padre;
    protected String excento;

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

    /**
     * Obtiene el valor de la propiedad hijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHijo() {
        return hijo;
    }

    /**
     * Define el valor de la propiedad hijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHijo(String value) {
        this.hijo = value;
    }

    /**
     * Obtiene el valor de la propiedad padre1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadre1() {
        return padre1;
    }

    /**
     * Define el valor de la propiedad padre1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadre1(String value) {
        this.padre1 = value;
    }

    /**
     * Obtiene el valor de la propiedad padre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadre() {
        return padre;
    }

    /**
     * Define el valor de la propiedad padre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadre(String value) {
        this.padre = value;
    }

    /**
     * Obtiene el valor de la propiedad excento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcento() {
        return excento;
    }

    /**
     * Define el valor de la propiedad excento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcento(String value) {
        this.excento = value;
    }

}
