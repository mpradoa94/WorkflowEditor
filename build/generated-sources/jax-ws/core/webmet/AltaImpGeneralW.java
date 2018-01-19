
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Alta_ImpGeneralW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Alta_ImpGeneralW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://Webmet.core/}abcImpuestosNotaria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alta_ImpGeneralW", propOrder = {
    "param"
})
public class AltaImpGeneralW {

    protected AbcImpuestosNotaria param;

    /**
     * Obtiene el valor de la propiedad param.
     * 
     * @return
     *     possible object is
     *     {@link AbcImpuestosNotaria }
     *     
     */
    public AbcImpuestosNotaria getParam() {
        return param;
    }

    /**
     * Define el valor de la propiedad param.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcImpuestosNotaria }
     *     
     */
    public void setParam(AbcImpuestosNotaria value) {
        this.param = value;
    }

}
