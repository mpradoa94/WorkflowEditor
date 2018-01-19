
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchDisbursementFundsReceiptReason complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchDisbursementFundsReceiptReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_RCV_DSB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDisbursementFundsReceiptReason", propOrder = {
    "idInstancia",
    "dercvdsb"
})
public class SearchDisbursementFundsReceiptReason {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "DE_RCV_DSB", required = true)
    protected String dercvdsb;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad dercvdsb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDERCVDSB() {
        return dercvdsb;
    }

    /**
     * Define el valor de la propiedad dercvdsb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDERCVDSB(String value) {
        this.dercvdsb = value;
    }

}
