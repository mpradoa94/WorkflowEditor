
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para writeControlTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="writeControlTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ControlTransaction" type="{http://Webmet.core/}controlTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writeControlTransaction", propOrder = {
    "controlTransaction"
})
public class WriteControlTransaction {

    @XmlElement(name = "ControlTransaction")
    protected ControlTransaction controlTransaction;

    /**
     * Obtiene el valor de la propiedad controlTransaction.
     * 
     * @return
     *     possible object is
     *     {@link ControlTransaction }
     *     
     */
    public ControlTransaction getControlTransaction() {
        return controlTransaction;
    }

    /**
     * Define el valor de la propiedad controlTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlTransaction }
     *     
     */
    public void setControlTransaction(ControlTransaction value) {
        this.controlTransaction = value;
    }

}
