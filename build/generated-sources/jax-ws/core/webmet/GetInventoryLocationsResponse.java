
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getInventoryLocationsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getInventoryLocationsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="inventory" type="{http://Webmet.core/}inventoryLocation" minOccurs="0"/>
 *         &lt;element name="listlocations" type="{http://Webmet.core/}inventoryLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInventoryLocationsResponse", propOrder = {
    "resultado",
    "inventory",
    "listlocations"
})
public class GetInventoryLocationsResponse {

    protected Resultado resultado;
    protected InventoryLocation inventory;
    @XmlElement(nillable = true)
    protected List<InventoryLocation> listlocations;

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
     * Obtiene el valor de la propiedad inventory.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocation }
     *     
     */
    public InventoryLocation getInventory() {
        return inventory;
    }

    /**
     * Define el valor de la propiedad inventory.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocation }
     *     
     */
    public void setInventory(InventoryLocation value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the listlocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listlocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListlocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryLocation }
     * 
     * 
     */
    public List<InventoryLocation> getListlocations() {
        if (listlocations == null) {
            listlocations = new ArrayList<InventoryLocation>();
        }
        return this.listlocations;
    }

}
