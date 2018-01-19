
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tillTenderHistory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tillTenderHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TY_TND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL_DEPOSITOS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TOTAL_RETIROS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TOTAL_INGRESOS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TOTAL_CAMBIOS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TOTAL_PAGOS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TOTAL_PAGOS_MENORES" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TOTAL_COBROS_MENORES" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tillTenderHistory", propOrder = {
    "tytnd",
    "totaldepositos",
    "totalretiros",
    "totalingresos",
    "totalcambios",
    "totalpagos",
    "totalpagosmenores",
    "totalcobrosmenores"
})
public class TillTenderHistory {

    @XmlElement(name = "TY_TND")
    protected String tytnd;
    @XmlElement(name = "TOTAL_DEPOSITOS")
    protected float totaldepositos;
    @XmlElement(name = "TOTAL_RETIROS")
    protected float totalretiros;
    @XmlElement(name = "TOTAL_INGRESOS")
    protected float totalingresos;
    @XmlElement(name = "TOTAL_CAMBIOS")
    protected float totalcambios;
    @XmlElement(name = "TOTAL_PAGOS")
    protected float totalpagos;
    @XmlElement(name = "TOTAL_PAGOS_MENORES")
    protected float totalpagosmenores;
    @XmlElement(name = "TOTAL_COBROS_MENORES")
    protected float totalcobrosmenores;

    /**
     * Obtiene el valor de la propiedad tytnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYTND() {
        return tytnd;
    }

    /**
     * Define el valor de la propiedad tytnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYTND(String value) {
        this.tytnd = value;
    }

    /**
     * Obtiene el valor de la propiedad totaldepositos.
     * 
     */
    public float getTOTALDEPOSITOS() {
        return totaldepositos;
    }

    /**
     * Define el valor de la propiedad totaldepositos.
     * 
     */
    public void setTOTALDEPOSITOS(float value) {
        this.totaldepositos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalretiros.
     * 
     */
    public float getTOTALRETIROS() {
        return totalretiros;
    }

    /**
     * Define el valor de la propiedad totalretiros.
     * 
     */
    public void setTOTALRETIROS(float value) {
        this.totalretiros = value;
    }

    /**
     * Obtiene el valor de la propiedad totalingresos.
     * 
     */
    public float getTOTALINGRESOS() {
        return totalingresos;
    }

    /**
     * Define el valor de la propiedad totalingresos.
     * 
     */
    public void setTOTALINGRESOS(float value) {
        this.totalingresos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalcambios.
     * 
     */
    public float getTOTALCAMBIOS() {
        return totalcambios;
    }

    /**
     * Define el valor de la propiedad totalcambios.
     * 
     */
    public void setTOTALCAMBIOS(float value) {
        this.totalcambios = value;
    }

    /**
     * Obtiene el valor de la propiedad totalpagos.
     * 
     */
    public float getTOTALPAGOS() {
        return totalpagos;
    }

    /**
     * Define el valor de la propiedad totalpagos.
     * 
     */
    public void setTOTALPAGOS(float value) {
        this.totalpagos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalpagosmenores.
     * 
     */
    public float getTOTALPAGOSMENORES() {
        return totalpagosmenores;
    }

    /**
     * Define el valor de la propiedad totalpagosmenores.
     * 
     */
    public void setTOTALPAGOSMENORES(float value) {
        this.totalpagosmenores = value;
    }

    /**
     * Obtiene el valor de la propiedad totalcobrosmenores.
     * 
     */
    public float getTOTALCOBROSMENORES() {
        return totalcobrosmenores;
    }

    /**
     * Define el valor de la propiedad totalcobrosmenores.
     * 
     */
    public void setTOTALCOBROSMENORES(float value) {
        this.totalcobrosmenores = value;
    }

}
