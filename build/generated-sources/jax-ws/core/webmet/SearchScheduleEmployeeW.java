
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_ScheduleEmployeeW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_ScheduleEmployeeW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scem" type="{http://Webmet.core/}searchScheduleEmployee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_ScheduleEmployeeW", propOrder = {
    "scem"
})
public class SearchScheduleEmployeeW {

    protected SearchScheduleEmployee scem;

    /**
     * Obtiene el valor de la propiedad scem.
     * 
     * @return
     *     possible object is
     *     {@link SearchScheduleEmployee }
     *     
     */
    public SearchScheduleEmployee getScem() {
        return scem;
    }

    /**
     * Define el valor de la propiedad scem.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScheduleEmployee }
     *     
     */
    public void setScem(SearchScheduleEmployee value) {
        this.scem = value;
    }

}
