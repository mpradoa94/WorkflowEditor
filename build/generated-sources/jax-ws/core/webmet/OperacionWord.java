
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operacionWord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operacionWord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_formato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_modelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_proceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procede" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacionWord", propOrder = {
    "idFormato",
    "idModelo",
    "idProceso",
    "nombreProceso",
    "tipoProceso",
    "resultado",
    "procede"
})
public class OperacionWord {

    @XmlElement(name = "id_formato")
    protected int idFormato;
    @XmlElement(name = "id_modelo")
    protected int idModelo;
    @XmlElement(name = "id_proceso")
    protected int idProceso;
    @XmlElement(name = "nombre_proceso")
    protected String nombreProceso;
    @XmlElement(name = "tipo_proceso")
    protected String tipoProceso;
    protected String resultado;
    protected int procede;

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
     * Obtiene el valor de la propiedad idProceso.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Define el valor de la propiedad idProceso.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProceso() {
        return nombreProceso;
    }

    /**
     * Define el valor de la propiedad nombreProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProceso(String value) {
        this.nombreProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProceso(String value) {
        this.tipoProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad procede.
     * 
     */
    public int getProcede() {
        return procede;
    }

    /**
     * Define el valor de la propiedad procede.
     * 
     */
    public void setProcede(int value) {
        this.procede = value;
    }

}
