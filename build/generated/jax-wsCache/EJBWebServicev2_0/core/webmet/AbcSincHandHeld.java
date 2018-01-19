
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcSincHandHeld complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcSincHandHeld">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="listInv" type="{http://Webmet.core/}handHeldInv" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcSincHandHeld", propOrder = {
    "instancia",
    "listInv"
})
public class AbcSincHandHeld {

    protected int instancia;
    @XmlElement(required = true)
    protected List<HandHeldInv> listInv;

    /**
     * Obtiene el valor de la propiedad instancia.
     * 
     */
    public int getInstancia() {
        return instancia;
    }

    /**
     * Define el valor de la propiedad instancia.
     * 
     */
    public void setInstancia(int value) {
        this.instancia = value;
    }

    /**
     * Gets the value of the listInv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listInv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListInv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandHeldInv }
     * 
     * 
     */
    public List<HandHeldInv> getListInv() {
        if (listInv == null) {
            listInv = new ArrayList<HandHeldInv>();
        }
        return this.listInv;
    }

}
