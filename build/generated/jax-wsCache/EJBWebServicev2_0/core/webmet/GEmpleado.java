
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gEmpleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gEmpleado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_EM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_ALTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_BAJA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_EMPLEADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyrol" type="{http://Webmet.core/}partyRol" minOccurs="0"/>
 *         &lt;element name="GEmpleadoP" type="{http://Webmet.core/}gempleadoPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gEmpleado", propOrder = {
    "idem",
    "dcalta",
    "dcbaja",
    "activo",
    "tipoempleado",
    "partyrol",
    "gEmpleadoP"
})
public class GEmpleado {

    @XmlElement(name = "ID_EM")
    protected int idem;
    @XmlElement(name = "DC_ALTA")
    protected String dcalta;
    @XmlElement(name = "DC_BAJA")
    protected String dcbaja;
    @XmlElement(name = "ACTIVO")
    protected String activo;
    @XmlElement(name = "TIPO_EMPLEADO")
    protected String tipoempleado;
    protected PartyRol partyrol;
    @XmlElement(name = "GEmpleadoP")
    protected GempleadoPersona gEmpleadoP;

    /**
     * Obtiene el valor de la propiedad idem.
     * 
     */
    public int getIDEM() {
        return idem;
    }

    /**
     * Define el valor de la propiedad idem.
     * 
     */
    public void setIDEM(int value) {
        this.idem = value;
    }

    /**
     * Obtiene el valor de la propiedad dcalta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCALTA() {
        return dcalta;
    }

    /**
     * Define el valor de la propiedad dcalta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCALTA(String value) {
        this.dcalta = value;
    }

    /**
     * Obtiene el valor de la propiedad dcbaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCBAJA() {
        return dcbaja;
    }

    /**
     * Define el valor de la propiedad dcbaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCBAJA(String value) {
        this.dcbaja = value;
    }

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVO() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVO(String value) {
        this.activo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoempleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOEMPLEADO() {
        return tipoempleado;
    }

    /**
     * Define el valor de la propiedad tipoempleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOEMPLEADO(String value) {
        this.tipoempleado = value;
    }

    /**
     * Obtiene el valor de la propiedad partyrol.
     * 
     * @return
     *     possible object is
     *     {@link PartyRol }
     *     
     */
    public PartyRol getPartyrol() {
        return partyrol;
    }

    /**
     * Define el valor de la propiedad partyrol.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRol }
     *     
     */
    public void setPartyrol(PartyRol value) {
        this.partyrol = value;
    }

    /**
     * Obtiene el valor de la propiedad gEmpleadoP.
     * 
     * @return
     *     possible object is
     *     {@link GempleadoPersona }
     *     
     */
    public GempleadoPersona getGEmpleadoP() {
        return gEmpleadoP;
    }

    /**
     * Define el valor de la propiedad gEmpleadoP.
     * 
     * @param value
     *     allowed object is
     *     {@link GempleadoPersona }
     *     
     */
    public void setGEmpleadoP(GempleadoPersona value) {
        this.gEmpleadoP = value;
    }

}
