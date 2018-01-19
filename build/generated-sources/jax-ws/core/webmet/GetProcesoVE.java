
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getProcesoVE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getProcesoVE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idProceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nmEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idUse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProcesoVE", propOrder = {
    "idInstancia",
    "idProceso",
    "idVersion",
    "nmEstado",
    "idUse"
})
public class GetProcesoVE {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    protected int idProceso;
    protected int idVersion;
    @XmlElement(required = true)
    protected String nmEstado;
    protected int idUse;

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
     * Obtiene el valor de la propiedad idVersion.
     * 
     */
    public int getIdVersion() {
        return idVersion;
    }

    /**
     * Define el valor de la propiedad idVersion.
     * 
     */
    public void setIdVersion(int value) {
        this.idVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad nmEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmEstado() {
        return nmEstado;
    }

    /**
     * Define el valor de la propiedad nmEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmEstado(String value) {
        this.nmEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad idUse.
     * 
     */
    public int getIdUse() {
        return idUse;
    }

    /**
     * Define el valor de la propiedad idUse.
     * 
     */
    public void setIdUse(int value) {
        this.idUse = value;
    }

}
