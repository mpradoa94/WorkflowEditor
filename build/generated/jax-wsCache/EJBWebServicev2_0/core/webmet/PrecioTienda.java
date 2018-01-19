
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para precioTienda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="precioTienda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM_SL_PRC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ISP" type="{http://Webmet.core/}itemSellPrice" minOccurs="0"/>
 *         &lt;element name="rs" type="{http://Webmet.core/}retailStore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "precioTienda", propOrder = {
    "iditmps",
    "idstrrt",
    "iditmslprc",
    "isp",
    "rs"
})
public class PrecioTienda {

    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_ITM_SL_PRC")
    protected int iditmslprc;
    @XmlElement(name = "ISP")
    protected ItemSellPrice isp;
    protected RetailStore rs;

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
     * Obtiene el valor de la propiedad iditmslprc.
     * 
     */
    public int getIDITMSLPRC() {
        return iditmslprc;
    }

    /**
     * Define el valor de la propiedad iditmslprc.
     * 
     */
    public void setIDITMSLPRC(int value) {
        this.iditmslprc = value;
    }

    /**
     * Obtiene el valor de la propiedad isp.
     * 
     * @return
     *     possible object is
     *     {@link ItemSellPrice }
     *     
     */
    public ItemSellPrice getISP() {
        return isp;
    }

    /**
     * Define el valor de la propiedad isp.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSellPrice }
     *     
     */
    public void setISP(ItemSellPrice value) {
        this.isp = value;
    }

    /**
     * Obtiene el valor de la propiedad rs.
     * 
     * @return
     *     possible object is
     *     {@link RetailStore }
     *     
     */
    public RetailStore getRs() {
        return rs;
    }

    /**
     * Define el valor de la propiedad rs.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStore }
     *     
     */
    public void setRs(RetailStore value) {
        this.rs = value;
    }

}
