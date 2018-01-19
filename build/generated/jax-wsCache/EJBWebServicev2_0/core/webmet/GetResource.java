
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getResource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buscador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_RS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NM_RS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPadre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getResource", propOrder = {
    "idInstancia",
    "buscador",
    "idrs",
    "nmrs",
    "idPadre",
    "idopr"
})
public class GetResource {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected String buscador;
    @XmlElement(name = "ID_RS")
    protected int idrs;
    @XmlElement(name = "NM_RS", required = true)
    protected String nmrs;
    protected int idPadre;
    @XmlElement(name = "ID_OPR")
    protected int idopr;

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
     * Obtiene el valor de la propiedad buscador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscador() {
        return buscador;
    }

    /**
     * Define el valor de la propiedad buscador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscador(String value) {
        this.buscador = value;
    }

    /**
     * Obtiene el valor de la propiedad idrs.
     * 
     */
    public int getIDRS() {
        return idrs;
    }

    /**
     * Define el valor de la propiedad idrs.
     * 
     */
    public void setIDRS(int value) {
        this.idrs = value;
    }

    /**
     * Obtiene el valor de la propiedad nmrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMRS() {
        return nmrs;
    }

    /**
     * Define el valor de la propiedad nmrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMRS(String value) {
        this.nmrs = value;
    }

    /**
     * Obtiene el valor de la propiedad idPadre.
     * 
     */
    public int getIdPadre() {
        return idPadre;
    }

    /**
     * Define el valor de la propiedad idPadre.
     * 
     */
    public void setIdPadre(int value) {
        this.idPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

}
