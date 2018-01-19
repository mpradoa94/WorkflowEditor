
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcAntiLavado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcAntiLavado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idInstancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="antiLavado" type="{http://Webmet.core/}antiLavadoD"/>
 *         &lt;element name="listaA" type="{http://Webmet.core/}antiLavadoD" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcAntiLavado", propOrder = {
    "operacion",
    "idInstancia",
    "antiLavado",
    "listaA"
})
public class AbcAntiLavado {

    @XmlElement(required = true)
    protected String operacion;
    protected int idInstancia;
    @XmlElement(required = true)
    protected AntiLavadoD antiLavado;
    @XmlElement(required = true)
    protected List<AntiLavadoD> listaA;

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
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad antiLavado.
     * 
     * @return
     *     possible object is
     *     {@link AntiLavadoD }
     *     
     */
    public AntiLavadoD getAntiLavado() {
        return antiLavado;
    }

    /**
     * Define el valor de la propiedad antiLavado.
     * 
     * @param value
     *     allowed object is
     *     {@link AntiLavadoD }
     *     
     */
    public void setAntiLavado(AntiLavadoD value) {
        this.antiLavado = value;
    }

    /**
     * Gets the value of the listaA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AntiLavadoD }
     * 
     * 
     */
    public List<AntiLavadoD> getListaA() {
        if (listaA == null) {
            listaA = new ArrayList<AntiLavadoD>();
        }
        return this.listaA;
    }

}
