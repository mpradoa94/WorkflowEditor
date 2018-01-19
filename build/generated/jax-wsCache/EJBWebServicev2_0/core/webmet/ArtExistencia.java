
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para artExistencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="artExistencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_MRHRC_GP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "artExistencia", propOrder = {
    "iditm",
    "nmitm",
    "iditmps",
    "idbrn",
    "nmbrn",
    "idmrhrcgp",
    "nmmrhrcgp",
    "existencia"
})
public class ArtExistencia {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "NM_ITM")
    protected String nmitm;
    @XmlElement(name = "ID_ITM_PS")
    protected int iditmps;
    @XmlElement(name = "ID_BRN")
    protected int idbrn;
    @XmlElement(name = "NM_BRN")
    protected String nmbrn;
    @XmlElement(name = "ID_MRHRC_GP")
    protected int idmrhrcgp;
    @XmlElement(name = "NM_MRHRC_GP")
    protected String nmmrhrcgp;
    @XmlElement(name = "Existencia")
    protected double existencia;

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
     * Obtiene el valor de la propiedad iditmps.
     * 
     */
    public int getIDITMPS() {
        return iditmps;
    }

    /**
     * Define el valor de la propiedad iditmps.
     * 
     */
    public void setIDITMPS(int value) {
        this.iditmps = value;
    }

    /**
     * Obtiene el valor de la propiedad idbrn.
     * 
     */
    public int getIDBRN() {
        return idbrn;
    }

    /**
     * Define el valor de la propiedad idbrn.
     * 
     */
    public void setIDBRN(int value) {
        this.idbrn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmbrn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMBRN() {
        return nmbrn;
    }

    /**
     * Define el valor de la propiedad nmbrn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMBRN(String value) {
        this.nmbrn = value;
    }

    /**
     * Obtiene el valor de la propiedad idmrhrcgp.
     * 
     */
    public int getIDMRHRCGP() {
        return idmrhrcgp;
    }

    /**
     * Define el valor de la propiedad idmrhrcgp.
     * 
     */
    public void setIDMRHRCGP(int value) {
        this.idmrhrcgp = value;
    }

    /**
     * Obtiene el valor de la propiedad nmmrhrcgp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMMRHRCGP() {
        return nmmrhrcgp;
    }

    /**
     * Define el valor de la propiedad nmmrhrcgp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMMRHRCGP(String value) {
        this.nmmrhrcgp = value;
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
