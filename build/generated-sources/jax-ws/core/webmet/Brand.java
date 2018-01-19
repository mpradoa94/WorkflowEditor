
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para brand complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="brand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_BRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_MF" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "brand", propOrder = {
    "idbrn",
    "nmbrn",
    "idmf"
})
public class Brand {

    @XmlElement(name = "ID_BRN")
    protected int idbrn;
    @XmlElement(name = "NM_BRN")
    protected String nmbrn;
    @XmlElement(name = "ID_MF")
    protected int idmf;

    /**
     * Obtiene el valor de la propiedad idbrn.
     * 
     */
    public int getIDBRN() {
        return idbrn;
    }

    /**
     * Define el valor de la propiedad idbrn.
     * 
     */
    public void setIDBRN(int value) {
        this.idbrn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmbrn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMBRN() {
        return nmbrn;
    }

    /**
     * Define el valor de la propiedad nmbrn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMBRN(String value) {
        this.nmbrn = value;
    }

    /**
     * Obtiene el valor de la propiedad idmf.
     * 
     */
    public int getIDMF() {
        return idmf;
    }

    /**
     * Define el valor de la propiedad idmf.
     * 
     */
    public void setIDMF(int value) {
        this.idmf = value;
    }

}
