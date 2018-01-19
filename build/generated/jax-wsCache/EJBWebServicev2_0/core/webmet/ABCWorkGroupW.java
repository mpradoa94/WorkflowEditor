
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_WorkGroupW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_WorkGroupW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wrk" type="{http://Webmet.core/}abcWorkGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_WorkGroupW", propOrder = {
    "wrk"
})
public class ABCWorkGroupW {

    protected AbcWorkGroup wrk;

    /**
     * Obtiene el valor de la propiedad wrk.
     * 
     * @return
     *     possible object is
     *     {@link AbcWorkGroup }
     *     
     */
    public AbcWorkGroup getWrk() {
        return wrk;
    }

    /**
     * Define el valor de la propiedad wrk.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcWorkGroup }
     *     
     */
    public void setWrk(AbcWorkGroup value) {
        this.wrk = value;
    }

}
