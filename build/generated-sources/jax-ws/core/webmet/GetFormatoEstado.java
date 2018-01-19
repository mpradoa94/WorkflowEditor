
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFormatoEstado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFormatoEstado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pve" type="{http://Webmet.core/}procesoVersionEstado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormatoEstado", propOrder = {
    "idInstancia",
    "pve"
})
public class GetFormatoEstado {

    @XmlElement(name = "id_instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected ProcesoVersionEstado pve;

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

}
