
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteVentasImpuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteVentasImpuestos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NM_STRGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ORGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AI_TRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_GP_TX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MO_TX_RTN_SLS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_NETA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Fecha1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHADEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHAAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteVentasImpuestos", propOrder = {
    "nmstrgrp",
    "nmorgn",
    "idstrrt",
    "idws",
    "dcdybsn",
    "aitrn",
    "nmgptx",
    "motxrtnsls",
    "vneta",
    "total",
    "fecha1",
    "fecha2",
    "fechadel",
    "fechaal"
})
public class ReporteVentasImpuestos {

    @XmlElement(name = "NM_STRGRP")
    protected String nmstrgrp;
    @XmlElement(name = "NM_ORGN")
    protected String nmorgn;
    @XmlElement(name = "ID_STR_RT")
    protected String idstrrt;
    @XmlElement(name = "ID_WS")
    protected String idws;
    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "AI_TRN")
    protected String aitrn;
    @XmlElement(name = "NM_GP_TX")
    protected String nmgptx;
    @XmlElement(name = "MO_TX_RTN_SLS")
    protected double motxrtnsls;
    @XmlElement(name = "V_NETA")
    protected double vneta;
    @XmlElement(name = "TOTAL")
    protected double total;
    @XmlElement(name = "Fecha1")
    protected String fecha1;
    @XmlElement(name = "Fecha2")
    protected String fecha2;
    @XmlElement(name = "FECHADEL")
    protected String fechadel;
    @XmlElement(name = "FECHAAL")
    protected String fechaal;

    /**
     * Obtiene el valor de la propiedad nmstrgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSTRGRP() {
        return nmstrgrp;
    }

    /**
     * Define el valor de la propiedad nmstrgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSTRGRP(String value) {
        this.nmstrgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad nmorgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMORGN() {
        return nmorgn;
    }

    /**
     * Define el valor de la propiedad nmorgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMORGN(String value) {
        this.nmorgn = value;
    }

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSTRRT(String value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad idws.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDWS() {
        return idws;
    }

    /**
     * Define el valor de la propiedad idws.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDWS(String value) {
        this.idws = value;
    }

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
     * Obtiene el valor de la propiedad aitrn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAITRN() {
        return aitrn;
    }

    /**
     * Define el valor de la propiedad aitrn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAITRN(String value) {
        this.aitrn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmgptx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMGPTX() {
        return nmgptx;
    }

    /**
     * Define el valor de la propiedad nmgptx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMGPTX(String value) {
        this.nmgptx = value;
    }

    /**
     * Obtiene el valor de la propiedad motxrtnsls.
     * 
     */
    public double getMOTXRTNSLS() {
        return motxrtnsls;
    }

    /**
     * Define el valor de la propiedad motxrtnsls.
     * 
     */
    public void setMOTXRTNSLS(double value) {
        this.motxrtnsls = value;
    }

    /**
     * Obtiene el valor de la propiedad vneta.
     * 
     */
    public double getVNETA() {
        return vneta;
    }

    /**
     * Define el valor de la propiedad vneta.
     * 
     */
    public void setVNETA(double value) {
        this.vneta = value;
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

    /**
     * Obtiene el valor de la propiedad fecha1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha1() {
        return fecha1;
    }

    /**
     * Define el valor de la propiedad fecha1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha1(String value) {
        this.fecha1 = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha2() {
        return fecha2;
    }

    /**
     * Define el valor de la propiedad fecha2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha2(String value) {
        this.fecha2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHADEL() {
        return fechadel;
    }

    /**
     * Define el valor de la propiedad fechadel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHADEL(String value) {
        this.fechadel = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAAL() {
        return fechaal;
    }

    /**
     * Define el valor de la propiedad fechaal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAAL(String value) {
        this.fechaal = value;
    }

}
