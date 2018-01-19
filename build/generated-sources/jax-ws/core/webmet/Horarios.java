
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para horarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="horarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DET_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_HORARIO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_INI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_FIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horarios", propOrder = {
    "itm",
    "idversion",
    "iddetcontrato",
    "idct",
    "idhorario",
    "dia",
    "horaini",
    "horafin"
})
public class Horarios {

    @XmlElement(name = "ITM")
    protected int itm;
    @XmlElement(name = "ID_VERSION")
    protected int idversion;
    @XmlElement(name = "ID_DET_CONTRATO")
    protected int iddetcontrato;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "ID_HORARIO")
    protected int idhorario;
    @XmlElement(name = "DIA")
    protected String dia;
    @XmlElement(name = "HORA_INI")
    protected String horaini;
    @XmlElement(name = "HORA_FIN")
    protected String horafin;

    /**
     * Obtiene el valor de la propiedad itm.
     * 
     */
    public int getITM() {
        return itm;
    }

    /**
     * Define el valor de la propiedad itm.
     * 
     */
    public void setITM(int value) {
        this.itm = value;
    }

    /**
     * Obtiene el valor de la propiedad idversion.
     * 
     */
    public int getIDVERSION() {
        return idversion;
    }

    /**
     * Define el valor de la propiedad idversion.
     * 
     */
    public void setIDVERSION(int value) {
        this.idversion = value;
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
     * Obtiene el valor de la propiedad idhorario.
     * 
     */
    public int getIDHORARIO() {
        return idhorario;
    }

    /**
     * Define el valor de la propiedad idhorario.
     * 
     */
    public void setIDHORARIO(int value) {
        this.idhorario = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIA() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIA(String value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad horaini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAINI() {
        return horaini;
    }

    /**
     * Define el valor de la propiedad horaini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAINI(String value) {
        this.horaini = value;
    }

    /**
     * Obtiene el valor de la propiedad horafin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAFIN() {
        return horafin;
    }

    /**
     * Define el valor de la propiedad horafin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAFIN(String value) {
        this.horafin = value;
    }

}
