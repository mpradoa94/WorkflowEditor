
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchCustomer2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchCustomer2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CV_CT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCustomer2", propOrder = {
    "idInstancia",
    "nmcustomer",
    "cvct"
})
public class SearchCustomer2 {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "NM_CUSTOMER", required = true)
    protected String nmcustomer;
    @XmlElement(name = "CV_CT", required = true)
    protected String cvct;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad nmcustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMCUSTOMER() {
        return nmcustomer;
    }

    /**
     * Define el valor de la propiedad nmcustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMCUSTOMER(String value) {
        this.nmcustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad cvct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVCT() {
        return cvct;
    }

    /**
     * Define el valor de la propiedad cvct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVCT(String value) {
        this.cvct = value;
    }

}
