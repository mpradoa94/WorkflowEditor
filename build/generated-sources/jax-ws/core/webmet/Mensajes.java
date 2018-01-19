
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mensajes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mensajes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_rs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_lgn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_msj" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="msj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensajes", propOrder = {
    "idRs",
    "idLgn",
    "idMsj",
    "msj"
})
public class Mensajes {

    @XmlElement(name = "id_rs")
    protected int idRs;
    @XmlElement(name = "id_lgn")
    protected int idLgn;
    @XmlElement(name = "id_msj")
    protected int idMsj;
    protected String msj;

    /**
     * Obtiene el valor de la propiedad idRs.
     * 
     */
    public int getIdRs() {
        return idRs;
    }

    /**
     * Define el valor de la propiedad idRs.
     * 
     */
    public void setIdRs(int value) {
        this.idRs = value;
    }

    /**
     * Obtiene el valor de la propiedad idLgn.
     * 
     */
    public int getIdLgn() {
        return idLgn;
    }

    /**
     * Define el valor de la propiedad idLgn.
     * 
     */
    public void setIdLgn(int value) {
        this.idLgn = value;
    }

    /**
     * Obtiene el valor de la propiedad idMsj.
     * 
     */
    public int getIdMsj() {
        return idMsj;
    }

    /**
     * Define el valor de la propiedad idMsj.
     * 
     */
    public void setIdMsj(int value) {
        this.idMsj = value;
    }

    /**
     * Obtiene el valor de la propiedad msj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsj() {
        return msj;
    }

    /**
     * Define el valor de la propiedad msj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsj(String value) {
        this.msj = value;
    }

}
