
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteMovimientos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteMovimientos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NM_STRGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ORGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_CMPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_SALDO_INI" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_COMPRAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_DEVUELTAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_ENTRADASV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_TRASPASOE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_AJUSTEE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_VENDIDAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_DEVPROV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_SALIDASV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_AJUSTES" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_TRASPASOS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_VENTA_DIA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_SALDO_INI" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_COMPRAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_DEVUELTAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_ENTRADASV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_TRASPASOE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_AJUSTEE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_VENDIDAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_DEVPROV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_SALIDASV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_TRASPASOS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="V_AJUSTES" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="U_COSTO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteMovimientos", propOrder = {
    "nmstrgrp",
    "nmorgn",
    "tscmpl",
    "iditmps",
    "nmitm",
    "usaldoini",
    "ucompras",
    "udevueltas",
    "uentradasv",
    "utraspasoe",
    "uajustee",
    "uvendidas",
    "udevprov",
    "usalidasv",
    "uajustes",
    "utraspasos",
    "uventadia",
    "vsaldoini",
    "vcompras",
    "vdevueltas",
    "ventradasv",
    "vtraspasoe",
    "vajustee",
    "vvendidas",
    "vdevprov",
    "vsalidasv",
    "vtraspasos",
    "vajustes",
    "ucosto"
})
public class ReporteMovimientos {

