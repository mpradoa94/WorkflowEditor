
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteTransaccionCXPResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteTransaccionCXPResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="listaCargo" type="{http://Webmet.core/}reporteTransaccionCXPDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaAbono" type="{http://Webmet.core/}reporteTransaccionCXPDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteTransaccionCXPResponse", propOrder = {
    "resultado",
    "listaCargo",
    "listaAbono"
})
public class GetReporteTransaccionCXPResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<ReporteTransaccionCXPDTO> listaCargo;
    @XmlElement(nillable = true)
    protected List<ReporteTransaccionCXPDTO> listaAbono;

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
     * Gets the value of the listaCargo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCargo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCargo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReporteTransaccionCXPDTO }
     * 
     * 
     */
    public List<ReporteTransaccionCXPDTO> getListaCargo() {
        if (listaCargo == null) {
            listaCargo = new ArrayList<ReporteTransaccionCXPDTO>();
        }
        return this.listaCargo;
    }

    /**
     * Gets the value of the listaAbono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaAbono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaAbono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReporteTransaccionCXPDTO }
     * 
     * 
     */
    public List<ReporteTransaccionCXPDTO> getListaAbono() {
        if (listaAbono == null) {
            listaAbono = new ArrayList<ReporteTransaccionCXPDTO>();
        }
        return this.listaAbono;
    }

}
