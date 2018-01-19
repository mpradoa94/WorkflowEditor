
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retailStoreGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retailStoreGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STRGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_STRGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retailStoreGroup", propOrder = {
    "idstrgrp",
    "nmstrgrp"
})
public class RetailStoreGroup {

    @XmlElement(name = "ID_STRGRP")
    protected int idstrgrp;
    @XmlElement(name = "NM_STRGRP")
    protected String nmstrgrp;

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

}
