
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUOMResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUOMResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="UOM" type="{http://Webmet.core/}unitOfMesure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUOMResponse", propOrder = {
    "resultado",
    "uom"
})
public class GetUOMResponse {

    protected Resultado resultado;
    @XmlElement(name = "UOM")
    protected UnitOfMesure uom;

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
     * Obtiene el valor de la propiedad uom.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMesure }
     *     
     */
    public UnitOfMesure getUOM() {
        return uom;
    }

    /**
     * Define el valor de la propiedad uom.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMesure }
     *     
     */
    public void setUOM(UnitOfMesure value) {
        this.uom = value;
    }

}
