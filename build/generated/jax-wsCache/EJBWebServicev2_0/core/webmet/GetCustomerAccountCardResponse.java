
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCustomerAccountCardResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCustomerAccountCardResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="cards" type="{http://Webmet.core/}customerAccountCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://Webmet.core/}customer2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerAccountCardResponse", propOrder = {
    "resultado",
    "cards",
    "customer"
})
public class GetCustomerAccountCardResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<CustomerAccountCard> cards;
    protected Customer2 customer;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the cards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccountCard }
     * 
     * 
     */
    public List<CustomerAccountCard> getCards() {
        if (cards == null) {
            cards = new ArrayList<CustomerAccountCard>();
        }
        return this.cards;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link Customer2 }
     *     
     */
    public Customer2 getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer2 }
     *     
     */
    public void setCustomer(Customer2 value) {
        this.customer = value;
    }

}
