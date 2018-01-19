
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteConcentradoMovimientos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteConcentradoMovimientos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DE_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stk" type="{http://Webmet.core/}stockLedgerAccount" minOccurs="0"/>
 *         &lt;element name="Existencia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteConcentradoMovimientos", propOrder = {
    "iditmps",
    "iditm",
    "deitm",
    "stk",
    "existencia"
})
public class ReporteConcentradoMovimientos {

    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "ID_ITM")
    protected String iditm;
    @XmlElement(name = "DE_ITM")
    protected String deitm;
    protected StockLedgerAccount stk;
    @XmlElement(name = "Existencia")
    protected double existencia;

    /**
     * Obtiene el valor de la propiedad iditmps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDITMPS() {
        return iditmps;
    }

    /**
     * Define el valor de la propiedad iditmps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDITMPS(String value) {
        this.iditmps = value;
    }

    /**
     * Obtiene el valor de la propiedad iditm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDITM(String value) {
        this.iditm = value;
    }

    /**
     * Obtiene el valor de la propiedad deitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEITM() {
        return deitm;
    }

    /**
     * Define el valor de la propiedad deitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEITM(String value) {
        this.deitm = value;
    }

    /**
     * Obtiene el valor de la propiedad stk.
     * 
     * @return
     *     possible object is
     *     {@link StockLedgerAccount }
     *     
     */
    public StockLedgerAccount getStk() {
        return stk;
    }

    /**
     * Define el valor de la propiedad stk.
     * 
     * @param value
     *     allowed object is
     *     {@link StockLedgerAccount }
     *     
     */
    public void setStk(StockLedgerAccount value) {
        this.stk = value;
    }

    /**
     * Obtiene el valor de la propiedad existencia.
     * 
     */
    public double getExistencia() {
        return existencia;
    }

    /**
     * Define el valor de la propiedad existencia.
     * 
     */
    public void setExistencia(double value) {
        this.existencia = value;
    }

}
