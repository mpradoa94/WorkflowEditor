
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcOperacionWord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcOperacionWord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_formato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_modelos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultado_xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obligatorios" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcOperacionWord", propOrder = {
    "idInstancia",
    "operacion",
    "idFormato",
    "idModelos",
    "resultadoXml",
    "obligatorios"
})
public class AbcOperacionWord {

    @XmlElement(name = "id_instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(name = "id_formato")
    protected int idFormato;
    @XmlElement(name = "id_modelos")
    protected int idModelos;
    @XmlElement(name = "resultado_xml")
    protected String resultadoXml;
    protected List<String> obligatorios;

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
     * Obtiene el valor de la propiedad idFormato.
     * 
     */
    public int getIdFormato() {
        return idFormato;
    }

    /**
     * Define el valor de la propiedad idFormato.
     * 
     */
    public void setIdFormato(int value) {
        this.idFormato = value;
    }

    /**
     * Obtiene el valor de la propiedad idModelos.
     * 
     */
    public int getIdModelos() {
        return idModelos;
    }

    /**
     * Define el valor de la propiedad idModelos.
     * 
     */
    public void setIdModelos(int value) {
        this.idModelos = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoXml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoXml() {
        return resultadoXml;
    }

    /**
     * Define el valor de la propiedad resultadoXml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoXml(String value) {
        this.resultadoXml = value;
    }

    /**
     * Gets the value of the obligatorios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obligatorios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObligatorios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObligatorios() {
        if (obligatorios == null) {
            obligatorios = new ArrayList<String>();
        }
        return this.obligatorios;
    }

}
