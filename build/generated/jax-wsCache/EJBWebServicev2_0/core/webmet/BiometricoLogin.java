
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para biometricoLogin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="biometricoLogin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL_SERVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATABASE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biometricoLogin", propOrder = {
    "urlserver",
    "databasename",
    "idinstancia"
})
public class BiometricoLogin {

    @XmlElement(name = "URL_SERVER")
    protected String urlserver;
    @XmlElement(name = "DATABASE_NAME")
    protected String databasename;
    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;

    /**
     * Obtiene el valor de la propiedad urlserver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLSERVER() {
        return urlserver;
    }

    /**
     * Define el valor de la propiedad urlserver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLSERVER(String value) {
        this.urlserver = value;
    }

    /**
     * Obtiene el valor de la propiedad databasename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATABASENAME() {
        return databasename;
    }

    /**
     * Define el valor de la propiedad databasename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATABASENAME(String value) {
        this.databasename = value;
    }

    /**
     * Obtiene el valor de la propiedad idinstancia.
     * 
     */
    public int getIDINSTANCIA() {
        return idinstancia;
    }

    /**
     * Define el valor de la propiedad idinstancia.
     * 
     */
    public void setIDINSTANCIA(int value) {
        this.idinstancia = value;
    }

}
