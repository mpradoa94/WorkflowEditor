
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteConcentradoMovimientos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteConcentradoMovimientos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "getReporteConcentradoMovimientos", propOrder = {
    "idInstancia",
    "fe1",
    "fe2"
})
public class GetReporteConcentradoMovimientos {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
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
