
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para handHeldItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="handHeldItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_GP_TX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="COUNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SELL_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handHeldItem", propOrder = {
    "iditmps",
    "nmitm",
    "idgptx",
    "count",
    "sellprice"
})
public class HandHeldItem {

    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "ID_GP_TX")
    protected int idgptx;
    @XmlElement(name = "COUNT")
    protected int count;
    @XmlElement(name = "SELL_PRICE")
    protected double sellprice;

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
     * Obtiene el valor de la propiedad nmitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMITM() {
        return nmitm;
    }

    /**
     * Define el valor de la propiedad nmitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMITM(String value) {
        this.nmitm = value;
    }

    /**
     * Obtiene el valor de la propiedad idgptx.
     * 
     */
    public int getIDGPTX() {
        return idgptx;
    }

    /**
     * Define el valor de la propiedad idgptx.
     * 
     */
    public void setIDGPTX(int value) {
        this.idgptx = value;
    }

    /**
     * Obtiene el valor de la propiedad count.
     * 
     */
    public int getCOUNT() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     */
    public void setCOUNT(int value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad sellprice.
     * 
     */
    public double getSELLPRICE() {
        return sellprice;
    }

    /**
     * Define el valor de la propiedad sellprice.
     * 
     */
    public void setSELLPRICE(double value) {
        this.sellprice = value;
    }

}
