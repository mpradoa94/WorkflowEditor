
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_ThirdMerch complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_ThirdMerch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inn" type="{http://Webmet.core/}getCategoriasAll" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ThirdMerch", propOrder = {
    "inn"
})
public class GETThirdMerch {

    protected GetCategoriasAll inn;

    /**
     * Obtiene el valor de la propiedad inn.
     * 
     * @return
     *     possible object is
     *     {@link GetCategoriasAll }
     *     
     */
    public GetCategoriasAll getInn() {
        return inn;
    }

    /**
     * Define el valor de la propiedad inn.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCategoriasAll }
     *     
     */
    public void setInn(GetCategoriasAll value) {
        this.inn = value;
    }

}
