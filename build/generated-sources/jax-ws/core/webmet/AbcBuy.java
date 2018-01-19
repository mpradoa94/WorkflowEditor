
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcBuy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcBuy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DC_DCTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DC_VENC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pedido" type="{http://Webmet.core/}inventoryControlDocument"/>
 *         &lt;element name="factura" type="{http://Webmet.core/}inventoryControlDocument"/>
 *         &lt;element name="ID_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="document" type="{http://Webmet.core/}document"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcBuy", propOrder = {
    "idInstancia",
    "idspr",
    "operacion",
    "descripcion",
    "dcdcto",
    "dcvenc",
    "referencia",
    "pedido",
    "factura",
    "idcountry",
    "document"
})
public class AbcBuy {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_SPR")
    protected int idspr;
    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(name = "DESCRIPCION", required = true)
    protected String descripcion;
    @XmlElement(name = "DC_DCTO", required = true)
    protected String dcdcto;
    @XmlElement(name = "DC_VENC", required = true)
    protected String dcvenc;
    @XmlElement(name = "REFERENCIA", required = true)
    protected String referencia;
    @XmlElement(required = true)
    protected InventoryControlDocument pedido;
    @XmlElement(required = true)
    protected InventoryControlDocument factura;
    @XmlElement(name = "ID_COUNTRY")
    protected int idcountry;
    @XmlElement(required = true)
    protected Document document;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad idspr.
     * 
     */
    public int getIDSPR() {
        return idspr;
    }

    /**
     * Define el valor de la propiedad idspr.
     * 
     */
    public void setIDSPR(int value) {
        this.idspr = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION() {
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
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad dcdcto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDCTO() {
        return dcdcto;
    }

    /**
     * Define el valor de la propiedad dcdcto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDCTO(String value) {
        this.dcdcto = value;
    }

    /**
     * Obtiene el valor de la propiedad dcvenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCVENC() {
        return dcvenc;
    }

    /**
     * Define el valor de la propiedad dcvenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCVENC(String value) {
        this.dcvenc = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCIA() {
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
    public void setREFERENCIA(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad pedido.
     * 
     * @return
     *     possible object is
     *     {@link InventoryControlDocument }
     *     
     */
    public InventoryControlDocument getPedido() {
        return pedido;
    }

    /**
     * Define el valor de la propiedad pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryControlDocument }
     *     
     */
    public void setPedido(InventoryControlDocument value) {
        this.pedido = value;
    }

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link InventoryControlDocument }
     *     
     */
    public InventoryControlDocument getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryControlDocument }
     *     
     */
    public void setFactura(InventoryControlDocument value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad idcountry.
     * 
     */
    public int getIDCOUNTRY() {
        return idcountry;
    }

    /**
     * Define el valor de la propiedad idcountry.
     * 
     */
    public void setIDCOUNTRY(int value) {
        this.idcountry = value;
    }

    /**
     * Obtiene el valor de la propiedad document.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Define el valor de la propiedad document.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

}
