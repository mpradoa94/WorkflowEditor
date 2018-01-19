
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_WorkstationW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_WorkstationW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="work" type="{http://Webmet.core/}getWorkstation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_WorkstationW", propOrder = {
    "work"
})
public class GETWorkstationW {

    protected GetWorkstation work;

    /**
     * Obtiene el valor de la propiedad work.
     * 
     * @return
     *     possible object is
     *     {@link GetWorkstation }
     *     
     */
    public GetWorkstation getWork() {
        return work;
    }

    /**
     * Define el valor de la propiedad work.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWorkstation }
     *     
     */
    public void setWork(GetWorkstation value) {
        this.work = value;
    }

}
