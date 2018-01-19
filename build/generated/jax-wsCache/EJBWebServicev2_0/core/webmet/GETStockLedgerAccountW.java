
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_StockLedgerAccountW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_StockLedgerAccountW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sla" type="{http://Webmet.core/}getStockLedgerAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_StockLedgerAccountW", propOrder = {
    "sla"
})
public class GETStockLedgerAccountW {

    protected GetStockLedgerAccount sla;

    /**
     * Obtiene el valor de la propiedad sla.
     * 
     * @return
     *     possible object is
     *     {@link GetStockLedgerAccount }
     *     
     */
    public GetStockLedgerAccount getSla() {
        return sla;
    }

    /**
     * Define el valor de la propiedad sla.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStockLedgerAccount }
     *     
     */
    public void setSla(GetStockLedgerAccount value) {
        this.sla = value;
    }

}
