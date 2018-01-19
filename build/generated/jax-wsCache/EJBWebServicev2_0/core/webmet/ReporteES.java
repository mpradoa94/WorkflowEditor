
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteES complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FN_PRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LN_PRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteES", propOrder = {
    "fecha",
    "fnprs",
    "lnprs",
    "dia"
})
public class ReporteES {

    protected String fecha;
    @XmlElement(name = "FN_PRS")
    protected String fnprs;
    @XmlElement(name = "LN_PRS")
    protected String lnprs;
    protected String dia;

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
     * Obtiene el valor de la propiedad fnprs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNPRS() {
        return fnprs;
    }

    /**
     * Define el valor de la propiedad fnprs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNPRS(String value) {
        this.fnprs = value;
    }

    /**
     * Obtiene el valor de la propiedad lnprs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNPRS() {
        return lnprs;
    }

    /**
     * Define el valor de la propiedad lnprs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNPRS(String value) {
        this.lnprs = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDia(String value) {
        this.dia = value;
    }

}
