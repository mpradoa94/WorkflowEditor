
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clienteContratoServ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clienteContratoServ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DET_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ROL_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NMT_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dias" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProxFInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteContratoServ", propOrder = {
    "idversion",
    "iddetcontrato",
    "idct",
    "rolcontrato",
    "nmtc",
    "inscripcion",
    "dias",
    "proxFInscripcion"
})
public class ClienteContratoServ {

    @XmlElement(name = "ID_VERSION")
    protected int idversion;
    @XmlElement(name = "ID_DET_CONTRATO")
    protected int iddetcontrato;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "ROL_CONTRATO")
    protected String rolcontrato;
    @XmlElement(name = "NMT_C")
    protected String nmtc;
    @XmlElement(name = "INSCRIPCION")
    protected String inscripcion;
    @XmlElement(name = "Dias")
    protected int dias;
    @XmlElement(name = "ProxFInscripcion")
    protected String proxFInscripcion;

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
     * Obtiene el valor de la propiedad rolcontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLCONTRATO() {
        return rolcontrato;
    }

    /**
     * Define el valor de la propiedad rolcontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLCONTRATO(String value) {
        this.rolcontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad nmtc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMTC() {
        return nmtc;
    }

    /**
     * Define el valor de la propiedad nmtc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMTC(String value) {
        this.nmtc = value;
    }

    /**
     * Obtiene el valor de la propiedad inscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSCRIPCION() {
        return inscripcion;
    }

    /**
     * Define el valor de la propiedad inscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSCRIPCION(String value) {
        this.inscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     */
    public int getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     */
    public void setDias(int value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad proxFInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxFInscripcion() {
        return proxFInscripcion;
    }

    /**
     * Define el valor de la propiedad proxFInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxFInscripcion(String value) {
        this.proxFInscripcion = value;
    }

}
