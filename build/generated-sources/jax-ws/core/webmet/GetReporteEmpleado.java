
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteEmpleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteEmpleado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="url_server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="database_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_INI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_FIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDPERSONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteEmpleado", propOrder = {
    "operacion",
    "idInstancia",
    "urlServer",
    "databaseName",
    "fechaini",
    "fechafin",
    "idpersona",
    "nombre"
})
public class GetReporteEmpleado {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "url_server", required = true)
    protected String urlServer;
    @XmlElement(name = "database_name", required = true)
    protected String databaseName;
    @XmlElement(name = "FECHA_INI", required = true)
    protected String fechaini;
    @XmlElement(name = "FECHA_FIN", required = true)
    protected String fechafin;
    @XmlElement(name = "IDPERSONA")
    protected int idpersona;
    @XmlElement(name = "NOMBRE", required = true)
    protected String nombre;

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
     * Obtiene el valor de la propiedad fechaini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAINI() {
        return fechaini;
    }

    /**
     * Define el valor de la propiedad fechaini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAINI(String value) {
        this.fechaini = value;
    }

    /**
     * Obtiene el valor de la propiedad fechafin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAFIN() {
        return fechafin;
    }

    /**
     * Define el valor de la propiedad fechafin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAFIN(String value) {
        this.fechafin = value;
    }

    /**
     * Obtiene el valor de la propiedad idpersona.
     * 
     */
    public int getIDPERSONA() {
        return idpersona;
    }

    /**
     * Define el valor de la propiedad idpersona.
     * 
     */
    public void setIDPERSONA(int value) {
        this.idpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE() {
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
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

}