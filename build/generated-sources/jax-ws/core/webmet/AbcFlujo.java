
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcFlujo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcFlujo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Flujo" type="{http://Webmet.core/}flujo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcFlujo", propOrder = {
    "operacion",
    "idInstancia",
    "flujo"
})
public class AbcFlujo {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "Id_instancia")
    protected int idInstancia;
    @XmlElement(name = "Flujo", required = true)
    protected Flujo flujo;

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
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad flujo.
     * 
     * @return
     *     possible object is
     *     {@link Flujo }
     *     
     */
    public Flujo getFlujo() {
        return flujo;
    }

    /**
     * Define el valor de la propiedad flujo.
     * 
     * @param value
     *     allowed object is
     *     {@link Flujo }
     *     
     */
    public void setFlujo(Flujo value) {
        this.flujo = value;
    }

}
