
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operatorArranque complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operatorArranque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ARRANQUE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LEIDO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoVolveraVer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operatorArranque", propOrder = {
    "idopr",
    "idarranque",
    "leido",
    "noVolveraVer"
})
public class OperatorArranque {

    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(name = "ID_ARRANQUE")
    protected int idarranque;
    @XmlElement(name = "LEIDO")
    protected String leido;
    @XmlElement(name = "NoVolveraVer")
    protected String noVolveraVer;

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

    /**
     * Obtiene el valor de la propiedad idarranque.
     * 
     */
    public int getIDARRANQUE() {
        return idarranque;
    }

    /**
     * Define el valor de la propiedad idarranque.
     * 
     */
    public void setIDARRANQUE(int value) {
        this.idarranque = value;
    }

    /**
     * Obtiene el valor de la propiedad leido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEIDO() {
        return leido;
    }

    /**
     * Define el valor de la propiedad leido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEIDO(String value) {
        this.leido = value;
    }

    /**
     * Obtiene el valor de la propiedad noVolveraVer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoVolveraVer() {
        return noVolveraVer;
    }

    /**
     * Define el valor de la propiedad noVolveraVer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoVolveraVer(String value) {
        this.noVolveraVer = value;
    }

}
