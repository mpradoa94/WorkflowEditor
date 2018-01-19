
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGroupAccessList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGroupAccessList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_WRK_GP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupAccessList", propOrder = {
    "idwrkgp"
})
public class GetGroupAccessList {

    @XmlElement(name = "ID_WRK_GP")
    protected int idwrkgp;

    /**
     * Obtiene el valor de la propiedad idwrkgp.
     * 
     */
    public int getIDWRKGP() {
        return idwrkgp;
    }

    /**
     * Define el valor de la propiedad idwrkgp.
     * 
     */
    public void setIDWRKGP(int value) {
        this.idwrkgp = value;
    }

}
