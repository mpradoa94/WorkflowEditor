
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para procesos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="procesos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_proceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_proceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_rs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procesos", propOrder = {
    "idProceso",
    "nmProceso",
    "idRs"
})
public class Procesos {

    @XmlElement(name = "id_proceso")
    protected int idProceso;
    @XmlElement(name = "nm_proceso")
    protected int nmProceso;
    @XmlElement(name = "id_rs")
    protected int idRs;

    /**
     * Obtiene el valor de la propiedad idProceso.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Define el valor de la propiedad idProceso.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad nmProceso.
     * 
     */
    public int getNmProceso() {
        return nmProceso;
    }

    /**
     * Define el valor de la propiedad nmProceso.
     * 
     */
    public void setNmProceso(int value) {
        this.nmProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idRs.
     * 
     */
    public int getIdRs() {
        return idRs;
    }

    /**
     * Define el valor de la propiedad idRs.
     * 
     */
    public void setIdRs(int value) {
        this.idRs = value;
    }

}
