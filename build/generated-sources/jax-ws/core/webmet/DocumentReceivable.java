
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentReceivable complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentReceivable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DCTO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CTAC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AI_ACNT_CT_CRD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GUIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentReceivable", propOrder = {
    "iddcto",
    "idctac",
    "reference",
    "aiacntctcrd",
    "idguia"
})
public class DocumentReceivable {

    @XmlElement(name = "ID_DCTO")
    protected int iddcto;
    @XmlElement(name = "ID_CTAC")
    protected int idctac;
    @XmlElement(name = "REFERENCE")
    protected String reference;
    @XmlElement(name = "AI_ACNT_CT_CRD")
    protected int aiacntctcrd;
    @XmlElement(name = "ID_GUIA")
    protected int idguia;

    /**
     * Obtiene el valor de la propiedad iddcto.
     * 
     */
    public int getIDDCTO() {
        return iddcto;
    }

    /**
     * Define el valor de la propiedad iddcto.
     * 
     */
    public void setIDDCTO(int value) {
        this.iddcto = value;
    }

    /**
     * Obtiene el valor de la propiedad idctac.
     * 
     */
    public int getIDCTAC() {
        return idctac;
    }

    /**
     * Define el valor de la propiedad idctac.
     * 
     */
    public void setIDCTAC(int value) {
        this.idctac = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCE() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCE(String value) {
        this.reference = value;
    }

    /**
     * Obtiene el valor de la propiedad aiacntctcrd.
     * 
     */
    public int getAIACNTCTCRD() {
        return aiacntctcrd;
    }

    /**
     * Define el valor de la propiedad aiacntctcrd.
     * 
     */
    public void setAIACNTCTCRD(int value) {
        this.aiacntctcrd = value;
    }

    /**
     * Obtiene el valor de la propiedad idguia.
     * 
     */
    public int getIDGUIA() {
        return idguia;
    }

    /**
     * Define el valor de la propiedad idguia.
     * 
     */
    public void setIDGUIA(int value) {
        this.idguia = value;
    }

}
