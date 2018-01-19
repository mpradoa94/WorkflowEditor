
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteDiasInv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteDiasInv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Brand1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Brand2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Categoria1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Categoria2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Proveedor1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Proveedor2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idSTRRT" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="sininventario" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sinventas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="idlcn" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteDiasInv", propOrder = {
    "idInstancia",
    "operacion",
    "idstrrt",
    "brand1",
    "brand2",
    "categoria1",
    "categoria2",
    "proveedor1",
    "proveedor2",
    "fecha",
    "idSTRRT",
    "sininventario",
    "sinventas",
    "idlcn"
})
public class GetReporteDiasInv {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "Brand1", required = true)
    protected String brand1;
    @XmlElement(name = "Brand2", required = true)
    protected String brand2;
    @XmlElement(name = "Categoria1", required = true)
    protected String categoria1;
    @XmlElement(name = "Categoria2", required = true)
    protected String categoria2;
    @XmlElement(name = "Proveedor1", required = true)
    protected String proveedor1;
    @XmlElement(name = "Proveedor2", required = true)
    protected String proveedor2;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(type = Integer.class)
    protected List<Integer> idSTRRT;
    protected boolean sininventario;
    protected boolean sinventas;
    @XmlElement(type = Integer.class)
    protected List<Integer> idlcn;

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
     * Obtiene el valor de la propiedad brand1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand1() {
        return brand1;
    }

    /**
     * Define el valor de la propiedad brand1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand1(String value) {
        this.brand1 = value;
    }

    /**
     * Obtiene el valor de la propiedad brand2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand2() {
        return brand2;
    }

    /**
     * Define el valor de la propiedad brand2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand2(String value) {
        this.brand2 = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria1() {
        return categoria1;
    }

    /**
     * Define el valor de la propiedad categoria1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria1(String value) {
        this.categoria1 = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria2() {
        return categoria2;
    }

    /**
     * Define el valor de la propiedad categoria2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria2(String value) {
        this.categoria2 = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedor1() {
        return proveedor1;
    }

    /**
     * Define el valor de la propiedad proveedor1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedor1(String value) {
        this.proveedor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedor2() {
        return proveedor2;
    }

    /**
     * Define el valor de la propiedad proveedor2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedor2(String value) {
        this.proveedor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the idSTRRT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idSTRRT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdSTRRT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdSTRRT() {
        if (idSTRRT == null) {
            idSTRRT = new ArrayList<Integer>();
        }
        return this.idSTRRT;
    }

    /**
     * Obtiene el valor de la propiedad sininventario.
     * 
     */
    public boolean isSininventario() {
        return sininventario;
    }

    /**
     * Define el valor de la propiedad sininventario.
     * 
     */
    public void setSininventario(boolean value) {
        this.sininventario = value;
    }

    /**
     * Obtiene el valor de la propiedad sinventas.
     * 
     */
    public boolean isSinventas() {
        return sinventas;
    }

    /**
     * Define el valor de la propiedad sinventas.
     * 
     */
    public void setSinventas(boolean value) {
        this.sinventas = value;
    }

    /**
     * Gets the value of the idlcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idlcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdlcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdlcn() {
        if (idlcn == null) {
            idlcn = new ArrayList<Integer>();
        }
        return this.idlcn;
    }

}
