
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFlujoVersion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFlujoVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idFlujo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlujoVersion", propOrder = {
    "idInstancia",
    "idFlujo",
    "idVersion",
    "idUser"
})
public class GetFlujoVersion {

    @XmlElement(name = "Id_Instancia")
    protected int idInstancia;
    protected int idFlujo;
    protected int idVersion;
    protected int idUser;

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
     * Obtiene el valor de la propiedad idFlujo.
     * 
     */
    public int getIdFlujo() {
        return idFlujo;
    }

    /**
     * Define el valor de la propiedad idFlujo.
     * 
     */
    public void setIdFlujo(int value) {
        this.idFlujo = value;
    }

    /**
     * Obtiene el valor de la propiedad idVersion.
     * 
     */
    public int getIdVersion() {
        return idVersion;
    }

    /**
     * Define el valor de la propiedad idVersion.
     * 
     */
    public void setIdVersion(int value) {
        this.idVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad idUser.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Define el valor de la propiedad idUser.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

}
