
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agenda1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agenda1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_cita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="del" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="al" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_formato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Asunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDS_FORMATO" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agenda1", propOrder = {
    "idCita",
    "dia",
    "del",
    "al",
    "idFormato",
    "asunto",
    "idsformato"
})
public class Agenda1 {

    @XmlElement(name = "id_cita")
    protected int idCita;
    protected String dia;
    protected String del;
    protected String al;
    @XmlElement(name = "id_formato")
    protected int idFormato;
    @XmlElement(name = "Asunto")
    protected String asunto;
    @XmlElement(name = "IDS_FORMATO", nillable = true)
    protected List<Integer> idsformato;

    /**
     * Obtiene el valor de la propiedad idCita.
     * 
     */
    public int getIdCita() {
        return idCita;
    }

    /**
     * Define el valor de la propiedad idCita.
     * 
     */
    public void setIdCita(int value) {
        this.idCita = value;
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
     * Obtiene el valor de la propiedad del.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDel() {
        return del;
    }

    /**
     * Define el valor de la propiedad del.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDel(String value) {
        this.del = value;
    }

    /**
     * Obtiene el valor de la propiedad al.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAl() {
        return al;
    }

    /**
     * Define el valor de la propiedad al.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAl(String value) {
        this.al = value;
    }

    /**
     * Obtiene el valor de la propiedad idFormato.
     * 
     */
    public int getIdFormato() {
        return idFormato;
    }

    /**
     * Define el valor de la propiedad idFormato.
     * 
     */
    public void setIdFormato(int value) {
        this.idFormato = value;
    }

    /**
     * Obtiene el valor de la propiedad asunto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * Define el valor de la propiedad asunto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsunto(String value) {
        this.asunto = value;
    }

    /**
     * Gets the value of the idsformato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idsformato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDSFORMATO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIDSFORMATO() {
        if (idsformato == null) {
            idsformato = new ArrayList<Integer>();
        }
        return this.idsformato;
    }

}
