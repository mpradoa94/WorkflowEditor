
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getModelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getModelo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MODELO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_MODELO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getModelo", propOrder = {
    "oper",
    "idInstancia",
    "idmodelo",
    "tymodelo",
    "nombre"
})
public class GetModelo {

    @XmlElement(required = true)
    protected String oper;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_MODELO")
    protected int idmodelo;
    @XmlElement(name = "TY_MODELO", required = true)
    protected String tymodelo;
    @XmlElement(name = "NOMBRE")
    protected String nombre;

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
     * Obtiene el valor de la propiedad idmodelo.
     * 
     */
    public int getIDMODELO() {
        return idmodelo;
    }

    /**
     * Define el valor de la propiedad idmodelo.
     * 
     */
    public void setIDMODELO(int value) {
        this.idmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad tymodelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYMODELO() {
        return tymodelo;
    }

    /**
     * Define el valor de la propiedad tymodelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYMODELO(String value) {
        this.tymodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

}
