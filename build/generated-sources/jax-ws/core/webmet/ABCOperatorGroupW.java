
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_OperatorGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_OperatorGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opg" type="{http://Webmet.core/}abcOperatorGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_OperatorGroupW", propOrder = {
    "opg"
})
public class ABCOperatorGroupW {

    protected AbcOperatorGroup opg;

    /**
     * Obtiene el valor de la propiedad opg.
     * 
     * @return
     *     possible object is
     *     {@link AbcOperatorGroup }
     *     
     */
    public AbcOperatorGroup getOpg() {
        return opg;
    }

    /**
     * Define el valor de la propiedad opg.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcOperatorGroup }
     *     
     */
    public void setOpg(AbcOperatorGroup value) {
        this.opg = value;
    }

}
