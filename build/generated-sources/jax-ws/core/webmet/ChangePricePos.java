
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para changePricePos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="changePricePos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS_QFR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="inst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loghead" type="{http://Webmet.core/}logHead" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePricePos", propOrder = {
    "idstrrt",
    "iditmps",
    "iditmpsqfr",
    "price",
    "inst",
    "loghead"
})
public class ChangePricePos {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "ID_ITM_PS_QFR")
    protected int iditmpsqfr;
    @XmlElement(name = "PRICE")
    protected double price;
    protected int inst;
    protected LogHead loghead;

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDITMPS() {
        return iditmps;
    }

    /**
     * Define el valor de la propiedad iditmps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDITMPS(String value) {
        this.iditmps = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmpsqfr.
     * 
     */
    public int getIDITMPSQFR() {
        return iditmpsqfr;
    }

    /**
     * Define el valor de la propiedad iditmpsqfr.
     * 
     */
    public void setIDITMPSQFR(int value) {
        this.iditmpsqfr = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public double getPRICE() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPRICE(double value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad inst.
     * 
     */
    public int getInst() {
        return inst;
    }

    /**
     * Define el valor de la propiedad inst.
     * 
     */
    public void setInst(int value) {
        this.inst = value;
    }

    /**
     * Obtiene el valor de la propiedad loghead.
     * 
     * @return
     *     possible object is
     *     {@link LogHead }
     *     
     */
    public LogHead getLoghead() {
        return loghead;
    }

    /**
     * Define el valor de la propiedad loghead.
     * 
     * @param value
     *     allowed object is
     *     {@link LogHead }
     *     
     */
    public void setLoghead(LogHead value) {
        this.loghead = value;
    }

}
