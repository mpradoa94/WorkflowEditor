
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_GroupResourceAccessW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_GroupResourceAccessW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gra" type="{http://Webmet.core/}getGroupResourceAccess" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_GroupResourceAccessW", propOrder = {
    "gra"
})
public class GETGroupResourceAccessW {

    protected GetGroupResourceAccess gra;

    /**
     * Obtiene el valor de la propiedad gra.
     * 
     * @return
     *     possible object is
     *     {@link GetGroupResourceAccess }
     *     
     */
    public GetGroupResourceAccess getGra() {
        return gra;
    }

    /**
     * Define el valor de la propiedad gra.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGroupResourceAccess }
     *     
     */
    public void setGra(GetGroupResourceAccess value) {
        this.gra = value;
    }

}
