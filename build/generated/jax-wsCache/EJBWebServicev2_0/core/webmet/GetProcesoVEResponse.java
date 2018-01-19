
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getProcesoVEResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getProcesoVEResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="pve" type="{http://Webmet.core/}procesoVersionEstado" minOccurs="0"/>
 *         &lt;element name="listPVE" type="{http://Webmet.core/}procesoVersionEstado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProcesoVEResponse", propOrder = {
    "resultado",
    "pve",
    "listPVE"
})
public class GetProcesoVEResponse {

    protected Resultado resultado;
    protected ProcesoVersionEstado pve;
    @XmlElement(nillable = true)
    protected List<ProcesoVersionEstado> listPVE;

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
     * Obtiene el valor de la propiedad pve.
     * 
     * @return
     *     possible object is
     *     {@link ProcesoVersionEstado }
     *     
     */
    public ProcesoVersionEstado getPve() {
        return pve;
    }

    /**
     * Define el valor de la propiedad pve.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcesoVersionEstado }
     *     
     */
    public void setPve(ProcesoVersionEstado value) {
        this.pve = value;
    }

    /**
     * Gets the value of the listPVE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPVE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPVE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcesoVersionEstado }
     * 
     * 
     */
    public List<ProcesoVersionEstado> getListPVE() {
        if (listPVE == null) {
            listPVE = new ArrayList<ProcesoVersionEstado>();
        }
        return this.listPVE;
    }

}
