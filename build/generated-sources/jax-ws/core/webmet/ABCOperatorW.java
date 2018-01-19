
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_OperatorW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_OperatorW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opr" type="{http://Webmet.core/}abcOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_OperatorW", propOrder = {
    "opr"
})
public class ABCOperatorW {

    protected AbcOperator opr;

    /**
     * Obtiene el valor de la propiedad opr.
     * 
     * @return
     *     possible object is
     *     {@link AbcOperator }
     *     
     */
    public AbcOperator getOpr() {
        return opr;
    }

    /**
     * Define el valor de la propiedad opr.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcOperator }
     *     
     */
    public void setOpr(AbcOperator value) {
        this.opr = value;
    }

}
