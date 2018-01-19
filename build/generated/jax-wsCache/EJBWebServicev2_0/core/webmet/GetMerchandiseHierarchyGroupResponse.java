
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getMerchandiseHierarchyGroupResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getMerchandiseHierarchyGroupResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="NIVELES_ARBOL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lista" type="{http://Webmet.core/}merchandiseHierarchyGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMerchandiseHierarchyGroupResponse", propOrder = {
    "resultado",
    "nivelesarbol",
    "lista"
})
public class GetMerchandiseHierarchyGroupResponse {

    protected Resultado resultado;
    @XmlElement(name = "NIVELES_ARBOL")
    protected int nivelesarbol;
    @XmlElement(nillable = true)
    protected List<MerchandiseHierarchyGroup> lista;

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
     * Obtiene el valor de la propiedad nivelesarbol.
     * 
     */
    public int getNIVELESARBOL() {
        return nivelesarbol;
    }

    /**
     * Define el valor de la propiedad nivelesarbol.
     * 
     */
    public void setNIVELESARBOL(int value) {
        this.nivelesarbol = value;
    }

    /**
     * Gets the value of the lista property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lista property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLista().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchandiseHierarchyGroup }
     * 
     * 
     */
    public List<MerchandiseHierarchyGroup> getLista() {
        if (lista == null) {
            lista = new ArrayList<MerchandiseHierarchyGroup>();
        }
        return this.lista;
    }

}
