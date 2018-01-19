
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_POSIdentityW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_POSIdentityW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="posid" type="{http://Webmet.core/}abcPOSIdentity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_POSIdentityW", propOrder = {
    "posid"
})
public class ABCPOSIdentityW {

    protected AbcPOSIdentity posid;

    /**
     * Obtiene el valor de la propiedad posid.
     * 
     * @return
     *     possible object is
     *     {@link AbcPOSIdentity }
     *     
     */
    public AbcPOSIdentity getPosid() {
        return posid;
    }

    /**
     * Define el valor de la propiedad posid.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcPOSIdentity }
     *     
     */
    public void setPosid(AbcPOSIdentity value) {
        this.posid = value;
    }

}
