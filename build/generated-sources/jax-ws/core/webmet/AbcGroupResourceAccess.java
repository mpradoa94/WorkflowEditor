
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcGroupResourceAccess complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcGroupResourceAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gra" type="{http://Webmet.core/}groupResourceAccess"/>
 *         &lt;element name="loghead" type="{http://Webmet.core/}logHead"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcGroupResourceAccess", propOrder = {
    "gra",
    "loghead"
})
public class AbcGroupResourceAccess {

    @XmlElement(required = true)
    protected GroupResourceAccess gra;
    @XmlElement(required = true)
    protected LogHead loghead;

    /**
     * Obtiene el valor de la propiedad gra.
     * 
     * @return
     *     possible object is
     *     {@link GroupResourceAccess }
     *     
     */
    public GroupResourceAccess getGra() {
        return gra;
    }

    /**
     * Define el valor de la propiedad gra.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupResourceAccess }
     *     
     */
    public void setGra(GroupResourceAccess value) {
        this.gra = value;
    }

    /**
     * Obtiene el valor de la propiedad loghead.
     * 
     * @return
     *     possible object is
     *     {@link LogHead }
     *     
     */
    public LogHead getLoghead() {
        return loghead;
    }

    /**
     * Define el valor de la propiedad loghead.
     * 
     * @param value
     *     allowed object is
     *     {@link LogHead }
     *     
     */
    public void setLoghead(LogHead value) {
        this.loghead = value;
    }

}
