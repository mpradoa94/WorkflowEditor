
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchInventoryControlDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchInventoryControlDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_SPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ICD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SRZ_FRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchInventoryControlDocument", propOrder = {
    "idinstancia",
    "idlcn",
    "tyicd",
    "idspr",
    "idicd",
    "idsrzfrm"
})
public class SearchInventoryControlDocument {

    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;
    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "TY_ICD")
    protected String tyicd;
    @XmlElement(name = "ID_SPR")
    protected int idspr;
    @XmlElement(name = "ID_ICD")
    protected int idicd;
    @XmlElement(name = "ID_SRZ_FRM")
    protected String idsrzfrm;

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
     * Obtiene el valor de la propiedad idspr.
     * 
     */
    public int getIDSPR() {
        return idspr;
    }

    /**
     * Define el valor de la propiedad idspr.
     * 
     */
    public void setIDSPR(int value) {
        this.idspr = value;
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
     * Obtiene el valor de la propiedad idsrzfrm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSRZFRM() {
        return idsrzfrm;
    }

    /**
     * Define el valor de la propiedad idsrzfrm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSRZFRM(String value) {
        this.idsrzfrm = value;
    }

}
