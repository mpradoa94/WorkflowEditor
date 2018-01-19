
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcSaldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcSaldo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="saldo" type="{http://Webmet.core/}saldos"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sumaResta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcSaldo", propOrder = {
    "operacion",
    "idinstancia",
    "saldo",
    "monto",
    "sumaResta"
})
public class AbcSaldo {

    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;
    @XmlElement(required = true)
    protected Saldos saldo;
    protected double monto;
    @XmlElement(required = true)
    protected String sumaResta;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idinstancia.
     * 
     */
    public int getIDINSTANCIA() {
        return idinstancia;
    }

    /**
     * Define el valor de la propiedad idinstancia.
     * 
     */
    public void setIDINSTANCIA(int value) {
        this.idinstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     * @return
     *     possible object is
     *     {@link Saldos }
     *     
     */
    public Saldos getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     * @param value
     *     allowed object is
     *     {@link Saldos }
     *     
     */
    public void setSaldo(Saldos value) {
        this.saldo = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaResta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaResta() {
        return sumaResta;
    }

    /**
     * Define el valor de la propiedad sumaResta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaResta(String value) {
        this.sumaResta = value;
    }

}
