
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcClausula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcClausula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oper" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_claus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="des_clau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cont" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcClausula", propOrder = {
    "idInstancia",
    "oper",
    "idClaus",
    "modelo",
    "desClau",
    "cont"
})
public class AbcClausula {

    @XmlElement(name = "id_instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected String oper;
    @XmlElement(name = "id_claus")
    protected int idClaus;
    protected int modelo;
    @XmlElement(name = "des_clau")
    protected String desClau;
    @XmlElement(required = true)
    protected String cont;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad oper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOper() {
        return oper;
    }

    /**
     * Define el valor de la propiedad oper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOper(String value) {
        this.oper = value;
    }

    /**
     * Obtiene el valor de la propiedad idClaus.
     * 
     */
    public int getIdClaus() {
        return idClaus;
    }

    /**
     * Define el valor de la propiedad idClaus.
     * 
     */
    public void setIdClaus(int value) {
        this.idClaus = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     */
    public void setModelo(int value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad desClau.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesClau() {
        return desClau;
    }

    /**
     * Define el valor de la propiedad desClau.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesClau(String value) {
        this.desClau = value;
    }

    /**
     * Obtiene el valor de la propiedad cont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCont() {
        return cont;
    }

    /**
     * Define el valor de la propiedad cont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCont(String value) {
        this.cont = value;
    }

}
