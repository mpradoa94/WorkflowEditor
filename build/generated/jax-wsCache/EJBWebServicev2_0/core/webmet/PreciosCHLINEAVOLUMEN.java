
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preciosCHLINEAVOLUMEN complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preciosCHLINEAVOLUMEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DCTO_PR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DCTO_PR_LN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_LN_PRC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NPRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preciosCHLINEAVOLUMEN", propOrder = {
    "iddctopr",
    "iddctoprln",
    "ailnprc",
    "price",
    "nprice"
})
public class PreciosCHLINEAVOLUMEN {

    @XmlElement(name = "ID_DCTO_PR")
    protected int iddctopr;
    @XmlElement(name = "ID_DCTO_PR_LN")
    protected int iddctoprln;
    @XmlElement(name = "AI_LN_PRC")
    protected int ailnprc;
    @XmlElement(name = "PRICE")
    protected double price;
    @XmlElement(name = "NPRICE")
    protected double nprice;

    /**
     * Obtiene el valor de la propiedad iddctopr.
     * 
     */
    public int getIDDCTOPR() {
        return iddctopr;
    }

    /**
     * Define el valor de la propiedad iddctopr.
     * 
     */
    public void setIDDCTOPR(int value) {
        this.iddctopr = value;
    }

    /**
     * Obtiene el valor de la propiedad iddctoprln.
     * 
     */
    public int getIDDCTOPRLN() {
        return iddctoprln;
    }

    /**
     * Define el valor de la propiedad iddctoprln.
     * 
     */
    public void setIDDCTOPRLN(int value) {
        this.iddctoprln = value;
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
     * Obtiene el valor de la propiedad nprice.
     * 
     */
    public double getNPRICE() {
        return nprice;
    }

    /**
     * Define el valor de la propiedad nprice.
     * 
     */
    public void setNPRICE(double value) {
        this.nprice = value;
    }

}
