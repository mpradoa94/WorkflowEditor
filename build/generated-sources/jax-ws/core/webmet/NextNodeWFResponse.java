
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nextNodeWFResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nextNodeWFResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="procesoactual" type="{http://Webmet.core/}procesoVersionEstado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nextNodeWFResponse", propOrder = {
    "resultado",
    "procesoactual"
})
public class NextNodeWFResponse {

    protected Resultado resultado;
    protected ProcesoVersionEstado procesoactual;

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
     * Obtiene el valor de la propiedad procesoactual.
     * 
     * @return
     *     possible object is
     *     {@link ProcesoVersionEstado }
     *     
     */
    public ProcesoVersionEstado getProcesoactual() {
        return procesoactual;
    }

    /**
     * Define el valor de la propiedad procesoactual.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcesoVersionEstado }
     *     
     */
    public void setProcesoactual(ProcesoVersionEstado value) {
        this.procesoactual = value;
    }

}
