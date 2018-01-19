
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchInventoryLocation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchInventoryLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_LCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchInventoryLocation", propOrder = {
    "idinstancia",
    "idstrrt",
    "nmlcn"
})
public class SearchInventoryLocation {

    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "NM_LCN")
    protected String nmlcn;

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

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad nmlcn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMLCN() {
        return nmlcn;
    }

    /**
     * Define el valor de la propiedad nmlcn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMLCN(String value) {
        this.nmlcn = value;
    }

}
