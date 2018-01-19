
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saldos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saldos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_SALDO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saldos", propOrder = {
    "idsaldo",
    "mes",
    "anio",
    "balance"
})
public class Saldos {

    @XmlElement(name = "ID_SALDO")
    protected int idsaldo;
    @XmlElement(name = "MES")
    protected String mes;
    @XmlElement(name = "ANIO")
    protected String anio;
    @XmlElement(name = "BALANCE")
    protected double balance;

    /**
     * Obtiene el valor de la propiedad idsaldo.
     * 
     */
    public int getIDSALDO() {
        return idsaldo;
    }

    /**
     * Define el valor de la propiedad idsaldo.
     * 
     */
    public void setIDSALDO(int value) {
        this.idsaldo = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMES() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMES(String value) {
        this.mes = value;
    }

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIO() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIO(String value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad balance.
     * 
     */
    public double getBALANCE() {
        return balance;
    }

    /**
     * Define el valor de la propiedad balance.
     * 
     */
    public void setBALANCE(double value) {
        this.balance = value;
    }

}
