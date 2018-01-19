
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gHistorialCobros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gHistorialCobros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_HIST_PAGOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PERMISOACCESO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FECHA_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gHistorialCobros", propOrder = {
    "idhistpagos",
    "idpermisoacceso",
    "estatus",
    "idct",
    "fechaf"
})
public class GHistorialCobros {

    @XmlElement(name = "ID_HIST_PAGOS")
    protected int idhistpagos;
    @XmlElement(name = "ID_PERMISOACCESO")
    protected int idpermisoacceso;
    @XmlElement(name = "ESTATUS")
    protected String estatus;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "FECHA_F")
    protected String fechaf;

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

}
