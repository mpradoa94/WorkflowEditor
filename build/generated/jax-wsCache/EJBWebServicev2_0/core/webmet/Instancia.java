
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para instancia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="instancia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="URL_SERVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATABASE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_U_PAGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_VENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_ANIVERSARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CTAC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CAD_VAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instancia", propOrder = {
    "idinstancia",
    "urlserver",
    "databasename",
    "fupago",
    "fvence",
    "faniversario",
    "idct",
    "idctac",
    "cadval",
    "activo"
})
public class Instancia {

    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;
    @XmlElement(name = "URL_SERVER")
    protected String urlserver;
    @XmlElement(name = "DATABASE_NAME")
    protected String databasename;
    @XmlElement(name = "F_U_PAGO")
    protected String fupago;
    @XmlElement(name = "F_VENCE")
    protected String fvence;
    @XmlElement(name = "F_ANIVERSARIO")
    protected String faniversario;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "ID_CTAC")
    protected int idctac;
    @XmlElement(name = "CAD_VAL")
    protected String cadval;
    @XmlElement(name = "ACTIVO")
    protected String activo;

    /**
     * Obtiene el valor de la propiedad idinstancia.
     * 
     */
    public int getIDINSTANCIA() {
        return idinstancia;
    }

    /**
     * Define el valor de la propiedad idinstancia.
     * 
     */
    public void setIDINSTANCIA(int value) {
        this.idinstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad urlserver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLSERVER() {
        return urlserver;
    }

    /**
     * Define el valor de la propiedad urlserver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLSERVER(String value) {
        this.urlserver = value;
    }

    /**
     * Obtiene el valor de la propiedad databasename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATABASENAME() {
        return databasename;
    }

    /**
     * Define el valor de la propiedad databasename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATABASENAME(String value) {
        this.databasename = value;
    }

    /**
     * Obtiene el valor de la propiedad fupago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUPAGO() {
        return fupago;
    }

    /**
     * Define el valor de la propiedad fupago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUPAGO(String value) {
        this.fupago = value;
    }

    /**
     * Obtiene el valor de la propiedad fvence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVENCE() {
        return fvence;
    }

    /**
     * Define el valor de la propiedad fvence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVENCE(String value) {
        this.fvence = value;
    }

    /**
     * Obtiene el valor de la propiedad faniversario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFANIVERSARIO() {
        return faniversario;
    }

    /**
     * Define el valor de la propiedad faniversario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFANIVERSARIO(String value) {
        this.faniversario = value;
    }

    /**
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
    }

    /**
     * Obtiene el valor de la propiedad idctac.
     * 
     */
    public int getIDCTAC() {
        return idctac;
    }

    /**
     * Define el valor de la propiedad idctac.
     * 
     */
    public void setIDCTAC(int value) {
        this.idctac = value;
    }

    /**
     * Obtiene el valor de la propiedad cadval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCADVAL() {
        return cadval;
    }

    /**
     * Define el valor de la propiedad cadval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCADVAL(String value) {
        this.cadval = value;
    }

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVO() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVO(String value) {
        this.activo = value;
    }

}
