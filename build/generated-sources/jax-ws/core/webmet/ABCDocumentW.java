
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_DocumentW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_DocumentW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doc" type="{http://Webmet.core/}abcDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_DocumentW", propOrder = {
    "doc"
})
public class ABCDocumentW {

    protected AbcDocument doc;

    /**
     * Obtiene el valor de la propiedad doc.
     * 
     * @return
     *     possible object is
     *     {@link AbcDocument }
     *     
     */
    public AbcDocument getDoc() {
        return doc;
    }

    /**
     * Define el valor de la propiedad doc.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcDocument }
     *     
     */
    public void setDoc(AbcDocument value) {
        this.doc = value;
    }

}
