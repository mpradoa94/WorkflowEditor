
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retailStoreGroupRecipe complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retailStoreGroupRecipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_GRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RCPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_RCPE_EF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_RCPE_EP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PREP_CC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retailStoreGroupRecipe", propOrder = {
    "idstrgrp",
    "idrcpe",
    "dcrcpeef",
    "dcrcpeep",
    "idprepcc"
})
public class RetailStoreGroupRecipe {

    @XmlElement(name = "ID_STR_GRP")
    protected int idstrgrp;
    @XmlElement(name = "ID_RCPE")
    protected int idrcpe;
    @XmlElement(name = "DC_RCPE_EF")
    protected String dcrcpeef;
    @XmlElement(name = "DC_RCPE_EP")
    protected String dcrcpeep;
    @XmlElement(name = "ID_PREP_CC")
    protected int idprepcc;

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
     * Obtiene el valor de la propiedad idrcpe.
     * 
     */
    public int getIDRCPE() {
        return idrcpe;
    }

    /**
     * Define el valor de la propiedad idrcpe.
     * 
     */
    public void setIDRCPE(int value) {
        this.idrcpe = value;
    }

    /**
     * Obtiene el valor de la propiedad dcrcpeef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCRCPEEF() {
        return dcrcpeef;
    }

    /**
     * Define el valor de la propiedad dcrcpeef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCRCPEEF(String value) {
        this.dcrcpeef = value;
    }

    /**
     * Obtiene el valor de la propiedad dcrcpeep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCRCPEEP() {
        return dcrcpeep;
    }

    /**
     * Define el valor de la propiedad dcrcpeep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCRCPEEP(String value) {
        this.dcrcpeep = value;
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

}
