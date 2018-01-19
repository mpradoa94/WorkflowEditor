
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VOprW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VOprW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nmopr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VOprW", propOrder = {
    "nmopr",
    "inst"
})
public class VOprW {

    protected String nmopr;
    protected int inst;

    /**
     * Obtiene el valor de la propiedad nmopr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmopr() {
        return nmopr;
    }

    /**
     * Define el valor de la propiedad nmopr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmopr(String value) {
        this.nmopr = value;
    }

    /**
     * Obtiene el valor de la propiedad inst.
     * 
     */
    public int getInst() {
        return inst;
    }

    /**
     * Define el valor de la propiedad inst.
     * 
     */
    public void setInst(int value) {
        this.inst = value;
    }

}
