
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcTaxableGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcTaxableGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxablegroup" type="{http://Webmet.core/}taxableGroup"/>
 *         &lt;element name="taxgrouprule" type="{http://Webmet.core/}taxGroupRule"/>
 *         &lt;element name="taxraterule" type="{http://Webmet.core/}taxRateRule"/>
 *         &lt;element name="loghead" type="{http://Webmet.core/}logHead"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcTaxableGroup", propOrder = {
    "operacion",
    "idInstancia",
    "taxablegroup",
    "taxgrouprule",
    "taxraterule",
    "loghead"
})
public class AbcTaxableGroup {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected TaxableGroup taxablegroup;
    @XmlElement(required = true)
    protected TaxGroupRule taxgrouprule;
    @XmlElement(required = true)
    protected TaxRateRule taxraterule;
    @XmlElement(required = true)
    protected LogHead loghead;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
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
     * Obtiene el valor de la propiedad taxgrouprule.
     * 
     * @return
     *     possible object is
     *     {@link TaxGroupRule }
     *     
     */
    public TaxGroupRule getTaxgrouprule() {
        return taxgrouprule;
    }

    /**
     * Define el valor de la propiedad taxgrouprule.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxGroupRule }
     *     
     */
    public void setTaxgrouprule(TaxGroupRule value) {
        this.taxgrouprule = value;
    }

    /**
     * Obtiene el valor de la propiedad taxraterule.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateRule }
     *     
     */
    public TaxRateRule getTaxraterule() {
        return taxraterule;
    }

    /**
     * Define el valor de la propiedad taxraterule.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateRule }
     *     
     */
    public void setTaxraterule(TaxRateRule value) {
        this.taxraterule = value;
    }

    /**
     * Obtiene el valor de la propiedad loghead.
     * 
     * @return
     *     possible object is
     *     {@link LogHead }
     *     
     */
    public LogHead getLoghead() {
        return loghead;
    }

    /**
     * Define el valor de la propiedad loghead.
     * 
     * @param value
     *     allowed object is
     *     {@link LogHead }
     *     
     */
    public void setLoghead(LogHead value) {
        this.loghead = value;
    }

}