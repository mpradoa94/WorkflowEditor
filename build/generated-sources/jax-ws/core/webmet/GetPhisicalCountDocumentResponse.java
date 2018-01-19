
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPhisicalCountDocumentResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPhisicalCountDocumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="phisicalcountdocument" type="{http://Webmet.core/}phisicalCountDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPhisicalCountDocumentResponse", propOrder = {
    "resultado",
    "phisicalcountdocument"
})
public class GetPhisicalCountDocumentResponse {

    protected Resultado resultado;
    protected PhisicalCountDocument phisicalcountdocument;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad phisicalcountdocument.
     * 
     * @return
     *     possible object is
     *     {@link PhisicalCountDocument }
     *     
     */
    public PhisicalCountDocument getPhisicalcountdocument() {
        return phisicalcountdocument;
    }

    /**
     * Define el valor de la propiedad phisicalcountdocument.
     * 
     * @param value
     *     allowed object is
     *     {@link PhisicalCountDocument }
     *     
     */
    public void setPhisicalcountdocument(PhisicalCountDocument value) {
        this.phisicalcountdocument = value;
    }

}
