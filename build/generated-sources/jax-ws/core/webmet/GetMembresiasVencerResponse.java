
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getMembresiasVencerResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getMembresiasVencerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="membresias" type="{http://Webmet.core/}membresiasVencer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numvencidas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMembresiasVencerResponse", propOrder = {
    "resultado",
    "membresias",
    "numvencidas"
})
public class GetMembresiasVencerResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<MembresiasVencer> membresias;
    protected int numvencidas;

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
     * Gets the value of the membresias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membresias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembresias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MembresiasVencer }
     * 
     * 
     */
    public List<MembresiasVencer> getMembresias() {
        if (membresias == null) {
            membresias = new ArrayList<MembresiasVencer>();
        }
        return this.membresias;
    }

    /**
     * Obtiene el valor de la propiedad numvencidas.
     * 
     */
    public int getNumvencidas() {
        return numvencidas;
    }

    /**
     * Define el valor de la propiedad numvencidas.
     * 
     */
    public void setNumvencidas(int value) {
        this.numvencidas = value;
    }

}
