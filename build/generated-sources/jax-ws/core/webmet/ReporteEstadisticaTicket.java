
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteEstadisticaTicket complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteEstadisticaTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caja" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="apertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cierre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cajero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renglones" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="folioI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="folioF" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="promedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteEstadisticaTicket", propOrder = {
    "fecha",
    "caja",
    "apertura",
    "cierre",
    "cajero",
    "hora",
    "renglones",
    "folioI",
    "folioF",
    "promedio",
    "importe"
})
public class ReporteEstadisticaTicket {

    protected String fecha;
    protected int caja;
    protected String apertura;
    protected String cierre;
    protected int cajero;
    protected String hora;
    protected double renglones;
    protected int folioI;
    protected int folioF;
    protected double promedio;
    protected double importe;

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
     * Obtiene el valor de la propiedad apertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApertura() {
        return apertura;
    }

    /**
     * Define el valor de la propiedad apertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApertura(String value) {
        this.apertura = value;
    }

    /**
     * Obtiene el valor de la propiedad cierre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCierre() {
        return cierre;
    }

    /**
     * Define el valor de la propiedad cierre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCierre(String value) {
        this.cierre = value;
    }

    /**
     * Obtiene el valor de la propiedad cajero.
     * 
     */
    public int getCajero() {
        return cajero;
    }

    /**
     * Define el valor de la propiedad cajero.
     * 
     */
    public void setCajero(int value) {
        this.cajero = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad renglones.
     * 
     */
    public double getRenglones() {
        return renglones;
    }

    /**
     * Define el valor de la propiedad renglones.
     * 
     */
    public void setRenglones(double value) {
        this.renglones = value;
    }

    /**
     * Obtiene el valor de la propiedad folioI.
     * 
     */
    public int getFolioI() {
        return folioI;
    }

    /**
     * Define el valor de la propiedad folioI.
     * 
     */
    public void setFolioI(int value) {
        this.folioI = value;
    }

    /**
     * Obtiene el valor de la propiedad folioF.
     * 
     */
    public int getFolioF() {
        return folioF;
    }

    /**
     * Define el valor de la propiedad folioF.
     * 
     */
    public void setFolioF(int value) {
        this.folioF = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio.
     * 
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Define el valor de la propiedad promedio.
     * 
     */
    public void setPromedio(double value) {
        this.promedio = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

}
