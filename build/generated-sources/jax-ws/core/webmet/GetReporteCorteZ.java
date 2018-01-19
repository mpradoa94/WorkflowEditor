
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteCorteZ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteCorteZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteCorteZ", propOrder = {
    "idInstancia",
    "fechaI",
    "fechaF"
})
public class GetReporteCorteZ {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected String fechaI;
    @XmlElement(required = true)
    protected String fechaF;

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
     * Obtiene el valor de la propiedad fechaI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaI() {
        return fechaI;
    }

    /**
     * Define el valor de la propiedad fechaI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaI(String value) {
        this.fechaI = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaF() {
        return fechaF;
    }

    /**
     * Define el valor de la propiedad fechaF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaF(String value) {
        this.fechaF = value;
    }

}
