
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para permisoAcceso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="permisoAcceso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PERMISOACCESO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_HIST_PAGOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PUERTA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LOCKER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FECHA_I" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIA_SEMANA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_I" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "permisoAcceso", propOrder = {
    "idpermisoacceso",
    "idhistpagos",
    "idpuerta",
    "idlocker",
    "fechai",
    "fechaf",
    "diasemana",
    "horai",
    "horaf",
    "estatus"
})
public class PermisoAcceso {

    @XmlElement(name = "ID_PERMISOACCESO")
    protected int idpermisoacceso;
    @XmlElement(name = "ID_HIST_PAGOS")
    protected int idhistpagos;
    @XmlElement(name = "ID_PUERTA")
    protected int idpuerta;
    @XmlElement(name = "ID_LOCKER")
    protected int idlocker;
    @XmlElement(name = "FECHA_I")
    protected String fechai;
    @XmlElement(name = "FECHA_F")
    protected String fechaf;
    @XmlElement(name = "DIA_SEMANA")
    protected String diasemana;
    @XmlElement(name = "HORA_I")
    protected String horai;
    @XmlElement(name = "HORA_F")
    protected String horaf;
    @XmlElement(name = "ESTATUS")
    protected String estatus;

    /**
     * Obtiene el valor de la propiedad idpermisoacceso.
     * 
     */
    public int getIDPERMISOACCESO() {
        return idpermisoacceso;
    }

    /**
     * Define el valor de la propiedad idpermisoacceso.
     * 
     */
    public void setIDPERMISOACCESO(int value) {
        this.idpermisoacceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idhistpagos.
     * 
     */
    public int getIDHISTPAGOS() {
        return idhistpagos;
    }

    /**
     * Define el valor de la propiedad idhistpagos.
     * 
     */
    public void setIDHISTPAGOS(int value) {
        this.idhistpagos = value;
    }

    /**
     * Obtiene el valor de la propiedad idpuerta.
     * 
     */
    public int getIDPUERTA() {
        return idpuerta;
    }

    /**
     * Define el valor de la propiedad idpuerta.
     * 
     */
    public void setIDPUERTA(int value) {
        this.idpuerta = value;
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
     * Obtiene el valor de la propiedad fechai.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAI() {
        return fechai;
    }

    /**
     * Define el valor de la propiedad fechai.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAI(String value) {
        this.fechai = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAF() {
        return fechaf;
    }

    /**
     * Define el valor de la propiedad fechaf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAF(String value) {
        this.fechaf = value;
    }

    /**
     * Obtiene el valor de la propiedad diasemana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIASEMANA() {
        return diasemana;
    }

    /**
     * Define el valor de la propiedad diasemana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIASEMANA(String value) {
        this.diasemana = value;
    }

    /**
     * Obtiene el valor de la propiedad horai.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAI() {
        return horai;
    }

    /**
     * Define el valor de la propiedad horai.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAI(String value) {
        this.horai = value;
    }

    /**
     * Obtiene el valor de la propiedad horaf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAF() {
        return horaf;
    }

    /**
     * Define el valor de la propiedad horaf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAF(String value) {
        this.horaf = value;
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
