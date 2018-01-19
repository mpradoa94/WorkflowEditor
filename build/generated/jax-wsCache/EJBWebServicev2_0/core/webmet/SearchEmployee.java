
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchEmployee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apeP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apeM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchEmployee", propOrder = {
    "idInstancia",
    "name",
    "apeP",
    "apeM"
})
public class SearchEmployee {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    protected String name;
    protected String apeP;
    protected String apeM;

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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad apeP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeP() {
        return apeP;
    }

    /**
     * Define el valor de la propiedad apeP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeP(String value) {
        this.apeP = value;
    }

    /**
     * Obtiene el valor de la propiedad apeM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeM() {
        return apeM;
    }

    /**
     * Define el valor de la propiedad apeM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeM(String value) {
        this.apeM = value;
    }

}
