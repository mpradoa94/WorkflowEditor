
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAntiLavadoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAntiLavadoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="antilavado" type="{http://Webmet.core/}antiLavadoD" minOccurs="0"/>
 *         &lt;element name="listaAntiLavado" type="{http://Webmet.core/}antiLavadoD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAntiLavadoResponse", propOrder = {
    "resultado",
    "antilavado",
    "listaAntiLavado"
})
public class GetAntiLavadoResponse {

    protected Resultado resultado;
    protected AntiLavadoD antilavado;
    @XmlElement(nillable = true)
    protected List<AntiLavadoD> listaAntiLavado;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad antilavado.
     * 
     * @return
     *     possible object is
     *     {@link AntiLavadoD }
     *     
     */
    public AntiLavadoD getAntilavado() {
        return antilavado;
    }

    /**
     * Define el valor de la propiedad antilavado.
     * 
     * @param value
     *     allowed object is
     *     {@link AntiLavadoD }
     *     
     */
    public void setAntilavado(AntiLavadoD value) {
        this.antilavado = value;
    }

    /**
     * Gets the value of the listaAntiLavado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaAntiLavado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaAntiLavado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AntiLavadoD }
     * 
     * 
     */
    public List<AntiLavadoD> getListaAntiLavado() {
        if (listaAntiLavado == null) {
            listaAntiLavado = new ArrayList<AntiLavadoD>();
        }
        return this.listaAntiLavado;
    }

}
