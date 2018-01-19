
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchOperator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchOperator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NM_OPR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOperator", propOrder = {
    "nmopr",
    "idinstancia"
})
public class SearchOperator {

    @XmlElement(name = "NM_OPR", required = true)
    protected String nmopr;
    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;

    /**
     * Obtiene el valor de la propiedad nmopr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMOPR() {
        return nmopr;
    }

    /**
     * Define el valor de la propiedad nmopr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMOPR(String value) {
        this.nmopr = value;
    }

    /**
     * Obtiene el valor de la propiedad idinstancia.
     * 
     */
    public int getIDINSTANCIA() {
        return idinstancia;
    }

    /**
     * Define el valor de la propiedad idinstancia.
     * 
     */
    public void setIDINSTANCIA(int value) {
        this.idinstancia = value;
    }

}
