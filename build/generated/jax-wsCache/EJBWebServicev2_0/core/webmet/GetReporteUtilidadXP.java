
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteUtilidadXP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteUtilidadXP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mar1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mar2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cat1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cat2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fe1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fe2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteUtilidadXP", propOrder = {
    "idInstancia",
    "mar1",
    "mar2",
    "cat1",
    "cat2",
    "fe1",
    "fe2"
})
public class GetReporteUtilidadXP {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected String mar1;
    @XmlElement(required = true)
    protected String mar2;
    @XmlElement(required = true)
    protected String cat1;
    @XmlElement(required = true)
    protected String cat2;
    @XmlElement(required = true)
    protected String fe1;
    @XmlElement(required = true)
    protected String fe2;

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
     * Obtiene el valor de la propiedad mar1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMar1() {
        return mar1;
    }

    /**
     * Define el valor de la propiedad mar1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMar1(String value) {
        this.mar1 = value;
    }

    /**
     * Obtiene el valor de la propiedad mar2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMar2() {
        return mar2;
    }

    /**
     * Define el valor de la propiedad mar2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMar2(String value) {
        this.mar2 = value;
    }

    /**
     * Obtiene el valor de la propiedad cat1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCat1() {
        return cat1;
    }

    /**
     * Define el valor de la propiedad cat1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCat1(String value) {
        this.cat1 = value;
    }

    /**
     * Obtiene el valor de la propiedad cat2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCat2() {
        return cat2;
    }

    /**
     * Define el valor de la propiedad cat2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCat2(String value) {
        this.cat2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fe1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFe1() {
        return fe1;
    }

    /**
     * Define el valor de la propiedad fe1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFe1(String value) {
        this.fe1 = value;
    }

    /**
     * Obtiene el valor de la propiedad fe2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFe2() {
        return fe2;
    }

    /**
     * Define el valor de la propiedad fe2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFe2(String value) {
        this.fe2 = value;
    }

}
