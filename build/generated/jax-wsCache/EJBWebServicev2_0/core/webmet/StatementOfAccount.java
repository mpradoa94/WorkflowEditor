
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para statementOfAccount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="statementOfAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ult_Car" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Pagos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Saldo_act" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc" type="{http://Webmet.core/}document" minOccurs="0"/>
 *         &lt;element name="listaprbll" type="{http://Webmet.core/}accountsPayRecBanLedgerLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statementOfAccount", propOrder = {
    "ultCar",
    "pagos",
    "saldoAct",
    "name",
    "last",
    "lastM",
    "doc",
    "listaprbll"
})
public class StatementOfAccount {

    @XmlElement(name = "Ult_Car")
    protected Double ultCar;
    @XmlElement(name = "Pagos")
    protected Double pagos;
    @XmlElement(name = "Saldo_act")
    protected Double saldoAct;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Last")
    protected String last;
    @XmlElement(name = "LastM")
    protected String lastM;
    protected Document doc;
    @XmlElement(nillable = true)
    protected List<AccountsPayRecBanLedgerLine> listaprbll;

    /**
     * Obtiene el valor de la propiedad ultCar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUltCar() {
        return ultCar;
    }

    /**
     * Define el valor de la propiedad ultCar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUltCar(Double value) {
        this.ultCar = value;
    }

    /**
     * Obtiene el valor de la propiedad pagos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPagos() {
        return pagos;
    }

    /**
     * Define el valor de la propiedad pagos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPagos(Double value) {
        this.pagos = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoAct.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoAct() {
        return saldoAct;
    }

    /**
     * Define el valor de la propiedad saldoAct.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoAct(Double value) {
        this.saldoAct = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad last.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast() {
        return last;
    }

    /**
     * Define el valor de la propiedad last.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast(String value) {
        this.last = value;
    }

    /**
     * Obtiene el valor de la propiedad lastM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastM() {
        return lastM;
    }

    /**
     * Define el valor de la propiedad lastM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastM(String value) {
        this.lastM = value;
    }

    /**
     * Obtiene el valor de la propiedad doc.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDoc() {
        return doc;
    }

    /**
     * Define el valor de la propiedad doc.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDoc(Document value) {
        this.doc = value;
    }

    /**
     * Gets the value of the listaprbll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaprbll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaprbll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountsPayRecBanLedgerLine }
     * 
     * 
     */
    public List<AccountsPayRecBanLedgerLine> getListaprbll() {
        if (listaprbll == null) {
            listaprbll = new ArrayList<AccountsPayRecBanLedgerLine>();
        }
        return this.listaprbll;
    }

}
