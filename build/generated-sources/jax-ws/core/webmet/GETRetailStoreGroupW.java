
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_RetailStoreGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_RetailStoreGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsgp" type="{http://Webmet.core/}getRetailStoreGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_RetailStoreGroupW", propOrder = {
    "rsgp"
})
public class GETRetailStoreGroupW {

    protected GetRetailStoreGroup rsgp;

    /**
     * Obtiene el valor de la propiedad rsgp.
     * 
     * @return
     *     possible object is
     *     {@link GetRetailStoreGroup }
     *     
     */
    public GetRetailStoreGroup getRsgp() {
        return rsgp;
    }

    /**
     * Define el valor de la propiedad rsgp.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRetailStoreGroup }
     *     
     */
    public void setRsgp(GetRetailStoreGroup value) {
        this.rsgp = value;
    }

}
