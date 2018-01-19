
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchSupplier complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchSupplier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_SPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NMORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchSupplier", propOrder = {
    "idinstancia",
    "nmspr",
    "nmorg"
})
public class SearchSupplier {

    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;
    @XmlElement(name = "NM_SPR")
    protected String nmspr;
    @XmlElement(name = "NMORG")
    protected String nmorg;

    /**
     * Obtiene el valor de la propiedad idinstancia.
     * 
     */
    public int getIDINSTANCIA() {
        return idinstancia;
    }

    /**
     * Define el valor de la propiedad idinstancia.
     * 
     */
    public void setIDINSTANCIA(int value) {
        this.idinstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad nmspr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSPR() {
        return nmspr;
    }

    /**
     * Define el valor de la propiedad nmspr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSPR(String value) {
        this.nmspr = value;
    }

    /**
     * Obtiene el valor de la propiedad nmorg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMORG() {
        return nmorg;
    }

    /**
     * Define el valor de la propiedad nmorg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMORG(String value) {
        this.nmorg = value;
    }

}
