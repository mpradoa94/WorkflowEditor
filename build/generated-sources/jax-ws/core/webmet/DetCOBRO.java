
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detCOBRO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detCOBRO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DET_COBRO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_COBRO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DET_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SERVICIO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MESES_PAGADOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "detCOBRO", propOrder = {
    "iddetcobro",
    "idcobro",
    "iddetcontrato",
    "idservicio",
    "mesespagados",
    "precio",
    "nmitm"
})
public class DetCOBRO {

    @XmlElement(name = "ID_DET_COBRO")
    protected int iddetcobro;
    @XmlElement(name = "ID_COBRO")
    protected int idcobro;
    @XmlElement(name = "ID_DET_CONTRATO")
    protected int iddetcontrato;
    @XmlElement(name = "ID_SERVICIO")
    protected int idservicio;
    @XmlElement(name = "MESES_PAGADOS")
    protected int mesespagados;
    @XmlElement(name = "PRECIO")
    protected double precio;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;

    /**
     * Obtiene el valor de la propiedad iddetcobro.
     * 
     */
    public int getIDDETCOBRO() {
        return iddetcobro;
    }

    /**
     * Define el valor de la propiedad iddetcobro.
     * 
     */
    public void setIDDETCOBRO(int value) {
        this.iddetcobro = value;
    }

    /**
     * Obtiene el valor de la propiedad idcobro.
     * 
     */
    public int getIDCOBRO() {
        return idcobro;
    }

    /**
     * Define el valor de la propiedad idcobro.
     * 
     */
    public void setIDCOBRO(int value) {
        this.idcobro = value;
    }

    /**
     * Obtiene el valor de la propiedad iddetcontrato.
     * 
     */
    public int getIDDETCONTRATO() {
        return iddetcontrato;
    }

    /**
     * Define el valor de la propiedad iddetcontrato.
     * 
     */
    public void setIDDETCONTRATO(int value) {
        this.iddetcontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad idservicio.
     * 
     */
    public int getIDSERVICIO() {
        return idservicio;
    }

    /**
     * Define el valor de la propiedad idservicio.
     * 
     */
    public void setIDSERVICIO(int value) {
        this.idservicio = value;
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
