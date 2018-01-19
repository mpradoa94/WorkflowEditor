
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteUXP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteUXP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DE_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="V_VENDIDAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="utilidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteUXP", propOrder = {
    "iditmps",
    "deitm",
    "vvendidas",
    "utilidad"
})
public class ReporteUXP {

    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "DE_ITM")
    protected String deitm;
    @XmlElement(name = "V_VENDIDAS")
    protected double vvendidas;
    protected double utilidad;

    /**
     * Obtiene el valor de la propiedad iditmps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDITMPS() {
        return iditmps;
    }

    /**
     * Define el valor de la propiedad iditmps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDITMPS(String value) {
        this.iditmps = value;
    }

    /**
     * Obtiene el valor de la propiedad deitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEITM() {
        return deitm;
    }

    /**
     * Define el valor de la propiedad deitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEITM(String value) {
        this.deitm = value;
    }

    /**
     * Obtiene el valor de la propiedad vvendidas.
     * 
     */
    public double getVVENDIDAS() {
        return vvendidas;
    }

    /**
     * Define el valor de la propiedad vvendidas.
     * 
     */
    public void setVVENDIDAS(double value) {
        this.vvendidas = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidad.
     * 
     */
    public double getUtilidad() {
        return utilidad;
    }

    /**
     * Define el valor de la propiedad utilidad.
     * 
     */
    public void setUtilidad(double value) {
        this.utilidad = value;
    }

}
