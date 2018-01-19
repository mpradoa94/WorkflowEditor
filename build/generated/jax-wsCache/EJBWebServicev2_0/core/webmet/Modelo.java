
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modelo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_modelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_propietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre_cuestionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dc_aplica_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dc_aplica_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variables" type="{http://Webmet.core/}variables" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelo", propOrder = {
    "idModelo",
    "nombrePropietario",
    "nombreCuestionario",
    "xml",
    "idProceso",
    "dcAplicaDesde",
    "dcAplicaHasta",
    "tipo",
    "variables"
})
public class Modelo {

    @XmlElement(name = "id_modelo")
    protected int idModelo;
    @XmlElement(name = "nombre_propietario")
    protected String nombrePropietario;
    @XmlElement(name = "nombre_cuestionario")
    protected String nombreCuestionario;
    protected String xml;
    protected int idProceso;
    @XmlElement(name = "dc_aplica_desde")
    protected String dcAplicaDesde;
    @XmlElement(name = "dc_aplica_hasta")
    protected String dcAplicaHasta;
    protected String tipo;
    @XmlElement(nillable = true)
    protected List<Variables> variables;

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
     * Obtiene el valor de la propiedad nombrePropietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     * Define el valor de la propiedad nombrePropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePropietario(String value) {
        this.nombrePropietario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCuestionario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCuestionario() {
        return nombreCuestionario;
    }

    /**
     * Define el valor de la propiedad nombreCuestionario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCuestionario(String value) {
        this.nombreCuestionario = value;
    }

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXml() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXml(String value) {
        this.xml = value;
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
     * Obtiene el valor de la propiedad dcAplicaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcAplicaDesde() {
        return dcAplicaDesde;
    }

    /**
     * Define el valor de la propiedad dcAplicaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcAplicaDesde(String value) {
        this.dcAplicaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad dcAplicaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcAplicaHasta() {
        return dcAplicaHasta;
    }

    /**
     * Define el valor de la propiedad dcAplicaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcAplicaHasta(String value) {
        this.dcAplicaHasta = value;
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
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variables }
     * 
     * 
     */
    public List<Variables> getVariables() {
        if (variables == null) {
            variables = new ArrayList<Variables>();
        }
        return this.variables;
    }

}
