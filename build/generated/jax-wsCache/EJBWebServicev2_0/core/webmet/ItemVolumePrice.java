
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemVolumePrice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemVolumePrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_SL_PRC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_LN_PRC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MIN_QTY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MAX_QTY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemVolumePrice", propOrder = {
    "iditmslprc",
    "ailnprc",
    "price",
    "minqty",
    "maxqty"
})
public class ItemVolumePrice {

    @XmlElement(name = "ID_ITM_SL_PRC")
    protected int iditmslprc;
    @XmlElement(name = "AI_LN_PRC")
    protected int ailnprc;
    @XmlElement(name = "PRICE")
    protected double price;
    @XmlElement(name = "MIN_QTY")
    protected double minqty;
    @XmlElement(name = "MAX_QTY")
    protected double maxqty;

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
     * Obtiene el valor de la propiedad ailnprc.
     * 
     */
    public int getAILNPRC() {
        return ailnprc;
    }

    /**
     * Define el valor de la propiedad ailnprc.
     * 
     */
    public void setAILNPRC(int value) {
        this.ailnprc = value;
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
     * Obtiene el valor de la propiedad minqty.
     * 
     */
    public double getMINQTY() {
        return minqty;
    }

    /**
     * Define el valor de la propiedad minqty.
     * 
     */
    public void setMINQTY(double value) {
        this.minqty = value;
    }

    /**
     * Obtiene el valor de la propiedad maxqty.
     * 
     */
    public double getMAXQTY() {
        return maxqty;
    }

    /**
     * Define el valor de la propiedad maxqty.
     * 
     */
    public void setMAXQTY(double value) {
        this.maxqty = value;
    }

}
