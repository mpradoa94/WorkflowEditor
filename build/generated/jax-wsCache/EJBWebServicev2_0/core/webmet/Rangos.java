
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rangos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rangos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idvig" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idLn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="porcentaje" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rangos", propOrder = {
    "idFn",
    "idvig",
    "idLn",
    "min",
    "max",
    "importe",
    "porcentaje"
})
public class Rangos {

    protected int idFn;
    protected int idvig;
    protected int idLn;
    protected double min;
    protected double max;
    protected double importe;
    protected double porcentaje;

    /**
     * Obtiene el valor de la propiedad idFn.
     * 
     */
    public int getIdFn() {
        return idFn;
    }

    /**
     * Define el valor de la propiedad idFn.
     * 
     */
    public void setIdFn(int value) {
        this.idFn = value;
    }

    /**
     * Obtiene el valor de la propiedad idvig.
     * 
     */
    public int getIdvig() {
        return idvig;
    }

    /**
     * Define el valor de la propiedad idvig.
     * 
     */
    public void setIdvig(int value) {
        this.idvig = value;
    }

    /**
     * Obtiene el valor de la propiedad idLn.
     * 
     */
    public int getIdLn() {
        return idLn;
    }

    /**
     * Define el valor de la propiedad idLn.
     * 
     */
    public void setIdLn(int value) {
        this.idLn = value;
    }

    /**
     * Obtiene el valor de la propiedad min.
     * 
     */
    public double getMin() {
        return min;
    }

    /**
     * Define el valor de la propiedad min.
     * 
     */
    public void setMin(double value) {
        this.min = value;
    }

    /**
     * Obtiene el valor de la propiedad max.
     * 
     */
    public double getMax() {
        return max;
    }

    /**
     * Define el valor de la propiedad max.
     * 
     */
    public void setMax(double value) {
        this.max = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentaje.
     * 
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     */
    public void setPorcentaje(double value) {
        this.porcentaje = value;
    }

}
