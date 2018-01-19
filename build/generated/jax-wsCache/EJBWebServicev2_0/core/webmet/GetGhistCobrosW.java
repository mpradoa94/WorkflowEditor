
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Get_Ghist_CobrosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Get_Ghist_CobrosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get" type="{http://Webmet.core/}getGhistCobros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Ghist_CobrosW", propOrder = {
    "get"
})
public class GetGhistCobrosW {

    protected GetGhistCobros get;

    /**
     * Obtiene el valor de la propiedad get.
     * 
     * @return
     *     possible object is
     *     {@link GetGhistCobros }
     *     
     */
    public GetGhistCobros getGet() {
        return get;
    }

    /**
     * Define el valor de la propiedad get.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGhistCobros }
     *     
     */
    public void setGet(GetGhistCobros value) {
        this.get = value;
    }

}
