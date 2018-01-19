
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStockLedgerAccountResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getStockLedgerAccountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="STA" type="{http://Webmet.core/}stockLedgerAccount" minOccurs="0"/>
 *         &lt;element name="ventadia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStockLedgerAccountResponse", propOrder = {
    "resultado",
    "sta",
    "ventadia"
})
public class GetStockLedgerAccountResponse {

    protected Resultado resultado;
    @XmlElement(name = "STA")
    protected StockLedgerAccount sta;
    protected double ventadia;

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
     * Obtiene el valor de la propiedad sta.
     * 
     * @return
     *     possible object is
     *     {@link StockLedgerAccount }
     *     
     */
    public StockLedgerAccount getSTA() {
        return sta;
    }

    /**
     * Define el valor de la propiedad sta.
     * 
     * @param value
     *     allowed object is
     *     {@link StockLedgerAccount }
     *     
     */
    public void setSTA(StockLedgerAccount value) {
        this.sta = value;
    }

    /**
     * Obtiene el valor de la propiedad ventadia.
     * 
     */
    public double getVentadia() {
        return ventadia;
    }

    /**
     * Define el valor de la propiedad ventadia.
     * 
     */
    public void setVentadia(double value) {
        this.ventadia = value;
    }

}
