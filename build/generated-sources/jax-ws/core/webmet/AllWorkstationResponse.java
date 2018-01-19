
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para allWorkstationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="allWorkstationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaWorkstation" type="{http://Webmet.core/}workstation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allWorkstationResponse", propOrder = {
    "listaWorkstation"
})
public class AllWorkstationResponse {

    @XmlElement(nillable = true)
    protected List<Workstation> listaWorkstation;

    /**
     * Gets the value of the listaWorkstation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaWorkstation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaWorkstation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Workstation }
     * 
     * 
     */
    public List<Workstation> getListaWorkstation() {
        if (listaWorkstation == null) {
            listaWorkstation = new ArrayList<Workstation>();
        }
        return this.listaWorkstation;
    }

}
