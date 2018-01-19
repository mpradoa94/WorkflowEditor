
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emailAddress complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emailAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PARTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EM_ADS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailAddress", propOrder = {
    "idparty",
    "emads"
})
public class EmailAddress {

    @XmlElement(name = "ID_PARTY")
    protected int idparty;
    @XmlElement(name = "EM_ADS")
    protected String emads;

    /**
     * Obtiene el valor de la propiedad idparty.
     * 
     */
    public int getIDPARTY() {
        return idparty;
    }

    /**
     * Define el valor de la propiedad idparty.
     * 
     */
    public void setIDPARTY(int value) {
        this.idparty = value;
    }

    /**
     * Obtiene el valor de la propiedad emads.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMADS() {
        return emads;
    }

    /**
     * Define el valor de la propiedad emads.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMADS(String value) {
        this.emads = value;
    }

}
