
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para funciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="funciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_fn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_fn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funciones", propOrder = {
    "idFn",
    "nmFn"
})
public class Funciones {

    @XmlElement(name = "id_fn")
    protected int idFn;
    @XmlElement(name = "nm_fn")
    protected String nmFn;

    /**
     * Obtiene el valor de la propiedad idFn.
     * 
     */
    public int getIdFn() {
        return idFn;
    }

    /**
     * Define el valor de la propiedad idFn.
     * 
     */
    public void setIdFn(int value) {
        this.idFn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmFn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmFn() {
        return nmFn;
    }

    /**
     * Define el valor de la propiedad nmFn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmFn(String value) {
        this.nmFn = value;
    }

}
