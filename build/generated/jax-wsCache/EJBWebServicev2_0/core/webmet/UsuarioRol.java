
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuarioRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioRol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_opr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_usr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_usr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioRol", propOrder = {
    "idOpr",
    "idUsr",
    "nmUsr"
})
public class UsuarioRol {

    @XmlElement(name = "id_opr")
    protected int idOpr;
    @XmlElement(name = "id_usr")
    protected int idUsr;
    @XmlElement(name = "nm_usr")
    protected String nmUsr;

    /**
     * Obtiene el valor de la propiedad idOpr.
     * 
     */
    public int getIdOpr() {
        return idOpr;
    }

    /**
     * Define el valor de la propiedad idOpr.
     * 
     */
    public void setIdOpr(int value) {
        this.idOpr = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsr.
     * 
     */
    public int getIdUsr() {
        return idUsr;
    }

    /**
     * Define el valor de la propiedad idUsr.
     * 
     */
    public void setIdUsr(int value) {
        this.idUsr = value;
    }

    /**
     * Obtiene el valor de la propiedad nmUsr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmUsr() {
        return nmUsr;
    }

    /**
     * Define el valor de la propiedad nmUsr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmUsr(String value) {
        this.nmUsr = value;
    }

}
