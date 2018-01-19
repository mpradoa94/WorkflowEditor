
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporteProducto8020DTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporteProducto8020DTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ANIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DE_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXISTENCIA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MONTO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CANTIDAD" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fechaDel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaAl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporteProducto8020DTO", propOrder = {
    "idstrrt",
    "idlcn",
    "iditm",
    "anio",
    "mes",
    "iditmps",
    "deitm",
    "existencia",
    "monto",
    "cantidad",
    "fechaDel",
    "fechaAl"
})
public class ReporteProducto8020DTO {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ANIO")
    protected String anio;
    @XmlElement(name = "MES")
    protected String mes;
    @XmlElement(name = "ID_ITM_PS")
    protected String iditmps;
    @XmlElement(name = "DE_ITM")
    protected String deitm;
    @XmlElement(name = "EXISTENCIA")
    protected double existencia;
    @XmlElement(name = "MONTO")
    protected double monto;
    @XmlElement(name = "CANTIDAD")
    protected double cantidad;
    protected String fechaDel;
    protected String fechaAl;

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
     * Obtiene el valor de la propiedad idlcn.
     * 
     */
    public int getIDLCN() {
        return idlcn;
    }

    /**
     * Define el valor de la propiedad idlcn.
     * 
     */
    public void setIDLCN(int value) {
        this.idlcn = value;
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
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIO() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIO(String value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMES() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMES(String value) {
        this.mes = value;
    }

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
     * Obtiene el valor de la propiedad existencia.
     * 
     */
    public double getEXISTENCIA() {
        return existencia;
    }

    /**
     * Define el valor de la propiedad existencia.
     * 
     */
    public void setEXISTENCIA(double value) {
        this.existencia = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public double getMONTO() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMONTO(double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCANTIDAD() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCANTIDAD(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDel() {
        return fechaDel;
    }

    /**
     * Define el valor de la propiedad fechaDel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDel(String value) {
        this.fechaDel = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAl() {
        return fechaAl;
    }

    /**
     * Define el valor de la propiedad fechaAl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAl(String value) {
        this.fechaAl = value;
    }

}
