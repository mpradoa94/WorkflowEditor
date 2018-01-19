
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchDescuentos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchDescuentos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_DSC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDescuentos", propOrder = {
    "idInstancia",
    "nmdsc"
})
public class SearchDescuentos {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "NM_DSC", required = true)
    protected String nmdsc;

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
     * Obtiene el valor de la propiedad nmdsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMDSC() {
        return nmdsc;
    }

    /**
     * Define el valor de la propiedad nmdsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMDSC(String value) {
        this.nmdsc = value;
    }

}
