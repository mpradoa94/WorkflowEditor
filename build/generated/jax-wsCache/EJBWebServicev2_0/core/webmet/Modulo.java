
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_MODULO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_MODULO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modulo", propOrder = {
    "idmodulo",
    "demodulo"
})
public class Modulo {

    @XmlElement(name = "ID_MODULO")
    protected int idmodulo;
    @XmlElement(name = "DE_MODULO")
    protected String demodulo;

    /**
     * Obtiene el valor de la propiedad idmodulo.
     * 
     */
    public int getIDMODULO() {
        return idmodulo;
    }

    /**
     * Define el valor de la propiedad idmodulo.
     * 
     */
    public void setIDMODULO(int value) {
        this.idmodulo = value;
    }

    /**
     * Obtiene el valor de la propiedad demodulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEMODULO() {
        return demodulo;
    }

    /**
     * Define el valor de la propiedad demodulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEMODULO(String value) {
        this.demodulo = value;
    }

}
