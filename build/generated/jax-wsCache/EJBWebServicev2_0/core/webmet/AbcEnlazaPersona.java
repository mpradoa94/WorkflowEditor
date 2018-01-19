
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcEnlazaPersona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcEnlazaPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idPrincipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idEnlazado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcEnlazaPersona", propOrder = {
    "operacion",
    "idInstancia",
    "idPrincipal",
    "idEnlazado"
})
public class AbcEnlazaPersona {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    protected int idPrincipal;
    protected int idEnlazado;

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
     * Obtiene el valor de la propiedad idPrincipal.
     * 
     */
    public int getIdPrincipal() {
        return idPrincipal;
    }

    /**
     * Define el valor de la propiedad idPrincipal.
     * 
     */
    public void setIdPrincipal(int value) {
        this.idPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad idEnlazado.
     * 
     */
    public int getIdEnlazado() {
        return idEnlazado;
    }

    /**
     * Define el valor de la propiedad idEnlazado.
     * 
     */
    public void setIdEnlazado(int value) {
        this.idEnlazado = value;
    }

}
