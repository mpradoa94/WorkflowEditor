
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCveRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCveRol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idInstancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idopr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idproceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCveRol", propOrder = {
    "idInstancia",
    "idopr",
    "idproceso"
})
public class GetCveRol {

    protected int idInstancia;
    protected int idopr;
    protected int idproceso;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIdopr() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIdopr(int value) {
        this.idopr = value;
    }

    /**
     * Obtiene el valor de la propiedad idproceso.
     * 
     */
    public int getIdproceso() {
        return idproceso;
    }

    /**
     * Define el valor de la propiedad idproceso.
     * 
     */
    public void setIdproceso(int value) {
        this.idproceso = value;
    }

}
