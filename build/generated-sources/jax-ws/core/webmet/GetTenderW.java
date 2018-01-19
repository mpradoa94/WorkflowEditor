
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Get_TenderW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Get_TenderW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tend" type="{http://Webmet.core/}getTender" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_TenderW", propOrder = {
    "tend"
})
public class GetTenderW {

    protected GetTender tend;

    /**
     * Obtiene el valor de la propiedad tend.
     * 
     * @return
     *     possible object is
     *     {@link GetTender }
     *     
     */
    public GetTender getTend() {
        return tend;
    }

    /**
     * Define el valor de la propiedad tend.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTender }
     *     
     */
    public void setTend(GetTender value) {
        this.tend = value;
    }

}
