
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mantenimientosVigentes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mantenimientosVigentes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AREACONTRATADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHAVENCIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHAULTIMOPAGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEXO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CELULAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELEFONO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Huella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mantenimientosVigentes", propOrder = {
    "id",
    "nombre",
    "areacontratada",
    "fechavencimiento",
    "fechaultimopago",
    "sexo",
    "celular",
    "telefono",
    "email",
    "huella",
    "clave",
    "edad"
})
public class MantenimientosVigentes {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "NOMBRE")
    protected String nombre;
    @XmlElement(name = "AREACONTRATADA")
    protected String areacontratada;
    @XmlElement(name = "FECHAVENCIMIENTO")
    protected String fechavencimiento;
    @XmlElement(name = "FECHAULTIMOPAGO")
    protected String fechaultimopago;
    @XmlElement(name = "SEXO")
    protected String sexo;
    @XmlElement(name = "CELULAR")
    protected String celular;
    @XmlElement(name = "TELEFONO")
    protected String telefono;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "Huella")
    protected String huella;
    @XmlElement(name = "Clave")
    protected String clave;
    @XmlElement(name = "Edad")
    protected String edad;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setID(int value) {
        this.id = value;
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

    /**
     * Obtiene el valor de la propiedad areacontratada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREACONTRATADA() {
        return areacontratada;
    }

    /**
     * Define el valor de la propiedad areacontratada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREACONTRATADA(String value) {
        this.areacontratada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechavencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAVENCIMIENTO() {
        return fechavencimiento;
    }

    /**
     * Define el valor de la propiedad fechavencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAVENCIMIENTO(String value) {
        this.fechavencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaultimopago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAULTIMOPAGO() {
        return fechaultimopago;
    }

    /**
     * Define el valor de la propiedad fechaultimopago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAULTIMOPAGO(String value) {
        this.fechaultimopago = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEXO() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEXO(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCELULAR() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCELULAR(String value) {
        this.celular = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONO() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONO(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad huella.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuella() {
        return huella;
    }

    /**
     * Define el valor de la propiedad huella.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuella(String value) {
        this.huella = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdad(String value) {
        this.edad = value;
    }

}
