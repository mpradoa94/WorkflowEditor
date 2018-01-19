
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flujoVersion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flujoVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flujo" type="{http://Webmet.core/}flujo" minOccurs="0"/>
 *         &lt;element name="idVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="xsdFlujo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listPVE" type="{http://Webmet.core/}procesoVersionEstado" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "flujoVersion", propOrder = {
    "flujo",
    "idVersion",
    "xsdFlujo",
    "fechaEnt",
    "fechaSal",
    "listPVE",
    "listFE"
})
public class FlujoVersion {

    protected Flujo flujo;
    protected int idVersion;
    protected String xsdFlujo;
    protected String fechaEnt;
    protected String fechaSal;
    @XmlElement(nillable = true)
    protected List<ProcesoVersionEstado> listPVE;
    @XmlElement(nillable = true)
    protected List<FormatoEstado> listFE;

    /**
     * Obtiene el valor de la propiedad flujo.
     * 
     * @return
     *     possible object is
     *     {@link Flujo }
     *     
     */
    public Flujo getFlujo() {
        return flujo;
    }

    /**
     * Define el valor de la propiedad flujo.
     * 
     * @param value
     *     allowed object is
     *     {@link Flujo }
     *     
     */
    public void setFlujo(Flujo value) {
        this.flujo = value;
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
     * Obtiene el valor de la propiedad xsdFlujo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsdFlujo() {
        return xsdFlujo;
    }

    /**
     * Define el valor de la propiedad xsdFlujo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsdFlujo(String value) {
        this.xsdFlujo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEnt() {
        return fechaEnt;
    }

    /**
     * Define el valor de la propiedad fechaEnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEnt(String value) {
        this.fechaEnt = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSal() {
        return fechaSal;
    }

    /**
     * Define el valor de la propiedad fechaSal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSal(String value) {
        this.fechaSal = value;
    }

    /**
     * Gets the value of the listPVE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPVE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPVE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcesoVersionEstado }
     * 
     * 
     */
    public List<ProcesoVersionEstado> getListPVE() {
        if (listPVE == null) {
            listPVE = new ArrayList<ProcesoVersionEstado>();
        }
        return this.listPVE;
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
