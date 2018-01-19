
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buttonTemp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buttonTemp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_BTN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_BTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buttonTemp", propOrder = {
    "idbtn",
    "nmbtn"
})
public class ButtonTemp {

    @XmlElement(name = "ID_BTN")
    protected int idbtn;
    @XmlElement(name = "NM_BTN")
    protected String nmbtn;

    /**
     * Obtiene el valor de la propiedad idbtn.
     * 
     */
    public int getIDBTN() {
        return idbtn;
    }

    /**
     * Define el valor de la propiedad idbtn.
     * 
     */
    public void setIDBTN(int value) {
        this.idbtn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmbtn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMBTN() {
        return nmbtn;
    }

    /**
     * Define el valor de la propiedad nmbtn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMBTN(String value) {
        this.nmbtn = value;
    }

}
