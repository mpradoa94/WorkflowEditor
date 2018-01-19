
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemTmp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemTmp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS_QFR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STRGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemTmp", propOrder = {
    "iditm",
    "iditmps",
    "iditmpsqfr",
    "idstrgrp"
})
public class ItemTmp {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "ID_ITM_PS_QFR")
    protected int iditmpsqfr;
    @XmlElement(name = "ID_STRGRP")
    protected int idstrgrp;

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

}
