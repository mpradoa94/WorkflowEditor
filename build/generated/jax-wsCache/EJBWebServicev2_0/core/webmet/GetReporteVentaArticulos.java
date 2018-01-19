
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteVentaArticulos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteVentaArticulos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Parametro1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parametro2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDSTRT" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteVentaArticulos", propOrder = {
    "idInstancia",
    "operacion",
    "idstrrt",
    "parametro1",
    "parametro2",
    "fechaI",
    "fechaF",
    "idstrt"
})
public class GetReporteVentaArticulos {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "Parametro1", required = true)
    protected String parametro1;
    @XmlElement(required = true)
    protected String parametro2;
    @XmlElement(name = "FechaI", required = true)
    protected String fechaI;
    @XmlElement(name = "FechaF", required = true)
    protected String fechaF;
    @XmlElement(name = "IDSTRT", type = Integer.class)
    protected List<Integer> idstrt;

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
     * Obtiene el valor de la propiedad parametro1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametro1() {
        return parametro1;
    }

    /**
     * Define el valor de la propiedad parametro1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametro1(String value) {
        this.parametro1 = value;
    }

    /**
     * Obtiene el valor de la propiedad parametro2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametro2() {
        return parametro2;
    }

    /**
     * Define el valor de la propiedad parametro2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametro2(String value) {
        this.parametro2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaI() {
        return fechaI;
    }

    /**
     * Define el valor de la propiedad fechaI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaI(String value) {
        this.fechaI = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaF() {
        return fechaF;
    }

    /**
     * Define el valor de la propiedad fechaF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaF(String value) {
        this.fechaF = value;
    }

    /**
     * Gets the value of the idstrt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idstrt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDSTRT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIDSTRT() {
        if (idstrt == null) {
            idstrt = new ArrayList<Integer>();
        }
        return this.idstrt;
    }

}
