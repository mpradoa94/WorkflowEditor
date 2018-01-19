
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFormatosFiltro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFormatosFiltro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_USER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tyUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminados" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormatosFiltro", propOrder = {
    "idInstancia",
    "iduser",
    "tyUser",
    "terminados",
    "nombre"
})
public class GetFormatosFiltro {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_USER")
    protected int iduser;
    @XmlElement(required = true)
    protected String tyUser;
    protected boolean terminados;
    @XmlElement(required = true)
    protected String nombre;

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
     * Obtiene el valor de la propiedad tyUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyUser() {
        return tyUser;
    }

    /**
     * Define el valor de la propiedad tyUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyUser(String value) {
        this.tyUser = value;
    }

    /**
     * Obtiene el valor de la propiedad terminados.
     * 
     */
    public boolean isTerminados() {
        return terminados;
    }

    /**
     * Define el valor de la propiedad terminados.
     * 
     */
    public void setTerminados(boolean value) {
        this.terminados = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
