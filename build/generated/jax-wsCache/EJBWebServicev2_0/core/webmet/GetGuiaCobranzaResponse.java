
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGuiaCobranzaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGuiaCobranzaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="guia" type="{http://Webmet.core/}guiaCobranza" minOccurs="0"/>
 *         &lt;element name="guias" type="{http://Webmet.core/}guiaCobranza" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGuiaCobranzaResponse", propOrder = {
    "resultado",
    "guia",
    "guias"
})
public class GetGuiaCobranzaResponse {

    protected Resultado resultado;
    protected GuiaCobranza guia;
    @XmlElement(nillable = true)
    protected List<GuiaCobranza> guias;

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
     * Obtiene el valor de la propiedad guia.
     * 
     * @return
     *     possible object is
     *     {@link GuiaCobranza }
     *     
     */
    public GuiaCobranza getGuia() {
        return guia;
    }

    /**
     * Define el valor de la propiedad guia.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiaCobranza }
     *     
     */
    public void setGuia(GuiaCobranza value) {
        this.guia = value;
    }

    /**
     * Gets the value of the guias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuiaCobranza }
     * 
     * 
     */
    public List<GuiaCobranza> getGuias() {
        if (guias == null) {
            guias = new ArrayList<GuiaCobranza>();
        }
        return this.guias;
    }

}
