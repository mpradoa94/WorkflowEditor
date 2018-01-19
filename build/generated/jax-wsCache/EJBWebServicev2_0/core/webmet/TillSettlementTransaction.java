
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tillSettlementTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tillSettlementTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TillHistory" type="{http://Webmet.core/}tillHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tillSettlementTransaction", propOrder = {
    "tillHistory"
})
public class TillSettlementTransaction {

    @XmlElement(name = "TillHistory")
    protected TillHistory tillHistory;

    /**
     * Obtiene el valor de la propiedad tillHistory.
     * 
     * @return
     *     possible object is
     *     {@link TillHistory }
     *     
     */
    public TillHistory getTillHistory() {
        return tillHistory;
    }

    /**
     * Define el valor de la propiedad tillHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link TillHistory }
     *     
     */
    public void setTillHistory(TillHistory value) {
        this.tillHistory = value;
    }

}
