
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ABC_InstanciaW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ABC_InstanciaW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rva" type="{http://Webmet.core/}abcInstancia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABC_InstanciaW", propOrder = {
    "rva"
})
public class ABCInstanciaW {

    protected AbcInstancia rva;

    /**
     * Obtiene el valor de la propiedad rva.
     * 
     * @return
     *     possible object is
     *     {@link AbcInstancia }
     *     
     */
    public AbcInstancia getRva() {
        return rva;
    }

    /**
     * Define el valor de la propiedad rva.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcInstancia }
     *     
     */
    public void setRva(AbcInstancia value) {
        this.rva = value;
    }

}
