
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para corteZResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="corteZResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Oper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorteId" type="{http://Webmet.core/}transaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultadoMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corteZResponse", propOrder = {
    "oper",
    "corteId",
    "resultado",
    "resultadoMsg"
})
public class CorteZResponse {

    @XmlElement(name = "Oper")
    protected String oper;
    @XmlElement(name = "CorteId", nillable = true)
    protected List<Transaction> corteId;
    protected int resultado;
    protected String resultadoMsg;

    /**
     * Obtiene el valor de la propiedad oper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOper() {
        return oper;
    }

    /**
     * Define el valor de la propiedad oper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOper(String value) {
        this.oper = value;
    }

    /**
     * Gets the value of the corteId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corteId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorteId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction }
     * 
     * 
     */
    public List<Transaction> getCorteId() {
        if (corteId == null) {
            corteId = new ArrayList<Transaction>();
        }
        return this.corteId;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     */
    public void setResultado(int value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoMsg() {
        return resultadoMsg;
    }

    /**
     * Define el valor de la propiedad resultadoMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoMsg(String value) {
        this.resultadoMsg = value;
    }

}
