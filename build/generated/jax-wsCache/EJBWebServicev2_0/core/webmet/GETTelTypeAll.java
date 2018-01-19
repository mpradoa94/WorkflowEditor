
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_TelTypeAll complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_TelTypeAll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="teltype" type="{http://Webmet.core/}getTelephoneTypeALL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_TelTypeAll", propOrder = {
    "teltype"
})
public class GETTelTypeAll {

    protected GetTelephoneTypeALL teltype;

    /**
     * Obtiene el valor de la propiedad teltype.
     * 
     * @return
     *     possible object is
     *     {@link GetTelephoneTypeALL }
     *     
     */
    public GetTelephoneTypeALL getTeltype() {
        return teltype;
    }

    /**
     * Define el valor de la propiedad teltype.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTelephoneTypeALL }
     *     
     */
    public void setTeltype(GetTelephoneTypeALL value) {
        this.teltype = value;
    }

}
