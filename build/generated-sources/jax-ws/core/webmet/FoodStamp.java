
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para foodStamp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="foodStamp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SELL_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CANTIDAD" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTALFOODSTAMP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foodStamp", propOrder = {
    "dcdybsn",
    "iditmps",
    "nmitm",
    "sellprice",
    "cantidad",
    "total",
    "totalfoodstamp"
})
public class FoodStamp {

    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "SELL_PRICE")
    protected double sellprice;
    @XmlElement(name = "CANTIDAD")
    protected double cantidad;
    @XmlElement(name = "TOTAL")
    protected double total;
    @XmlElement(name = "TOTALFOODSTAMP")
    protected double totalfoodstamp;

    /**
     * Obtiene el valor de la propiedad dcdybsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDYBSN() {
        return dcdybsn;
    }

    /**
     * Define el valor de la propiedad dcdybsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDYBSN(String value) {
        this.dcdybsn = value;
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

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCANTIDAD() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCANTIDAD(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTOTAL() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTOTAL(double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad totalfoodstamp.
     * 
     */
    public double getTOTALFOODSTAMP() {
        return totalfoodstamp;
    }

    /**
     * Define el valor de la propiedad totalfoodstamp.
     * 
     */
    public void setTOTALFOODSTAMP(double value) {
        this.totalfoodstamp = value;
    }

}
