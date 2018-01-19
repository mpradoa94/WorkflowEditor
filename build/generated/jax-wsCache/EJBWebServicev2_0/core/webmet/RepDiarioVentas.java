
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para repDiarioVentas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="repDiarioVentas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SELL_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FECHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_CT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_HIST_PAGOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MESES_PAGADOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repDiarioVentas", propOrder = {
    "iditm",
    "nmitm",
    "sellprice",
    "fecha",
    "nmct",
    "idprty",
    "idhistpagos",
    "precio",
    "mesespagados"
})
public class RepDiarioVentas {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "SELL_PRICE")
    protected double sellprice;
    @XmlElement(name = "FECHA")
    protected String fecha;
    @XmlElement(name = "NM_CT")
    protected String nmct;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "ID_HIST_PAGOS")
    protected int idhistpagos;
    @XmlElement(name = "PRECIO")
    protected double precio;
    @XmlElement(name = "MESES_PAGADOS")
    protected int mesespagados;

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
     * Obtiene el valor de la propiedad sellprice.
     * 
     */
    public double getSELLPRICE() {
        return sellprice;
    }

    /**
     * Define el valor de la propiedad sellprice.
     * 
     */
    public void setSELLPRICE(double value) {
        this.sellprice = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHA() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHA(String value) {
        this.fecha = value;
    }

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
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPRECIO() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPRECIO(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad mesespagados.
     * 
     */
    public int getMESESPAGADOS() {
        return mesespagados;
    }

    /**
     * Define el valor de la propiedad mesespagados.
     * 
     */
    public void setMESESPAGADOS(int value) {
        this.mesespagados = value;
    }

}
