
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrdenesCompraPorRecibirWResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrdenesCompraPorRecibirWResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Webmet.core/}getOrdenesCompraPorRecibirResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdenesCompraPorRecibirWResponse", propOrder = {
    "_return"
})
public class OrdenesCompraPorRecibirWResponse {

    @XmlElement(name = "return")
    protected GetOrdenesCompraPorRecibirResponse _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link GetOrdenesCompraPorRecibirResponse }
     *     
     */
    public GetOrdenesCompraPorRecibirResponse getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrdenesCompraPorRecibirResponse }
     *     
     */
    public void setReturn(GetOrdenesCompraPorRecibirResponse value) {
        this._return = value;
    }

}
