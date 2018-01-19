
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para descuentos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="descuentos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_dsc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_dsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="de_dsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dc_ini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dc_fin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elegibildad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descuentos", propOrder = {
    "idDsc",
    "nmDsc",
    "deDsc",
    "dcIni",
    "dcFin",
    "elegibildad"
})
public class Descuentos {

    @XmlElement(name = "id_dsc")
    protected int idDsc;
    @XmlElement(name = "nm_dsc")
    protected String nmDsc;
    @XmlElement(name = "de_dsc")
    protected String deDsc;
    @XmlElement(name = "dc_ini")
    protected String dcIni;
    @XmlElement(name = "dc_fin")
    protected String dcFin;
    protected String elegibildad;

    /**
     * Obtiene el valor de la propiedad idDsc.
     * 
     */
    public int getIdDsc() {
        return idDsc;
    }

    /**
     * Define el valor de la propiedad idDsc.
     * 
     */
    public void setIdDsc(int value) {
        this.idDsc = value;
    }

    /**
     * Obtiene el valor de la propiedad nmDsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmDsc() {
        return nmDsc;
    }

    /**
     * Define el valor de la propiedad nmDsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmDsc(String value) {
        this.nmDsc = value;
    }

    /**
     * Obtiene el valor de la propiedad deDsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeDsc() {
        return deDsc;
    }

    /**
     * Define el valor de la propiedad deDsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeDsc(String value) {
        this.deDsc = value;
    }

    /**
     * Obtiene el valor de la propiedad dcIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcIni() {
        return dcIni;
    }

    /**
     * Define el valor de la propiedad dcIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcIni(String value) {
        this.dcIni = value;
    }

    /**
     * Obtiene el valor de la propiedad dcFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcFin() {
        return dcFin;
    }

    /**
     * Define el valor de la propiedad dcFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcFin(String value) {
        this.dcFin = value;
    }

    /**
     * Obtiene el valor de la propiedad elegibildad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElegibildad() {
        return elegibildad;
    }

    /**
     * Define el valor de la propiedad elegibildad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElegibildad(String value) {
        this.elegibildad = value;
    }

}
