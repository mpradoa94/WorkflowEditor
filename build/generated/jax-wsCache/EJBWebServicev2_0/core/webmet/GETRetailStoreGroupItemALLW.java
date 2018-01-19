
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_RetailStoreGroupItemALLW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_RetailStoreGroupItemALLW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsgi" type="{http://Webmet.core/}getRetailStoreGroupItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_RetailStoreGroupItemALLW", propOrder = {
    "rsgi"
})
public class GETRetailStoreGroupItemALLW {

    protected GetRetailStoreGroupItem rsgi;

    /**
     * Obtiene el valor de la propiedad rsgi.
     * 
     * @return
     *     possible object is
     *     {@link GetRetailStoreGroupItem }
     *     
     */
    public GetRetailStoreGroupItem getRsgi() {
        return rsgi;
    }

    /**
     * Define el valor de la propiedad rsgi.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRetailStoreGroupItem }
     *     
     */
    public void setRsgi(GetRetailStoreGroupItem value) {
        this.rsgi = value;
    }

}
