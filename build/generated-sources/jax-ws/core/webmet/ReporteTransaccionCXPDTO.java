
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteTransaccionCXPDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteTransaccionCXPDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FECHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVEEDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCUMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL_PROVEEDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL_FECHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL_CA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFormato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoFormato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteTransaccionCXPDTO", propOrder = {
    "fecha",
    "proveedor",
    "documento",
    "referencia",
    "monto",
    "totalproveedor",
    "totalfecha",
    "totalca",
    "fechaFormato",
    "montoFormato"
})
public class ReporteTransaccionCXPDTO {

    @XmlElement(name = "FECHA")
    protected String fecha;
    @XmlElement(name = "PROVEEDOR")
    protected String proveedor;
    @XmlElement(name = "DOCUMENTO")
    protected String documento;
    @XmlElement(name = "REFERENCIA")
    protected String referencia;
    @XmlElement(name = "MONTO")
    protected String monto;
    @XmlElement(name = "TOTAL_PROVEEDOR")
    protected String totalproveedor;
    @XmlElement(name = "TOTAL_FECHA")
    protected String totalfecha;
    @XmlElement(name = "TOTAL_CA")
    protected String totalca;
    protected String fechaFormato;
    protected String montoFormato;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHA() {
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
    public void setFECHA(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVEEDOR() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVEEDOR(String value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTO() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTO(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCIA() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCIA(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMONTO() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMONTO(String value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad totalproveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALPROVEEDOR() {
        return totalproveedor;
    }

    /**
     * Define el valor de la propiedad totalproveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALPROVEEDOR(String value) {
        this.totalproveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad totalfecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALFECHA() {
        return totalfecha;
    }

    /**
     * Define el valor de la propiedad totalfecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALFECHA(String value) {
        this.totalfecha = value;
    }

    /**
     * Obtiene el valor de la propiedad totalca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALCA() {
        return totalca;
    }

    /**
     * Define el valor de la propiedad totalca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALCA(String value) {
        this.totalca = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFormato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFormato() {
        return fechaFormato;
    }

    /**
     * Define el valor de la propiedad fechaFormato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFormato(String value) {
        this.fechaFormato = value;
    }

    /**
     * Obtiene el valor de la propiedad montoFormato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoFormato() {
        return montoFormato;
    }

    /**
     * Define el valor de la propiedad montoFormato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoFormato(String value) {
        this.montoFormato = value;
    }

}
