
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Get_TyIdW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Get_TyIdW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tyid" type="{http://Webmet.core/}getTyId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_TyIdW", propOrder = {
    "tyid"
})
public class GetTyIdW {

    protected GetTyId tyid;

    /**
     * Obtiene el valor de la propiedad tyid.
     * 
     * @return
     *     possible object is
     *     {@link GetTyId }
     *     
     */
    public GetTyId getTyid() {
        return tyid;
    }

    /**
     * Define el valor de la propiedad tyid.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTyId }
     *     
     */
    public void setTyid(GetTyId value) {
        this.tyid = value;
    }

}
