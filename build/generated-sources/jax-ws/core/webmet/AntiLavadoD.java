
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para antiLavadoD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="antiLavadoD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAntilavado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idFormato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fechaOp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuevo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antiLavadoD", propOrder = {
    "idAntilavado",
    "idFormato",
    "rfc",
    "rol",
    "formaPago",
    "monto",
    "fechaOp",
    "nuevo"
})
public class AntiLavadoD {

    protected int idAntilavado;
    protected int idFormato;
    protected String rfc;
    protected String rol;
    protected String formaPago;
    protected double monto;
    protected String fechaOp;
    protected int nuevo;

    /**
     * Obtiene el valor de la propiedad idAntilavado.
     * 
     */
    public int getIdAntilavado() {
        return idAntilavado;
    }

    /**
     * Define el valor de la propiedad idAntilavado.
     * 
     */
    public void setIdAntilavado(int value) {
        this.idAntilavado = value;
    }

    /**
     * Obtiene el valor de la propiedad idFormato.
     * 
     */
    public int getIdFormato() {
        return idFormato;
    }

    /**
     * Define el valor de la propiedad idFormato.
     * 
     */
    public void setIdFormato(int value) {
        this.idFormato = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOp() {
        return fechaOp;
    }

    /**
     * Define el valor de la propiedad fechaOp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOp(String value) {
        this.fechaOp = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevo.
     * 
     */
    public int getNuevo() {
        return nuevo;
    }

    /**
     * Define el valor de la propiedad nuevo.
     * 
     */
    public void setNuevo(int value) {
        this.nuevo = value;
    }

}
