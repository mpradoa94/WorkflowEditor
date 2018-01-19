
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guiaCobranza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guiaCobranza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_GUIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CV_COBRADOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_DCTO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GUIA_ANT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VALIDADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiaCobranza", propOrder = {
    "idguia",
    "cvcobrador",
    "iddcto",
    "idguiaant",
    "validado",
    "estatus"
})
public class GuiaCobranza {

    @XmlElement(name = "ID_GUIA")
    protected int idguia;
    @XmlElement(name = "CV_COBRADOR")
    protected String cvcobrador;
    @XmlElement(name = "ID_DCTO")
    protected int iddcto;
    @XmlElement(name = "ID_GUIA_ANT")
    protected int idguiaant;
    @XmlElement(name = "VALIDADO")
    protected String validado;
    @XmlElement(name = "ESTATUS")
    protected String estatus;

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
     * Obtiene el valor de la propiedad cvcobrador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVCOBRADOR() {
        return cvcobrador;
    }

    /**
     * Define el valor de la propiedad cvcobrador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVCOBRADOR(String value) {
        this.cvcobrador = value;
    }

    /**
     * Obtiene el valor de la propiedad iddcto.
     * 
     */
    public int getIDDCTO() {
        return iddcto;
    }

    /**
     * Define el valor de la propiedad iddcto.
     * 
     */
    public void setIDDCTO(int value) {
        this.iddcto = value;
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

    /**
     * Obtiene el valor de la propiedad validado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDADO() {
        return validado;
    }

    /**
     * Define el valor de la propiedad validado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDADO(String value) {
        this.validado = value;
    }

    /**
     * Obtiene el valor de la propiedad estatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTATUS() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTATUS(String value) {
        this.estatus = value;
    }

}
