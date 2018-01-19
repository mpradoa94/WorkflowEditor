
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getHistCatalogosSinc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getHistCatalogosSinc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Oper" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="url_server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="database_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_LN_MAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHistCatalogosSinc", propOrder = {
    "oper",
    "idInstancia",
    "urlServer",
    "databaseName",
    "idstrrt",
    "ailnmax"
})
public class GetHistCatalogosSinc {

    @XmlElement(name = "Oper", required = true)
    protected String oper;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "url_server", required = true)
    protected String urlServer;
    @XmlElement(name = "database_name", required = true)
    protected String databaseName;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "AI_LN_MAX")
    protected int ailnmax;

    /**
     * Obtiene el valor de la propiedad oper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOper() {
        return oper;
    }

    /**
     * Define el valor de la propiedad oper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOper(String value) {
        this.oper = value;
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
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad ailnmax.
     * 
     */
    public int getAILNMAX() {
        return ailnmax;
    }

    /**
     * Define el valor de la propiedad ailnmax.
     * 
     */
    public void setAILNMAX(int value) {
        this.ailnmax = value;
    }

}
