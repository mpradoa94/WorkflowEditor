
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lenguaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lenguaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LNG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Lenguaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lenguaje", propOrder = {
    "idlng",
    "lenguaje"
})
public class Lenguaje {

    @XmlElement(name = "ID_LNG")
    protected int idlng;
    @XmlElement(name = "Lenguaje")
    protected String lenguaje;

    /**
     * Obtiene el valor de la propiedad idlng.
     * 
     */
    public int getIDLNG() {
        return idlng;
    }

    /**
     * Define el valor de la propiedad idlng.
     * 
     */
    public void setIDLNG(int value) {
        this.idlng = value;
    }

    /**
     * Obtiene el valor de la propiedad lenguaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenguaje() {
        return lenguaje;
    }

    /**
     * Define el valor de la propiedad lenguaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenguaje(String value) {
        this.lenguaje = value;
    }

}
