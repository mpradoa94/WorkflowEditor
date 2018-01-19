
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para personsRelated complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="personsRelated">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_prty_prs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_prty_prs_related" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personsRelated", propOrder = {
    "idPrtyPrs",
    "idPrtyPrsRelated"
})
public class PersonsRelated {

    @XmlElement(name = "id_prty_prs")
    protected int idPrtyPrs;
    @XmlElement(name = "id_prty_prs_related")
    protected int idPrtyPrsRelated;

    /**
     * Obtiene el valor de la propiedad idPrtyPrs.
     * 
     */
    public int getIdPrtyPrs() {
        return idPrtyPrs;
    }

    /**
     * Define el valor de la propiedad idPrtyPrs.
     * 
     */
    public void setIdPrtyPrs(int value) {
        this.idPrtyPrs = value;
    }

    /**
     * Obtiene el valor de la propiedad idPrtyPrsRelated.
     * 
     */
    public int getIdPrtyPrsRelated() {
        return idPrtyPrsRelated;
    }

    /**
     * Define el valor de la propiedad idPrtyPrsRelated.
     * 
     */
    public void setIdPrtyPrsRelated(int value) {
        this.idPrtyPrsRelated = value;
    }

}
