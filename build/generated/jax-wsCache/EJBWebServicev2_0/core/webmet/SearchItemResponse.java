
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchItemResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="itemlist" type="{http://Webmet.core/}item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemlistvj" type="{http://Webmet.core/}itemList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchItemResponse", propOrder = {
    "resultado",
    "itemlist",
    "itemlistvj",
    "max"
})
public class SearchItemResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<Item> itemlist;
    @XmlElement(nillable = true)
    protected List<ItemList> itemlistvj;
    protected int max;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the itemlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItemlist() {
        if (itemlist == null) {
            itemlist = new ArrayList<Item>();
        }
        return this.itemlist;
    }

    /**
     * Gets the value of the itemlistvj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemlistvj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemlistvj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemList }
     * 
     * 
     */
    public List<ItemList> getItemlistvj() {
        if (itemlistvj == null) {
            itemlistvj = new ArrayList<ItemList>();
        }
        return this.itemlistvj;
    }

    /**
     * Obtiene el valor de la propiedad max.
     * 
     */
    public int getMax() {
        return max;
    }

    /**
     * Define el valor de la propiedad max.
     * 
     */
    public void setMax(int value) {
        this.max = value;
    }

}
