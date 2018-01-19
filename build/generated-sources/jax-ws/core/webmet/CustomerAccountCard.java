
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para customerAccountCard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customerAccountCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AI_ACNT_CT_CRD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CTAC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DC_EP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODIGO_INT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerAccountCard", propOrder = {
    "aiacntctcrd",
    "idctac",
    "dcep",
    "codigoint"
})
public class CustomerAccountCard {

    @XmlElement(name = "AI_ACNT_CT_CRD")
    protected int aiacntctcrd;
    @XmlElement(name = "ID_CTAC")
    protected int idctac;
    @XmlElement(name = "DC_EP")
    protected String dcep;
    @XmlElement(name = "CODIGO_INT")
    protected String codigoint;

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
     * Obtiene el valor de la propiedad dcep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCEP() {
        return dcep;
    }

    /**
     * Define el valor de la propiedad dcep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCEP(String value) {
        this.dcep = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINT() {
        return codigoint;
    }

    /**
     * Define el valor de la propiedad codigoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINT(String value) {
        this.codigoint = value;
    }

}
