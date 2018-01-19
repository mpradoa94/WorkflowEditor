
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccesosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccesosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abc" type="{http://Webmet.core/}abcAccesos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccesosW", propOrder = {
    "abc"
})
public class AccesosW {

    protected AbcAccesos abc;

    /**
     * Obtiene el valor de la propiedad abc.
     * 
     * @return
     *     possible object is
     *     {@link AbcAccesos }
     *     
     */
    public AbcAccesos getAbc() {
        return abc;
    }

    /**
     * Define el valor de la propiedad abc.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcAccesos }
     *     
     */
    public void setAbc(AbcAccesos value) {
        this.abc = value;
    }

}
