
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para unitOfMesure complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="unitOfMesure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LU_UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitOfMesure", propOrder = {
    "luuom",
    "nmuom"
})
public class UnitOfMesure {

    @XmlElement(name = "LU_UOM")
    protected String luuom;
    @XmlElement(name = "NM_UOM")
    protected String nmuom;

    /**
     * Obtiene el valor de la propiedad luuom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLUUOM() {
        return luuom;
    }

    /**
     * Define el valor de la propiedad luuom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLUUOM(String value) {
        this.luuom = value;
    }

    /**
     * Obtiene el valor de la propiedad nmuom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMUOM() {
        return nmuom;
    }

    /**
     * Define el valor de la propiedad nmuom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMUOM(String value) {
        this.nmuom = value;
    }

}
