
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para busquedaICD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaICD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_CMPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busquedaICD", propOrder = {
    "descripcion",
    "idicd",
    "referencia",
    "tscmpl"
})
public class BusquedaICD {

    @XmlElement(name = "DESCRIPCION")
    protected String descripcion;
    @XmlElement(name = "ID_ICD")
    protected int idicd;
    @XmlElement(name = "REFERENCIA")
    protected String referencia;
    @XmlElement(name = "TS_CMPL")
    protected String tscmpl;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idicd.
     * 
     */
    public int getIDICD() {
        return idicd;
    }

    /**
     * Define el valor de la propiedad idicd.
     * 
     */
    public void setIDICD(int value) {
        this.idicd = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCIA() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCIA(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tscmpl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCMPL() {
        return tscmpl;
    }

    /**
     * Define el valor de la propiedad tscmpl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCMPL(String value) {
        this.tscmpl = value;
    }

}
