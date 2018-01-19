
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAntiLavado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAntiLavado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idInstancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idFormato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idAntilavado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parametros" type="{http://Webmet.core/}antiLavadoD"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAntiLavado", propOrder = {
    "idInstancia",
    "idFormato",
    "idAntilavado",
    "fechaI",
    "fechaF",
    "parametros"
})
public class GetAntiLavado {

    protected int idInstancia;
    protected int idFormato;
    protected int idAntilavado;
    @XmlElement(required = true)
    protected String fechaI;
    @XmlElement(required = true)
    protected String fechaF;
    @XmlElement(required = true)
    protected AntiLavadoD parametros;

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
     * Obtiene el valor de la propiedad idAntilavado.
     * 
     */
    public int getIdAntilavado() {
        return idAntilavado;
    }

    /**
     * Define el valor de la propiedad idAntilavado.
     * 
     */
    public void setIdAntilavado(int value) {
        this.idAntilavado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaI() {
        return fechaI;
    }

    /**
     * Define el valor de la propiedad fechaI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaI(String value) {
        this.fechaI = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaF() {
        return fechaF;
    }

    /**
     * Define el valor de la propiedad fechaF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaF(String value) {
        this.fechaF = value;
    }

    /**
     * Obtiene el valor de la propiedad parametros.
     * 
     * @return
     *     possible object is
     *     {@link AntiLavadoD }
     *     
     */
    public AntiLavadoD getParametros() {
        return parametros;
    }

    /**
     * Define el valor de la propiedad parametros.
     * 
     * @param value
     *     allowed object is
     *     {@link AntiLavadoD }
     *     
     */
    public void setParametros(AntiLavadoD value) {
        this.parametros = value;
    }

}
