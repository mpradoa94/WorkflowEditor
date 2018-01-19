
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para userName complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="userName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_PERSONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HUELLA_IZQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HUELLA_DER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userName", propOrder = {
    "idpersona",
    "huellaizq",
    "huellader",
    "nip",
    "foto"
})
public class UserName {

    @XmlElement(name = "ID_PERSONA")
    protected int idpersona;
    @XmlElement(name = "HUELLA_IZQ")
    protected String huellaizq;
    @XmlElement(name = "HUELLA_DER")
    protected String huellader;
    @XmlElement(name = "NIP")
    protected String nip;
    @XmlElement(name = "FOTO")
    protected String foto;

    /**
     * Obtiene el valor de la propiedad idpersona.
     * 
     */
    public int getIDPERSONA() {
        return idpersona;
    }

    /**
     * Define el valor de la propiedad idpersona.
     * 
     */
    public void setIDPERSONA(int value) {
        this.idpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad huellaizq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUELLAIZQ() {
        return huellaizq;
    }

    /**
     * Define el valor de la propiedad huellaizq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUELLAIZQ(String value) {
        this.huellaizq = value;
    }

    /**
     * Obtiene el valor de la propiedad huellader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUELLADER() {
        return huellader;
    }

    /**
     * Define el valor de la propiedad huellader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUELLADER(String value) {
        this.huellader = value;
    }

    /**
     * Obtiene el valor de la propiedad nip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIP() {
        return nip;
    }

    /**
     * Define el valor de la propiedad nip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIP(String value) {
        this.nip = value;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOTO() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOTO(String value) {
        this.foto = value;
    }

}
