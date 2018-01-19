
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getDisbursementFundsReceiptReasonResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getDisbursementFundsReceiptReasonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="cg" type="{http://Webmet.core/}disbursementFundsReceiptReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDisbursementFundsReceiptReasonResponse", propOrder = {
    "resultado",
    "cg"
})
public class GetDisbursementFundsReceiptReasonResponse {

    protected Resultado resultado;
    protected DisbursementFundsReceiptReason cg;

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
     * Obtiene el valor de la propiedad cg.
     * 
     * @return
     *     possible object is
     *     {@link DisbursementFundsReceiptReason }
     *     
     */
    public DisbursementFundsReceiptReason getCg() {
        return cg;
    }

    /**
     * Define el valor de la propiedad cg.
     * 
     * @param value
     *     allowed object is
     *     {@link DisbursementFundsReceiptReason }
     *     
     */
    public void setCg(DisbursementFundsReceiptReason value) {
        this.cg = value;
    }

}
