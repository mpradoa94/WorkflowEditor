
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Get_UOMW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Get_UOMW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UOM" type="{http://Webmet.core/}getUOM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_UOMW", propOrder = {
    "uom"
})
public class GetUOMW {

    @XmlElement(name = "UOM")
    protected GetUOM uom;

    /**
     * Obtiene el valor de la propiedad uom.
     * 
     * @return
     *     possible object is
     *     {@link GetUOM }
     *     
     */
    public GetUOM getUOM() {
        return uom;
    }

    /**
     * Define el valor de la propiedad uom.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUOM }
     *     
     */
    public void setUOM(GetUOM value) {
        this.uom = value;
    }

}
