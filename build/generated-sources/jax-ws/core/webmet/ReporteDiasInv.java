
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteDiasInv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteDiasInv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="padre2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GRUPO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_STRGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ORGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INVENTARIO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MO_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QU_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VtaPromedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DiasInv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteDiasInv", propOrder = {
    "fecha",
    "iditm",
    "padre2",
    "padre",
    "grupo1",
    "nmstrgrp",
    "nmorgn",
    "iditmps",
    "nmitm",
    "inventario",
    "moslsitm",
    "quslsitm",
    "vtaPromedio",
    "diasInv",
    "mensaje"
})
public class ReporteDiasInv {

    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    protected String padre2;
    protected String padre;
    @XmlElement(name = "GRUPO1")
    protected String grupo1;
    @XmlElement(name = "NM_STRGRP")
    protected String nmstrgrp;
    @XmlElement(name = "NM_ORGN")
    protected String nmorgn;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "INVENTARIO")
    protected double inventario;
    @XmlElement(name = "MO_SLS_ITM")
    protected double moslsitm;
    @XmlElement(name = "QU_SLS_ITM")
    protected double quslsitm;
    @XmlElement(name = "VtaPromedio")
    protected double vtaPromedio;
    @XmlElement(name = "DiasInv")
    protected double diasInv;
    @XmlElement(name = "Mensaje")
    protected String mensaje;

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
     * Obtiene el valor de la propiedad iditm.
     * 
     */
    public int getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     */
    public void setIDITM(int value) {
        this.iditm = value;
    }

    /**
     * Obtiene el valor de la propiedad padre2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadre2() {
        return padre2;
    }

    /**
     * Define el valor de la propiedad padre2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadre2(String value) {
        this.padre2 = value;
    }

    /**
     * Obtiene el valor de la propiedad padre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadre() {
        return padre;
    }

    /**
     * Define el valor de la propiedad padre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadre(String value) {
        this.padre = value;
    }

    /**
     * Obtiene el valor de la propiedad grupo1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUPO1() {
        return grupo1;
    }

    /**
     * Define el valor de la propiedad grupo1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUPO1(String value) {
        this.grupo1 = value;
    }

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
     * Obtiene el valor de la propiedad nmitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMITM() {
        return nmitm;
    }

    /**
     * Define el valor de la propiedad nmitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMITM(String value) {
        this.nmitm = value;
    }

    /**
     * Obtiene el valor de la propiedad inventario.
     * 
     */
    public double getINVENTARIO() {
        return inventario;
    }

    /**
     * Define el valor de la propiedad inventario.
     * 
     */
    public void setINVENTARIO(double value) {
        this.inventario = value;
    }

    /**
     * Obtiene el valor de la propiedad moslsitm.
     * 
     */
    public double getMOSLSITM() {
        return moslsitm;
    }

    /**
     * Define el valor de la propiedad moslsitm.
     * 
     */
    public void setMOSLSITM(double value) {
        this.moslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quslsitm.
     * 
     */
    public double getQUSLSITM() {
        return quslsitm;
    }

    /**
     * Define el valor de la propiedad quslsitm.
     * 
     */
    public void setQUSLSITM(double value) {
        this.quslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad vtaPromedio.
     * 
     */
    public double getVtaPromedio() {
        return vtaPromedio;
    }

    /**
     * Define el valor de la propiedad vtaPromedio.
     * 
     */
    public void setVtaPromedio(double value) {
        this.vtaPromedio = value;
    }

    /**
     * Obtiene el valor de la propiedad diasInv.
     * 
     */
    public double getDiasInv() {
        return diasInv;
    }

    /**
     * Define el valor de la propiedad diasInv.
     * 
     */
    public void setDiasInv(double value) {
        this.diasInv = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
