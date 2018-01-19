
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para customer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ORGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_TX_IRGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_TX_FLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFC_TAXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direcciones" type="{http://Webmet.core/}customerAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "idct",
    "tyroprty",
    "idprty",
    "nmct",
    "nmorgn",
    "idtxirgn",
    "idtxfld",
    "rfctaxid",
    "direcciones"
})
public class Customer {

    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "NM_CT")
    protected String nmct;
    @XmlElement(name = "NM_ORGN")
    protected String nmorgn;
    @XmlElement(name = "ID_TX_IRGN")
    protected String idtxirgn;
    @XmlElement(name = "ID_TX_FLD")
    protected String idtxfld;
    @XmlElement(name = "RFC_TAXID")
    protected String rfctaxid;
    @XmlElement(nillable = true)
    protected List<CustomerAddress> direcciones;

    /**
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
    }

    /**
     * Obtiene el valor de la propiedad tyroprty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYROPRTY() {
        return tyroprty;
    }

    /**
     * Define el valor de la propiedad tyroprty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYROPRTY(String value) {
        this.tyroprty = value;
    }

    /**
     * Obtiene el valor de la propiedad idprty.
     * 
     */
    public int getIDPRTY() {
        return idprty;
    }

    /**
     * Define el valor de la propiedad idprty.
     * 
     */
    public void setIDPRTY(int value) {
        this.idprty = value;
    }

    /**
     * Obtiene el valor de la propiedad nmct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMCT() {
        return nmct;
    }

    /**
     * Define el valor de la propiedad nmct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMCT(String value) {
        this.nmct = value;
    }

    /**
     * Obtiene el valor de la propiedad nmorgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMORGN() {
        return nmorgn;
    }

    /**
     * Define el valor de la propiedad nmorgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMORGN(String value) {
        this.nmorgn = value;
    }

    /**
     * Obtiene el valor de la propiedad idtxirgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTXIRGN() {
        return idtxirgn;
    }

    /**
     * Define el valor de la propiedad idtxirgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTXIRGN(String value) {
        this.idtxirgn = value;
    }

    /**
     * Obtiene el valor de la propiedad idtxfld.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTXFLD() {
        return idtxfld;
    }

    /**
     * Define el valor de la propiedad idtxfld.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTXFLD(String value) {
        this.idtxfld = value;
    }

    /**
     * Obtiene el valor de la propiedad rfctaxid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCTAXID() {
        return rfctaxid;
    }

    /**
     * Define el valor de la propiedad rfctaxid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCTAXID(String value) {
        this.rfctaxid = value;
    }

    /**
     * Gets the value of the direcciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direcciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirecciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAddress }
     * 
     * 
     */
    public List<CustomerAddress> getDirecciones() {
        if (direcciones == null) {
            direcciones = new ArrayList<CustomerAddress>();
        }
        return this.direcciones;
    }

}
