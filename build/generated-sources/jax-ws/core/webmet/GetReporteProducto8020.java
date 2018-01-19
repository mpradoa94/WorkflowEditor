
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteProducto8020 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteProducto8020">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FechaDel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaAl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idSTRRT" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteProducto8020", propOrder = {
    "idInstancia",
    "operacion",
    "idstrrt",
    "fechaDel",
    "fechaAl",
    "idSTRRT"
})
public class GetReporteProducto8020 {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "FechaDel", required = true)
    protected String fechaDel;
    @XmlElement(name = "FechaAl", required = true)
    protected String fechaAl;
    @XmlElement(type = Integer.class)
    protected List<Integer> idSTRRT;

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
     * Obtiene el valor de la propiedad fechaDel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDel() {
        return fechaDel;
    }

    /**
     * Define el valor de la propiedad fechaDel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDel(String value) {
        this.fechaDel = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAl() {
        return fechaAl;
    }

    /**
     * Define el valor de la propiedad fechaAl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAl(String value) {
        this.fechaAl = value;
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

}
