
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReporteOrdenesyReportesProduccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReporteOrdenesyReportesProduccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDLCN" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReporteOrdenesyReportesProduccion", propOrder = {
    "idInstancia",
    "fecha1",
    "fecha2",
    "idstrrt",
    "idlcn"
})
public class GetReporteOrdenesyReportesProduccion {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected String fecha1;
    @XmlElement(required = true)
    protected String fecha2;
    @XmlElement(name = "ID_STR_RT", required = true)
    protected String idstrrt;
    @XmlElement(name = "IDLCN", type = Integer.class)
    protected List<Integer> idlcn;

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
     * Obtiene el valor de la propiedad idstrrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSTRRT(String value) {
        this.idstrrt = value;
    }

    /**
     * Gets the value of the idlcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idlcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDLCN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIDLCN() {
        if (idlcn == null) {
            idlcn = new ArrayList<Integer>();
        }
        return this.idlcn;
    }

}
