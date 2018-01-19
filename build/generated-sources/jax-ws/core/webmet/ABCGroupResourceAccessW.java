
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_GroupResourceAccessW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_GroupResourceAccessW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gra" type="{http://Webmet.core/}abcGroupResourceAccess" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_GroupResourceAccessW", propOrder = {
    "gra"
})
public class ABCGroupResourceAccessW {

    protected AbcGroupResourceAccess gra;

    /**
     * Obtiene el valor de la propiedad gra.
     * 
     * @return
     *     possible object is
     *     {@link AbcGroupResourceAccess }
     *     
     */
    public AbcGroupResourceAccess getGra() {
        return gra;
    }

    /**
     * Define el valor de la propiedad gra.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcGroupResourceAccess }
     *     
     */
    public void setGra(AbcGroupResourceAccess value) {
        this.gra = value;
    }

}
