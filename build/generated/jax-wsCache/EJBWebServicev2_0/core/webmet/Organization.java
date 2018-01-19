
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para organization complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="organization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PRTY_ORGN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_ORGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_TX_ORGN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_TX_FDL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RFC_TAXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxablegroup" type="{http://Webmet.core/}taxableGroup" minOccurs="0"/>
 *         &lt;element name="FIEL" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organization", propOrder = {
    "idprtyorgn",
    "nmorgn",
    "idtxorgn",
    "idtxfdl",
    "rfctaxid",
    "taxablegroup",
    "fiel"
})
public class Organization {

    @XmlElement(name = "ID_PRTY_ORGN")
    protected int idprtyorgn;
    @XmlElement(name = "NM_ORGN")
    protected String nmorgn;
    @XmlElement(name = "ID_TX_ORGN")
    protected int idtxorgn;
    @XmlElement(name = "ID_TX_FDL")
    protected int idtxfdl;
    @XmlElement(name = "RFC_TAXID")
    protected String rfctaxid;
    protected TaxableGroup taxablegroup;
    @XmlElement(name = "FIEL")
    protected byte[] fiel;

    /**
     * Obtiene el valor de la propiedad idprtyorgn.
     * 
     */
    public int getIDPRTYORGN() {
        return idprtyorgn;
    }

    /**
     * Define el valor de la propiedad idprtyorgn.
     * 
     */
    public void setIDPRTYORGN(int value) {
        this.idprtyorgn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmorgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMORGN() {
        return nmorgn;
    }

    /**
     * Define el valor de la propiedad nmorgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMORGN(String value) {
        this.nmorgn = value;
    }

    /**
     * Obtiene el valor de la propiedad idtxorgn.
     * 
     */
    public int getIDTXORGN() {
        return idtxorgn;
    }

    /**
     * Define el valor de la propiedad idtxorgn.
     * 
     */
    public void setIDTXORGN(int value) {
        this.idtxorgn = value;
    }

    /**
     * Obtiene el valor de la propiedad idtxfdl.
     * 
     */
    public int getIDTXFDL() {
        return idtxfdl;
    }

    /**
     * Define el valor de la propiedad idtxfdl.
     * 
     */
    public void setIDTXFDL(int value) {
        this.idtxfdl = value;
    }

    /**
     * Obtiene el valor de la propiedad rfctaxid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCTAXID() {
        return rfctaxid;
    }

    /**
     * Define el valor de la propiedad rfctaxid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCTAXID(String value) {
        this.rfctaxid = value;
    }

    /**
     * Obtiene el valor de la propiedad taxablegroup.
     * 
     * @return
     *     possible object is
     *     {@link TaxableGroup }
     *     
     */
    public TaxableGroup getTaxablegroup() {
        return taxablegroup;
    }

    /**
     * Define el valor de la propiedad taxablegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableGroup }
     *     
     */
    public void setTaxablegroup(TaxableGroup value) {
        this.taxablegroup = value;
    }

    /**
     * Obtiene el valor de la propiedad fiel.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFIEL() {
        return fiel;
    }

    /**
     * Define el valor de la propiedad fiel.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFIEL(byte[] value) {
        this.fiel = value;
    }

}
