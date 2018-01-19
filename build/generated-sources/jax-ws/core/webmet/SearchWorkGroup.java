
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchWorkGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchWorkGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_USERGROUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchWorkGroup", propOrder = {
    "idInstancia",
    "deusergroup"
})
public class SearchWorkGroup {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "DE_USERGROUP", required = true)
    protected String deusergroup;

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
     * Obtiene el valor de la propiedad deusergroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEUSERGROUP() {
        return deusergroup;
    }

    /**
     * Define el valor de la propiedad deusergroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEUSERGROUP(String value) {
        this.deusergroup = value;
    }

}
