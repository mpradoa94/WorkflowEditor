
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getInternosRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getInternosRol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_proceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_ver" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cverol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInternosRol", propOrder = {
    "idInstancia",
    "idProceso",
    "idVer",
    "cverol"
})
public class GetInternosRol {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "id_proceso")
    protected int idProceso;
    @XmlElement(name = "id_ver")
    protected int idVer;
    @XmlElement(required = true)
    protected String cverol;

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
     * Obtiene el valor de la propiedad idVer.
     * 
     */
    public int getIdVer() {
        return idVer;
    }

    /**
     * Define el valor de la propiedad idVer.
     * 
     */
    public void setIdVer(int value) {
        this.idVer = value;
    }

    /**
     * Obtiene el valor de la propiedad cverol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCverol() {
        return cverol;
    }

    /**
     * Define el valor de la propiedad cverol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCverol(String value) {
        this.cverol = value;
    }

}
