
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_PhisicalCountDocumentW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_PhisicalCountDocumentW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pcd" type="{http://Webmet.core/}getPhisicalCountDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_PhisicalCountDocumentW", propOrder = {
    "pcd"
})
public class GETPhisicalCountDocumentW {

    protected GetPhisicalCountDocument pcd;

    /**
     * Obtiene el valor de la propiedad pcd.
     * 
     * @return
     *     possible object is
     *     {@link GetPhisicalCountDocument }
     *     
     */
    public GetPhisicalCountDocument getPcd() {
        return pcd;
    }

    /**
     * Define el valor de la propiedad pcd.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPhisicalCountDocument }
     *     
     */
    public void setPcd(GetPhisicalCountDocument value) {
        this.pcd = value;
    }

}
