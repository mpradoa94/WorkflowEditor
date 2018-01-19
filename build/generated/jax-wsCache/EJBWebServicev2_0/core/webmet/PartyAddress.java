
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para partyAddress complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="partyAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ADS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PRTY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_RO_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_EF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_EP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIR_FACTURA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIR_ESPERA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MUNICIPIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyAddress", propOrder = {
    "idads",
    "idprty",
    "tyroprty",
    "dcef",
    "dcep",
    "domicilio",
    "colonia",
    "ciudad",
    "estado",
    "pais",
    "cp",
    "dirfactura",
    "direspera",
    "municipio"
})
public class PartyAddress {

    @XmlElement(name = "ID_ADS")
    protected int idads;
    @XmlElement(name = "ID_PRTY")
    protected int idprty;
    @XmlElement(name = "TY_RO_PRTY")
    protected String tyroprty;
    @XmlElement(name = "DC_EF")
    protected String dcef;
    @XmlElement(name = "DC_EP")
    protected String dcep;
    @XmlElement(name = "DOMICILIO")
    protected String domicilio;
    @XmlElement(name = "COLONIA")
    protected String colonia;
    @XmlElement(name = "CIUDAD")
    protected String ciudad;
    @XmlElement(name = "ESTADO")
    protected String estado;
    @XmlElement(name = "PAIS")
    protected String pais;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "DIR_FACTURA")
    protected String dirfactura;
    @XmlElement(name = "DIR_ESPERA")
    protected String direspera;
    @XmlElement(name = "MUNICIPIO")
    protected String municipio;

    /**
     * Obtiene el valor de la propiedad idads.
     * 
     */
    public int getIDADS() {
        return idads;
    }

    /**
     * Define el valor de la propiedad idads.
     * 
     */
    public void setIDADS(int value) {
        this.idads = value;
    }

    /**
     * Obtiene el valor de la propiedad idprty.
     * 
     */
    public int getIDPRTY() {
        return idprty;
    }

    /**
     * Define el valor de la propiedad idprty.
     * 
     */
    public void setIDPRTY(int value) {
        this.idprty = value;
    }

    /**
     * Obtiene el valor de la propiedad tyroprty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYROPRTY() {
        return tyroprty;
    }

    /**
     * Define el valor de la propiedad tyroprty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYROPRTY(String value) {
        this.tyroprty = value;
    }

    /**
     * Obtiene el valor de la propiedad dcef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCEF() {
        return dcef;
    }

    /**
     * Define el valor de la propiedad dcef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCEF(String value) {
        this.dcef = value;
    }

    /**
     * Obtiene el valor de la propiedad dcep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCEP() {
        return dcep;
    }

    /**
     * Define el valor de la propiedad dcep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCEP(String value) {
        this.dcep = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMICILIO() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMICILIO(String value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad colonia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLONIA() {
        return colonia;
    }

    /**
     * Define el valor de la propiedad colonia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLONIA(String value) {
        this.colonia = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIUDAD() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIUDAD(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADO() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADO(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIS() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIS(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * Define el valor de la propiedad cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Obtiene el valor de la propiedad dirfactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRFACTURA() {
        return dirfactura;
    }

    /**
     * Define el valor de la propiedad dirfactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRFACTURA(String value) {
        this.dirfactura = value;
    }

    /**
     * Obtiene el valor de la propiedad direspera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRESPERA() {
        return direspera;
    }

    /**
     * Define el valor de la propiedad direspera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRESPERA(String value) {
        this.direspera = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUNICIPIO() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUNICIPIO(String value) {
        this.municipio = value;
    }

}
