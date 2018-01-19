
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_PrecioTiendaALLW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_PrecioTiendaALLW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pt" type="{http://Webmet.core/}getPrecioTiendaALL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_PrecioTiendaALLW", propOrder = {
    "pt"
})
public class GETPrecioTiendaALLW {

    protected GetPrecioTiendaALL pt;

    /**
     * Obtiene el valor de la propiedad pt.
     * 
     * @return
     *     possible object is
     *     {@link GetPrecioTiendaALL }
     *     
     */
    public GetPrecioTiendaALL getPt() {
        return pt;
    }

    /**
     * Define el valor de la propiedad pt.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPrecioTiendaALL }
     *     
     */
    public void setPt(GetPrecioTiendaALL value) {
        this.pt = value;
    }

}
