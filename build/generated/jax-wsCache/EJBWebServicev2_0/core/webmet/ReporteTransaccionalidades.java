
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteTransaccionalidades complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteTransaccionalidades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MO_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QU_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteTransaccionalidades", propOrder = {
    "dcdybsn",
    "iditm",
    "moslsitm",
    "quslsitm",
    "nmitm"
})
public class ReporteTransaccionalidades {

    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "MO_SLS_ITM")
    protected double moslsitm;
    @XmlElement(name = "QU_SLS_ITM")
    protected double quslsitm;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;

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
     * Obtiene el valor de la propiedad iditm.
     * 
     */
    public int getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     */
    public void setIDITM(int value) {
        this.iditm = value;
    }

    /**
     * Obtiene el valor de la propiedad moslsitm.
     * 
     */
    public double getMOSLSITM() {
        return moslsitm;
    }

    /**
     * Define el valor de la propiedad moslsitm.
     * 
     */
    public void setMOSLSITM(double value) {
        this.moslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quslsitm.
     * 
     */
    public double getQUSLSITM() {
        return quslsitm;
    }

    /**
     * Define el valor de la propiedad quslsitm.
     * 
     */
    public void setQUSLSITM(double value) {
        this.quslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad nmitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMITM() {
        return nmitm;
    }

    /**
     * Define el valor de la propiedad nmitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMITM(String value) {
        this.nmitm = value;
    }

}
