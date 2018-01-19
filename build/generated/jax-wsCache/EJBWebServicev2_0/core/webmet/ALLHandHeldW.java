
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ALL_HandHeldW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ALL_HandHeldW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idStrgrp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idInst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALL_HandHeldW", propOrder = {
    "idStrgrp",
    "idInst"
})
public class ALLHandHeldW {

    protected int idStrgrp;
    protected int idInst;

    /**
     * Obtiene el valor de la propiedad idStrgrp.
     * 
     */
    public int getIdStrgrp() {
        return idStrgrp;
    }

    /**
     * Define el valor de la propiedad idStrgrp.
     * 
     */
    public void setIdStrgrp(int value) {
        this.idStrgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad idInst.
     * 
     */
    public int getIdInst() {
        return idInst;
    }

    /**
     * Define el valor de la propiedad idInst.
     * 
     */
    public void setIdInst(int value) {
        this.idInst = value;
    }

}
