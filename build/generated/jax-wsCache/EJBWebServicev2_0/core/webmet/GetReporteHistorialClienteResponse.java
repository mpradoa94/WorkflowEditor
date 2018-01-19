
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteHistorialClienteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteHistorialClienteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://Webmet.core/}reporteHistorialCliente" minOccurs="0"/>
 *         &lt;element name="Servicios" type="{http://Webmet.core/}reporteHistorialClienteServicios" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteHistorialClienteResponse", propOrder = {
    "resultado",
    "cliente",
    "servicios"
})
public class GetReporteHistorialClienteResponse {

    protected Resultado resultado;
    protected ReporteHistorialCliente cliente;
    @XmlElement(name = "Servicios", nillable = true)
    protected List<ReporteHistorialClienteServicios> servicios;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link ReporteHistorialCliente }
     *     
     */
    public ReporteHistorialCliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link ReporteHistorialCliente }
     *     
     */
    public void setCliente(ReporteHistorialCliente value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the servicios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReporteHistorialClienteServicios }
     * 
     * 
     */
    public List<ReporteHistorialClienteServicios> getServicios() {
        if (servicios == null) {
            servicios = new ArrayList<ReporteHistorialClienteServicios>();
        }
        return this.servicios;
    }

}
