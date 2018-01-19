
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para telephoneType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="telephoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PH_TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_PH_TYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telephoneType", propOrder = {
    "idphtype",
    "dephtyp"
})
public class TelephoneType {

    @XmlElement(name = "ID_PH_TYPE")
    protected int idphtype;
    @XmlElement(name = "DE_PH_TYP")
    protected String dephtyp;

    /**
     * Obtiene el valor de la propiedad idphtype.
     * 
     */
    public int getIDPHTYPE() {
        return idphtype;
    }

    /**
     * Define el valor de la propiedad idphtype.
     * 
     */
    public void setIDPHTYPE(int value) {
        this.idphtype = value;
    }

    /**
     * Obtiene el valor de la propiedad dephtyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPHTYP() {
        return dephtyp;
    }

    /**
     * Define el valor de la propiedad dephtyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPHTYP(String value) {
        this.dephtyp = value;
    }

}
