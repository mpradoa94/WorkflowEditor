
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteEmpleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteEmpleado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HR_ENTRADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HR_SALIDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TORNIQUETE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteEmpleado", propOrder = {
    "nombre",
    "id",
    "area",
    "fecha",
    "hrentrada",
    "hrsalida",
    "torniquete"
})
public class ReporteEmpleado {

    @XmlElement(name = "NOMBRE")
    protected String nombre;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "AREA")
    protected String area;
    @XmlElement(name = "FECHA")
    protected String fecha;
    @XmlElement(name = "HR_ENTRADA")
    protected String hrentrada;
    @XmlElement(name = "HR_SALIDA")
    protected String hrsalida;
    @XmlElement(name = "TORNIQUETE")
    protected String torniquete;

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

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREA() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREA(String value) {
        this.area = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHA() {
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
    public void setFECHA(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad hrentrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRENTRADA() {
        return hrentrada;
    }

    /**
     * Define el valor de la propiedad hrentrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRENTRADA(String value) {
        this.hrentrada = value;
    }

    /**
     * Obtiene el valor de la propiedad hrsalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRSALIDA() {
        return hrsalida;
    }

    /**
     * Define el valor de la propiedad hrsalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRSALIDA(String value) {
        this.hrsalida = value;
    }

    /**
     * Obtiene el valor de la propiedad torniquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTORNIQUETE() {
        return torniquete;
    }

    /**
     * Define el valor de la propiedad torniquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTORNIQUETE(String value) {
        this.torniquete = value;
    }

}
