
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_DocRecByIdW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_DocRecByIdW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://Webmet.core/}getDocReceivable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_DocRecByIdW", propOrder = {
    "parameter"
})
public class GETDocRecByIdW {

    protected GetDocReceivable parameter;

    /**
     * Obtiene el valor de la propiedad parameter.
     * 
     * @return
     *     possible object is
     *     {@link GetDocReceivable }
     *     
     */
    public GetDocReceivable getParameter() {
        return parameter;
    }

    /**
     * Define el valor de la propiedad parameter.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocReceivable }
     *     
     */
    public void setParameter(GetDocReceivable value) {
        this.parameter = value;
    }

}