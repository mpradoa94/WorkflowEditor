
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteVentasImpuestosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteVentasImpuestosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="lista" type="{http://Webmet.core/}reporteVentasImpuestos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listasub" type="{http://Webmet.core/}reporteVentasImpuestosSubrepote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteVentasImpuestosResponse", propOrder = {
    "resultado",
    "lista",
    "listasub"
})
public class GetReporteVentasImpuestosResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<ReporteVentasImpuestos> lista;
    @XmlElement(nillable = true)
    protected List<ReporteVentasImpuestosSubrepote> listasub;

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
     * Gets the value of the lista property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lista property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLista().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReporteVentasImpuestos }
     * 
     * 
     */
    public List<ReporteVentasImpuestos> getLista() {
        if (lista == null) {
            lista = new ArrayList<ReporteVentasImpuestos>();
        }
        return this.lista;
    }

    /**
     * Gets the value of the listasub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listasub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListasub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReporteVentasImpuestosSubrepote }
     * 
     * 
     */
    public List<ReporteVentasImpuestosSubrepote> getListasub() {
        if (listasub == null) {
            listasub = new ArrayList<ReporteVentasImpuestosSubrepote>();
        }
        return this.listasub;
    }

}
