
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para till complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="till">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RPSTY_TND" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SC_TL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TS_TST_TL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CP_BLNC_DFLT_OPN" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LU_TND_MXM_ALW" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "till", propOrder = {
    "idstrrt",
    "idrpstytnd",
    "idws",
    "idopr",
    "sctl",
    "tststtl",
    "cpblncdfltopn",
    "lutndmxmalw"
})
public class Till {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_RPSTY_TND")
    protected int idrpstytnd;
    @XmlElement(name = "ID_WS")
    protected int idws;
    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(name = "SC_TL", required = true)
    protected String sctl;
    @XmlElement(name = "TS_TST_TL", required = true)
    protected String tststtl;
    @XmlElement(name = "CP_BLNC_DFLT_OPN")
    protected double cpblncdfltopn;
    @XmlElement(name = "LU_TND_MXM_ALW")
    protected double lutndmxmalw;

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
     * Obtiene el valor de la propiedad idrpstytnd.
     * 
     */
    public int getIDRPSTYTND() {
        return idrpstytnd;
    }

    /**
     * Define el valor de la propiedad idrpstytnd.
     * 
     */
    public void setIDRPSTYTND(int value) {
        this.idrpstytnd = value;
    }

    /**
     * Obtiene el valor de la propiedad idws.
     * 
     */
    public int getIDWS() {
        return idws;
    }

    /**
     * Define el valor de la propiedad idws.
     * 
     */
    public void setIDWS(int value) {
        this.idws = value;
    }

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
     * Obtiene el valor de la propiedad sctl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCTL() {
        return sctl;
    }

    /**
     * Define el valor de la propiedad sctl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCTL(String value) {
        this.sctl = value;
    }

    /**
     * Obtiene el valor de la propiedad tststtl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSTSTTL() {
        return tststtl;
    }

    /**
     * Define el valor de la propiedad tststtl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSTSTTL(String value) {
        this.tststtl = value;
    }

    /**
     * Obtiene el valor de la propiedad cpblncdfltopn.
     * 
     */
    public double getCPBLNCDFLTOPN() {
        return cpblncdfltopn;
    }

    /**
     * Define el valor de la propiedad cpblncdfltopn.
     * 
     */
    public void setCPBLNCDFLTOPN(double value) {
        this.cpblncdfltopn = value;
    }

    /**
     * Obtiene el valor de la propiedad lutndmxmalw.
     * 
     */
    public double getLUTNDMXMALW() {
        return lutndmxmalw;
    }

    /**
     * Define el valor de la propiedad lutndmxmalw.
     * 
     */
    public void setLUTNDMXMALW(double value) {
        this.lutndmxmalw = value;
    }

}
