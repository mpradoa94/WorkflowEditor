
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_TyIdW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_TyIdW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tyid" type="{http://Webmet.core/}abcTyId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_TyIdW", propOrder = {
    "tyid"
})
public class ABCTyIdW {

    protected AbcTyId tyid;

    /**
     * Obtiene el valor de la propiedad tyid.
     * 
     * @return
     *     possible object is
     *     {@link AbcTyId }
     *     
     */
    public AbcTyId getTyid() {
        return tyid;
    }

    /**
     * Define el valor de la propiedad tyid.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcTyId }
     *     
     */
    public void setTyid(AbcTyId value) {
        this.tyid = value;
    }

}
