
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteLockers complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteLockers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROX_VENC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_LOCKER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteLockers", propOrder = {
    "nmct",
    "nmitm",
    "proxvenc",
    "dcdybsn",
    "idlocker",
    "idct",
    "status"
})
public class ReporteLockers {

    @XmlElement(name = "NM_CT")
    protected String nmct;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "PROX_VENC")
    protected String proxvenc;
    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "ID_LOCKER")
    protected int idlocker;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "STATUS")
    protected String status;

    /**
     * Obtiene el valor de la propiedad nmct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMCT() {
        return nmct;
    }

    /**
     * Define el valor de la propiedad nmct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMCT(String value) {
        this.nmct = value;
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

    /**
     * Obtiene el valor de la propiedad proxvenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROXVENC() {
        return proxvenc;
    }

    /**
     * Define el valor de la propiedad proxvenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROXVENC(String value) {
        this.proxvenc = value;
    }

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

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

}
