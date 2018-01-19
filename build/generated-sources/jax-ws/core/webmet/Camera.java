
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para camera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="camera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CAMERA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UBICACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camera", propOrder = {
    "idstrrt",
    "idcamera",
    "ubicacion",
    "ip4"
})
public class Camera {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_CAMERA")
    protected int idcamera;
    @XmlElement(name = "UBICACION")
    protected String ubicacion;
    @XmlElement(name = "IP4")
    protected String ip4;

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad idcamera.
     * 
     */
    public int getIDCAMERA() {
        return idcamera;
    }

    /**
     * Define el valor de la propiedad idcamera.
     * 
     */
    public void setIDCAMERA(int value) {
        this.idcamera = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBICACION() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBICACION(String value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ip4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP4() {
        return ip4;
    }

    /**
     * Define el valor de la propiedad ip4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP4(String value) {
        this.ip4 = value;
    }

}
