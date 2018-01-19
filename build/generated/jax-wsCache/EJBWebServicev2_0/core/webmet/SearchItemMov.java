
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchItemMov complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchItemMov">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SUPPLIER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_BRN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CATEGO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LOCALIZACION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_ITM_PS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROJOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PCERO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOREV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIF_MARGEN" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NM_ITM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchItemMov", propOrder = {
    "idinstancia",
    "idsupplier",
    "idbrn",
    "idcatego",
    "localizacion",
    "iditmps",
    "projos",
    "pcero",
    "norev",
    "difmargen",
    "nmitm",
    "idstrrt"
})
public class SearchItemMov {

    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;
    @XmlElement(name = "ID_SUPPLIER")
    protected int idsupplier;
    @XmlElement(name = "ID_BRN")
    protected int idbrn;
    @XmlElement(name = "ID_CATEGO")
    protected int idcatego;
    @XmlElement(name = "LOCALIZACION", required = true)
    protected String localizacion;
    @XmlElement(name = "ID_ITM_PS", required = true)
    protected String iditmps;
    @XmlElement(name = "PROJOS")
    protected int projos;
    @XmlElement(name = "PCERO")
    protected int pcero;
    @XmlElement(name = "NOREV", required = true)
    protected String norev;
    @XmlElement(name = "DIF_MARGEN")
    protected double difmargen;
    @XmlElement(name = "NM_ITM", required = true)
    protected String nmitm;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;

    /**
     * Obtiene el valor de la propiedad idinstancia.
     * 
     */
    public int getIDINSTANCIA() {
        return idinstancia;
    }

    /**
     * Define el valor de la propiedad idinstancia.
     * 
     */
    public void setIDINSTANCIA(int value) {
        this.idinstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad idsupplier.
     * 
     */
    public int getIDSUPPLIER() {
        return idsupplier;
    }

    /**
     * Define el valor de la propiedad idsupplier.
     * 
     */
    public void setIDSUPPLIER(int value) {
        this.idsupplier = value;
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
     * Obtiene el valor de la propiedad idcatego.
     * 
     */
    public int getIDCATEGO() {
        return idcatego;
    }

    /**
     * Define el valor de la propiedad idcatego.
     * 
     */
    public void setIDCATEGO(int value) {
        this.idcatego = value;
    }

    /**
     * Obtiene el valor de la propiedad localizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIZACION() {
        return localizacion;
    }

    /**
     * Define el valor de la propiedad localizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIZACION(String value) {
        this.localizacion = value;
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
     * Obtiene el valor de la propiedad projos.
     * 
     */
    public int getPROJOS() {
        return projos;
    }

    /**
     * Define el valor de la propiedad projos.
     * 
     */
    public void setPROJOS(int value) {
        this.projos = value;
    }

    /**
     * Obtiene el valor de la propiedad pcero.
     * 
     */
    public int getPCERO() {
        return pcero;
    }

    /**
     * Define el valor de la propiedad pcero.
     * 
     */
    public void setPCERO(int value) {
        this.pcero = value;
    }

    /**
     * Obtiene el valor de la propiedad norev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOREV() {
        return norev;
    }

    /**
     * Define el valor de la propiedad norev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOREV(String value) {
        this.norev = value;
    }

    /**
     * Obtiene el valor de la propiedad difmargen.
     * 
     */
    public double getDIFMARGEN() {
        return difmargen;
    }

    /**
     * Define el valor de la propiedad difmargen.
     * 
     */
    public void setDIFMARGEN(double value) {
        this.difmargen = value;
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

}
