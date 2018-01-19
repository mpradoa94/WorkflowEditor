
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_OperatorW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_OperatorW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opr" type="{http://Webmet.core/}searchOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_OperatorW", propOrder = {
    "opr"
})
public class SearchOperatorW {

    protected SearchOperator opr;

    /**
     * Obtiene el valor de la propiedad opr.
     * 
     * @return
     *     possible object is
     *     {@link SearchOperator }
     *     
     */
    public SearchOperator getOpr() {
        return opr;
    }

    /**
     * Define el valor de la propiedad opr.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOperator }
     *     
     */
    public void setOpr(SearchOperator value) {
        this.opr = value;
    }

}
