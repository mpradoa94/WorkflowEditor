
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retailStore complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retailStore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_STRGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_OPN_RT_STR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_CL_RT_STR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_STR_RT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENC_PRN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENC_PRN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIE_PRN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIE_PRN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_MERCHANT_ED" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LOGIN_ED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASSWORD_ED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_AUTO_ED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyrol" type="{http://Webmet.core/}partyRol" minOccurs="0"/>
 *         &lt;element name="grupo" type="{http://Webmet.core/}retailStoreGroup" minOccurs="0"/>
 *         &lt;element name="Logo1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Logo2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="GIRO_TIENDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_EMP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retailStore", propOrder = {
    "idstrrt",
    "idprty",
    "tyroprty",
    "idstrgrp",
    "dcopnrtstr",
    "dcclrtstr",
    "nmstrrt",
    "encprn1",
    "encprn2",
    "pieprn1",
    "pieprn2",
    "idmerchanted",
    "logined",
    "passworded",
    "bankautoed",
    "position1",
    "position2",
    "position3",
    "position4",
    "position5",
    "position6",
    "partyrol",
    "grupo",
    "logo1",
    "logo2",
    "girotienda",
    "idemp"
})
public class RetailStore {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "ID_STRGRP")
    protected int idstrgrp;
    @XmlElement(name = "DC_OPN_RT_STR")
    protected String dcopnrtstr;
    @XmlElement(name = "DC_CL_RT_STR")
    protected String dcclrtstr;
    @XmlElement(name = "NM_STR_RT")
    protected String nmstrrt;
    @XmlElement(name = "ENC_PRN1")
    protected String encprn1;
    @XmlElement(name = "ENC_PRN2")
    protected String encprn2;
    @XmlElement(name = "PIE_PRN1")
    protected String pieprn1;
    @XmlElement(name = "PIE_PRN2")
    protected String pieprn2;
    @XmlElement(name = "ID_MERCHANT_ED")
    protected int idmerchanted;
    @XmlElement(name = "LOGIN_ED")
    protected String logined;
    @XmlElement(name = "PASSWORD_ED")
    protected String passworded;
    @XmlElement(name = "BANK_AUTO_ED")
    protected String bankautoed;
    @XmlElement(name = "POSITION1")
    protected String position1;
    @XmlElement(name = "POSITION2")
    protected String position2;
    @XmlElement(name = "POSITION3")
    protected String position3;
    @XmlElement(name = "POSITION4")
    protected String position4;
    @XmlElement(name = "POSITION5")
    protected String position5;
    @XmlElement(name = "POSITION6")
    protected String position6;
    protected PartyRol partyrol;
    protected RetailStoreGroup grupo;
    @XmlElement(name = "Logo1")
    protected byte[] logo1;
    @XmlElement(name = "Logo2")
    protected byte[] logo2;
    @XmlElement(name = "GIRO_TIENDA")
    protected String girotienda;
    @XmlElement(name = "ID_EMP")
    protected int idemp;

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
     * Obtiene el valor de la propiedad idstrgrp.
     * 
     */
    public int getIDSTRGRP() {
        return idstrgrp;
    }

    /**
     * Define el valor de la propiedad idstrgrp.
     * 
     */
    public void setIDSTRGRP(int value) {
        this.idstrgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad dcopnrtstr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCOPNRTSTR() {
        return dcopnrtstr;
    }

    /**
     * Define el valor de la propiedad dcopnrtstr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCOPNRTSTR(String value) {
        this.dcopnrtstr = value;
    }

    /**
     * Obtiene el valor de la propiedad dcclrtstr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCLRTSTR() {
        return dcclrtstr;
    }

    /**
     * Define el valor de la propiedad dcclrtstr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCLRTSTR(String value) {
        this.dcclrtstr = value;
    }

    /**
     * Obtiene el valor de la propiedad nmstrrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSTRRT() {
        return nmstrrt;
    }

    /**
     * Define el valor de la propiedad nmstrrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSTRRT(String value) {
        this.nmstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad encprn1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCPRN1() {
        return encprn1;
    }

    /**
     * Define el valor de la propiedad encprn1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCPRN1(String value) {
        this.encprn1 = value;
    }

    /**
     * Obtiene el valor de la propiedad encprn2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCPRN2() {
        return encprn2;
    }

    /**
     * Define el valor de la propiedad encprn2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCPRN2(String value) {
        this.encprn2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pieprn1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIEPRN1() {
        return pieprn1;
    }

    /**
     * Define el valor de la propiedad pieprn1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIEPRN1(String value) {
        this.pieprn1 = value;
    }

    /**
     * Obtiene el valor de la propiedad pieprn2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIEPRN2() {
        return pieprn2;
    }

    /**
     * Define el valor de la propiedad pieprn2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIEPRN2(String value) {
        this.pieprn2 = value;
    }

    /**
     * Obtiene el valor de la propiedad idmerchanted.
     * 
     */
    public int getIDMERCHANTED() {
        return idmerchanted;
    }

    /**
     * Define el valor de la propiedad idmerchanted.
     * 
     */
    public void setIDMERCHANTED(int value) {
        this.idmerchanted = value;
    }

    /**
     * Obtiene el valor de la propiedad logined.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOGINED() {
        return logined;
    }

    /**
     * Define el valor de la propiedad logined.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOGINED(String value) {
        this.logined = value;
    }

    /**
     * Obtiene el valor de la propiedad passworded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORDED() {
        return passworded;
    }

    /**
     * Define el valor de la propiedad passworded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORDED(String value) {
        this.passworded = value;
    }

    /**
     * Obtiene el valor de la propiedad bankautoed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKAUTOED() {
        return bankautoed;
    }

    /**
     * Define el valor de la propiedad bankautoed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKAUTOED(String value) {
        this.bankautoed = value;
    }

    /**
     * Obtiene el valor de la propiedad position1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITION1() {
        return position1;
    }

    /**
     * Define el valor de la propiedad position1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITION1(String value) {
        this.position1 = value;
    }

    /**
     * Obtiene el valor de la propiedad position2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITION2() {
        return position2;
    }

    /**
     * Define el valor de la propiedad position2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITION2(String value) {
        this.position2 = value;
    }

    /**
     * Obtiene el valor de la propiedad position3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITION3() {
        return position3;
    }

    /**
     * Define el valor de la propiedad position3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITION3(String value) {
        this.position3 = value;
    }

    /**
     * Obtiene el valor de la propiedad position4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITION4() {
        return position4;
    }

    /**
     * Define el valor de la propiedad position4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITION4(String value) {
        this.position4 = value;
    }

    /**
     * Obtiene el valor de la propiedad position5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITION5() {
        return position5;
    }

    /**
     * Define el valor de la propiedad position5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITION5(String value) {
        this.position5 = value;
    }

    /**
     * Obtiene el valor de la propiedad position6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITION6() {
        return position6;
    }

    /**
     * Define el valor de la propiedad position6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITION6(String value) {
        this.position6 = value;
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
     * Obtiene el valor de la propiedad grupo.
     * 
     * @return
     *     possible object is
     *     {@link RetailStoreGroup }
     *     
     */
    public RetailStoreGroup getGrupo() {
        return grupo;
    }

    /**
     * Define el valor de la propiedad grupo.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStoreGroup }
     *     
     */
    public void setGrupo(RetailStoreGroup value) {
        this.grupo = value;
    }

    /**
     * Obtiene el valor de la propiedad logo1.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogo1() {
        return logo1;
    }

    /**
     * Define el valor de la propiedad logo1.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogo1(byte[] value) {
        this.logo1 = value;
    }

    /**
     * Obtiene el valor de la propiedad logo2.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogo2() {
        return logo2;
    }

    /**
     * Define el valor de la propiedad logo2.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogo2(byte[] value) {
        this.logo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad girotienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIROTIENDA() {
        return girotienda;
    }

    /**
     * Define el valor de la propiedad girotienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIROTIENDA(String value) {
        this.girotienda = value;
    }

    /**
     * Obtiene el valor de la propiedad idemp.
     * 
     */
    public int getIDEMP() {
        return idemp;
    }

    /**
     * Define el valor de la propiedad idemp.
     * 
     */
    public void setIDEMP(int value) {
        this.idemp = value;
    }

}
