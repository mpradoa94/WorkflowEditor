
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoNoRecibidoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoNoRecibidoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="provedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordendecompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_itm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiplicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pedido" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="surtido" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="diferencia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoNoRecibidoDTO", propOrder = {
    "provedor",
    "ordendecompra",
    "fecha",
    "descuento",
    "idItm",
    "descripcion",
    "multiplicador",
    "pedido",
    "surtido",
    "diferencia"
})
public class ProductoNoRecibidoDTO {

    protected String provedor;
    protected String ordendecompra;
    protected String fecha;
    protected String descuento;
    @XmlElement(name = "id_itm")
    protected String idItm;
    protected String descripcion;
    @XmlElement(name = "Multiplicador")
    protected String multiplicador;
    protected double pedido;
    protected double surtido;
    protected double diferencia;

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
     * Obtiene el valor de la propiedad ordendecompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdendecompra() {
        return ordendecompra;
    }

    /**
     * Define el valor de la propiedad ordendecompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdendecompra(String value) {
        this.ordendecompra = value;
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
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescuento(String value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad idItm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdItm() {
        return idItm;
    }

    /**
     * Define el valor de la propiedad idItm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdItm(String value) {
        this.idItm = value;
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
     * Obtiene el valor de la propiedad pedido.
     * 
     */
    public double getPedido() {
        return pedido;
    }

    /**
     * Define el valor de la propiedad pedido.
     * 
     */
    public void setPedido(double value) {
        this.pedido = value;
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
     * Obtiene el valor de la propiedad diferencia.
     * 
     */
    public double getDiferencia() {
        return diferencia;
    }

    /**
     * Define el valor de la propiedad diferencia.
     * 
     */
    public void setDiferencia(double value) {
        this.diferencia = value;
    }

}
