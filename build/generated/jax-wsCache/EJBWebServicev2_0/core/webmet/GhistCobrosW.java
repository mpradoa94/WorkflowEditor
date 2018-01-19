
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ghist_CobrosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ghist_CobrosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gabc" type="{http://Webmet.core/}abcGhistCobros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ghist_CobrosW", propOrder = {
    "gabc"
})
public class GhistCobrosW {

    protected AbcGhistCobros gabc;

    /**
     * Obtiene el valor de la propiedad gabc.
     * 
     * @return
     *     possible object is
     *     {@link AbcGhistCobros }
     *     
     */
    public AbcGhistCobros getGabc() {
        return gabc;
    }

    /**
     * Define el valor de la propiedad gabc.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcGhistCobros }
     *     
     */
    public void setGabc(AbcGhistCobros value) {
        this.gabc = value;
    }

}
