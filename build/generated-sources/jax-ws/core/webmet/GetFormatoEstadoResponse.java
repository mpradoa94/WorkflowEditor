
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFormatoEstadoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFormatoEstadoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="pve" type="{http://Webmet.core/}procesoVersionEstado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormatoEstadoResponse", propOrder = {
    "resultado",
    "pve"
})
public class GetFormatoEstadoResponse {

    protected Resultado resultado;
    protected ProcesoVersionEstado pve;

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
     * Obtiene el valor de la propiedad pve.
     * 
     * @return
     *     possible object is
     *     {@link ProcesoVersionEstado }
     *     
     */
    public ProcesoVersionEstado getPve() {
        return pve;
    }

    /**
     * Define el valor de la propiedad pve.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcesoVersionEstado }
     *     
     */
    public void setPve(ProcesoVersionEstado value) {
        this.pve = value;
    }

}