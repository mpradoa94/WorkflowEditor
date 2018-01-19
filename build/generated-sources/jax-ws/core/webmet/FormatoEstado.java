
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formatoEstado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formatoEstado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formato" type="{http://Webmet.core/}formatos" minOccurs="0"/>
 *         &lt;element name="idCopia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pve" type="{http://Webmet.core/}procesoVersionEstado" minOccurs="0"/>
 *         &lt;element name="userEI" type="{http://Webmet.core/}usuariosEI" minOccurs="0"/>
 *         &lt;element name="F_INGRESO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_SALIDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_PROGRAMADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatoEstado", propOrder = {
    "formato",
    "idCopia",
    "pve",
    "userEI",
    "fingreso",
    "fsalida",
    "fprogramada"
})
public class FormatoEstado {

    protected Formatos formato;
    protected int idCopia;
    protected ProcesoVersionEstado pve;
    protected UsuariosEI userEI;
    @XmlElement(name = "F_INGRESO")
    protected String fingreso;
    @XmlElement(name = "F_SALIDA")
    protected String fsalida;
    @XmlElement(name = "F_PROGRAMADA")
    protected String fprogramada;

    /**
     * Obtiene el valor de la propiedad formato.
     * 
     * @return
     *     possible object is
     *     {@link Formatos }
     *     
     */
    public Formatos getFormato() {
        return formato;
    }

    /**
     * Define el valor de la propiedad formato.
     * 
     * @param value
     *     allowed object is
     *     {@link Formatos }
     *     
     */
    public void setFormato(Formatos value) {
        this.formato = value;
    }

    /**
     * Obtiene el valor de la propiedad idCopia.
     * 
     */
    public int getIdCopia() {
        return idCopia;
    }

    /**
     * Define el valor de la propiedad idCopia.
     * 
     */
    public void setIdCopia(int value) {
        this.idCopia = value;
    }

    /**
     * Obtiene el valor de la propiedad pve.
     * 
     * @return
     *     possible object is
     *     {@link ProcesoVersionEstado }
     *     
     */
    public ProcesoVersionEstado getPve() {
        return pve;
    }

    /**
     * Define el valor de la propiedad pve.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcesoVersionEstado }
     *     
     */
    public void setPve(ProcesoVersionEstado value) {
        this.pve = value;
    }

    /**
     * Obtiene el valor de la propiedad userEI.
     * 
     * @return
     *     possible object is
     *     {@link UsuariosEI }
     *     
     */
    public UsuariosEI getUserEI() {
        return userEI;
    }

    /**
     * Define el valor de la propiedad userEI.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuariosEI }
     *     
     */
    public void setUserEI(UsuariosEI value) {
        this.userEI = value;
    }

    /**
     * Obtiene el valor de la propiedad fingreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINGRESO() {
        return fingreso;
    }

    /**
     * Define el valor de la propiedad fingreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINGRESO(String value) {
        this.fingreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fsalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSALIDA() {
        return fsalida;
    }

    /**
     * Define el valor de la propiedad fsalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSALIDA(String value) {
        this.fsalida = value;
    }

    /**
     * Obtiene el valor de la propiedad fprogramada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPROGRAMADA() {
        return fprogramada;
    }

    /**
     * Define el valor de la propiedad fprogramada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPROGRAMADA(String value) {
        this.fprogramada = value;
    }

}
