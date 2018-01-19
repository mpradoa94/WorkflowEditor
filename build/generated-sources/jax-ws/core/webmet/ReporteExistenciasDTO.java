
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteExistenciasDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteExistenciasDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gRUPO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gRUPO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gRUPO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nM_STRGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nM_ORGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iD_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dE_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sALDOINI" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="eNTRADAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cOMPRAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tRANSPASOE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="aJUSTEE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sALIDAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vENTAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tRANSPASOS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="aJUSTES" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="iNVENTARIO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cOSTO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tOTALCOSTO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dEVUELTAS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteExistenciasDTO", propOrder = {
    "grupo1",
    "grupo2",
    "grupo3",
    "nmstrgrp",
    "nmorgn",
    "iditmps",
    "deitm",
    "saldoini",
    "entradas",
    "compras",
    "transpasoe",
    "ajustee",
    "te",
    "salidas",
    "ventas",
    "transpasos",
    "ajustes",
    "ts",
    "inventario",
    "costo",
    "totalcosto",
    "devueltas"
})
public class ReporteExistenciasDTO {

    @XmlElement(name = "gRUPO1")
    protected String grupo1;
    @XmlElement(name = "gRUPO2")
    protected String grupo2;
    @XmlElement(name = "gRUPO3")
    protected String grupo3;
    @XmlElement(name = "nM_STRGRP")
    protected String nmstrgrp;
    @XmlElement(name = "nM_ORGN")
    protected String nmorgn;
    @XmlElement(name = "iD_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "dE_ITM")
    protected String deitm;
    @XmlElement(name = "sALDOINI")
    protected double saldoini;
    @XmlElement(name = "eNTRADAS")
    protected double entradas;
    @XmlElement(name = "cOMPRAS")
    protected double compras;
    @XmlElement(name = "tRANSPASOE")
    protected double transpasoe;
    @XmlElement(name = "aJUSTEE")
    protected double ajustee;
    @XmlElement(name = "tE")
    protected double te;
    @XmlElement(name = "sALIDAS")
    protected double salidas;
    @XmlElement(name = "vENTAS")
    protected double ventas;
    @XmlElement(name = "tRANSPASOS")
    protected double transpasos;
    @XmlElement(name = "aJUSTES")
    protected double ajustes;
    @XmlElement(name = "tS")
    protected double ts;
    @XmlElement(name = "iNVENTARIO")
    protected double inventario;
    @XmlElement(name = "cOSTO")
    protected double costo;
    @XmlElement(name = "tOTALCOSTO")
    protected double totalcosto;
    @XmlElement(name = "dEVUELTAS")
    protected double devueltas;

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
     * Obtiene el valor de la propiedad grupo2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUPO2() {
        return grupo2;
    }

    /**
     * Define el valor de la propiedad grupo2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUPO2(String value) {
        this.grupo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad grupo3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUPO3() {
        return grupo3;
    }

    /**
     * Define el valor de la propiedad grupo3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUPO3(String value) {
        this.grupo3 = value;
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
     * Obtiene el valor de la propiedad saldoini.
     * 
     */
    public double getSALDOINI() {
        return saldoini;
    }

    /**
     * Define el valor de la propiedad saldoini.
     * 
     */
    public void setSALDOINI(double value) {
        this.saldoini = value;
    }

    /**
     * Obtiene el valor de la propiedad entradas.
     * 
     */
    public double getENTRADAS() {
        return entradas;
    }

    /**
     * Define el valor de la propiedad entradas.
     * 
     */
    public void setENTRADAS(double value) {
        this.entradas = value;
    }

    /**
     * Obtiene el valor de la propiedad compras.
     * 
     */
    public double getCOMPRAS() {
        return compras;
    }

    /**
     * Define el valor de la propiedad compras.
     * 
     */
    public void setCOMPRAS(double value) {
        this.compras = value;
    }

    /**
     * Obtiene el valor de la propiedad transpasoe.
     * 
     */
    public double getTRANSPASOE() {
        return transpasoe;
    }

    /**
     * Define el valor de la propiedad transpasoe.
     * 
     */
    public void setTRANSPASOE(double value) {
        this.transpasoe = value;
    }

    /**
     * Obtiene el valor de la propiedad ajustee.
     * 
     */
    public double getAJUSTEE() {
        return ajustee;
    }

    /**
     * Define el valor de la propiedad ajustee.
     * 
     */
    public void setAJUSTEE(double value) {
        this.ajustee = value;
    }

    /**
     * Obtiene el valor de la propiedad te.
     * 
     */
    public double getTE() {
        return te;
    }

    /**
     * Define el valor de la propiedad te.
     * 
     */
    public void setTE(double value) {
        this.te = value;
    }

    /**
     * Obtiene el valor de la propiedad salidas.
     * 
     */
    public double getSALIDAS() {
        return salidas;
    }

    /**
     * Define el valor de la propiedad salidas.
     * 
     */
    public void setSALIDAS(double value) {
        this.salidas = value;
    }

    /**
     * Obtiene el valor de la propiedad ventas.
     * 
     */
    public double getVENTAS() {
        return ventas;
    }

    /**
     * Define el valor de la propiedad ventas.
     * 
     */
    public void setVENTAS(double value) {
        this.ventas = value;
    }

    /**
     * Obtiene el valor de la propiedad transpasos.
     * 
     */
    public double getTRANSPASOS() {
        return transpasos;
    }

    /**
     * Define el valor de la propiedad transpasos.
     * 
     */
    public void setTRANSPASOS(double value) {
        this.transpasos = value;
    }

    /**
     * Obtiene el valor de la propiedad ajustes.
     * 
     */
    public double getAJUSTES() {
        return ajustes;
    }

    /**
     * Define el valor de la propiedad ajustes.
     * 
     */
    public void setAJUSTES(double value) {
        this.ajustes = value;
    }

    /**
     * Obtiene el valor de la propiedad ts.
     * 
     */
    public double getTS() {
        return ts;
    }

    /**
     * Define el valor de la propiedad ts.
     * 
     */
    public void setTS(double value) {
        this.ts = value;
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
     * Obtiene el valor de la propiedad costo.
     * 
     */
    public double getCOSTO() {
        return costo;
    }

    /**
     * Define el valor de la propiedad costo.
     * 
     */
    public void setCOSTO(double value) {
        this.costo = value;
    }

    /**
     * Obtiene el valor de la propiedad totalcosto.
     * 
     */
    public double getTOTALCOSTO() {
        return totalcosto;
    }

    /**
     * Define el valor de la propiedad totalcosto.
     * 
     */
    public void setTOTALCOSTO(double value) {
        this.totalcosto = value;
    }

    /**
     * Obtiene el valor de la propiedad devueltas.
     * 
     */
    public double getDEVUELTAS() {
        return devueltas;
    }

    /**
     * Define el valor de la propiedad devueltas.
     * 
     */
    public void setDEVUELTAS(double value) {
        this.devueltas = value;
    }

}
