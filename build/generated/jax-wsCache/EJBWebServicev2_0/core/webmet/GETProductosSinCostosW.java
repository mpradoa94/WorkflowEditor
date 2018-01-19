
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ProductosSinCostosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ProductosSinCostosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entra" type="{http://Webmet.core/}getProductosSinCosto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ProductosSinCostosW", propOrder = {
    "entra"
})
public class GETProductosSinCostosW {

    protected GetProductosSinCosto entra;

    /**
     * Obtiene el valor de la propiedad entra.
     * 
     * @return
     *     possible object is
     *     {@link GetProductosSinCosto }
     *     
     */
    public GetProductosSinCosto getEntra() {
        return entra;
    }

    /**
     * Define el valor de la propiedad entra.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProductosSinCosto }
     *     
     */
    public void setEntra(GetProductosSinCosto value) {
        this.entra = value;
    }

}
