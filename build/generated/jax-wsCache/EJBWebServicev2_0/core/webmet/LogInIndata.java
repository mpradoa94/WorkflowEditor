
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para logInIndata complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="logInIndata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nmopr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logInIndata", propOrder = {
    "nmopr",
    "pwd",
    "urlExt"
})
public class LogInIndata {

    protected String nmopr;
    protected String pwd;
    protected String urlExt;

    /**
     * Obtiene el valor de la propiedad nmopr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmopr() {
        return nmopr;
    }

    /**
     * Define el valor de la propiedad nmopr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmopr(String value) {
        this.nmopr = value;
    }

    /**
     * Obtiene el valor de la propiedad pwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
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
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * Obtiene el valor de la propiedad urlExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlExt() {
        return urlExt;
    }

    /**
     * Define el valor de la propiedad urlExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlExt(String value) {
        this.urlExt = value;
    }

}
