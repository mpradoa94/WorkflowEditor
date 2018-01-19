
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para procesoVersionEstado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="procesoVersionEstado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cvEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cveRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodoIni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodoFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tiempoMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nmRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propiedades" type="{http://Webmet.core/}propiedadesNodo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mensajeMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asuntoMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listFE" type="{http://Webmet.core/}formatoEstado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procesoVersionEstado", propOrder = {
    "idProceso",
    "idVersion",
    "cvEstado",
    "cveRol",
    "tipoEstado",
    "nmEstado",
    "tipoProceso",
    "nodoIni",
    "nodoFin",
    "tiempo",
    "tiempoMax",
    "nmRol",
    "propiedades",
    "mensajeMail",
    "asuntoMail",
    "listFE"
})
public class ProcesoVersionEstado {

    protected int idProceso;
    protected int idVersion;
    protected String cvEstado;
    protected String cveRol;
    protected String tipoEstado;
    protected String nmEstado;
    protected String tipoProceso;
    protected String nodoIni;
    protected String nodoFin;
    protected int tiempo;
    protected int tiempoMax;
    protected String nmRol;
    @XmlElement(nillable = true)
    protected List<PropiedadesNodo> propiedades;
    protected String mensajeMail;
    protected String asuntoMail;
    @XmlElement(nillable = true)
    protected List<FormatoEstado> listFE;

    /**
     * Obtiene el valor de la propiedad idProceso.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Define el valor de la propiedad idProceso.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idVersion.
     * 
     */
    public int getIdVersion() {
        return idVersion;
    }

    /**
     * Define el valor de la propiedad idVersion.
     * 
     */
    public void setIdVersion(int value) {
        this.idVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad cvEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvEstado() {
        return cvEstado;
    }

    /**
     * Define el valor de la propiedad cvEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvEstado(String value) {
        this.cvEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad cveRol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveRol() {
        return cveRol;
    }

    /**
     * Define el valor de la propiedad cveRol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveRol(String value) {
        this.cveRol = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEstado() {
        return tipoEstado;
    }

    /**
     * Define el valor de la propiedad tipoEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEstado(String value) {
        this.tipoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad nmEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmEstado() {
        return nmEstado;
    }

    /**
     * Define el valor de la propiedad nmEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmEstado(String value) {
        this.nmEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProceso(String value) {
        this.tipoProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad nodoIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodoIni() {
        return nodoIni;
    }

    /**
     * Define el valor de la propiedad nodoIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodoIni(String value) {
        this.nodoIni = value;
    }

    /**
     * Obtiene el valor de la propiedad nodoFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodoFin() {
        return nodoFin;
    }

    /**
     * Define el valor de la propiedad nodoFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodoFin(String value) {
        this.nodoFin = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     */
    public void setTiempo(int value) {
        this.tiempo = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoMax.
     * 
     */
    public int getTiempoMax() {
        return tiempoMax;
    }

    /**
     * Define el valor de la propiedad tiempoMax.
     * 
     */
    public void setTiempoMax(int value) {
        this.tiempoMax = value;
    }

    /**
     * Obtiene el valor de la propiedad nmRol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmRol() {
        return nmRol;
    }

    /**
     * Define el valor de la propiedad nmRol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmRol(String value) {
        this.nmRol = value;
    }

    /**
     * Gets the value of the propiedades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propiedades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropiedades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropiedadesNodo }
     * 
     * 
     */
    public List<PropiedadesNodo> getPropiedades() {
        if (propiedades == null) {
            propiedades = new ArrayList<PropiedadesNodo>();
        }
        return this.propiedades;
    }

    /**
     * Obtiene el valor de la propiedad mensajeMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeMail() {
        return mensajeMail;
    }

    /**
     * Define el valor de la propiedad mensajeMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeMail(String value) {
        this.mensajeMail = value;
    }

    /**
     * Obtiene el valor de la propiedad asuntoMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuntoMail() {
        return asuntoMail;
    }

    /**
     * Define el valor de la propiedad asuntoMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuntoMail(String value) {
        this.asuntoMail = value;
    }

    /**
     * Gets the value of the listFE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listFE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListFE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatoEstado }
     * 
     * 
     */
    public List<FormatoEstado> getListFE() {
        if (listFE == null) {
            listFE = new ArrayList<FormatoEstado>();
        }
        return this.listFE;
    }

}
