
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAcceso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAcceso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CTAC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LNG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaActual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAcceso", propOrder = {
    "idInstancia",
    "idctac",
    "idct",
    "idlng",
    "user",
    "password",
    "fechaActual"
})
public class GetAcceso {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_CTAC")
    protected int idctac;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "ID_LNG")
    protected int idlng;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String fechaActual;

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
     * Obtiene el valor de la propiedad idctac.
     * 
     */
    public int getIDCTAC() {
        return idctac;
    }

    /**
     * Define el valor de la propiedad idctac.
     * 
     */
    public void setIDCTAC(int value) {
        this.idctac = value;
    }

    /**
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
    }

    /**
     * Obtiene el valor de la propiedad idlng.
     * 
     */
    public int getIDLNG() {
        return idlng;
    }

    /**
     * Define el valor de la propiedad idlng.
     * 
     */
    public void setIDLNG(int value) {
        this.idlng = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActual() {
        return fechaActual;
    }

    /**
     * Define el valor de la propiedad fechaActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActual(String value) {
        this.fechaActual = value;
    }

}
