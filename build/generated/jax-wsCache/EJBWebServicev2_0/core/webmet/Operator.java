
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_OPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PWD_ACS_OPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_ALTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_BAJA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LNG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Leng" type="{http://Webmet.core/}lenguaje" minOccurs="0"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyrol" type="{http://Webmet.core/}partyRol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operator", propOrder = {
    "idopr",
    "nmopr",
    "pwdacsopr",
    "dcalta",
    "dcbaja",
    "activo",
    "idinstancia",
    "idlng",
    "leng",
    "idstrrt",
    "idprty",
    "tyroprty",
    "partyrol"
})
public class Operator {

    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(name = "NM_OPR")
    protected String nmopr;
    @XmlElement(name = "PWD_ACS_OPR")
    protected String pwdacsopr;
    @XmlElement(name = "DC_ALTA")
    protected String dcalta;
    @XmlElement(name = "DC_BAJA")
    protected String dcbaja;
    @XmlElement(name = "ACTIVO")
    protected String activo;
    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;
    @XmlElement(name = "ID_LNG")
    protected int idlng;
    @XmlElement(name = "Leng")
    protected Lenguaje leng;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    protected PartyRol partyrol;

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

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
     * Obtiene el valor de la propiedad pwdacsopr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWDACSOPR() {
        return pwdacsopr;
    }

    /**
     * Define el valor de la propiedad pwdacsopr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWDACSOPR(String value) {
        this.pwdacsopr = value;
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
     * Obtiene el valor de la propiedad idlng.
     * 
     */
    public int getIDLNG() {
        return idlng;
    }

    /**
     * Define el valor de la propiedad idlng.
     * 
     */
    public void setIDLNG(int value) {
        this.idlng = value;
    }

    /**
     * Obtiene el valor de la propiedad leng.
     * 
     * @return
     *     possible object is
     *     {@link Lenguaje }
     *     
     */
    public Lenguaje getLeng() {
        return leng;
    }

    /**
     * Define el valor de la propiedad leng.
     * 
     * @param value
     *     allowed object is
     *     {@link Lenguaje }
     *     
     */
    public void setLeng(Lenguaje value) {
        this.leng = value;
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
     * Obtiene el valor de la propiedad idprty.
     * 
     */
    public int getIDPRTY() {
        return idprty;
    }

    /**
     * Define el valor de la propiedad idprty.
     * 
     */
    public void setIDPRTY(int value) {
        this.idprty = value;
    }

    /**
     * Obtiene el valor de la propiedad tyroprty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYROPRTY() {
        return tyroprty;
    }

    /**
     * Define el valor de la propiedad tyroprty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYROPRTY(String value) {
        this.tyroprty = value;
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

}
