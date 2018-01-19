
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_UOMW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_UOMW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UOM" type="{http://Webmet.core/}abcUOM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_UOMW", propOrder = {
    "uom"
})
public class ABCUOMW {

    @XmlElement(name = "UOM")
    protected AbcUOM uom;

    /**
     * Obtiene el valor de la propiedad uom.
     * 
     * @return
     *     possible object is
     *     {@link AbcUOM }
     *     
     */
    public AbcUOM getUOM() {
        return uom;
    }

    /**
     * Define el valor de la propiedad uom.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcUOM }
     *     
     */
    public void setUOM(AbcUOM value) {
        this.uom = value;
    }

}
