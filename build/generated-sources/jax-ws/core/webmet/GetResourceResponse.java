
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getResourceResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getResourceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="modulos" type="{http://Webmet.core/}modulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recursos" type="{http://Webmet.core/}resource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recurso" type="{http://Webmet.core/}resource" minOccurs="0"/>
 *         &lt;element name="maxPos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getResourceResponse", propOrder = {
    "resultado",
    "modulos",
    "recursos",
    "recurso",
    "maxPos"
})
public class GetResourceResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<Modulo> modulos;
    @XmlElement(nillable = true)
    protected List<Resource> recursos;
    protected Resource recurso;
    protected int maxPos;

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
     * Gets the value of the modulos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modulos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModulos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modulo }
     * 
     * 
     */
    public List<Modulo> getModulos() {
        if (modulos == null) {
            modulos = new ArrayList<Modulo>();
        }
        return this.modulos;
    }

    /**
     * Gets the value of the recursos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recursos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecursos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     * 
     * 
     */
    public List<Resource> getRecursos() {
        if (recursos == null) {
            recursos = new ArrayList<Resource>();
        }
        return this.recursos;
    }

    /**
     * Obtiene el valor de la propiedad recurso.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getRecurso() {
        return recurso;
    }

    /**
     * Define el valor de la propiedad recurso.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setRecurso(Resource value) {
        this.recurso = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPos.
     * 
     */
    public int getMaxPos() {
        return maxPos;
    }

    /**
     * Define el valor de la propiedad maxPos.
     * 
     */
    public void setMaxPos(int value) {
        this.maxPos = value;
    }

}
