
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ausencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ausencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDCT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ausencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ausencia", propOrder = {
    "idct",
    "ausencia"
})
public class Ausencia {

    @XmlElement(name = "IDCT")
    protected int idct;
    @XmlElement(name = "Ausencia")
    protected String ausencia;

    /**
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
    }

    /**
     * Obtiene el valor de la propiedad ausencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAusencia() {
        return ausencia;
    }

    /**
     * Define el valor de la propiedad ausencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAusencia(String value) {
        this.ausencia = value;
    }

}
