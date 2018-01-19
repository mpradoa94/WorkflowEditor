
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para timeCardEmployee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="timeCardEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ACCESO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_EM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FECHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENTRADASALIDA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeCardEmployee", propOrder = {
    "idacceso",
    "idem",
    "fecha",
    "entradasalida"
})
public class TimeCardEmployee {

    @XmlElement(name = "ID_ACCESO")
    protected int idacceso;
    @XmlElement(name = "ID_EM")
    protected int idem;
    @XmlElement(name = "FECHA")
    protected String fecha;
    @XmlElement(name = "ENTRADASALIDA")
    protected int entradasalida;

    /**
     * Obtiene el valor de la propiedad idacceso.
     * 
     */
    public int getIDACCESO() {
        return idacceso;
    }

    /**
     * Define el valor de la propiedad idacceso.
     * 
     */
    public void setIDACCESO(int value) {
        this.idacceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idem.
     * 
     */
    public int getIDEM() {
        return idem;
    }

    /**
     * Define el valor de la propiedad idem.
     * 
     */
    public void setIDEM(int value) {
        this.idem = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHA() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHA(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad entradasalida.
     * 
     */
    public int getENTRADASALIDA() {
        return entradasalida;
    }

    /**
     * Define el valor de la propiedad entradasalida.
     * 
     */
    public void setENTRADASALIDA(int value) {
        this.entradasalida = value;
    }

}
