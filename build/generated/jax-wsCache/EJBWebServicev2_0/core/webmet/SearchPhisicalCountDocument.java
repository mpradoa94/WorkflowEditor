
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchPhisicalCountDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchPhisicalCountDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_PID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPhisicalCountDocument", propOrder = {
    "idInstancia",
    "depid",
    "idlcn"
})
public class SearchPhisicalCountDocument {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "DE_PID", required = true)
    protected String depid;
    @XmlElement(name = "ID_LCN")
    protected int idlcn;

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
     * Obtiene el valor de la propiedad depid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPID() {
        return depid;
    }

    /**
     * Define el valor de la propiedad depid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPID(String value) {
        this.depid = value;
    }

    /**
     * Obtiene el valor de la propiedad idlcn.
     * 
     */
    public int getIDLCN() {
        return idlcn;
    }

    /**
     * Define el valor de la propiedad idlcn.
     * 
     */
    public void setIDLCN(int value) {
        this.idlcn = value;
    }

}
