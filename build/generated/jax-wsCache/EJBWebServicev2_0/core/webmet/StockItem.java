
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para stockItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="stockItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LU_UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NM_UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LU_CNT_SLS_WT_UN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP_UN_SL_LS_RSV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DC_CST_EST_LS_RCV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitofmesure" type="{http://Webmet.core/}unitOfMesure" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://Webmet.core/}supplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stockItem", propOrder = {
    "iditm",
    "idspr",
    "luuom",
    "nmuom",
    "lucntslswtun",
    "cpunsllsrsv",
    "dccstestlsrcv",
    "location",
    "unitofmesure",
    "supplier"
})
public class StockItem {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "ID_SPR")
    protected int idspr;
    @XmlElement(name = "LU_UOM")
    protected String luuom;
    @XmlElement(name = "NM_UOM")
    protected String nmuom;
    @XmlElement(name = "LU_CNT_SLS_WT_UN")
    protected String lucntslswtun;
    @XmlElement(name = "CP_UN_SL_LS_RSV")
    protected double cpunsllsrsv;
    @XmlElement(name = "DC_CST_EST_LS_RCV")
    protected String dccstestlsrcv;
    @XmlElement(name = "LOCATION")
    protected String location;
    protected UnitOfMesure unitofmesure;
    protected Supplier supplier;

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
     * Obtiene el valor de la propiedad idspr.
     * 
     */
    public int getIDSPR() {
        return idspr;
    }

    /**
     * Define el valor de la propiedad idspr.
     * 
     */
    public void setIDSPR(int value) {
        this.idspr = value;
    }

    /**
     * Obtiene el valor de la propiedad luuom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLUUOM() {
        return luuom;
    }

    /**
     * Define el valor de la propiedad luuom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLUUOM(String value) {
        this.luuom = value;
    }

    /**
     * Obtiene el valor de la propiedad nmuom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMUOM() {
        return nmuom;
    }

    /**
     * Define el valor de la propiedad nmuom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMUOM(String value) {
        this.nmuom = value;
    }

    /**
     * Obtiene el valor de la propiedad lucntslswtun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLUCNTSLSWTUN() {
        return lucntslswtun;
    }

    /**
     * Define el valor de la propiedad lucntslswtun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLUCNTSLSWTUN(String value) {
        this.lucntslswtun = value;
    }

    /**
     * Obtiene el valor de la propiedad cpunsllsrsv.
     * 
     */
    public double getCPUNSLLSRSV() {
        return cpunsllsrsv;
    }

    /**
     * Define el valor de la propiedad cpunsllsrsv.
     * 
     */
    public void setCPUNSLLSRSV(double value) {
        this.cpunsllsrsv = value;
    }

    /**
     * Obtiene el valor de la propiedad dccstestlsrcv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCSTESTLSRCV() {
        return dccstestlsrcv;
    }

    /**
     * Define el valor de la propiedad dccstestlsrcv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCSTESTLSRCV(String value) {
        this.dccstestlsrcv = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATION() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATION(String value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad unitofmesure.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMesure }
     *     
     */
    public UnitOfMesure getUnitofmesure() {
        return unitofmesure;
    }

    /**
     * Define el valor de la propiedad unitofmesure.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMesure }
     *     
     */
    public void setUnitofmesure(UnitOfMesure value) {
        this.unitofmesure = value;
    }

    /**
     * Obtiene el valor de la propiedad supplier.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Define el valor de la propiedad supplier.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

}
