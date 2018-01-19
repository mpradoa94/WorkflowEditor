
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preciosCHDOC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preciosCHDOC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DCTO_PR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_DCTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_STRGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MNF" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PE_AJUSTE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PE_VARMG" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TY_CH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_EV_PREC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_EV_REV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pchl" type="{http://Webmet.core/}preciosCHLINEA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preciosCHDOC", propOrder = {
    "iddctopr",
    "tydcto",
    "idstrgrp",
    "iditm",
    "idbrn",
    "idspr",
    "idmnf",
    "idmrhrcgp",
    "peajuste",
    "pevarmg",
    "tych",
    "idevprec",
    "idevrev",
    "pchl"
})
public class PreciosCHDOC {

    @XmlElement(name = "ID_DCTO_PR")
    protected int iddctopr;
    @XmlElement(name = "TY_DCTO")
    protected String tydcto;
    @XmlElement(name = "ID_STRGRP")
    protected int idstrgrp;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_BRN")
    protected int idbrn;
    @XmlElement(name = "ID_SPR")
    protected int idspr;
    @XmlElement(name = "ID_MNF")
    protected int idmnf;
    @XmlElement(name = "ID_MRHRC_GP")
    protected int idmrhrcgp;
    @XmlElement(name = "PE_AJUSTE")
    protected double peajuste;
    @XmlElement(name = "PE_VARMG")
    protected double pevarmg;
    @XmlElement(name = "TY_CH")
    protected String tych;
    @XmlElement(name = "ID_EV_PREC")
    protected int idevprec;
    @XmlElement(name = "ID_EV_REV")
    protected int idevrev;
    @XmlElement(nillable = true)
    protected List<PreciosCHLINEA> pchl;

    /**
     * Obtiene el valor de la propiedad iddctopr.
     * 
     */
    public int getIDDCTOPR() {
        return iddctopr;
    }

    /**
     * Define el valor de la propiedad iddctopr.
     * 
     */
    public void setIDDCTOPR(int value) {
        this.iddctopr = value;
    }

    /**
     * Obtiene el valor de la propiedad tydcto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYDCTO() {
        return tydcto;
    }

    /**
     * Define el valor de la propiedad tydcto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYDCTO(String value) {
        this.tydcto = value;
    }

    /**
     * Obtiene el valor de la propiedad idstrgrp.
     * 
     */
    public int getIDSTRGRP() {
        return idstrgrp;
    }

    /**
     * Define el valor de la propiedad idstrgrp.
     * 
     */
    public void setIDSTRGRP(int value) {
        this.idstrgrp = value;
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
     * Obtiene el valor de la propiedad idbrn.
     * 
     */
    public int getIDBRN() {
        return idbrn;
    }

    /**
     * Define el valor de la propiedad idbrn.
     * 
     */
    public void setIDBRN(int value) {
        this.idbrn = value;
    }

    /**
     * Obtiene el valor de la propiedad idspr.
     * 
     */
    public int getIDSPR() {
        return idspr;
    }

    /**
     * Define el valor de la propiedad idspr.
     * 
     */
    public void setIDSPR(int value) {
        this.idspr = value;
    }

    /**
     * Obtiene el valor de la propiedad idmnf.
     * 
     */
    public int getIDMNF() {
        return idmnf;
    }

    /**
     * Define el valor de la propiedad idmnf.
     * 
     */
    public void setIDMNF(int value) {
        this.idmnf = value;
    }

    /**
     * Obtiene el valor de la propiedad idmrhrcgp.
     * 
     */
    public int getIDMRHRCGP() {
        return idmrhrcgp;
    }

    /**
     * Define el valor de la propiedad idmrhrcgp.
     * 
     */
    public void setIDMRHRCGP(int value) {
        this.idmrhrcgp = value;
    }

    /**
     * Obtiene el valor de la propiedad peajuste.
     * 
     */
    public double getPEAJUSTE() {
        return peajuste;
    }

    /**
     * Define el valor de la propiedad peajuste.
     * 
     */
    public void setPEAJUSTE(double value) {
        this.peajuste = value;
    }

    /**
     * Obtiene el valor de la propiedad pevarmg.
     * 
     */
    public double getPEVARMG() {
        return pevarmg;
    }

    /**
     * Define el valor de la propiedad pevarmg.
     * 
     */
    public void setPEVARMG(double value) {
        this.pevarmg = value;
    }

    /**
     * Obtiene el valor de la propiedad tych.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYCH() {
        return tych;
    }

    /**
     * Define el valor de la propiedad tych.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYCH(String value) {
        this.tych = value;
    }

    /**
     * Obtiene el valor de la propiedad idevprec.
     * 
     */
    public int getIDEVPREC() {
        return idevprec;
    }

    /**
     * Define el valor de la propiedad idevprec.
     * 
     */
    public void setIDEVPREC(int value) {
        this.idevprec = value;
    }

    /**
     * Obtiene el valor de la propiedad idevrev.
     * 
     */
    public int getIDEVREV() {
        return idevrev;
    }

    /**
     * Define el valor de la propiedad idevrev.
     * 
     */
    public void setIDEVREV(int value) {
        this.idevrev = value;
    }

    /**
     * Gets the value of the pchl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pchl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPchl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreciosCHLINEA }
     * 
     * 
     */
    public List<PreciosCHLINEA> getPchl() {
        if (pchl == null) {
            pchl = new ArrayList<PreciosCHLINEA>();
        }
        return this.pchl;
    }

}
