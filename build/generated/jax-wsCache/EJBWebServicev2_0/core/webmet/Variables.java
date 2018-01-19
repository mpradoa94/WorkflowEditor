
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para variables complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="variables">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_variable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_modelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_variable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ty_variable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variables", propOrder = {
    "idVariable",
    "idModelo",
    "nmVariable",
    "tyVariable"
})
public class Variables {

    @XmlElement(name = "id_variable")
    protected int idVariable;
    @XmlElement(name = "id_modelo")
    protected int idModelo;
    @XmlElement(name = "nm_variable")
    protected String nmVariable;
    @XmlElement(name = "ty_variable")
    protected String tyVariable;

    /**
     * Obtiene el valor de la propiedad idVariable.
     * 
     */
    public int getIdVariable() {
        return idVariable;
    }

    /**
     * Define el valor de la propiedad idVariable.
     * 
     */
    public void setIdVariable(int value) {
        this.idVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad idModelo.
     * 
     */
    public int getIdModelo() {
        return idModelo;
    }

    /**
     * Define el valor de la propiedad idModelo.
     * 
     */
    public void setIdModelo(int value) {
        this.idModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad nmVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmVariable() {
        return nmVariable;
    }

    /**
     * Define el valor de la propiedad nmVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmVariable(String value) {
        this.nmVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad tyVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyVariable() {
        return tyVariable;
    }

    /**
     * Define el valor de la propiedad tyVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyVariable(String value) {
        this.tyVariable = value;
    }

}
