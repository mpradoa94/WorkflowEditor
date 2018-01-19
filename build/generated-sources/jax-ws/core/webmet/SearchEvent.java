
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchEvent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_ev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ty_ev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchEvent", propOrder = {
    "idInstancia",
    "nmEv",
    "tyEv"
})
public class SearchEvent {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "nm_ev", required = true)
    protected String nmEv;
    @XmlElement(name = "ty_ev", required = true)
    protected String tyEv;

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
     * Obtiene el valor de la propiedad nmEv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmEv() {
        return nmEv;
    }

    /**
     * Define el valor de la propiedad nmEv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmEv(String value) {
        this.nmEv = value;
    }

    /**
     * Obtiene el valor de la propiedad tyEv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyEv() {
        return tyEv;
    }

    /**
     * Define el valor de la propiedad tyEv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyEv(String value) {
        this.tyEv = value;
    }

}
