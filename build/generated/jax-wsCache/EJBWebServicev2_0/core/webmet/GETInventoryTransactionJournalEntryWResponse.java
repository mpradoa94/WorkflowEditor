
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_InventoryTransactionJournalEntryWResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_InventoryTransactionJournalEntryWResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Webmet.core/}getInventoryTransactionJournalEntryResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_InventoryTransactionJournalEntryWResponse", propOrder = {
    "_return"
})
public class GETInventoryTransactionJournalEntryWResponse {

    @XmlElement(name = "return")
    protected GetInventoryTransactionJournalEntryResponse _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryTransactionJournalEntryResponse }
     *     
     */
    public GetInventoryTransactionJournalEntryResponse getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryTransactionJournalEntryResponse }
     *     
     */
    public void setReturn(GetInventoryTransactionJournalEntryResponse value) {
        this._return = value;
    }

}
