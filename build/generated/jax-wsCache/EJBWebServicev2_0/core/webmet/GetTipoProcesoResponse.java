
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTipoProcesoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTipoProcesoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="tiposProceso" type="{http://Webmet.core/}tipoProceso" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://Webmet.core/}tipoProceso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTipoProcesoResponse", propOrder = {
    "resultado",
    "tiposProceso",
    "tipo"
})
public class GetTipoProcesoResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<TipoProceso> tiposProceso;
    protected TipoProceso tipo;

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
     * Gets the value of the tiposProceso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposProceso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposProceso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoProceso }
     * 
     * 
     */
    public List<TipoProceso> getTiposProceso() {
        if (tiposProceso == null) {
            tiposProceso = new ArrayList<TipoProceso>();
        }
        return this.tiposProceso;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link TipoProceso }
     *     
     */
    public TipoProceso getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProceso }
     *     
     */
    public void setTipo(TipoProceso value) {
        this.tipo = value;
    }

}