    @XmlElement(name = "NM_STRGRP")
    protected String nmstrgrp;
    @XmlElement(name = "NM_ORGN")
    protected String nmorgn;
    @XmlElement(name = "TS_CMPL")
    protected String tscmpl;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "U_SALDO_INI")
    protected double usaldoini;
    @XmlElement(name = "U_COMPRAS")
    protected double ucompras;
    @XmlElement(name = "U_DEVUELTAS")
    protected double udevueltas;
    @XmlElement(name = "U_ENTRADASV")
    protected double uentradasv;
    @XmlElement(name = "U_TRASPASOE")
    protected double utraspasoe;
    @XmlElement(name = "U_AJUSTEE")
    protected double uajustee;
    @XmlElement(name = "U_VENDIDAS")
    protected double uvendidas;
    @XmlElement(name = "U_DEVPROV")
    protected double udevprov;
    @XmlElement(name = "U_SALIDASV")
    protected double usalidasv;
    @XmlElement(name = "U_AJUSTES")
    protected double uajustes;
    @XmlElement(name = "U_TRASPASOS")
    protected double utraspasos;
    @XmlElement(name = "U_VENTA_DIA")
    protected double uventadia;
    @XmlElement(name = "V_SALDO_INI")
    protected double vsaldoini;
    @XmlElement(name = "V_COMPRAS")
    protected double vcompras;
    @XmlElement(name = "V_DEVUELTAS")
    protected double vdevueltas;
    @XmlElement(name = "V_ENTRADASV")
    protected double ventradasv;
    @XmlElement(name = "V_TRASPASOE")
    protected double vtraspasoe;
    @XmlElement(name = "V_AJUSTEE")
    protected double vajustee;
    @XmlElement(name = "V_VENDIDAS")
    protected double vvendidas;
    @XmlElement(name = "V_DEVPROV")
    protected double vdevprov;
    @XmlElement(name = "V_SALIDASV")
    protected double vsalidasv;
    @XmlElement(name = "V_TRASPASOS")
    protected double vtraspasos;
    @XmlElement(name = "V_AJUSTES")
    protected double vajustes;
    @XmlElement(name = "U_COSTO")
    protected double ucosto;

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
     * Obtiene el valor de la propiedad tscmpl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCMPL() {
        return tscmpl;
    }

    /**
     * Define el valor de la propiedad tscmpl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCMPL(String value) {
        this.tscmpl = value;
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
     * Obtiene el valor de la propiedad usaldoini.
     * 
     */
    public double getUSALDOINI() {
        return usaldoini;
    }

    /**
     * Define el valor de la propiedad usaldoini.
     * 
     */
    public void setUSALDOINI(double value) {
        this.usaldoini = value;
    }

    /**
     * Obtiene el valor de la propiedad ucompras.
     * 
     */
    public double getUCOMPRAS() {
        return ucompras;
    }

    /**
     * Define el valor de la propiedad ucompras.
     * 
     */
    public void setUCOMPRAS(double value) {
        this.ucompras = value;
    }

    /**
     * Obtiene el valor de la propiedad udevueltas.
     * 
     */
    public double getUDEVUELTAS() {
        return udevueltas;
    }

    /**
     * Define el valor de la propiedad udevueltas.
     * 
     */
    public void setUDEVUELTAS(double value) {
        this.udevueltas = value;
    }

    /**
     * Obtiene el valor de la propiedad uentradasv.
     * 
     */
    public double getUENTRADASV() {
        return uentradasv;
    }

    /**
     * Define el valor de la propiedad uentradasv.
     * 
     */
    public void setUENTRADASV(double value) {
        this.uentradasv = value;
    }

    /**
     * Obtiene el valor de la propiedad utraspasoe.
     * 
     */
    public double getUTRASPASOE() {
        return utraspasoe;
    }

    /**
     * Define el valor de la propiedad utraspasoe.
     * 
     */
    public void setUTRASPASOE(double value) {
        this.utraspasoe = value;
    }

    /**
     * Obtiene el valor de la propiedad uajustee.
     * 
     */
    public double getUAJUSTEE() {
        return uajustee;
    }

    /**
     * Define el valor de la propiedad uajustee.
     * 
     */
    public void setUAJUSTEE(double value) {
        this.uajustee = value;
    }

    /**
     * Obtiene el valor de la propiedad uvendidas.
     * 
     */
    public double getUVENDIDAS() {
        return uvendidas;
    }

    /**
     * Define el valor de la propiedad uvendidas.
     * 
     */
    public void setUVENDIDAS(double value) {
        this.uvendidas = value;
    }

    /**
     * Obtiene el valor de la propiedad udevprov.
     * 
     */
    public double getUDEVPROV() {
        return udevprov;
    }

    /**
     * Define el valor de la propiedad udevprov.
     * 
     */
    public void setUDEVPROV(double value) {
        this.udevprov = value;
    }

    /**
     * Obtiene el valor de la propiedad usalidasv.
     * 
     */
    public double getUSALIDASV() {
        return usalidasv;
    }

    /**
     * Define el valor de la propiedad usalidasv.
     * 
     */
    public void setUSALIDASV(double value) {
        this.usalidasv = value;
    }

    /**
     * Obtiene el valor de la propiedad uajustes.
     * 
     */
    public double getUAJUSTES() {
        return uajustes;
    }

    /**
     * Define el valor de la propiedad uajustes.
     * 
     */
    public void setUAJUSTES(double value) {
        this.uajustes = value;
    }

    /**
     * Obtiene el valor de la propiedad utraspasos.
     * 
     */
    public double getUTRASPASOS() {
        return utraspasos;
    }

    /**
     * Define el valor de la propiedad utraspasos.
     * 
     */
    public void setUTRASPASOS(double value) {
        this.utraspasos = value;
    }

    /**
     * Obtiene el valor de la propiedad uventadia.
     * 
     */
    public double getUVENTADIA() {
        return uventadia;
    }

    /**
     * Define el valor de la propiedad uventadia.
     * 
     */
    public void setUVENTADIA(double value) {
        this.uventadia = value;
    }

    /**
     * Obtiene el valor de la propiedad vsaldoini.
     * 
     */
    public double getVSALDOINI() {
        return vsaldoini;
    }

    /**
     * Define el valor de la propiedad vsaldoini.
     * 
     */
    public void setVSALDOINI(double value) {
        this.vsaldoini = value;
    }

    /**
     * Obtiene el valor de la propiedad vcompras.
     * 
     */
    public double getVCOMPRAS() {
        return vcompras;
    }

    /**
     * Define el valor de la propiedad vcompras.
     * 
     */
    public void setVCOMPRAS(double value) {
        this.vcompras = value;
    }

    /**
     * Obtiene el valor de la propiedad vdevueltas.
     * 
     */
    public double getVDEVUELTAS() {
        return vdevueltas;
    }

    /**
     * Define el valor de la propiedad vdevueltas.
     * 
     */
    public void setVDEVUELTAS(double value) {
        this.vdevueltas = value;
    }

    /**
     * Obtiene el valor de la propiedad ventradasv.
     * 
     */
    public double getVENTRADASV() {
        return ventradasv;
    }

    /**
     * Define el valor de la propiedad ventradasv.
     * 
     */
    public void setVENTRADASV(double value) {
        this.ventradasv = value;
    }

    /**
     * Obtiene el valor de la propiedad vtraspasoe.
     * 
     */
    public double getVTRASPASOE() {
        return vtraspasoe;
    }

    /**
     * Define el valor de la propiedad vtraspasoe.
     * 
     */
    public void setVTRASPASOE(double value) {
        this.vtraspasoe = value;
    }

    /**
     * Obtiene el valor de la propiedad vajustee.
     * 
     */
    public double getVAJUSTEE() {
        return vajustee;
    }

    /**
     * Define el valor de la propiedad vajustee.
     * 
     */
    public void setVAJUSTEE(double value) {
        this.vajustee = value;
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
     * Obtiene el valor de la propiedad vdevprov.
     * 
     */
    public double getVDEVPROV() {
        return vdevprov;
    }

    /**
     * Define el valor de la propiedad vdevprov.
     * 
     */
    public void setVDEVPROV(double value) {
        this.vdevprov = value;
    }

    /**
     * Obtiene el valor de la propiedad vsalidasv.
     * 
     */
    public double getVSALIDASV() {
        return vsalidasv;
    }

    /**
     * Define el valor de la propiedad vsalidasv.
     * 
     */
    public void setVSALIDASV(double value) {
        this.vsalidasv = value;
    }

    /**
     * Obtiene el valor de la propiedad vtraspasos.
     * 
     */
    public double getVTRASPASOS() {
        return vtraspasos;
    }

    /**
     * Define el valor de la propiedad vtraspasos.
     * 
     */
    public void setVTRASPASOS(double value) {
        this.vtraspasos = value;
    }

    /**
     * Obtiene el valor de la propiedad vajustes.
     * 
     */
    public double getVAJUSTES() {
        return vajustes;
    }

    /**
     * Define el valor de la propiedad vajustes.
     * 
     */
    public void setVAJUSTES(double value) {
        this.vajustes = value;
    }

    /**
     * Obtiene el valor de la propiedad ucosto.
     * 
     */
    public double getUCOSTO() {
        return ucosto;
    }

    /**
     * Define el valor de la propiedad ucosto.
     * 
     */
    public void setUCOSTO(double value) {
        this.ucosto = value;
    }

}
