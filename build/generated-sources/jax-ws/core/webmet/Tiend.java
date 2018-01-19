
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tiend complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tiend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_STR_RT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GIRO_TIENDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_EMP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PROP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiend", propOrder = {
    "idstrrt",
    "nmstrrt",
    "girotienda",
    "idemp",
    "idprop"
})
public class Tiend {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "NM_STR_RT")
    protected String nmstrrt;
    @XmlElement(name = "GIRO_TIENDA")
    protected String girotienda;
    @XmlElement(name = "ID_EMP")
    protected int idemp;
    @XmlElement(name = "ID_PROP")
    protected int idprop;

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
     * Obtiene el valor de la propiedad nmstrrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSTRRT() {
        return nmstrrt;
    }

    /**
     * Define el valor de la propiedad nmstrrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSTRRT(String value) {
        this.nmstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad girotienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIROTIENDA() {
        return girotienda;
    }

    /**
     * Define el valor de la propiedad girotienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIROTIENDA(String value) {
        this.girotienda = value;
    }

    /**
     * Obtiene el valor de la propiedad idemp.
     * 
     */
    public int getIDEMP() {
        return idemp;
    }

    /**
     * Define el valor de la propiedad idemp.
     * 
     */
    public void setIDEMP(int value) {
        this.idemp = value;
    }

    /**
     * Obtiene el valor de la propiedad idprop.
     * 
     */
    public int getIDPROP() {
        return idprop;
    }

    /**
     * Define el valor de la propiedad idprop.
     * 
     */
    public void setIDPROP(int value) {
        this.idprop = value;
    }

}
