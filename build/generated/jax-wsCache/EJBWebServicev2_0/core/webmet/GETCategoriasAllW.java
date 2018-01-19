
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_CategoriasAllW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_CategoriasAllW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="innn" type="{http://Webmet.core/}getCategoriasAll" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_CategoriasAllW", propOrder = {
    "innn"
})
public class GETCategoriasAllW {

    protected GetCategoriasAll innn;

    /**
     * Obtiene el valor de la propiedad innn.
     * 
     * @return
     *     possible object is
     *     {@link GetCategoriasAll }
     *     
     */
    public GetCategoriasAll getInnn() {
        return innn;
    }

    /**
     * Define el valor de la propiedad innn.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCategoriasAll }
     *     
     */
    public void setInnn(GetCategoriasAll value) {
        this.innn = value;
    }

}
