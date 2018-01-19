
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFlujoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFlujoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="idFlujo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flujos" type="{http://Webmet.core/}flujoVersion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlujoResponse", propOrder = {
    "resultado",
    "idFlujo",
    "flujos"
})
public class GetFlujoResponse {

    protected Resultado resultado;
    protected int idFlujo;
    @XmlElement(nillable = true)
    protected List<FlujoVersion> flujos;

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
     * Obtiene el valor de la propiedad idFlujo.
     * 
     */
    public int getIdFlujo() {
        return idFlujo;
    }

    /**
     * Define el valor de la propiedad idFlujo.
     * 
     */
    public void setIdFlujo(int value) {
        this.idFlujo = value;
    }

    /**
     * Gets the value of the flujos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flujos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlujos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlujoVersion }
     * 
     * 
     */
    public List<FlujoVersion> getFlujos() {
        if (flujos == null) {
            flujos = new ArrayList<FlujoVersion>();
        }
        return this.flujos;
    }

}
