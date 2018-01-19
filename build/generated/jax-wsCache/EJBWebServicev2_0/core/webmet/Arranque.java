
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arranque complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arranque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ARRANQUE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_ARRANQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "arranque", propOrder = {
    "idarranque",
    "dearranque",
    "idrs"
})
public class Arranque {

    @XmlElement(name = "ID_ARRANQUE")
    protected int idarranque;
    @XmlElement(name = "DE_ARRANQUE")
    protected String dearranque;
    @XmlElement(name = "ID_RS")
    protected int idrs;

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
     * Obtiene el valor de la propiedad dearranque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEARRANQUE() {
        return dearranque;
    }

    /**
     * Define el valor de la propiedad dearranque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEARRANQUE(String value) {
        this.dearranque = value;
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
