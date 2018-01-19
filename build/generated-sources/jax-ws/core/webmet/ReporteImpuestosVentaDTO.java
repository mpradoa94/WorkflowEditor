
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteImpuestosVentaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteImpuestosVentaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grabable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteImpuestosVentaDTO", propOrder = {
    "fecha",
    "caja",
    "folio",
    "corte",
    "grabable",
    "descripcion",
    "total"
})
public class ReporteImpuestosVentaDTO {

    protected String fecha;
    protected String caja;
    protected String folio;
    protected String corte;
    protected String grabable;
    protected String descripcion;
    protected double total;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaja() {
        return caja;
    }

    /**
     * Define el valor de la propiedad caja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaja(String value) {
        this.caja = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad corte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorte() {
        return corte;
    }

    /**
     * Define el valor de la propiedad corte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorte(String value) {
        this.corte = value;
    }

    /**
     * Obtiene el valor de la propiedad grabable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrabable() {
        return grabable;
    }

    /**
     * Define el valor de la propiedad grabable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrabable(String value) {
        this.grabable = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

}
