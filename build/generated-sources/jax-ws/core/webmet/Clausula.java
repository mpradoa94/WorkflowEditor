
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clausula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clausula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_clausula" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_modelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clausula", propOrder = {
    "idClausula",
    "idModelo",
    "descripcion",
    "contenido"
})
public class Clausula {

    @XmlElement(name = "id_clausula")
    protected int idClausula;
    @XmlElement(name = "id_modelo")
    protected int idModelo;
    protected String descripcion;
    protected String contenido;

    /**
     * Obtiene el valor de la propiedad idClausula.
     * 
     */
    public int getIdClausula() {
        return idClausula;
    }

    /**
     * Define el valor de la propiedad idClausula.
     * 
     */
    public void setIdClausula(int value) {
        this.idClausula = value;
    }

    /**
     * Obtiene el valor de la propiedad idModelo.
     * 
     */
    public int getIdModelo() {
        return idModelo;
    }

    /**
     * Define el valor de la propiedad idModelo.
     * 
     */
    public void setIdModelo(int value) {
        this.idModelo = value;
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
     * Obtiene el valor de la propiedad contenido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Define el valor de la propiedad contenido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenido(String value) {
        this.contenido = value;
    }

}
