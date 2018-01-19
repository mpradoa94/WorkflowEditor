
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para horarioDisponible complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="horarioDisponible">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_horario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traslapes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ocupadasmedia" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="citasXhora" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horarioDisponible", propOrder = {
    "idHorario",
    "dia",
    "desde",
    "hasta",
    "traslapes",
    "ocupadasmedia",
    "citasXhora"
})
public class HorarioDisponible {

    @XmlElement(name = "id_horario")
    protected int idHorario;
    protected String dia;
    protected String desde;
    protected String hasta;
    protected int traslapes;
    @XmlElement(nillable = true)
    protected List<Integer> ocupadasmedia;
    protected int citasXhora;

    /**
     * Obtiene el valor de la propiedad idHorario.
     * 
     */
    public int getIdHorario() {
        return idHorario;
    }

    /**
     * Define el valor de la propiedad idHorario.
     * 
     */
    public void setIdHorario(int value) {
        this.idHorario = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDia(String value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad desde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesde() {
        return desde;
    }

    /**
     * Define el valor de la propiedad desde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesde(String value) {
        this.desde = value;
    }

    /**
     * Obtiene el valor de la propiedad hasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasta() {
        return hasta;
    }

    /**
     * Define el valor de la propiedad hasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasta(String value) {
        this.hasta = value;
    }

    /**
     * Obtiene el valor de la propiedad traslapes.
     * 
     */
    public int getTraslapes() {
        return traslapes;
    }

    /**
     * Define el valor de la propiedad traslapes.
     * 
     */
    public void setTraslapes(int value) {
        this.traslapes = value;
    }

    /**
     * Gets the value of the ocupadasmedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocupadasmedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOcupadasmedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOcupadasmedia() {
        if (ocupadasmedia == null) {
            ocupadasmedia = new ArrayList<Integer>();
        }
        return this.ocupadasmedia;
    }

    /**
     * Obtiene el valor de la propiedad citasXhora.
     * 
     */
    public int getCitasXhora() {
        return citasXhora;
    }

    /**
     * Define el valor de la propiedad citasXhora.
     * 
     */
    public void setCitasXhora(int value) {
        this.citasXhora = value;
    }

}
