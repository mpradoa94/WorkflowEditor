
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteVentasImpuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteVentasImpuestos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fecha1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fecha2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHADEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHAAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "getReporteVentasImpuestos", propOrder = {
    "instancia",
    "operacion",
    "idstrrt",
    "fecha1",
    "fecha2",
    "fechadel",
    "fechaal",
    "idSTRRT"
})
public class GetReporteVentasImpuestos {

    protected int instancia;
    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "Fecha1", required = true)
    protected String fecha1;
    @XmlElement(name = "Fecha2", required = true)
    protected String fecha2;
    @XmlElement(name = "FECHADEL", required = true)
    protected String fechadel;
    @XmlElement(name = "FECHAAL", required = true)
    protected String fechaal;
    @XmlElement(type = Integer.class)
    protected List<Integer> idSTRRT;

    /**
     * Obtiene el valor de la propiedad instancia.
     * 
     */
    public int getInstancia() {
        return instancia;
    }

    /**
     * Define el valor de la propiedad instancia.
     * 
     */
    public void setInstancia(int value) {
        this.instancia = value;
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
     * Obtiene el valor de la propiedad fecha1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha1() {
        return fecha1;
    }

    /**
     * Define el valor de la propiedad fecha1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha1(String value) {
        this.fecha1 = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha2() {
        return fecha2;
    }

    /**
     * Define el valor de la propiedad fecha2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha2(String value) {
        this.fecha2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHADEL() {
        return fechadel;
    }

    /**
     * Define el valor de la propiedad fechadel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHADEL(String value) {
        this.fechadel = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAAL() {
        return fechaal;
    }

    /**
     * Define el valor de la propiedad fechaal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAAL(String value) {
        this.fechaal = value;
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
