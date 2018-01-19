
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para customerAddress complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customerAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ADS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_EF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DC_EP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIR_FACTURA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIR_ENTREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerAddress", propOrder = {
    "idads",
    "idcte",
    "dcef",
    "dcep",
    "domicilio",
    "colonia",
    "ciudad",
    "estado",
    "pais",
    "cp",
    "dirfactura",
    "direntreg",
    "idct"
})
public class CustomerAddress {

    @XmlElement(name = "ID_ADS")
    protected int idads;
    @XmlElement(name = "ID_CTE")
    protected int idcte;
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
    @XmlElement(name = "DIR_ENTREG")
    protected String direntreg;
    @XmlElement(name = "ID_CT")
    protected int idct;

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
     * Obtiene el valor de la propiedad idcte.
     * 
     */
    public int getIDCTE() {
        return idcte;
    }

    /**
     * Define el valor de la propiedad idcte.
     * 
     */
    public void setIDCTE(int value) {
        this.idcte = value;
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
     * Obtiene el valor de la propiedad direntreg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRENTREG() {
        return direntreg;
    }

    /**
     * Define el valor de la propiedad direntreg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRENTREG(String value) {
        this.direntreg = value;
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

}
