
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contratosList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contratosList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratosList", propOrder = {
    "idcontrato",
    "nmct"
})
public class ContratosList {

    @XmlElement(name = "ID_CONTRATO")
    protected int idcontrato;
    @XmlElement(name = "NM_CT")
    protected String nmct;

    /**
     * Obtiene el valor de la propiedad idcontrato.
     * 
     */
    public int getIDCONTRATO() {
        return idcontrato;
    }

    /**
     * Define el valor de la propiedad idcontrato.
     * 
     */
    public void setIDCONTRATO(int value) {
        this.idcontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad nmct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMCT() {
        return nmct;
    }

    /**
     * Define el valor de la propiedad nmct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMCT(String value) {
        this.nmct = value;
    }

}
