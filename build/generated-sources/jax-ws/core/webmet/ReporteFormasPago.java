
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteFormasPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteFormasPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL_DEPOSITOS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTAL_RETIROS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTAL_COBROS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTAL_DEVOLUCIONES" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTAL_PAGOS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteFormasPago", propOrder = {
    "dcdybsn",
    "tytnd",
    "totaldepositos",
    "totalretiros",
    "totalcobros",
    "totaldevoluciones",
    "totalpagos",
    "total"
})
public class ReporteFormasPago {

    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "TY_TND")
    protected String tytnd;
    @XmlElement(name = "TOTAL_DEPOSITOS")
    protected double totaldepositos;
    @XmlElement(name = "TOTAL_RETIROS")
    protected double totalretiros;
    @XmlElement(name = "TOTAL_COBROS")
    protected double totalcobros;
    @XmlElement(name = "TOTAL_DEVOLUCIONES")
    protected double totaldevoluciones;
    @XmlElement(name = "TOTAL_PAGOS")
    protected double totalpagos;
    @XmlElement(name = "TOTAL")
    protected double total;

    /**
     * Obtiene el valor de la propiedad dcdybsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDYBSN() {
        return dcdybsn;
    }

    /**
     * Define el valor de la propiedad dcdybsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDYBSN(String value) {
        this.dcdybsn = value;
    }

    /**
     * Obtiene el valor de la propiedad tytnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTND() {
        return tytnd;
    }

    /**
     * Define el valor de la propiedad tytnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTND(String value) {
        this.tytnd = value;
    }

    /**
     * Obtiene el valor de la propiedad totaldepositos.
     * 
     */
    public double getTOTALDEPOSITOS() {
        return totaldepositos;
    }

    /**
     * Define el valor de la propiedad totaldepositos.
     * 
     */
    public void setTOTALDEPOSITOS(double value) {
        this.totaldepositos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalretiros.
     * 
     */
    public double getTOTALRETIROS() {
        return totalretiros;
    }

    /**
     * Define el valor de la propiedad totalretiros.
     * 
     */
    public void setTOTALRETIROS(double value) {
        this.totalretiros = value;
    }

    /**
     * Obtiene el valor de la propiedad totalcobros.
     * 
     */
    public double getTOTALCOBROS() {
        return totalcobros;
    }

    /**
     * Define el valor de la propiedad totalcobros.
     * 
     */
    public void setTOTALCOBROS(double value) {
        this.totalcobros = value;
    }

    /**
     * Obtiene el valor de la propiedad totaldevoluciones.
     * 
     */
    public double getTOTALDEVOLUCIONES() {
        return totaldevoluciones;
    }

    /**
     * Define el valor de la propiedad totaldevoluciones.
     * 
     */
    public void setTOTALDEVOLUCIONES(double value) {
        this.totaldevoluciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalpagos.
     * 
     */
    public double getTOTALPAGOS() {
        return totalpagos;
    }

    /**
     * Define el valor de la propiedad totalpagos.
     * 
     */
    public void setTOTALPAGOS(double value) {
        this.totalpagos = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTOTAL() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTOTAL(double value) {
        this.total = value;
    }

}
