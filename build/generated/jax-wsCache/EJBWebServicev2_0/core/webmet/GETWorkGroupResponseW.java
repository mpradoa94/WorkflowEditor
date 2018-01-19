
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_WorkGroupResponseW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_WorkGroupResponseW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wrk" type="{http://Webmet.core/}getWorkGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_WorkGroupResponseW", propOrder = {
    "wrk"
})
public class GETWorkGroupResponseW {

    protected GetWorkGroup wrk;

    /**
     * Obtiene el valor de la propiedad wrk.
     * 
     * @return
     *     possible object is
     *     {@link GetWorkGroup }
     *     
     */
    public GetWorkGroup getWrk() {
        return wrk;
    }

    /**
     * Define el valor de la propiedad wrk.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWorkGroup }
     *     
     */
    public void setWrk(GetWorkGroup value) {
        this.wrk = value;
    }

}
