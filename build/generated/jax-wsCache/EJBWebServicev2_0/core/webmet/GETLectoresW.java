
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_LectoresW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_LectoresW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GETZ" type="{http://Webmet.core/}getLectores" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_LectoresW", propOrder = {
    "getz"
})
public class GETLectoresW {

    @XmlElement(name = "GETZ")
    protected GetLectores getz;

    /**
     * Obtiene el valor de la propiedad getz.
     * 
     * @return
     *     possible object is
     *     {@link GetLectores }
     *     
     */
    public GetLectores getGETZ() {
        return getz;
    }

    /**
     * Define el valor de la propiedad getz.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLectores }
     *     
     */
    public void setGETZ(GetLectores value) {
        this.getz = value;
    }

}
