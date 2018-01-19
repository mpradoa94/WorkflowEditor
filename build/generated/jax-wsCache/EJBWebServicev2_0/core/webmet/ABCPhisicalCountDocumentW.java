
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_PhisicalCountDocumentW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_PhisicalCountDocumentW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pcd" type="{http://Webmet.core/}abcPhisicalCountDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_PhisicalCountDocumentW", propOrder = {
    "pcd"
})
public class ABCPhisicalCountDocumentW {

    protected AbcPhisicalCountDocument pcd;

    /**
     * Obtiene el valor de la propiedad pcd.
     * 
     * @return
     *     possible object is
     *     {@link AbcPhisicalCountDocument }
     *     
     */
    public AbcPhisicalCountDocument getPcd() {
        return pcd;
    }

    /**
     * Define el valor de la propiedad pcd.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcPhisicalCountDocument }
     *     
     */
    public void setPcd(AbcPhisicalCountDocument value) {
        this.pcd = value;
    }

}
