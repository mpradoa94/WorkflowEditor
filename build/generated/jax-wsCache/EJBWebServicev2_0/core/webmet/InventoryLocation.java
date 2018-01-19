
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inventoryLocation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inventoryLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_LCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailstore" type="{http://Webmet.core/}retailStore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventoryLocation", propOrder = {
    "idlcn",
    "idstrrt",
    "nmlcn",
    "retailstore"
})
public class InventoryLocation {

    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "NM_LCN")
    protected String nmlcn;
    protected RetailStore retailstore;

    /**
     * Obtiene el valor de la propiedad idlcn.
     * 
     */
    public int getIDLCN() {
        return idlcn;
    }

    /**
     * Define el valor de la propiedad idlcn.
     * 
     */
    public void setIDLCN(int value) {
        this.idlcn = value;
    }

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad nmlcn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMLCN() {
        return nmlcn;
    }

    /**
     * Define el valor de la propiedad nmlcn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMLCN(String value) {
        this.nmlcn = value;
    }

    /**
     * Obtiene el valor de la propiedad retailstore.
     * 
     * @return
     *     possible object is
     *     {@link RetailStore }
     *     
     */
    public RetailStore getRetailstore() {
        return retailstore;
    }

    /**
     * Define el valor de la propiedad retailstore.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStore }
     *     
     */
    public void setRetailstore(RetailStore value) {
        this.retailstore = value;
    }

}
