
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_ItemW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_ItemW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itm" type="{http://Webmet.core/}abcItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_ItemW", propOrder = {
    "itm"
})
public class ABCItemW {

    protected AbcItem itm;

    /**
     * Obtiene el valor de la propiedad itm.
     * 
     * @return
     *     possible object is
     *     {@link AbcItem }
     *     
     */
    public AbcItem getItm() {
        return itm;
    }

    /**
     * Define el valor de la propiedad itm.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcItem }
     *     
     */
    public void setItm(AbcItem value) {
        this.itm = value;
    }

}
