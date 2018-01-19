
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcGhistCobros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcGhistCobros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="url_server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="database_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ghistcobro" type="{http://Webmet.core/}ghistCobros"/>
 *         &lt;element name="idcontrato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="proxvencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ausencia" type="{http://Webmet.core/}ausencia" maxOccurs="unbounded"/>
 *         &lt;element name="persona" type="{http://Webmet.core/}persona" maxOccurs="unbounded"/>
 *         &lt;element name="PermisoAcceso" type="{http://Webmet.core/}permisoAcceso" maxOccurs="unbounded"/>
 *         &lt;element name="lock" type="{http://Webmet.core/}lockers" maxOccurs="unbounded"/>
 *         &lt;element name="gHistorial" type="{http://Webmet.core/}gHistorialCobros" maxOccurs="unbounded"/>
 *         &lt;element name="det_cobro" type="{http://Webmet.core/}detCOBRO" maxOccurs="unbounded"/>
 *         &lt;element name="meses_pagados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcGhistCobros", propOrder = {
    "operacion",
    "idInstancia",
    "urlServer",
    "databaseName",
    "ghistcobro",
    "idcontrato",
    "proxvencimiento",
    "ausencia",
    "persona",
    "permisoAcceso",
    "lock",
    "gHistorial",
    "detCobro",
    "mesesPagados"
})
public class AbcGhistCobros {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "url_server", required = true)
    protected String urlServer;
    @XmlElement(name = "database_name", required = true)
    protected String databaseName;
    @XmlElement(name = "Ghistcobro", required = true)
    protected GhistCobros ghistcobro;
    protected int idcontrato;
    @XmlElement(required = true)
    protected String proxvencimiento;
    @XmlElement(name = "Ausencia", required = true)
    protected List<Ausencia> ausencia;
    @XmlElement(required = true)
    protected List<Persona> persona;
    @XmlElement(name = "PermisoAcceso", required = true)
    protected List<PermisoAcceso> permisoAcceso;
    @XmlElement(required = true)
    protected List<Lockers> lock;
    @XmlElement(required = true)
    protected List<GHistorialCobros> gHistorial;
    @XmlElement(name = "det_cobro", required = true)
    protected List<DetCOBRO> detCobro;
    @XmlElement(name = "meses_pagados")
    protected int mesesPagados;

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
     * Obtiene el valor de la propiedad ghistcobro.
     * 
     * @return
     *     possible object is
     *     {@link GhistCobros }
     *     
     */
    public GhistCobros getGhistcobro() {
        return ghistcobro;
    }

    /**
     * Define el valor de la propiedad ghistcobro.
     * 
     * @param value
     *     allowed object is
     *     {@link GhistCobros }
     *     
     */
    public void setGhistcobro(GhistCobros value) {
        this.ghistcobro = value;
    }

    /**
     * Obtiene el valor de la propiedad idcontrato.
     * 
     */
    public int getIdcontrato() {
        return idcontrato;
    }

    /**
     * Define el valor de la propiedad idcontrato.
     * 
     */
    public void setIdcontrato(int value) {
        this.idcontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad proxvencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxvencimiento() {
        return proxvencimiento;
    }

    /**
     * Define el valor de la propiedad proxvencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxvencimiento(String value) {
        this.proxvencimiento = value;
    }

    /**
     * Gets the value of the ausencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ausencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAusencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ausencia }
     * 
     * 
     */
    public List<Ausencia> getAusencia() {
        if (ausencia == null) {
            ausencia = new ArrayList<Ausencia>();
        }
        return this.ausencia;
    }

    /**
     * Gets the value of the persona property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persona property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersona().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Persona }
     * 
     * 
     */
    public List<Persona> getPersona() {
        if (persona == null) {
            persona = new ArrayList<Persona>();
        }
        return this.persona;
    }

    /**
     * Gets the value of the permisoAcceso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permisoAcceso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermisoAcceso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermisoAcceso }
     * 
     * 
     */
    public List<PermisoAcceso> getPermisoAcceso() {
        if (permisoAcceso == null) {
            permisoAcceso = new ArrayList<PermisoAcceso>();
        }
        return this.permisoAcceso;
    }

    /**
     * Gets the value of the lock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lockers }
     * 
     * 
     */
    public List<Lockers> getLock() {
        if (lock == null) {
            lock = new ArrayList<Lockers>();
        }
        return this.lock;
    }

    /**
     * Gets the value of the gHistorial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gHistorial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGHistorial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GHistorialCobros }
     * 
     * 
     */
    public List<GHistorialCobros> getGHistorial() {
        if (gHistorial == null) {
            gHistorial = new ArrayList<GHistorialCobros>();
        }
        return this.gHistorial;
    }

    /**
     * Gets the value of the detCobro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detCobro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetCobro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetCOBRO }
     * 
     * 
     */
    public List<DetCOBRO> getDetCobro() {
        if (detCobro == null) {
            detCobro = new ArrayList<DetCOBRO>();
        }
        return this.detCobro;
    }

    /**
     * Obtiene el valor de la propiedad mesesPagados.
     * 
     */
    public int getMesesPagados() {
        return mesesPagados;
    }

    /**
     * Define el valor de la propiedad mesesPagados.
     * 
     */
    public void setMesesPagados(int value) {
        this.mesesPagados = value;
    }

}
