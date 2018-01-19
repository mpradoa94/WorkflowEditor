
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para allHandHeldItemResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="allHandHeldItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaArticulos" type="{http://Webmet.core/}handHeldItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allHandHeldItemResponse", propOrder = {
    "listaArticulos"
})
public class AllHandHeldItemResponse {

    @XmlElement(nillable = true)
    protected List<HandHeldItem> listaArticulos;

    /**
     * Gets the value of the listaArticulos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaArticulos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaArticulos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandHeldItem }
     * 
     * 
     */
    public List<HandHeldItem> getListaArticulos() {
        if (listaArticulos == null) {
            listaArticulos = new ArrayList<HandHeldItem>();
        }
        return this.listaArticulos;
    }

}
