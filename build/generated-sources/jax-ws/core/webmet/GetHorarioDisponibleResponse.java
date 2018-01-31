
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getHorarioDisponibleResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getHorarioDisponibleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="horariod" type="{http://Webmet.core/}horarioDisponible" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHorarioDisponibleResponse", propOrder = {
    "resultado",
    "horariod"
})
public class GetHorarioDisponibleResponse {

    protected Resultado resultado;
    protected HorarioDisponible horariod;

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
     * Obtiene el valor de la propiedad horariod.
     * 
     * @return
     *     possible object is
     *     {@link HorarioDisponible }
     *     
     */
    public HorarioDisponible getHorariod() {
        return horariod;
    }

    /**
     * Define el valor de la propiedad horariod.
     * 
     * @param value
     *     allowed object is
     *     {@link HorarioDisponible }
     *     
     */
    public void setHorariod(HorarioDisponible value) {
        this.horariod = value;
    }

}