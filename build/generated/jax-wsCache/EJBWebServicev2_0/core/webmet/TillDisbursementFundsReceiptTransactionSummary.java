
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tillDisbursementFundsReceiptTransactionSummary complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tillDisbursementFundsReceiptTransactionSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RCV_DSB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RCV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_TND_CTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MO_RCV" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tillDisbursementFundsReceiptTransactionSummary", propOrder = {
    "idrcvdsb",
    "tyrcv",
    "tytndctl",
    "morcv"
})
public class TillDisbursementFundsReceiptTransactionSummary {

    @XmlElement(name = "ID_RCV_DSB")
    protected int idrcvdsb;
    @XmlElement(name = "TY_RCV")
    protected String tyrcv;
    @XmlElement(name = "TY_TND_CTL")
    protected String tytndctl;
    @XmlElement(name = "MO_RCV")
    protected float morcv;

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

    /**
     * Obtiene el valor de la propiedad tytndctl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTNDCTL() {
        return tytndctl;
    }

    /**
     * Define el valor de la propiedad tytndctl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTNDCTL(String value) {
        this.tytndctl = value;
    }

    /**
     * Obtiene el valor de la propiedad morcv.
     * 
     */
    public float getMORCV() {
        return morcv;
    }

    /**
     * Define el valor de la propiedad morcv.
     * 
     */
    public void setMORCV(float value) {
        this.morcv = value;
    }

}
