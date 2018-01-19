
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retailTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retailTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idStrRt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idWs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dcDyBsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aiTrn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idCt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inTndElpsd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flSpn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quUnRtlTrn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="quItmLnSc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="peItmLnSc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quItmLnKy" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idFactura" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="articulos" type="{http://Webmet.core/}saleReturnLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://Webmet.core/}customer2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retailTransaction", propOrder = {
    "idStrRt",
    "idWs",
    "dcDyBsn",
    "aiTrn",
    "idCt",
    "inTndElpsd",
    "flSpn",
    "quUnRtlTrn",
    "quItmLnSc",
    "peItmLnSc",
    "quItmLnKy",
    "idFactura",
    "articulos",
    "cliente"
})
public class RetailTransaction {

    protected int idStrRt;
    protected int idWs;
    protected String dcDyBsn;
    protected int aiTrn;
    protected int idCt;
    protected String inTndElpsd;
    protected int flSpn;
    protected double quUnRtlTrn;
    protected double quItmLnSc;
    protected int peItmLnSc;
    protected double quItmLnKy;
    protected int idFactura;
    @XmlElement(nillable = true)
    protected List<SaleReturnLineItem> articulos;
    protected Customer2 cliente;

    /**
     * Obtiene el valor de la propiedad idStrRt.
     * 
     */
    public int getIdStrRt() {
        return idStrRt;
    }

    /**
     * Define el valor de la propiedad idStrRt.
     * 
     */
    public void setIdStrRt(int value) {
        this.idStrRt = value;
    }

    /**
     * Obtiene el valor de la propiedad idWs.
     * 
     */
    public int getIdWs() {
        return idWs;
    }

    /**
     * Define el valor de la propiedad idWs.
     * 
     */
    public void setIdWs(int value) {
        this.idWs = value;
    }

    /**
     * Obtiene el valor de la propiedad dcDyBsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcDyBsn() {
        return dcDyBsn;
    }

    /**
     * Define el valor de la propiedad dcDyBsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcDyBsn(String value) {
        this.dcDyBsn = value;
    }

    /**
     * Obtiene el valor de la propiedad aiTrn.
     * 
     */
    public int getAiTrn() {
        return aiTrn;
    }

    /**
     * Define el valor de la propiedad aiTrn.
     * 
     */
    public void setAiTrn(int value) {
        this.aiTrn = value;
    }

    /**
     * Obtiene el valor de la propiedad idCt.
     * 
     */
    public int getIdCt() {
        return idCt;
    }

    /**
     * Define el valor de la propiedad idCt.
     * 
     */
    public void setIdCt(int value) {
        this.idCt = value;
    }

    /**
     * Obtiene el valor de la propiedad inTndElpsd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTndElpsd() {
        return inTndElpsd;
    }

    /**
     * Define el valor de la propiedad inTndElpsd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTndElpsd(String value) {
        this.inTndElpsd = value;
    }

    /**
     * Obtiene el valor de la propiedad flSpn.
     * 
     */
    public int getFlSpn() {
        return flSpn;
    }

    /**
     * Define el valor de la propiedad flSpn.
     * 
     */
    public void setFlSpn(int value) {
        this.flSpn = value;
    }

    /**
     * Obtiene el valor de la propiedad quUnRtlTrn.
     * 
     */
    public double getQuUnRtlTrn() {
        return quUnRtlTrn;
    }

    /**
     * Define el valor de la propiedad quUnRtlTrn.
     * 
     */
    public void setQuUnRtlTrn(double value) {
        this.quUnRtlTrn = value;
    }

    /**
     * Obtiene el valor de la propiedad quItmLnSc.
     * 
     */
    public double getQuItmLnSc() {
        return quItmLnSc;
    }

    /**
     * Define el valor de la propiedad quItmLnSc.
     * 
     */
    public void setQuItmLnSc(double value) {
        this.quItmLnSc = value;
    }

    /**
     * Obtiene el valor de la propiedad peItmLnSc.
     * 
     */
    public int getPeItmLnSc() {
        return peItmLnSc;
    }

    /**
     * Define el valor de la propiedad peItmLnSc.
     * 
     */
    public void setPeItmLnSc(int value) {
        this.peItmLnSc = value;
    }

    /**
     * Obtiene el valor de la propiedad quItmLnKy.
     * 
     */
    public double getQuItmLnKy() {
        return quItmLnKy;
    }

    /**
     * Define el valor de la propiedad quItmLnKy.
     * 
     */
    public void setQuItmLnKy(double value) {
        this.quItmLnKy = value;
    }

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     */
    public void setIdFactura(int value) {
        this.idFactura = value;
    }

    /**
     * Gets the value of the articulos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articulos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticulos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleReturnLineItem }
     * 
     * 
     */
    public List<SaleReturnLineItem> getArticulos() {
        if (articulos == null) {
            articulos = new ArrayList<SaleReturnLineItem>();
        }
        return this.articulos;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Customer2 }
     *     
     */
    public Customer2 getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer2 }
     *     
     */
    public void setCliente(Customer2 value) {
        this.cliente = value;
    }

}
