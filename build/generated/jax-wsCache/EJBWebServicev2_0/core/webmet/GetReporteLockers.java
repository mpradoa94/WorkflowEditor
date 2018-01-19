
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteLockers complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteLockers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FechaIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaOu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteLockers", propOrder = {
    "operacion",
    "idInstancia",
    "fechaIn",
    "fechaOu",
    "id"
})
public class GetReporteLockers {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "FechaIn", required = true)
    protected String fechaIn;
    @XmlElement(name = "FechaOu", required = true)
    protected String fechaOu;
    @XmlElement(name = "ID")
    protected int id;

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
     * Obtiene el valor de la propiedad fechaIn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIn() {
        return fechaIn;
    }

    /**
     * Define el valor de la propiedad fechaIn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIn(String value) {
        this.fechaIn = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOu() {
        return fechaOu;
    }

    /**
     * Define el valor de la propiedad fechaOu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOu(String value) {
        this.fechaOu = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

}
