
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getButtonConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getButtonConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_WK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BTN_PRNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getButtonConfig", propOrder = {
    "idInstancia",
    "idstrrt",
    "idwk",
    "idbtnprnt"
})
public class GetButtonConfig {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_WK")
    protected int idwk;
    @XmlElement(name = "ID_BTN_PRNT")
    protected int idbtnprnt;

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
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad idwk.
     * 
     */
    public int getIDWK() {
        return idwk;
    }

    /**
     * Define el valor de la propiedad idwk.
     * 
     */
    public void setIDWK(int value) {
        this.idwk = value;
    }

    /**
     * Obtiene el valor de la propiedad idbtnprnt.
     * 
     */
    public int getIDBTNPRNT() {
        return idbtnprnt;
    }

    /**
     * Define el valor de la propiedad idbtnprnt.
     * 
     */
    public void setIDBTNPRNT(int value) {
        this.idbtnprnt = value;
    }

}
