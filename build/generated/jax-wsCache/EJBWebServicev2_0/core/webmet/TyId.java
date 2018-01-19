
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tyId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tyId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tyId", propOrder = {
    "tyid",
    "nmid"
})
public class TyId {

    @XmlElement(name = "TY_ID")
    protected String tyid;
    @XmlElement(name = "NM_ID")
    protected String nmid;

    /**
     * Obtiene el valor de la propiedad tyid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYID() {
        return tyid;
    }

    /**
     * Define el valor de la propiedad tyid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYID(String value) {
        this.tyid = value;
    }

    /**
     * Obtiene el valor de la propiedad nmid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMID() {
        return nmid;
    }

    /**
     * Define el valor de la propiedad nmid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMID(String value) {
        this.nmid = value;
    }

}
