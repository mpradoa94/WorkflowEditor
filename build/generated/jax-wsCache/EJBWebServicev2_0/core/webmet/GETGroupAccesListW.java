
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_GroupAccesListW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_GroupAccesListW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grp" type="{http://Webmet.core/}getGroupAccessList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_GroupAccesListW", propOrder = {
    "grp"
})
public class GETGroupAccesListW {

    protected GetGroupAccessList grp;

    /**
     * Obtiene el valor de la propiedad grp.
     * 
     * @return
     *     possible object is
     *     {@link GetGroupAccessList }
     *     
     */
    public GetGroupAccessList getGrp() {
        return grp;
    }

    /**
     * Define el valor de la propiedad grp.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGroupAccessList }
     *     
     */
    public void setGrp(GetGroupAccessList value) {
        this.grp = value;
    }

}
