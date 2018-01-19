
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcUsersRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcUsersRol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userrol" type="{http://Webmet.core/}usersRol"/>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcUsersRol", propOrder = {
    "idInstancia",
    "userrol",
    "operacion"
})
public class AbcUsersRol {

    @XmlElement(name = "Id_instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected UsersRol userrol;
    @XmlElement(required = true)
    protected String operacion;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad userrol.
     * 
     * @return
     *     possible object is
     *     {@link UsersRol }
     *     
     */
    public UsersRol getUserrol() {
        return userrol;
    }

    /**
     * Define el valor de la propiedad userrol.
     * 
     * @param value
     *     allowed object is
     *     {@link UsersRol }
     *     
     */
    public void setUserrol(UsersRol value) {
        this.userrol = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

}
