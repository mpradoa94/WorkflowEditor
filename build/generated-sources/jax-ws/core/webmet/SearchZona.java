
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchZona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchZona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url_server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="database_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CVE_ZONA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOMBRE_ZONA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchZona", propOrder = {
    "urlServer",
    "databaseName",
    "cvezona",
    "nombrezona"
})
public class SearchZona {

    @XmlElement(name = "url_server", required = true)
    protected String urlServer;
    @XmlElement(name = "database_name", required = true)
    protected String databaseName;
    @XmlElement(name = "CVE_ZONA", required = true)
    protected String cvezona;
    @XmlElement(name = "NOMBRE_ZONA", required = true)
    protected String nombrezona;

    /**
     * Obtiene el valor de la propiedad urlServer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlServer() {
        return urlServer;
    }

    /**
     * Define el valor de la propiedad urlServer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlServer(String value) {
        this.urlServer = value;
    }

    /**
     * Obtiene el valor de la propiedad databaseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Define el valor de la propiedad databaseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Obtiene el valor de la propiedad cvezona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVEZONA() {
        return cvezona;
    }

    /**
     * Define el valor de la propiedad cvezona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVEZONA(String value) {
        this.cvezona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrezona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREZONA() {
        return nombrezona;
    }

    /**
     * Define el valor de la propiedad nombrezona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREZONA(String value) {
        this.nombrezona = value;
    }

}
