
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcUsuariosEI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcUsuariosEI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idform" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipousu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idopr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcUsuariosEI", propOrder = {
    "idInstancia",
    "idform",
    "tipousu",
    "idopr"
})
public class AbcUsuariosEI {

    @XmlElement(name = "Id_instancia")
    protected int idInstancia;
    protected int idform;
    @XmlElement(required = true)
    protected String tipousu;
    protected int idopr;

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
     * Obtiene el valor de la propiedad idform.
     * 
     */
    public int getIdform() {
        return idform;
    }

    /**
     * Define el valor de la propiedad idform.
     * 
     */
    public void setIdform(int value) {
        this.idform = value;
    }

    /**
     * Obtiene el valor de la propiedad tipousu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipousu() {
        return tipousu;
    }

    /**
     * Define el valor de la propiedad tipousu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipousu(String value) {
        this.tipousu = value;
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

}
