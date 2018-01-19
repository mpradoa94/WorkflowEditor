
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para propiedadesNodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="propiedadesNodo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPropiedades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idProceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cvEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idVariableInt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableCuestionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmVariableInterna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propiedadesNodo", propOrder = {
    "idPropiedades",
    "idProceso",
    "idVersion",
    "cvEstado",
    "idVariableInt",
    "tipo",
    "variableCuestionario",
    "nmVariableInterna"
})
public class PropiedadesNodo {

    protected int idPropiedades;
    protected int idProceso;
    protected int idVersion;
    protected String cvEstado;
    protected int idVariableInt;
    protected String tipo;
    protected String variableCuestionario;
    protected String nmVariableInterna;

    /**
     * Obtiene el valor de la propiedad idPropiedades.
     * 
     */
    public int getIdPropiedades() {
        return idPropiedades;
    }

    /**
     * Define el valor de la propiedad idPropiedades.
     * 
     */
    public void setIdPropiedades(int value) {
        this.idPropiedades = value;
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
     * Obtiene el valor de la propiedad idVersion.
     * 
     */
    public int getIdVersion() {
        return idVersion;
    }

    /**
     * Define el valor de la propiedad idVersion.
     * 
     */
    public void setIdVersion(int value) {
        this.idVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad cvEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvEstado() {
        return cvEstado;
    }

    /**
     * Define el valor de la propiedad cvEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvEstado(String value) {
        this.cvEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad idVariableInt.
     * 
     */
    public int getIdVariableInt() {
        return idVariableInt;
    }

    /**
     * Define el valor de la propiedad idVariableInt.
     * 
     */
    public void setIdVariableInt(int value) {
        this.idVariableInt = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad variableCuestionario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableCuestionario() {
        return variableCuestionario;
    }

    /**
     * Define el valor de la propiedad variableCuestionario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableCuestionario(String value) {
        this.variableCuestionario = value;
    }

    /**
     * Obtiene el valor de la propiedad nmVariableInterna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmVariableInterna() {
        return nmVariableInterna;
    }

    /**
     * Define el valor de la propiedad nmVariableInterna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmVariableInterna(String value) {
        this.nmVariableInterna = value;
    }

}
