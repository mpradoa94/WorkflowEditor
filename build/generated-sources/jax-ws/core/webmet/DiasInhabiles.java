
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para diasInhabiles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="diasInhabiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_inhabiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diasInhabiles", propOrder = {
    "idInhabiles",
    "dia",
    "habilitado"
})
public class DiasInhabiles {

    @XmlElement(name = "id_inhabiles")
    protected int idInhabiles;
    protected String dia;
    protected boolean habilitado;

    /**
     * Obtiene el valor de la propiedad idInhabiles.
     * 
     */
    public int getIdInhabiles() {
        return idInhabiles;
    }

    /**
     * Define el valor de la propiedad idInhabiles.
     * 
     */
    public void setIdInhabiles(int value) {
        this.idInhabiles = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDia(String value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitado.
     * 
     */
    public boolean isHabilitado() {
        return habilitado;
    }

    /**
     * Define el valor de la propiedad habilitado.
     * 
     */
    public void setHabilitado(boolean value) {
        this.habilitado = value;
    }

}
