
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteVentaXHora complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteVentaXHora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="horain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TICKETS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LPROM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IMPORTE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Caja" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteVentaXHora", propOrder = {
    "horain",
    "horaout",
    "tickets",
    "lprom",
    "importe",
    "caja",
    "fecha"
})
public class ReporteVentaXHora {

    protected String horain;
    protected String horaout;
    @XmlElement(name = "TICKETS")
    protected int tickets;
    @XmlElement(name = "LPROM")
    protected double lprom;
    @XmlElement(name = "IMPORTE")
    protected double importe;
    @XmlElement(name = "Caja")
    protected int caja;
    @XmlElement(name = "Fecha")
    protected String fecha;

    /**
     * Obtiene el valor de la propiedad horain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorain() {
        return horain;
    }

    /**
     * Define el valor de la propiedad horain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorain(String value) {
        this.horain = value;
    }

    /**
     * Obtiene el valor de la propiedad horaout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraout() {
        return horaout;
    }

    /**
     * Define el valor de la propiedad horaout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraout(String value) {
        this.horaout = value;
    }

    /**
     * Obtiene el valor de la propiedad tickets.
     * 
     */
    public int getTICKETS() {
        return tickets;
    }

    /**
     * Define el valor de la propiedad tickets.
     * 
     */
    public void setTICKETS(int value) {
        this.tickets = value;
    }

    /**
     * Obtiene el valor de la propiedad lprom.
     * 
     */
    public double getLPROM() {
        return lprom;
    }

    /**
     * Define el valor de la propiedad lprom.
     * 
     */
    public void setLPROM(double value) {
        this.lprom = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getIMPORTE() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setIMPORTE(double value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad caja.
     * 
     */
    public int getCaja() {
        return caja;
    }

    /**
     * Define el valor de la propiedad caja.
     * 
     */
    public void setCaja(int value) {
        this.caja = value;
    }

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

}
