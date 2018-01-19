
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para controlTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="controlTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction" type="{http://Webmet.core/}transaction" minOccurs="0"/>
 *         &lt;element name="TY_TRN_CTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostVoidTransaction" type="{http://Webmet.core/}postVoidTransaction" minOccurs="0"/>
 *         &lt;element name="TillSettlementTransaction" type="{http://Webmet.core/}tillSettlementTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlTransaction", propOrder = {
    "transaction",
    "tytrnctl",
    "postVoidTransaction",
    "tillSettlementTransaction"
})
public class ControlTransaction {

    @XmlElement(name = "Transaction")
    protected Transaction transaction;
    @XmlElement(name = "TY_TRN_CTL")
    protected String tytrnctl;
    @XmlElement(name = "PostVoidTransaction")
    protected PostVoidTransaction postVoidTransaction;
    @XmlElement(name = "TillSettlementTransaction")
    protected TillSettlementTransaction tillSettlementTransaction;

    /**
     * Obtiene el valor de la propiedad transaction.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Define el valor de la propiedad transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
        this.transaction = value;
    }

    /**
     * Obtiene el valor de la propiedad tytrnctl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTRNCTL() {
        return tytrnctl;
    }

    /**
     * Define el valor de la propiedad tytrnctl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTRNCTL(String value) {
        this.tytrnctl = value;
    }

    /**
     * Obtiene el valor de la propiedad postVoidTransaction.
     * 
     * @return
     *     possible object is
     *     {@link PostVoidTransaction }
     *     
     */
    public PostVoidTransaction getPostVoidTransaction() {
        return postVoidTransaction;
    }

    /**
     * Define el valor de la propiedad postVoidTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link PostVoidTransaction }
     *     
     */
    public void setPostVoidTransaction(PostVoidTransaction value) {
        this.postVoidTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad tillSettlementTransaction.
     * 
     * @return
     *     possible object is
     *     {@link TillSettlementTransaction }
     *     
     */
    public TillSettlementTransaction getTillSettlementTransaction() {
        return tillSettlementTransaction;
    }

    /**
     * Define el valor de la propiedad tillSettlementTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link TillSettlementTransaction }
     *     
     */
    public void setTillSettlementTransaction(TillSettlementTransaction value) {
        this.tillSettlementTransaction = value;
    }

}
