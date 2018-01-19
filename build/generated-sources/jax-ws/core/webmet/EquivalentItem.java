
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para equivalentItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="equivalentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM_EQUIV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equivalentItem", propOrder = {
    "iditm",
    "iditmequiv",
    "location",
    "nmItem"
})
public class EquivalentItem {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_ITM_EQUIV")
    protected int iditmequiv;
    @XmlElement(name = "LOCATION")
    protected String location;
    protected String nmItem;

    /**
     * Obtiene el valor de la propiedad iditm.
     * 
     */
    public int getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     */
    public void setIDITM(int value) {
        this.iditm = value;
    }

    /**
     * Obtiene el valor de la propiedad iditmequiv.
     * 
     */
    public int getIDITMEQUIV() {
        return iditmequiv;
    }

    /**
     * Define el valor de la propiedad iditmequiv.
     * 
     */
    public void setIDITMEQUIV(int value) {
        this.iditmequiv = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATION() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATION(String value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad nmItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmItem() {
        return nmItem;
    }

    /**
     * Define el valor de la propiedad nmItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmItem(String value) {
        this.nmItem = value;
    }

}
