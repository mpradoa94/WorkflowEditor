
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ordenesCompraPorRecibirDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ordenesCompraPorRecibirDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_itm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionicd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionitm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multiplicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechapedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaesperada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="periodicity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordenesCompraPorRecibirDTO", propOrder = {
    "idItm",
    "referencia",
    "provedor",
    "descripcionicd",
    "descripcionitm",
    "multiplicador",
    "fechapedido",
    "fechaesperada",
    "cantidad",
    "periodicity"
})
public class OrdenesCompraPorRecibirDTO {

    @XmlElement(name = "id_itm")
    protected int idItm;
    protected String referencia;
    protected String provedor;
    protected String descripcionicd;
    protected String descripcionitm;
    protected String multiplicador;
    protected String fechapedido;
    protected String fechaesperada;
    protected double cantidad;
    protected int periodicity;

    /**
     * Obtiene el valor de la propiedad idItm.
     * 
     */
    public int getIdItm() {
        return idItm;
    }

    /**
     * Define el valor de la propiedad idItm.
     * 
     */
    public void setIdItm(int value) {
        this.idItm = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad provedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvedor() {
        return provedor;
    }

    /**
     * Define el valor de la propiedad provedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvedor(String value) {
        this.provedor = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionicd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionicd() {
        return descripcionicd;
    }

    /**
     * Define el valor de la propiedad descripcionicd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionicd(String value) {
        this.descripcionicd = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionitm() {
        return descripcionitm;
    }

    /**
     * Define el valor de la propiedad descripcionitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionitm(String value) {
        this.descripcionitm = value;
    }

    /**
     * Obtiene el valor de la propiedad multiplicador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplicador() {
        return multiplicador;
    }

    /**
     * Define el valor de la propiedad multiplicador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplicador(String value) {
        this.multiplicador = value;
    }

    /**
     * Obtiene el valor de la propiedad fechapedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechapedido() {
        return fechapedido;
    }

    /**
     * Define el valor de la propiedad fechapedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechapedido(String value) {
        this.fechapedido = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaesperada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaesperada() {
        return fechaesperada;
    }

    /**
     * Define el valor de la propiedad fechaesperada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaesperada(String value) {
        this.fechaesperada = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad periodicity.
     * 
     */
    public int getPeriodicity() {
        return periodicity;
    }

    /**
     * Define el valor de la propiedad periodicity.
     * 
     */
    public void setPeriodicity(int value) {
        this.periodicity = value;
    }

}
