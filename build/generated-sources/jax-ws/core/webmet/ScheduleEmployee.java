
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para scheduleEmployee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="scheduleEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_SC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_EM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MORNINGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MORNINGOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOUNCHIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOUNCHOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVENINGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVENINGOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleEmployee", propOrder = {
    "idsc",
    "idem",
    "morningin",
    "morningout",
    "lounchin",
    "lounchout",
    "eveningin",
    "eveningout",
    "day"
})
public class ScheduleEmployee {

    @XmlElement(name = "ID_SC")
    protected int idsc;
    @XmlElement(name = "ID_EM")
    protected int idem;
    @XmlElement(name = "MORNINGIN")
    protected String morningin;
    @XmlElement(name = "MORNINGOUT")
    protected String morningout;
    @XmlElement(name = "LOUNCHIN")
    protected String lounchin;
    @XmlElement(name = "LOUNCHOUT")
    protected String lounchout;
    @XmlElement(name = "EVENINGIN")
    protected String eveningin;
    @XmlElement(name = "EVENINGOUT")
    protected String eveningout;
    @XmlElement(name = "DAY")
    protected String day;

    /**
     * Obtiene el valor de la propiedad idsc.
     * 
     */
    public int getIDSC() {
        return idsc;
    }

    /**
     * Define el valor de la propiedad idsc.
     * 
     */
    public void setIDSC(int value) {
        this.idsc = value;
    }

    /**
     * Obtiene el valor de la propiedad idem.
     * 
     */
    public int getIDEM() {
        return idem;
    }

    /**
     * Define el valor de la propiedad idem.
     * 
     */
    public void setIDEM(int value) {
        this.idem = value;
    }

    /**
     * Obtiene el valor de la propiedad morningin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMORNINGIN() {
        return morningin;
    }

    /**
     * Define el valor de la propiedad morningin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMORNINGIN(String value) {
        this.morningin = value;
    }

    /**
     * Obtiene el valor de la propiedad morningout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMORNINGOUT() {
        return morningout;
    }

    /**
     * Define el valor de la propiedad morningout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMORNINGOUT(String value) {
        this.morningout = value;
    }

    /**
     * Obtiene el valor de la propiedad lounchin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOUNCHIN() {
        return lounchin;
    }

    /**
     * Define el valor de la propiedad lounchin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOUNCHIN(String value) {
        this.lounchin = value;
    }

    /**
     * Obtiene el valor de la propiedad lounchout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOUNCHOUT() {
        return lounchout;
    }

    /**
     * Define el valor de la propiedad lounchout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOUNCHOUT(String value) {
        this.lounchout = value;
    }

    /**
     * Obtiene el valor de la propiedad eveningin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENINGIN() {
        return eveningin;
    }

    /**
     * Define el valor de la propiedad eveningin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENINGIN(String value) {
        this.eveningin = value;
    }

    /**
     * Obtiene el valor de la propiedad eveningout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENINGOUT() {
        return eveningout;
    }

    /**
     * Define el valor de la propiedad eveningout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENINGOUT(String value) {
        this.eveningout = value;
    }

    /**
     * Obtiene el valor de la propiedad day.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAY() {
        return day;
    }

    /**
     * Define el valor de la propiedad day.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAY(String value) {
        this.day = value;
    }

}
