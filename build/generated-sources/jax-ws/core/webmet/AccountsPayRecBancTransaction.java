
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para accountsPayRecBancTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accountsPayRecBancTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_TRAN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MODULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_TRANSACCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FORMA_TRANSACCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_OPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountsPayRecBancTransaction", propOrder = {
    "idstrrt",
    "idtran",
    "module",
    "tipotransaccion",
    "formatransaccion",
    "idoper",
    "mes",
    "anio"
})
public class AccountsPayRecBancTransaction {

    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "ID_TRAN")
    protected int idtran;
    @XmlElement(name = "MODULE")
    protected String module;
    @XmlElement(name = "TIPO_TRANSACCION")
    protected String tipotransaccion;
    @XmlElement(name = "FORMA_TRANSACCION")
    protected String formatransaccion;
    @XmlElement(name = "ID_OPER")
    protected String idoper;
    @XmlElement(name = "MES")
    protected String mes;
    @XmlElement(name = "ANIO")
    protected String anio;

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

    /**
     * Obtiene el valor de la propiedad idtran.
     * 
     */
    public int getIDTRAN() {
        return idtran;
    }

    /**
     * Define el valor de la propiedad idtran.
     * 
     */
    public void setIDTRAN(int value) {
        this.idtran = value;
    }

    /**
     * Obtiene el valor de la propiedad module.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULE() {
        return module;
    }

    /**
     * Define el valor de la propiedad module.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULE(String value) {
        this.module = value;
    }

    /**
     * Obtiene el valor de la propiedad tipotransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOTRANSACCION() {
        return tipotransaccion;
    }

    /**
     * Define el valor de la propiedad tipotransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOTRANSACCION(String value) {
        this.tipotransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad formatransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATRANSACCION() {
        return formatransaccion;
    }

    /**
     * Define el valor de la propiedad formatransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATRANSACCION(String value) {
        this.formatransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad idoper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDOPER() {
        return idoper;
    }

    /**
     * Define el valor de la propiedad idoper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDOPER(String value) {
        this.idoper = value;
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

}
