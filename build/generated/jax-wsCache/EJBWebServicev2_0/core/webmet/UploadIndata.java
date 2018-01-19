
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para uploadIndata complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="uploadIndata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nm_archivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nm_contenedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="nomNot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_oper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_modelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="xml_resultante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_formato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obligatorios" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadIndata", propOrder = {
    "nmArchivo",
    "nmContenedor",
    "archivo",
    "nomNot",
    "idInstancia",
    "idOper",
    "idModelo",
    "xmlResultante",
    "idFormato",
    "prefix",
    "obligatorios"
})
public class UploadIndata {

    @XmlElement(name = "nm_archivo", required = true)
    protected String nmArchivo;
    @XmlElement(name = "nm_contenedor", required = true)
    protected String nmContenedor;
    @XmlElement(name = "Archivo", required = true)
    protected byte[] archivo;
    @XmlElement(required = true)
    protected String nomNot;
    @XmlElement(name = "id_instancia")
    protected int idInstancia;
    @XmlElement(name = "id_oper")
    protected int idOper;
    @XmlElement(name = "id_modelo")
    protected int idModelo;
    @XmlElement(name = "xml_resultante")
    protected String xmlResultante;
    @XmlElement(name = "id_formato")
    protected int idFormato;
    protected String prefix;
    protected List<String> obligatorios;

    /**
     * Obtiene el valor de la propiedad nmArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmArchivo() {
        return nmArchivo;
    }

    /**
     * Define el valor de la propiedad nmArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmArchivo(String value) {
        this.nmArchivo = value;
    }

    /**
     * Obtiene el valor de la propiedad nmContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmContenedor() {
        return nmContenedor;
    }

    /**
     * Define el valor de la propiedad nmContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmContenedor(String value) {
        this.nmContenedor = value;
    }

    /**
     * Obtiene el valor de la propiedad archivo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivo() {
        return archivo;
    }

    /**
     * Define el valor de la propiedad archivo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivo(byte[] value) {
        this.archivo = value;
    }

    /**
     * Obtiene el valor de la propiedad nomNot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomNot() {
        return nomNot;
    }

    /**
     * Define el valor de la propiedad nomNot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomNot(String value) {
        this.nomNot = value;
    }

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
     * Obtiene el valor de la propiedad idOper.
     * 
     */
    public int getIdOper() {
        return idOper;
    }

    /**
     * Define el valor de la propiedad idOper.
     * 
     */
    public void setIdOper(int value) {
        this.idOper = value;
    }

    /**
     * Obtiene el valor de la propiedad idModelo.
     * 
     */
    public int getIdModelo() {
        return idModelo;
    }

    /**
     * Define el valor de la propiedad idModelo.
     * 
     */
    public void setIdModelo(int value) {
        this.idModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlResultante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlResultante() {
        return xmlResultante;
    }

    /**
     * Define el valor de la propiedad xmlResultante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlResultante(String value) {
        this.xmlResultante = value;
    }

    /**
     * Obtiene el valor de la propiedad idFormato.
     * 
     */
    public int getIdFormato() {
        return idFormato;
    }

    /**
     * Define el valor de la propiedad idFormato.
     * 
     */
    public void setIdFormato(int value) {
        this.idFormato = value;
    }

    /**
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the obligatorios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obligatorios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObligatorios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObligatorios() {
        if (obligatorios == null) {
            obligatorios = new ArrayList<String>();
        }
        return this.obligatorios;
    }

}
