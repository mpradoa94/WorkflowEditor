
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SET_Organization complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SET_Organization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rst" type="{http://Webmet.core/}abcOrganization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SET_Organization", propOrder = {
    "rst"
})
public class SETOrganization {

    protected AbcOrganization rst;

    /**
     * Obtiene el valor de la propiedad rst.
     * 
     * @return
     *     possible object is
     *     {@link AbcOrganization }
     *     
     */
    public AbcOrganization getRst() {
        return rst;
    }

    /**
     * Define el valor de la propiedad rst.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcOrganization }
     *     
     */
    public void setRst(AbcOrganization value) {
        this.rst = value;
    }

}
