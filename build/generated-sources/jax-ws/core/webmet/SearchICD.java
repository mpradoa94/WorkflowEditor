
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchICD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchICD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TY_ICD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TS_CMPL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NM_SUPPLIER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchICD", propOrder = {
    "idInstancia",
    "descripcion",
    "tyicd",
    "idlcn",
    "tscmpl",
    "nmsupplier"
})
public class SearchICD {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "DESCRIPCION", required = true)
    protected String descripcion;
    @XmlElement(name = "TY_ICD", required = true)
    protected String tyicd;
    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "TS_CMPL", required = true)
    protected String tscmpl;
    @XmlElement(name = "NM_SUPPLIER", required = true)
    protected String nmsupplier;

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
     * Obtiene el valor de la propiedad tyicd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYICD() {
        return tyicd;
    }

    /**
     * Define el valor de la propiedad tyicd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYICD(String value) {
        this.tyicd = value;
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

    /**
     * Obtiene el valor de la propiedad nmsupplier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSUPPLIER() {
        return nmsupplier;
    }

    /**
     * Define el valor de la propiedad nmsupplier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSUPPLIER(String value) {
        this.nmsupplier = value;
    }

}
