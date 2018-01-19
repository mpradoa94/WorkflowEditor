
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nextNodeWFIndata complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nextNodeWFIndata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_opr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_ext" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_formato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nextNodeWFIndata", propOrder = {
    "idInstancia",
    "idOpr",
    "idExt",
    "idFormato"
})
public class NextNodeWFIndata {

    @XmlElement(name = "Id_instancia")
    protected int idInstancia;
    @XmlElement(name = "id_opr")
    protected int idOpr;
    @XmlElement(name = "id_ext")
    protected int idExt;
    @XmlElement(name = "id_formato")
    protected int idFormato;

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
     * Obtiene el valor de la propiedad idExt.
     * 
     */
    public int getIdExt() {
        return idExt;
    }

    /**
     * Define el valor de la propiedad idExt.
     * 
     */
    public void setIdExt(int value) {
        this.idExt = value;
    }

    /**
     * Obtiene el valor de la propiedad idFormato.
     * 
     */
    public int getIdFormato() {
        return idFormato;
    }

    /**
     * Define el valor de la propiedad idFormato.
     * 
     */
    public void setIdFormato(int value) {
        this.idFormato = value;
    }

}
