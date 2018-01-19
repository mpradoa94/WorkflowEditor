
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_formato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_variable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_variable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_opcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuesta", propOrder = {
    "idRespuesta",
    "idFormato",
    "idVariable",
    "nmVariable",
    "numero",
    "texto",
    "fecha",
    "idOpcion",
    "valor"
})
public class Respuesta {

    @XmlElement(name = "id_respuesta")
    protected int idRespuesta;
    @XmlElement(name = "id_formato")
    protected int idFormato;
    @XmlElement(name = "id_variable")
    protected int idVariable;
    @XmlElement(name = "nm_variable")
    protected String nmVariable;
    protected int numero;
    protected String texto;
    protected String fecha;
    @XmlElement(name = "id_opcion")
    protected String idOpcion;
    protected int valor;

    /**
     * Obtiene el valor de la propiedad idRespuesta.
     * 
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * Define el valor de la propiedad idRespuesta.
     * 
     */
    public void setIdRespuesta(int value) {
        this.idRespuesta = value;
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
     * Obtiene el valor de la propiedad idVariable.
     * 
     */
    public int getIdVariable() {
        return idVariable;
    }

    /**
     * Define el valor de la propiedad idVariable.
     * 
     */
    public void setIdVariable(int value) {
        this.idVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad nmVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmVariable() {
        return nmVariable;
    }

    /**
     * Define el valor de la propiedad nmVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmVariable(String value) {
        this.nmVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad texto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Define el valor de la propiedad texto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idOpcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOpcion() {
        return idOpcion;
    }

    /**
     * Define el valor de la propiedad idOpcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOpcion(String value) {
        this.idOpcion = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public int getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(int value) {
        this.valor = value;
    }

}
