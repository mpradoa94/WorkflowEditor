
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getImpuestosNotaria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getImpuestosNotaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idInstancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idSis" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idFn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nmFn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImpuestosNotaria", propOrder = {
    "operacion",
    "idInstancia",
    "idSis",
    "idFn",
    "nmFn"
})
public class GetImpuestosNotaria {

    @XmlElement(required = true)
    protected String operacion;
    protected int idInstancia;
    protected int idSis;
    protected int idFn;
    @XmlElement(required = true)
    protected String nmFn;

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
     * Obtiene el valor de la propiedad idSis.
     * 
     */
    public int getIdSis() {
        return idSis;
    }

    /**
     * Define el valor de la propiedad idSis.
     * 
     */
    public void setIdSis(int value) {
        this.idSis = value;
    }

    /**
     * Obtiene el valor de la propiedad idFn.
     * 
     */
    public int getIdFn() {
        return idFn;
    }

    /**
     * Define el valor de la propiedad idFn.
     * 
     */
    public void setIdFn(int value) {
        this.idFn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmFn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmFn() {
        return nmFn;
    }

    /**
     * Define el valor de la propiedad nmFn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmFn(String value) {
        this.nmFn = value;
    }

}
