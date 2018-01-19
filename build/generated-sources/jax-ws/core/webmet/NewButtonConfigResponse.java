
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para newButtonConfigResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="newButtonConfigResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Oper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_BTN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newButtonConfigResponse", propOrder = {
    "oper",
    "idbtn",
    "resultado"
})
public class NewButtonConfigResponse {

    @XmlElement(name = "Oper")
    protected String oper;
    @XmlElement(name = "ID_BTN")
    protected int idbtn;
    protected Resultado resultado;

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
     * Obtiene el valor de la propiedad idbtn.
     * 
     */
    public int getIDBTN() {
        return idbtn;
    }

    /**
     * Define el valor de la propiedad idbtn.
     * 
     */
    public void setIDBTN(int value) {
        this.idbtn = value;
    }

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

}
