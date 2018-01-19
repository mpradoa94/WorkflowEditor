
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getContratoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getContratoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpagos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="contratos" type="{http://Webmet.core/}contratos" minOccurs="0"/>
 *         &lt;element name="CcS" type="{http://Webmet.core/}clienteContratoServ" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Horario" type="{http://Webmet.core/}horarios" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ghistorial" type="{http://Webmet.core/}gHistorialCobros" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detcobro" type="{http://Webmet.core/}detCOBRO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="store" type="{http://Webmet.core/}retailStore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContratoResponse", propOrder = {
    "gpagos",
    "resultado",
    "contratos",
    "ccS",
    "horario",
    "ghistorial",
    "detcobro",
    "store"
})
public class GetContratoResponse {

    protected int gpagos;
    protected Resultado resultado;
    protected Contratos contratos;
    @XmlElement(name = "CcS", nillable = true)
    protected List<ClienteContratoServ> ccS;
    @XmlElement(name = "Horario", nillable = true)
    protected List<Horarios> horario;
    @XmlElement(name = "Ghistorial", nillable = true)
    protected List<GHistorialCobros> ghistorial;
    @XmlElement(nillable = true)
    protected List<DetCOBRO> detcobro;
    protected RetailStore store;

    /**
     * Obtiene el valor de la propiedad gpagos.
     * 
     */
    public int getGpagos() {
        return gpagos;
    }

    /**
     * Define el valor de la propiedad gpagos.
     * 
     */
    public void setGpagos(int value) {
        this.gpagos = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad contratos.
     * 
     * @return
     *     possible object is
     *     {@link Contratos }
     *     
     */
    public Contratos getContratos() {
        return contratos;
    }

    /**
     * Define el valor de la propiedad contratos.
     * 
     * @param value
     *     allowed object is
     *     {@link Contratos }
     *     
     */
    public void setContratos(Contratos value) {
        this.contratos = value;
    }

    /**
     * Gets the value of the ccS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClienteContratoServ }
     * 
     * 
     */
    public List<ClienteContratoServ> getCcS() {
        if (ccS == null) {
            ccS = new ArrayList<ClienteContratoServ>();
        }
        return this.ccS;
    }

    /**
     * Gets the value of the horario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Horarios }
     * 
     * 
     */
    public List<Horarios> getHorario() {
        if (horario == null) {
            horario = new ArrayList<Horarios>();
        }
        return this.horario;
    }

    /**
     * Gets the value of the ghistorial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ghistorial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGhistorial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GHistorialCobros }
     * 
     * 
     */
    public List<GHistorialCobros> getGhistorial() {
        if (ghistorial == null) {
            ghistorial = new ArrayList<GHistorialCobros>();
        }
        return this.ghistorial;
    }

    /**
     * Gets the value of the detcobro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detcobro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetcobro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetCOBRO }
     * 
     * 
     */
    public List<DetCOBRO> getDetcobro() {
        if (detcobro == null) {
            detcobro = new ArrayList<DetCOBRO>();
        }
        return this.detcobro;
    }

    /**
     * Obtiene el valor de la propiedad store.
     * 
     * @return
     *     possible object is
     *     {@link RetailStore }
     *     
     */
    public RetailStore getStore() {
        return store;
    }

    /**
     * Define el valor de la propiedad store.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStore }
     *     
     */
    public void setStore(RetailStore value) {
        this.store = value;
    }

}
