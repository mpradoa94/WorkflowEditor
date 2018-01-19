
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para geTusersRolResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="geTusersRolResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="user_rol" type="{http://Webmet.core/}usersRol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operadores" type="{http://Webmet.core/}operator" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geTusersRolResponse", propOrder = {
    "resultado",
    "userRol",
    "operadores"
})
public class GeTusersRolResponse {

    protected Resultado resultado;
    @XmlElement(name = "user_rol", nillable = true)
    protected List<UsersRol> userRol;
    @XmlElement(nillable = true)
    protected List<Operator> operadores;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the userRol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsersRol }
     * 
     * 
     */
    public List<UsersRol> getUserRol() {
        if (userRol == null) {
            userRol = new ArrayList<UsersRol>();
        }
        return this.userRol;
    }

    /**
     * Gets the value of the operadores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operadores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperadores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operator }
     * 
     * 
     */
    public List<Operator> getOperadores() {
        if (operadores == null) {
            operadores = new ArrayList<Operator>();
        }
        return this.operadores;
    }

}
