
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRetailStoreGroupItemResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRetailStoreGroupItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="retailStore" type="{http://Webmet.core/}retailStoreGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ret1" type="{http://Webmet.core/}retailStoreGroupItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRetailStoreGroupItemResponse", propOrder = {
    "resultado",
    "retailStore",
    "ret1"
})
public class GetRetailStoreGroupItemResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<RetailStoreGroupItem> retailStore;
    protected RetailStoreGroupItem ret1;

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
     * Gets the value of the retailStore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailStore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailStore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailStoreGroupItem }
     * 
     * 
     */
    public List<RetailStoreGroupItem> getRetailStore() {
        if (retailStore == null) {
            retailStore = new ArrayList<RetailStoreGroupItem>();
        }
        return this.retailStore;
    }

    /**
     * Obtiene el valor de la propiedad ret1.
     * 
     * @return
     *     possible object is
     *     {@link RetailStoreGroupItem }
     *     
     */
    public RetailStoreGroupItem getRet1() {
        return ret1;
    }

    /**
     * Define el valor de la propiedad ret1.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStoreGroupItem }
     *     
     */
    public void setRet1(RetailStoreGroupItem value) {
        this.ret1 = value;
    }

}
