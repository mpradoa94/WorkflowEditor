
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteTransaccionCXP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteTransaccionCXP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_DEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_AL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteTransaccionCXP", propOrder = {
    "idInstancia",
    "operacion",
    "fechadel",
    "fechaal"
})
public class GetReporteTransaccionCXP {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "FECHA_DEL", required = true)
    protected String fechadel;
    @XmlElement(name = "FECHA_AL", required = true)
    protected String fechaal;

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
     * Obtiene el valor de la propiedad fechadel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHADEL() {
        return fechadel;
    }

    /**
     * Define el valor de la propiedad fechadel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHADEL(String value) {
        this.fechadel = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAAL() {
        return fechaal;
    }

    /**
     * Define el valor de la propiedad fechaal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAAL(String value) {
        this.fechaal = value;
    }

}
