
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcSupplier complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcSupplier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="supplier" type="{http://Webmet.core/}supplier"/>
 *         &lt;element name="loghead" type="{http://Webmet.core/}logHead"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcSupplier", propOrder = {
    "operacion",
    "idInstancia",
    "supplier",
    "loghead"
})
public class AbcSupplier {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected Supplier supplier;
    @XmlElement(required = true)
    protected LogHead loghead;

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
     * Obtiene el valor de la propiedad supplier.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Define el valor de la propiedad supplier.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

    /**
     * Obtiene el valor de la propiedad loghead.
     * 
     * @return
     *     possible object is
     *     {@link LogHead }
     *     
     */
    public LogHead getLoghead() {
        return loghead;
    }

    /**
     * Define el valor de la propiedad loghead.
     * 
     * @param value
     *     allowed object is
     *     {@link LogHead }
     *     
     */
    public void setLoghead(LogHead value) {
        this.loghead = value;
    }

}