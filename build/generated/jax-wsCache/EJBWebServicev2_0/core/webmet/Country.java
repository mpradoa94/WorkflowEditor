
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para country complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="country">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CNY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country", propOrder = {
    "idcountry",
    "idcny",
    "nombre"
})
public class Country {

    @XmlElement(name = "ID_COUNTRY")
    protected int idcountry;
    @XmlElement(name = "ID_CNY")
    protected int idcny;
    @XmlElement(name = "NOMBRE")
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad idcountry.
     * 
     */
    public int getIDCOUNTRY() {
        return idcountry;
    }

    /**
     * Define el valor de la propiedad idcountry.
     * 
     */
    public void setIDCOUNTRY(int value) {
        this.idcountry = value;
    }

    /**
     * Obtiene el valor de la propiedad idcny.
     * 
     */
    public int getIDCNY() {
        return idcny;
    }

    /**
     * Define el valor de la propiedad idcny.
     * 
     */
    public void setIDCNY(int value) {
        this.idcny = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

}
