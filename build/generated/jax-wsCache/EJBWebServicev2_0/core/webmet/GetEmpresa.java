
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getEmpresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idInstancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nmEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmpresa", propOrder = {
    "operacion",
    "idInstancia",
    "idEmpresa",
    "nmEmpresa"
})
public class GetEmpresa {

    @XmlElement(required = true)
    protected String operacion;
    protected int idInstancia;
    protected int idEmpresa;
    @XmlElement(required = true)
    protected String nmEmpresa;

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
     * Obtiene el valor de la propiedad idEmpresa.
     * 
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Define el valor de la propiedad idEmpresa.
     * 
     */
    public void setIdEmpresa(int value) {
        this.idEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nmEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmEmpresa() {
        return nmEmpresa;
    }

    /**
     * Define el valor de la propiedad nmEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmEmpresa(String value) {
        this.nmEmpresa = value;
    }

}
