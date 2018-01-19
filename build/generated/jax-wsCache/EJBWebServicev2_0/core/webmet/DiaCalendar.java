
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para diaCalendar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="diaCalendar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hrarioH" type="{http://Webmet.core/}horarioHabil" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="citas" type="{http://Webmet.core/}agenda1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diaCalendar", propOrder = {
    "dia",
    "color",
    "hrarioH",
    "citas"
})
public class DiaCalendar {

    protected int dia;
    protected String color;
    @XmlElement(nillable = true)
    protected List<HorarioHabil> hrarioH;
    @XmlElement(nillable = true)
    protected List<Agenda1> citas;

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     */
    public int getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     */
    public void setDia(int value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the hrarioH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hrarioH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHrarioH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorarioHabil }
     * 
     * 
     */
    public List<HorarioHabil> getHrarioH() {
        if (hrarioH == null) {
            hrarioH = new ArrayList<HorarioHabil>();
        }
        return this.hrarioH;
    }

    /**
     * Gets the value of the citas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agenda1 }
     * 
     * 
     */
    public List<Agenda1> getCitas() {
        if (citas == null) {
            citas = new ArrayList<Agenda1>();
        }
        return this.citas;
    }

}
