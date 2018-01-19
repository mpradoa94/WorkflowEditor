
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contratoVersion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contratoVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SUCURSAL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CUOTA_NOUSO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MORATORIOS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="INICIA_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TERMINA_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="det_contrato" type="{http://Webmet.core/}detContrato" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cliente_contrato" type="{http://Webmet.core/}clientesContrato" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratoVersion", propOrder = {
    "idversion",
    "idcontrato",
    "idsucursal",
    "cuotanouso",
    "moratorios",
    "iniciaversion",
    "terminaversion",
    "detContrato",
    "clienteContrato"
})
public class ContratoVersion {

    @XmlElement(name = "ID_VERSION")
    protected int idversion;
    @XmlElement(name = "ID_CONTRATO")
    protected int idcontrato;
    @XmlElement(name = "ID_SUCURSAL")
    protected int idsucursal;
    @XmlElement(name = "CUOTA_NOUSO")
    protected double cuotanouso;
    @XmlElement(name = "MORATORIOS")
    protected double moratorios;
    @XmlElement(name = "INICIA_VERSION")
    protected String iniciaversion;
    @XmlElement(name = "TERMINA_VERSION")
    protected String terminaversion;
    @XmlElement(name = "det_contrato", nillable = true)
    protected List<DetContrato> detContrato;
    @XmlElement(name = "cliente_contrato", nillable = true)
    protected List<ClientesContrato> clienteContrato;

    /**
     * Obtiene el valor de la propiedad idversion.
     * 
     */
    public int getIDVERSION() {
        return idversion;
    }

    /**
     * Define el valor de la propiedad idversion.
     * 
     */
    public void setIDVERSION(int value) {
        this.idversion = value;
    }

    /**
     * Obtiene el valor de la propiedad idcontrato.
     * 
     */
    public int getIDCONTRATO() {
        return idcontrato;
    }

    /**
     * Define el valor de la propiedad idcontrato.
     * 
     */
    public void setIDCONTRATO(int value) {
        this.idcontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad idsucursal.
     * 
     */
    public int getIDSUCURSAL() {
        return idsucursal;
    }

    /**
     * Define el valor de la propiedad idsucursal.
     * 
     */
    public void setIDSUCURSAL(int value) {
        this.idsucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotanouso.
     * 
     */
    public double getCUOTANOUSO() {
        return cuotanouso;
    }

    /**
     * Define el valor de la propiedad cuotanouso.
     * 
     */
    public void setCUOTANOUSO(double value) {
        this.cuotanouso = value;
    }

    /**
     * Obtiene el valor de la propiedad moratorios.
     * 
     */
    public double getMORATORIOS() {
        return moratorios;
    }

    /**
     * Define el valor de la propiedad moratorios.
     * 
     */
    public void setMORATORIOS(double value) {
        this.moratorios = value;
    }

    /**
     * Obtiene el valor de la propiedad iniciaversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINICIAVERSION() {
        return iniciaversion;
    }

    /**
     * Define el valor de la propiedad iniciaversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINICIAVERSION(String value) {
        this.iniciaversion = value;
    }

    /**
     * Obtiene el valor de la propiedad terminaversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTERMINAVERSION() {
        return terminaversion;
    }

    /**
     * Define el valor de la propiedad terminaversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTERMINAVERSION(String value) {
        this.terminaversion = value;
    }

    /**
     * Gets the value of the detContrato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detContrato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetContrato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetContrato }
     * 
     * 
     */
    public List<DetContrato> getDetContrato() {
        if (detContrato == null) {
            detContrato = new ArrayList<DetContrato>();
        }
        return this.detContrato;
    }

    /**
     * Gets the value of the clienteContrato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clienteContrato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClienteContrato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientesContrato }
     * 
     * 
     */
    public List<ClientesContrato> getClienteContrato() {
        if (clienteContrato == null) {
            clienteContrato = new ArrayList<ClientesContrato>();
        }
        return this.clienteContrato;
    }

}
