
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para externalUser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="externalUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_EXTU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="USER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_USR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externalUser", propOrder = {
    "idextu",
    "user",
    "pwd",
    "tyusr",
    "tytnd",
    "iditm"
})
public class ExternalUser {

    @XmlElement(name = "ID_EXTU")
    protected int idextu;
    @XmlElement(name = "USER")
    protected String user;
    @XmlElement(name = "PWD")
    protected String pwd;
    @XmlElement(name = "TY_USR")
    protected String tyusr;
    @XmlElement(name = "TY_TND")
    protected String tytnd;
    @XmlElement(name = "ID_ITM")
    protected int iditm;

    /**
     * Obtiene el valor de la propiedad idextu.
     * 
     */
    public int getIDEXTU() {
        return idextu;
    }

    /**
     * Define el valor de la propiedad idextu.
     * 
     */
    public void setIDEXTU(int value) {
        this.idextu = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSER() {
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
    public void setUSER(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad pwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWD() {
        return pwd;
    }

    /**
     * Define el valor de la propiedad pwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWD(String value) {
        this.pwd = value;
    }

    /**
     * Obtiene el valor de la propiedad tyusr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYUSR() {
        return tyusr;
    }

    /**
     * Define el valor de la propiedad tyusr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYUSR(String value) {
        this.tyusr = value;
    }

    /**
     * Obtiene el valor de la propiedad tytnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTND() {
        return tytnd;
    }

    /**
     * Define el valor de la propiedad tytnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTND(String value) {
        this.tytnd = value;
    }

    /**
     * Obtiene el valor de la propiedad iditm.
     * 
     */
    public int getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     */
    public void setIDITM(int value) {
        this.iditm = value;
    }

}
