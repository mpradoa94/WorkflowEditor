
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ArtExistenciaW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ArtExistenciaW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ae" type="{http://Webmet.core/}getArtExistencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ArtExistenciaW", propOrder = {
    "ae"
})
public class GETArtExistenciaW {

    protected GetArtExistencia ae;

    /**
     * Obtiene el valor de la propiedad ae.
     * 
     * @return
     *     possible object is
     *     {@link GetArtExistencia }
     *     
     */
    public GetArtExistencia getAe() {
        return ae;
    }

    /**
     * Define el valor de la propiedad ae.
     * 
     * @param value
     *     allowed object is
     *     {@link GetArtExistencia }
     *     
     */
    public void setAe(GetArtExistencia value) {
        this.ae = value;
    }

}
