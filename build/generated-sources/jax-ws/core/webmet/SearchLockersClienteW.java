
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_LockersClienteW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_LockersClienteW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locks" type="{http://Webmet.core/}searchLockersCliente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_LockersClienteW", propOrder = {
    "locks"
})
public class SearchLockersClienteW {

    protected SearchLockersCliente locks;

    /**
     * Obtiene el valor de la propiedad locks.
     * 
     * @return
     *     possible object is
     *     {@link SearchLockersCliente }
     *     
     */
    public SearchLockersCliente getLocks() {
        return locks;
    }

    /**
     * Define el valor de la propiedad locks.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLockersCliente }
     *     
     */
    public void setLocks(SearchLockersCliente value) {
        this.locks = value;
    }

}
