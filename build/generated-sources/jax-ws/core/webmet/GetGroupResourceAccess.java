
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGroupResourceAccess complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGroupResourceAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_GP_WKR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupResourceAccess", propOrder = {
    "idgpwkr",
    "idrs"
})
public class GetGroupResourceAccess {

    @XmlElement(name = "ID_GP_WKR")
    protected int idgpwkr;
    @XmlElement(name = "ID_RS")
    protected int idrs;

    /**
     * Obtiene el valor de la propiedad idgpwkr.
     * 
     */
    public int getIDGPWKR() {
        return idgpwkr;
    }

    /**
     * Define el valor de la propiedad idgpwkr.
     * 
     */
    public void setIDGPWKR(int value) {
        this.idgpwkr = value;
    }

    /**
     * Obtiene el valor de la propiedad idrs.
     * 
     */
    public int getIDRS() {
        return idrs;
    }

    /**
     * Define el valor de la propiedad idrs.
     * 
     */
    public void setIDRS(int value) {
        this.idrs = value;
    }

}
