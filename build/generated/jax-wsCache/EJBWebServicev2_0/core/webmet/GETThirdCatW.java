
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ThirdCatW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ThirdCatW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resp" type="{http://Webmet.core/}getCatNames" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ThirdCatW", propOrder = {
    "resp"
})
public class GETThirdCatW {

    protected GetCatNames resp;

    /**
     * Obtiene el valor de la propiedad resp.
     * 
     * @return
     *     possible object is
     *     {@link GetCatNames }
     *     
     */
    public GetCatNames getResp() {
        return resp;
    }

    /**
     * Define el valor de la propiedad resp.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCatNames }
     *     
     */
    public void setResp(GetCatNames value) {
        this.resp = value;
    }

}
