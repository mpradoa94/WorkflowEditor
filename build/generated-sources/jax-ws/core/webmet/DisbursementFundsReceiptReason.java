
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para disbursementFundsReceiptReason complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="disbursementFundsReceiptReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RCV_DSB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_RCV_DSB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_RCV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disbursementFundsReceiptReason", propOrder = {
    "idrcvdsb",
    "dercvdsb",
    "tyrcv"
})
public class DisbursementFundsReceiptReason {

    @XmlElement(name = "ID_RCV_DSB")
    protected int idrcvdsb;
    @XmlElement(name = "DE_RCV_DSB")
    protected String dercvdsb;
    @XmlElement(name = "TY_RCV")
    protected String tyrcv;

    /**
     * Obtiene el valor de la propiedad idrcvdsb.
     * 
     */
    public int getIDRCVDSB() {
        return idrcvdsb;
    }

    /**
     * Define el valor de la propiedad idrcvdsb.
     * 
     */
    public void setIDRCVDSB(int value) {
        this.idrcvdsb = value;
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

    /**
     * Obtiene el valor de la propiedad tyrcv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYRCV() {
        return tyrcv;
    }

    /**
     * Define el valor de la propiedad tyrcv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYRCV(String value) {
        this.tyrcv = value;
    }

}
