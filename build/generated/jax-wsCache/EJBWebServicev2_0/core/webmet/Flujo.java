
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flujo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flujo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFlujo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nmFlujo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flujo", propOrder = {
    "idFlujo",
    "nmFlujo"
})
public class Flujo {

    protected int idFlujo;
    protected String nmFlujo;

    /**
     * Obtiene el valor de la propiedad idFlujo.
     * 
     */
    public int getIdFlujo() {
        return idFlujo;
    }

    /**
     * Define el valor de la propiedad idFlujo.
     * 
     */
    public void setIdFlujo(int value) {
        this.idFlujo = value;
    }

    /**
     * Obtiene el valor de la propiedad nmFlujo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmFlujo() {
        return nmFlujo;
    }

    /**
     * Define el valor de la propiedad nmFlujo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmFlujo(String value) {
        this.nmFlujo = value;
    }

}
