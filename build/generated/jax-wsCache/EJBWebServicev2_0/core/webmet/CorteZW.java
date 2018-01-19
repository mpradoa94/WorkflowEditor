
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CorteZW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CorteZW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cortes" type="{http://Webmet.core/}corteZ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorteZW", propOrder = {
    "cortes"
})
public class CorteZW {

    @XmlElement(name = "Cortes")
    protected CorteZ cortes;

    /**
     * Obtiene el valor de la propiedad cortes.
     * 
     * @return
     *     possible object is
     *     {@link CorteZ }
     *     
     */
    public CorteZ getCortes() {
        return cortes;
    }

    /**
     * Define el valor de la propiedad cortes.
     * 
     * @param value
     *     allowed object is
     *     {@link CorteZ }
     *     
     */
    public void setCortes(CorteZ value) {
        this.cortes = value;
    }

}
