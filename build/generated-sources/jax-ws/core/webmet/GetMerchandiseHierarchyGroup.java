
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getMerchandiseHierarchyGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getMerchandiseHierarchyGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MRHC_PRNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMerchandiseHierarchyGroup", propOrder = {
    "idInstancia",
    "idmrhcprnt"
})
public class GetMerchandiseHierarchyGroup {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_MRHC_PRNT")
    protected int idmrhcprnt;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad idmrhcprnt.
     * 
     */
    public int getIDMRHCPRNT() {
        return idmrhcprnt;
    }

    /**
     * Define el valor de la propiedad idmrhcprnt.
     * 
     */
    public void setIDMRHCPRNT(int value) {
        this.idmrhcprnt = value;
    }

}
