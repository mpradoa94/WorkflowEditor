
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteLiquidacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteLiquidacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaReporte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_WS" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "getReporteLiquidacion", propOrder = {
    "idInstancia",
    "idstrrt",
    "fechaReporte",
    "idws",
    "idlcn"
})
public class GetReporteLiquidacion {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(required = true)
    protected String fechaReporte;
    @XmlElement(name = "ID_WS")
    protected int idws;
    @XmlElement(name = "ID_LCN")
    protected int idlcn;

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
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaReporte() {
        return fechaReporte;
    }

    /**
     * Define el valor de la propiedad fechaReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaReporte(String value) {
        this.fechaReporte = value;
    }

    /**
     * Obtiene el valor de la propiedad idws.
     * 
     */
    public int getIDWS() {
        return idws;
    }

    /**
     * Define el valor de la propiedad idws.
     * 
     */
    public void setIDWS(int value) {
        this.idws = value;
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
