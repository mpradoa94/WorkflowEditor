
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_InventoryTransactionJournalEntryW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_InventoryTransactionJournalEntryW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itje" type="{http://Webmet.core/}getInventoryTransactionJournalEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_InventoryTransactionJournalEntryW", propOrder = {
    "itje"
})
public class GETInventoryTransactionJournalEntryW {

    protected GetInventoryTransactionJournalEntry itje;

    /**
     * Obtiene el valor de la propiedad itje.
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryTransactionJournalEntry }
     *     
     */
    public GetInventoryTransactionJournalEntry getItje() {
        return itje;
    }

    /**
     * Define el valor de la propiedad itje.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryTransactionJournalEntry }
     *     
     */
    public void setItje(GetInventoryTransactionJournalEntry value) {
        this.itje = value;
    }

}
