
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para horarioHabil complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="horarioHabil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secuencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="citasxhora" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="laborable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indAmarillo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indNaranja" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horarioHabil", propOrder = {
    "dia",
    "secuencia",
    "desde",
    "hasta",
    "citasxhora",
    "laborable",
    "indAmarillo",
    "indNaranja"
})
public class HorarioHabil {

    protected String dia;
    protected int secuencia;
    protected String desde;
    protected String hasta;
    protected int citasxhora;
    protected String laborable;
    protected int indAmarillo;
    protected int indNaranja;

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
     * Obtiene el valor de la propiedad secuencia.
     * 
     */
    public int getSecuencia() {
        return secuencia;
    }

    /**
     * Define el valor de la propiedad secuencia.
     * 
     */
    public void setSecuencia(int value) {
        this.secuencia = value;
    }

    /**
     * Obtiene el valor de la propiedad desde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesde() {
        return desde;
    }

    /**
     * Define el valor de la propiedad desde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesde(String value) {
        this.desde = value;
    }

    /**
     * Obtiene el valor de la propiedad hasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasta() {
        return hasta;
    }

    /**
     * Define el valor de la propiedad hasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasta(String value) {
        this.hasta = value;
    }

    /**
     * Obtiene el valor de la propiedad citasxhora.
     * 
     */
    public int getCitasxhora() {
        return citasxhora;
    }

    /**
     * Define el valor de la propiedad citasxhora.
     * 
     */
    public void setCitasxhora(int value) {
        this.citasxhora = value;
    }

    /**
     * Obtiene el valor de la propiedad laborable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborable() {
        return laborable;
    }

    /**
     * Define el valor de la propiedad laborable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborable(String value) {
        this.laborable = value;
    }

    /**
     * Obtiene el valor de la propiedad indAmarillo.
     * 
     */
    public int getIndAmarillo() {
        return indAmarillo;
    }

    /**
     * Define el valor de la propiedad indAmarillo.
     * 
     */
    public void setIndAmarillo(int value) {
        this.indAmarillo = value;
    }

    /**
     * Obtiene el valor de la propiedad indNaranja.
     * 
     */
    public int getIndNaranja() {
        return indNaranja;
    }

    /**
     * Define el valor de la propiedad indNaranja.
     * 
     */
    public void setIndNaranja(int value) {
        this.indNaranja = value;
    }

}
