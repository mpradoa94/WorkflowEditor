
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para adeudosGenerados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="adeudosGenerados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_SPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QU_XDEP_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MO_XDEP_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adeudosGenerados", propOrder = {
    "dcdybsn",
    "nmspr",
    "quxdepitm",
    "moxdepitm"
})
public class AdeudosGenerados {

    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "NM_SPR")
    protected String nmspr;
    @XmlElement(name = "QU_XDEP_ITM")
    protected double quxdepitm;
    @XmlElement(name = "MO_XDEP_ITM")
    protected double moxdepitm;

    /**
     * Obtiene el valor de la propiedad dcdybsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDYBSN() {
        return dcdybsn;
    }

    /**
     * Define el valor de la propiedad dcdybsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDYBSN(String value) {
        this.dcdybsn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmspr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSPR() {
        return nmspr;
    }

    /**
     * Define el valor de la propiedad nmspr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSPR(String value) {
        this.nmspr = value;
    }

    /**
     * Obtiene el valor de la propiedad quxdepitm.
     * 
     */
    public double getQUXDEPITM() {
        return quxdepitm;
    }

    /**
     * Define el valor de la propiedad quxdepitm.
     * 
     */
    public void setQUXDEPITM(double value) {
        this.quxdepitm = value;
    }

    /**
     * Obtiene el valor de la propiedad moxdepitm.
     * 
     */
    public double getMOXDEPITM() {
        return moxdepitm;
    }

    /**
     * Define el valor de la propiedad moxdepitm.
     * 
     */
    public void setMOXDEPITM(double value) {
        this.moxdepitm = value;
    }

}
