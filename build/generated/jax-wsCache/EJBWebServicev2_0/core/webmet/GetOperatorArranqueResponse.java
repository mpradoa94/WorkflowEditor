
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getOperatorArranqueResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getOperatorArranqueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="opr" type="{http://Webmet.core/}operatorArranque" minOccurs="0"/>
 *         &lt;element name="lstopr" type="{http://Webmet.core/}operatorArranque" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOperatorArranqueResponse", propOrder = {
    "resultado",
    "opr",
    "lstopr"
})
public class GetOperatorArranqueResponse {

    protected Resultado resultado;
    protected OperatorArranque opr;
    @XmlElement(nillable = true)
    protected List<OperatorArranque> lstopr;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad opr.
     * 
     * @return
     *     possible object is
     *     {@link OperatorArranque }
     *     
     */
    public OperatorArranque getOpr() {
        return opr;
    }

    /**
     * Define el valor de la propiedad opr.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorArranque }
     *     
     */
    public void setOpr(OperatorArranque value) {
        this.opr = value;
    }

    /**
     * Gets the value of the lstopr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstopr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstopr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorArranque }
     * 
     * 
     */
    public List<OperatorArranque> getLstopr() {
        if (lstopr == null) {
            lstopr = new ArrayList<OperatorArranque>();
        }
        return this.lstopr;
    }

}
