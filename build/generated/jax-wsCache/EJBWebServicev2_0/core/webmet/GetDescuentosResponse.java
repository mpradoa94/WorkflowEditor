
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getDescuentosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getDescuentosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="descuentos" type="{http://Webmet.core/}descuentos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDescuentosResponse", propOrder = {
    "resultado",
    "descuentos"
})
public class GetDescuentosResponse {

    protected Resultado resultado;
    protected Descuentos descuentos;

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
     * Obtiene el valor de la propiedad descuentos.
     * 
     * @return
     *     possible object is
     *     {@link Descuentos }
     *     
     */
    public Descuentos getDescuentos() {
        return descuentos;
    }

    /**
     * Define el valor de la propiedad descuentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Descuentos }
     *     
     */
    public void setDescuentos(Descuentos value) {
        this.descuentos = value;
    }

}
