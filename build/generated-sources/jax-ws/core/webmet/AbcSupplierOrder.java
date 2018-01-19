
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcSupplierOrder complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcSupplierOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inventorycontoldocument" type="{http://Webmet.core/}inventoryControlDocument"/>
 *         &lt;element name="ID_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="docOrdenCompra" type="{http://Webmet.core/}document"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcSupplierOrder", propOrder = {
    "operacion",
    "idInstancia",
    "idspr",
    "descripcion",
    "inventorycontoldocument",
    "idcountry",
    "docOrdenCompra"
})
public class AbcSupplierOrder {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_SPR")
    protected int idspr;
    @XmlElement(name = "DESCRIPCION", required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected InventoryControlDocument inventorycontoldocument;
    @XmlElement(name = "ID_COUNTRY")
    protected int idcountry;
    @XmlElement(required = true)
    protected Document docOrdenCompra;

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
     * Obtiene el valor de la propiedad inventorycontoldocument.
     * 
     * @return
     *     possible object is
     *     {@link InventoryControlDocument }
     *     
     */
    public InventoryControlDocument getInventorycontoldocument() {
        return inventorycontoldocument;
    }

    /**
     * Define el valor de la propiedad inventorycontoldocument.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryControlDocument }
     *     
     */
    public void setInventorycontoldocument(InventoryControlDocument value) {
        this.inventorycontoldocument = value;
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
     * Obtiene el valor de la propiedad docOrdenCompra.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocOrdenCompra() {
        return docOrdenCompra;
    }

    /**
     * Define el valor de la propiedad docOrdenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocOrdenCompra(Document value) {
        this.docOrdenCompra = value;
    }

}
