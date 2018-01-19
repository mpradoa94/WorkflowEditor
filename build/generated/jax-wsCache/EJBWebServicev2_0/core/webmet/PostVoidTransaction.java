
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para postVoidTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="postVoidTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_WS_V" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_DY_BSN_V" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AI_TRN_V" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postVoidTransaction", propOrder = {
    "idwsv",
    "dcdybsnv",
    "aitrnv"
})
public class PostVoidTransaction {

    @XmlElement(name = "ID_WS_V")
    protected int idwsv;
    @XmlElement(name = "DC_DY_BSN_V")
    protected String dcdybsnv;
    @XmlElement(name = "AI_TRN_V")
    protected int aitrnv;

    /**
     * Obtiene el valor de la propiedad idwsv.
     * 
     */
    public int getIDWSV() {
        return idwsv;
    }

    /**
     * Define el valor de la propiedad idwsv.
     * 
     */
    public void setIDWSV(int value) {
        this.idwsv = value;
    }

    /**
     * Obtiene el valor de la propiedad dcdybsnv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDYBSNV() {
        return dcdybsnv;
    }

    /**
     * Define el valor de la propiedad dcdybsnv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDYBSNV(String value) {
        this.dcdybsnv = value;
    }

    /**
     * Obtiene el valor de la propiedad aitrnv.
     * 
     */
    public int getAITRNV() {
        return aitrnv;
    }

    /**
     * Define el valor de la propiedad aitrnv.
     * 
     */
    public void setAITRNV(int value) {
        this.aitrnv = value;
    }

}
