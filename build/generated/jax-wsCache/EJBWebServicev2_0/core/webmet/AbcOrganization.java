
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcOrganization complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcOrganization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PRTY_ORGN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIEL" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcOrganization", propOrder = {
    "instancia",
    "idprtyorgn",
    "fiel"
})
public class AbcOrganization {

    protected int instancia;
    @XmlElement(name = "ID_PRTY_ORGN")
    protected int idprtyorgn;
    @XmlElement(name = "FIEL", required = true)
    protected byte[] fiel;

    /**
     * Obtiene el valor de la propiedad instancia.
     * 
     */
    public int getInstancia() {
        return instancia;
    }

    /**
     * Define el valor de la propiedad instancia.
     * 
     */
    public void setInstancia(int value) {
        this.instancia = value;
    }

    /**
     * Obtiene el valor de la propiedad idprtyorgn.
     * 
     */
    public int getIDPRTYORGN() {
        return idprtyorgn;
    }

    /**
     * Define el valor de la propiedad idprtyorgn.
     * 
     */
    public void setIDPRTYORGN(int value) {
        this.idprtyorgn = value;
    }

    /**
     * Obtiene el valor de la propiedad fiel.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFIEL() {
        return fiel;
    }

    /**
     * Define el valor de la propiedad fiel.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFIEL(byte[] value) {
        this.fiel = value;
    }

}
