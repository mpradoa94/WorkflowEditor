
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_ContratosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_ContratosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABCZ" type="{http://Webmet.core/}abcContratos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_ContratosW", propOrder = {
    "abcz"
})
public class ABCContratosW {

    @XmlElement(name = "ABCZ")
    protected AbcContratos abcz;

    /**
     * Obtiene el valor de la propiedad abcz.
     * 
     * @return
     *     possible object is
     *     {@link AbcContratos }
     *     
     */
    public AbcContratos getABCZ() {
        return abcz;
    }

    /**
     * Define el valor de la propiedad abcz.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcContratos }
     *     
     */
    public void setABCZ(AbcContratos value) {
        this.abcz = value;
    }

}
