
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGuiaCobranza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGuiaCobranza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GUIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_COBRADOR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_GUIA_ANT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGuiaCobranza", propOrder = {
    "operacion",
    "idInstancia",
    "idguia",
    "nmcobrador",
    "idguiaant"
})
public class GetGuiaCobranza {

    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_GUIA")
    protected int idguia;
    @XmlElement(name = "NM_COBRADOR", required = true)
    protected String nmcobrador;
    @XmlElement(name = "ID_GUIA_ANT")
    protected int idguiaant;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

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
     * Obtiene el valor de la propiedad idguia.
     * 
     */
    public int getIDGUIA() {
        return idguia;
    }

    /**
     * Define el valor de la propiedad idguia.
     * 
     */
    public void setIDGUIA(int value) {
        this.idguia = value;
    }

    /**
     * Obtiene el valor de la propiedad nmcobrador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMCOBRADOR() {
        return nmcobrador;
    }

    /**
     * Define el valor de la propiedad nmcobrador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMCOBRADOR(String value) {
        this.nmcobrador = value;
    }

    /**
     * Obtiene el valor de la propiedad idguiaant.
     * 
     */
    public int getIDGUIAANT() {
        return idguiaant;
    }

    /**
     * Define el valor de la propiedad idguiaant.
     * 
     */
    public void setIDGUIAANT(int value) {
        this.idguiaant = value;
    }

}
