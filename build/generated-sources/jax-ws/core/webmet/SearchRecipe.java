
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchRecipe complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchRecipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_RCPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRecipe", propOrder = {
    "idInstancia",
    "dercpe"
})
public class SearchRecipe {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "DE_RCPE", required = true)
    protected String dercpe;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad dercpe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDERCPE() {
        return dercpe;
    }

    /**
     * Define el valor de la propiedad dercpe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDERCPE(String value) {
        this.dercpe = value;
    }

}
