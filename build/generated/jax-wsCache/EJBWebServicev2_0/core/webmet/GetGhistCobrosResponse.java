
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGhistCobrosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGhistCobrosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="ghistcobros" type="{http://Webmet.core/}ghistCobros" minOccurs="0"/>
 *         &lt;element name="Ghistorial" type="{http://Webmet.core/}gHistorialCobros" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detcobro" type="{http://Webmet.core/}detCOBRO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGhistCobrosResponse", propOrder = {
    "resultado",
    "ghistcobros",
    "ghistorial",
    "detcobro"
})
public class GetGhistCobrosResponse {

    protected Resultado resultado;
    protected GhistCobros ghistcobros;
    @XmlElement(name = "Ghistorial", nillable = true)
    protected List<GHistorialCobros> ghistorial;
    @XmlElement(nillable = true)
    protected List<DetCOBRO> detcobro;

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
     * Obtiene el valor de la propiedad ghistcobros.
     * 
     * @return
     *     possible object is
     *     {@link GhistCobros }
     *     
     */
    public GhistCobros getGhistcobros() {
        return ghistcobros;
    }

    /**
     * Define el valor de la propiedad ghistcobros.
     * 
     * @param value
     *     allowed object is
     *     {@link GhistCobros }
     *     
     */
    public void setGhistcobros(GhistCobros value) {
        this.ghistcobros = value;
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

}
