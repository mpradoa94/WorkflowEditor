
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para posIdentity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="posIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS_QFR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STRGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_STRGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_SL_PRC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PREP_CC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QU_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="preciotienda" type="{http://Webmet.core/}precioTienda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posIdentity", propOrder = {
    "iditmps",
    "iditmpsqfr",
    "idstrgrp",
    "nmstrgrp",
    "iditmslprc",
    "iditm",
    "idprepcc",
    "quitm",
    "preciotienda"
})
public class PosIdentity {

    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "ID_ITM_PS_QFR")
    protected int iditmpsqfr;
    @XmlElement(name = "ID_STRGRP")
    protected int idstrgrp;
    @XmlElement(name = "NM_STRGRP")
    protected String nmstrgrp;
    @XmlElement(name = "ID_ITM_SL_PRC")
    protected int iditmslprc;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_PREP_CC")
    protected int idprepcc;
    @XmlElement(name = "QU_ITM")
    protected int quitm;
    protected PrecioTienda preciotienda;

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
     * Obtiene el valor de la propiedad iditmpsqfr.
     * 
     */
    public int getIDITMPSQFR() {
        return iditmpsqfr;
    }

    /**
     * Define el valor de la propiedad iditmpsqfr.
     * 
     */
    public void setIDITMPSQFR(int value) {
        this.iditmpsqfr = value;
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
     * Obtiene el valor de la propiedad iditmslprc.
     * 
     */
    public int getIDITMSLPRC() {
        return iditmslprc;
    }

    /**
     * Define el valor de la propiedad iditmslprc.
     * 
     */
    public void setIDITMSLPRC(int value) {
        this.iditmslprc = value;
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
     * Obtiene el valor de la propiedad idprepcc.
     * 
     */
    public int getIDPREPCC() {
        return idprepcc;
    }

    /**
     * Define el valor de la propiedad idprepcc.
     * 
     */
    public void setIDPREPCC(int value) {
        this.idprepcc = value;
    }

    /**
     * Obtiene el valor de la propiedad quitm.
     * 
     */
    public int getQUITM() {
        return quitm;
    }

    /**
     * Define el valor de la propiedad quitm.
     * 
     */
    public void setQUITM(int value) {
        this.quitm = value;
    }

    /**
     * Obtiene el valor de la propiedad preciotienda.
     * 
     * @return
     *     possible object is
     *     {@link PrecioTienda }
     *     
     */
    public PrecioTienda getPreciotienda() {
        return preciotienda;
    }

    /**
     * Define el valor de la propiedad preciotienda.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecioTienda }
     *     
     */
    public void setPreciotienda(PrecioTienda value) {
        this.preciotienda = value;
    }

}
