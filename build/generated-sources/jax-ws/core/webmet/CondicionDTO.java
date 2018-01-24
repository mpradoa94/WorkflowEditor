
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para condicionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="condicionDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condicion" type="{http://Webmet.core/}condicionDTO"/>
 *         &lt;element name="comparative" type="{http://Webmet.core/}comparativeDTO"/>
 *         &lt;element name="comparative2" type="{http://Webmet.core/}comparative2DTO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "condicionDTO", propOrder = {
    "condicion",
    "comparative",
    "comparative2"
})
public class CondicionDTO {

    @XmlElement(required = true)
    protected CondicionDTO condicion;
    @XmlElement(required = true)
    protected ComparativeDTO comparative;
    @XmlElement(required = true)
    protected List<Comparative2DTO> comparative2;

    /**
     * Obtiene el valor de la propiedad condicion.
     * 
     * @return
     *     possible object is
     *     {@link CondicionDTO }
     *     
     */
    public CondicionDTO getCondicion() {
        return condicion;
    }

    /**
     * Define el valor de la propiedad condicion.
     * 
     * @param value
     *     allowed object is
     *     {@link CondicionDTO }
     *     
     */
    public void setCondicion(CondicionDTO value) {
        this.condicion = value;
    }

    /**
     * Obtiene el valor de la propiedad comparative.
     * 
     * @return
     *     possible object is
     *     {@link ComparativeDTO }
     *     
     */
    public ComparativeDTO getComparative() {
        return comparative;
    }

    /**
     * Define el valor de la propiedad comparative.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparativeDTO }
     *     
     */
    public void setComparative(ComparativeDTO value) {
        this.comparative = value;
    }

    /**
     * Gets the value of the comparative2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparative2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparative2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comparative2DTO }
     * 
     * 
     */
    public List<Comparative2DTO> getComparative2() {
        if (comparative2 == null) {
            comparative2 = new ArrayList<Comparative2DTO>();
        }
        return this.comparative2;
    }

}
