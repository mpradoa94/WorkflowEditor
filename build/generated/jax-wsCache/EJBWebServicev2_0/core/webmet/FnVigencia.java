
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fnVigencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fnVigencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idvig" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idfn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dciniciavig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dcfinvig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fnVigencia", propOrder = {
    "idvig",
    "idfn",
    "dciniciavig",
    "dcfinvig"
})
public class FnVigencia {

    protected int idvig;
    protected int idfn;
    protected String dciniciavig;
    protected String dcfinvig;

    /**
     * Obtiene el valor de la propiedad idvig.
     * 
     */
    public int getIdvig() {
        return idvig;
    }

    /**
     * Define el valor de la propiedad idvig.
     * 
     */
    public void setIdvig(int value) {
        this.idvig = value;
    }

    /**
     * Obtiene el valor de la propiedad idfn.
     * 
     */
    public int getIdfn() {
        return idfn;
    }

    /**
     * Define el valor de la propiedad idfn.
     * 
     */
    public void setIdfn(int value) {
        this.idfn = value;
    }

    /**
     * Obtiene el valor de la propiedad dciniciavig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDciniciavig() {
        return dciniciavig;
    }

    /**
     * Define el valor de la propiedad dciniciavig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDciniciavig(String value) {
        this.dciniciavig = value;
    }

    /**
     * Obtiene el valor de la propiedad dcfinvig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcfinvig() {
        return dcfinvig;
    }

    /**
     * Define el valor de la propiedad dcfinvig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcfinvig(String value) {
        this.dcfinvig = value;
    }

}
