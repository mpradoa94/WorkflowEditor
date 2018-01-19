
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcResource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recurso" type="{http://Webmet.core/}resource"/>
 *         &lt;element name="posAnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="favoritos" type="{http://Webmet.core/}resource" maxOccurs="unbounded"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcResource", propOrder = {
    "operacion",
    "idInstancia",
    "recurso",
    "posAnt",
    "favoritos",
    "idopr"
})
public class AbcResource {

    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected Resource recurso;
    protected int posAnt;
    @XmlElement(required = true)
    protected List<Resource> favoritos;
    @XmlElement(name = "ID_OPR")
    protected int idopr;

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
     * Obtiene el valor de la propiedad posAnt.
     * 
     */
    public int getPosAnt() {
        return posAnt;
    }

    /**
     * Define el valor de la propiedad posAnt.
     * 
     */
    public void setPosAnt(int value) {
        this.posAnt = value;
    }

    /**
     * Gets the value of the favoritos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the favoritos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFavoritos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     * 
     * 
     */
    public List<Resource> getFavoritos() {
        if (favoritos == null) {
            favoritos = new ArrayList<Resource>();
        }
        return this.favoritos;
    }

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

}
