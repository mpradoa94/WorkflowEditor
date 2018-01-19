
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_EmployeeW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_EmployeeW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emp" type="{http://Webmet.core/}searchEmployee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_EmployeeW", propOrder = {
    "emp"
})
public class SearchEmployeeW {

    protected SearchEmployee emp;

    /**
     * Obtiene el valor de la propiedad emp.
     * 
     * @return
     *     possible object is
     *     {@link SearchEmployee }
     *     
     */
    public SearchEmployee getEmp() {
        return emp;
    }

    /**
     * Define el valor de la propiedad emp.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEmployee }
     *     
     */
    public void setEmp(SearchEmployee value) {
        this.emp = value;
    }

}
