
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteInventario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteInventario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MER1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MER2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteInventario", propOrder = {
    "operacion",
    "idInstancia",
    "mer1",
    "mer2",
    "idlcn"
})
public class GetReporteInventario {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "MER1", required = true)
    protected String mer1;
    @XmlElement(name = "MER2", required = true)
    protected String mer2;
    @XmlElement(name = "ID_LCN")
    protected int idlcn;

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
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad mer1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMER1() {
        return mer1;
    }

    /**
     * Define el valor de la propiedad mer1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMER1(String value) {
        this.mer1 = value;
    }

    /**
     * Obtiene el valor de la propiedad mer2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMER2() {
        return mer2;
    }

    /**
     * Define el valor de la propiedad mer2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMER2(String value) {
        this.mer2 = value;
    }

    /**
     * Obtiene el valor de la propiedad idlcn.
     * 
     */
    public int getIDLCN() {
        return idlcn;
    }

    /**
     * Define el valor de la propiedad idlcn.
     * 
     */
    public void setIDLCN(int value) {
        this.idlcn = value;
    }

}
