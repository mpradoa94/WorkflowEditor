
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcFlujoVersionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcFlujoVersionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flujo" type="{http://Webmet.core/}flujo" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcFlujoVersionResponse", propOrder = {
    "flujo",
    "resultado"
})
public class AbcFlujoVersionResponse {

    protected Flujo flujo;
    protected Resultado resultado;

    /**
     * Obtiene el valor de la propiedad flujo.
     * 
     * @return
     *     possible object is
     *     {@link Flujo }
     *     
     */
    public Flujo getFlujo() {
        return flujo;
    }

    /**
     * Define el valor de la propiedad flujo.
     * 
     * @param value
     *     allowed object is
     *     {@link Flujo }
     *     
     */
    public void setFlujo(Flujo value) {
        this.flujo = value;
    }

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

}
