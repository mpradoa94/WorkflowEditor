
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para servicioProveedorDash complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="servicioProveedorDash">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variedad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="surtido" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="supplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicioProveedorDash", propOrder = {
    "variedad",
    "surtido",
    "supplier"
})
public class ServicioProveedorDash {

    protected double variedad;
    protected double surtido;
    protected String supplier;

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
     * Obtiene el valor de la propiedad surtido.
     * 
     */
    public double getSurtido() {
        return surtido;
    }

    /**
     * Define el valor de la propiedad surtido.
     * 
     */
    public void setSurtido(double value) {
        this.surtido = value;
    }

    /**
     * Obtiene el valor de la propiedad supplier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Define el valor de la propiedad supplier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

}
