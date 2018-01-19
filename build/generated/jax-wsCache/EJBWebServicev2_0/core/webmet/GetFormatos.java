
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFormatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFormatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_USER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TY_ROL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormatos", propOrder = {
    "idInstancia",
    "iduser",
    "tyuser",
    "tyrol"
})
public class GetFormatos {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_USER")
    protected int iduser;
    @XmlElement(name = "TY_USER", required = true)
    protected String tyuser;
    @XmlElement(name = "TY_ROL", required = true)
    protected String tyrol;

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
     * Obtiene el valor de la propiedad iduser.
     * 
     */
    public int getIDUSER() {
        return iduser;
    }

    /**
     * Define el valor de la propiedad iduser.
     * 
     */
    public void setIDUSER(int value) {
        this.iduser = value;
    }

    /**
     * Obtiene el valor de la propiedad tyuser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYUSER() {
        return tyuser;
    }

    /**
     * Define el valor de la propiedad tyuser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYUSER(String value) {
        this.tyuser = value;
    }

    /**
     * Obtiene el valor de la propiedad tyrol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYROL() {
        return tyrol;
    }

    /**
     * Define el valor de la propiedad tyrol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYROL(String value) {
        this.tyrol = value;
    }

}
