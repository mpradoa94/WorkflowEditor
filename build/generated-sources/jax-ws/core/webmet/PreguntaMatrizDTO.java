
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preguntaMatrizDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preguntaMatrizDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columna" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="preguntaRenglon" type="{http://Webmet.core/}preguntaRenglonDTO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rotar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntaMatrizDTO", propOrder = {
    "columna",
    "preguntaRenglon"
})
public class PreguntaMatrizDTO {

    @XmlElement(required = true)
    protected List<String> columna;
    @XmlElement(required = true)
    protected List<PreguntaRenglonDTO> preguntaRenglon;
    @XmlAttribute(name = "rotar")
    protected String rotar;

    /**
     * Gets the value of the columna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColumna() {
        if (columna == null) {
            columna = new ArrayList<String>();
        }
        return this.columna;
    }

    /**
     * Gets the value of the preguntaRenglon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preguntaRenglon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreguntaRenglon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreguntaRenglonDTO }
     * 
     * 
     */
    public List<PreguntaRenglonDTO> getPreguntaRenglon() {
        if (preguntaRenglon == null) {
            preguntaRenglon = new ArrayList<PreguntaRenglonDTO>();
        }
        return this.preguntaRenglon;
    }

    /**
     * Obtiene el valor de la propiedad rotar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotar() {
        return rotar;
    }

    /**
     * Define el valor de la propiedad rotar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotar(String value) {
        this.rotar = value;
    }

}
