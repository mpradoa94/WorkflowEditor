
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para isrNotariaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="isrNotariaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fn" type="{http://Webmet.core/}funciones" minOccurs="0"/>
 *         &lt;element name="vig" type="{http://Webmet.core/}fnVigencia" minOccurs="0"/>
 *         &lt;element name="rango" type="{http://Webmet.core/}rangos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isrNotariaDTO", propOrder = {
    "fn",
    "vig",
    "rango"
})
public class IsrNotariaDTO {

    protected Funciones fn;
    protected FnVigencia vig;
    protected Rangos rango;

    /**
     * Obtiene el valor de la propiedad fn.
     * 
     * @return
     *     possible object is
     *     {@link Funciones }
     *     
     */
    public Funciones getFn() {
        return fn;
    }

    /**
     * Define el valor de la propiedad fn.
     * 
     * @param value
     *     allowed object is
     *     {@link Funciones }
     *     
     */
    public void setFn(Funciones value) {
        this.fn = value;
    }

    /**
     * Obtiene el valor de la propiedad vig.
     * 
     * @return
     *     possible object is
     *     {@link FnVigencia }
     *     
     */
    public FnVigencia getVig() {
        return vig;
    }

    /**
     * Define el valor de la propiedad vig.
     * 
     * @param value
     *     allowed object is
     *     {@link FnVigencia }
     *     
     */
    public void setVig(FnVigencia value) {
        this.vig = value;
    }

    /**
     * Obtiene el valor de la propiedad rango.
     * 
     * @return
     *     possible object is
     *     {@link Rangos }
     *     
     */
    public Rangos getRango() {
        return rango;
    }

    /**
     * Define el valor de la propiedad rango.
     * 
     * @param value
     *     allowed object is
     *     {@link Rangos }
     *     
     */
    public void setRango(Rangos value) {
        this.rango = value;
    }

}
