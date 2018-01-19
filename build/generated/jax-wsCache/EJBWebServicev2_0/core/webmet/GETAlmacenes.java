
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_Almacenes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_Almacenes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inlocations" type="{http://Webmet.core/}getInventoryLocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_Almacenes", propOrder = {
    "inlocations"
})
public class GETAlmacenes {

    protected GetInventoryLocations inlocations;

    /**
     * Obtiene el valor de la propiedad inlocations.
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryLocations }
     *     
     */
    public GetInventoryLocations getInlocations() {
        return inlocations;
    }

    /**
     * Define el valor de la propiedad inlocations.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryLocations }
     *     
     */
    public void setInlocations(GetInventoryLocations value) {
        this.inlocations = value;
    }

}
