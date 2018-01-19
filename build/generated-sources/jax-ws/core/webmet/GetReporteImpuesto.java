
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteImpuesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteImpuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tienda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteImpuesto", propOrder = {
    "instancia",
    "tienda",
    "fecha1",
    "fecha2",
    "exento"
})
public class GetReporteImpuesto {

    protected int instancia;
    protected int tienda;
    @XmlElement(required = true)
    protected String fecha1;
    @XmlElement(required = true)
    protected String fecha2;
    protected int exento;

    /**
     * Obtiene el valor de la propiedad instancia.
     * 
     */
    public int getInstancia() {
        return instancia;
    }

    /**
     * Define el valor de la propiedad instancia.
     * 
     */
    public void setInstancia(int value) {
        this.instancia = value;
    }

    /**
     * Obtiene el valor de la propiedad tienda.
     * 
     */
    public int getTienda() {
        return tienda;
    }

    /**
     * Define el valor de la propiedad tienda.
     * 
     */
    public void setTienda(int value) {
        this.tienda = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha1() {
        return fecha1;
    }

    /**
     * Define el valor de la propiedad fecha1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha1(String value) {
        this.fecha1 = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha2() {
        return fecha2;
    }

    /**
     * Define el valor de la propiedad fecha2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha2(String value) {
        this.fecha2 = value;
    }

    /**
     * Obtiene el valor de la propiedad exento.
     * 
     */
    public int getExento() {
        return exento;
    }

    /**
     * Define el valor de la propiedad exento.
     * 
     */
    public void setExento(int value) {
        this.exento = value;
    }

}
