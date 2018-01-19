
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lockers complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lockers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LOCKER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CVE_LOCKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_ALTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_BAJA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_DISPONIBLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lockers", propOrder = {
    "idlocker",
    "cvelocker",
    "dcalta",
    "dcbaja",
    "activo",
    "dcdisponible",
    "idct"
})
public class Lockers {

    @XmlElement(name = "ID_LOCKER")
    protected int idlocker;
    @XmlElement(name = "CVE_LOCKER")
    protected String cvelocker;
    @XmlElement(name = "DC_ALTA")
    protected String dcalta;
    @XmlElement(name = "DC_BAJA")
    protected String dcbaja;
    @XmlElement(name = "ACTIVO")
    protected String activo;
    @XmlElement(name = "DC_DISPONIBLE")
    protected String dcdisponible;
    @XmlElement(name = "ID_CT")
    protected int idct;

    /**
     * Obtiene el valor de la propiedad idlocker.
     * 
     */
    public int getIDLOCKER() {
        return idlocker;
    }

    /**
     * Define el valor de la propiedad idlocker.
     * 
     */
    public void setIDLOCKER(int value) {
        this.idlocker = value;
    }

    /**
     * Obtiene el valor de la propiedad cvelocker.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVELOCKER() {
        return cvelocker;
    }

    /**
     * Define el valor de la propiedad cvelocker.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVELOCKER(String value) {
        this.cvelocker = value;
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
     * Obtiene el valor de la propiedad dcdisponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDISPONIBLE() {
        return dcdisponible;
    }

    /**
     * Define el valor de la propiedad dcdisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDISPONIBLE(String value) {
        this.dcdisponible = value;
    }

    /**
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
    }

}
