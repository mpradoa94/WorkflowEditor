
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para corte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="corte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WriteControlTransaction" type="{http://Webmet.core/}writeControlTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corte", propOrder = {
    "writeControlTransaction"
})
public class Corte {

    @XmlElement(name = "WriteControlTransaction")
    protected WriteControlTransaction writeControlTransaction;

    /**
     * Obtiene el valor de la propiedad writeControlTransaction.
     * 
     * @return
     *     possible object is
     *     {@link WriteControlTransaction }
     *     
     */
    public WriteControlTransaction getWriteControlTransaction() {
        return writeControlTransaction;
    }

    /**
     * Define el valor de la propiedad writeControlTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteControlTransaction }
     *     
     */
    public void setWriteControlTransaction(WriteControlTransaction value) {
        this.writeControlTransaction = value;
    }

}
