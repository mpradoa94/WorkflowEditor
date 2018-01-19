
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReportesFormatosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReportesFormatosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="repFormatos" type="{http://Webmet.core/}reportesFormatos" minOccurs="0"/>
 *         &lt;element name="repsFor" type="{http://Webmet.core/}reportesFormatos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReportesFormatosResponse", propOrder = {
    "resultado",
    "repFormatos",
    "repsFor"
})
public class GetReportesFormatosResponse {

    protected Resultado resultado;
    protected ReportesFormatos repFormatos;
    @XmlElement(nillable = true)
    protected List<ReportesFormatos> repsFor;

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
     * Obtiene el valor de la propiedad repFormatos.
     * 
     * @return
     *     possible object is
     *     {@link ReportesFormatos }
     *     
     */
    public ReportesFormatos getRepFormatos() {
        return repFormatos;
    }

    /**
     * Define el valor de la propiedad repFormatos.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportesFormatos }
     *     
     */
    public void setRepFormatos(ReportesFormatos value) {
        this.repFormatos = value;
    }

    /**
     * Gets the value of the repsFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repsFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepsFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportesFormatos }
     * 
     * 
     */
    public List<ReportesFormatos> getRepsFor() {
        if (repsFor == null) {
            repsFor = new ArrayList<ReportesFormatos>();
        }
        return this.repsFor;
    }

}
