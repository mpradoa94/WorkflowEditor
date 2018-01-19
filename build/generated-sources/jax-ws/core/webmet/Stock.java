
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para stock complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="stock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_itm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_ws" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo_Transaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendidas_devueltas" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stock", propOrder = {
    "idItm",
    "idWs",
    "tipoTransaccion",
    "vendidasDevueltas",
    "valor"
})
public class Stock {

    @XmlElement(name = "id_itm")
    protected int idItm;
    @XmlElement(name = "id_ws")
    protected int idWs;
    @XmlElement(name = "tipo_Transaccion")
    protected String tipoTransaccion;
    @XmlElement(name = "vendidas_devueltas")
    protected float vendidasDevueltas;
    protected float valor;

    /**
     * Obtiene el valor de la propiedad idItm.
     * 
     */
    public int getIdItm() {
        return idItm;
    }

    /**
     * Define el valor de la propiedad idItm.
     * 
     */
    public void setIdItm(int value) {
        this.idItm = value;
    }

    /**
     * Obtiene el valor de la propiedad idWs.
     * 
     */
    public int getIdWs() {
        return idWs;
    }

    /**
     * Define el valor de la propiedad idWs.
     * 
     */
    public void setIdWs(int value) {
        this.idWs = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Define el valor de la propiedad tipoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTransaccion(String value) {
        this.tipoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad vendidasDevueltas.
     * 
     */
    public float getVendidasDevueltas() {
        return vendidasDevueltas;
    }

    /**
     * Define el valor de la propiedad vendidasDevueltas.
     * 
     */
    public void setVendidasDevueltas(float value) {
        this.vendidasDevueltas = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public float getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(float value) {
        this.valor = value;
    }

}
