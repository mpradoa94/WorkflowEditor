
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para empresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="empresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEmp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idPrty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tyRoPrty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyrol" type="{http://Webmet.core/}partyRol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empresa", propOrder = {
    "idEmp",
    "idPrty",
    "tyRoPrty",
    "partyrol"
})
public class Empresa {

    protected int idEmp;
    protected int idPrty;
    protected String tyRoPrty;
    protected PartyRol partyrol;

    /**
     * Obtiene el valor de la propiedad idEmp.
     * 
     */
    public int getIdEmp() {
        return idEmp;
    }

    /**
     * Define el valor de la propiedad idEmp.
     * 
     */
    public void setIdEmp(int value) {
        this.idEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad idPrty.
     * 
     */
    public int getIdPrty() {
        return idPrty;
    }

    /**
     * Define el valor de la propiedad idPrty.
     * 
     */
    public void setIdPrty(int value) {
        this.idPrty = value;
    }

    /**
     * Obtiene el valor de la propiedad tyRoPrty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyRoPrty() {
        return tyRoPrty;
    }

    /**
     * Define el valor de la propiedad tyRoPrty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyRoPrty(String value) {
        this.tyRoPrty = value;
    }

    /**
     * Obtiene el valor de la propiedad partyrol.
     * 
     * @return
     *     possible object is
     *     {@link PartyRol }
     *     
     */
    public PartyRol getPartyrol() {
        return partyrol;
    }

    /**
     * Define el valor de la propiedad partyrol.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRol }
     *     
     */
    public void setPartyrol(PartyRol value) {
        this.partyrol = value;
    }

}
