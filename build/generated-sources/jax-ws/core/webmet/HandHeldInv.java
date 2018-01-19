
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para handHeldInv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="handHeldInv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handHeldInv", propOrder = {
    "idcb",
    "nom",
    "tax",
    "cant"
})
public class HandHeldInv {

    @XmlElement(name = "ID_CB")
    protected String idcb;
    @XmlElement(name = "Nom")
    protected String nom;
    @XmlElement(name = "Tax")
    protected String tax;
    @XmlElement(name = "Cant")
    protected String cant;

    /**
     * Obtiene el valor de la propiedad idcb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCB() {
        return idcb;
    }

    /**
     * Define el valor de la propiedad idcb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCB(String value) {
        this.idcb = value;
    }

    /**
     * Obtiene el valor de la propiedad nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Define el valor de la propiedad nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtiene el valor de la propiedad tax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * Define el valor de la propiedad tax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Obtiene el valor de la propiedad cant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCant() {
        return cant;
    }

    /**
     * Define el valor de la propiedad cant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCant(String value) {
        this.cant = value;
    }

}
