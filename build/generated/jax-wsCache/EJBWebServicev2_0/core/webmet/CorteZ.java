
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para corteZ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="corteZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="corte" type="{http://Webmet.core/}corte" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corteZ", propOrder = {
    "inst",
    "corte"
})
public class CorteZ {

    protected int inst;
    @XmlElement(nillable = true)
    protected List<Corte> corte;

    /**
     * Obtiene el valor de la propiedad inst.
     * 
     */
    public int getInst() {
        return inst;
    }

    /**
     * Define el valor de la propiedad inst.
     * 
     */
    public void setInst(int value) {
        this.inst = value;
    }

    /**
     * Gets the value of the corte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Corte }
     * 
     * 
     */
    public List<Corte> getCorte() {
        if (corte == null) {
            corte = new ArrayList<Corte>();
        }
        return this.corte;
    }

}
