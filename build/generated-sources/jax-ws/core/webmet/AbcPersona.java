
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcPersona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="url_server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="database_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personaDatos" type="{http://Webmet.core/}partyRol"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcPersona", propOrder = {
    "operacion",
    "idInstancia",
    "urlServer",
    "databaseName",
    "personaDatos"
})
public class AbcPersona {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "url_server", required = true)
    protected String urlServer;
    @XmlElement(name = "database_name", required = true)
    protected String databaseName;
    @XmlElement(required = true)
    protected PartyRol personaDatos;

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
     * Obtiene el valor de la propiedad personaDatos.
     * 
     * @return
     *     possible object is
     *     {@link PartyRol }
     *     
     */
    public PartyRol getPersonaDatos() {
        return personaDatos;
    }

    /**
     * Define el valor de la propiedad personaDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRol }
     *     
     */
    public void setPersonaDatos(PartyRol value) {
        this.personaDatos = value;
    }

}
