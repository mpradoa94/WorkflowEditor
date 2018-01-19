
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FoodStampw complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FoodStampw">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="food" type="{http://Webmet.core/}getFoodStamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodStampw", propOrder = {
    "food"
})
public class FoodStampw {

    protected GetFoodStamp food;

    /**
     * Obtiene el valor de la propiedad food.
     * 
     * @return
     *     possible object is
     *     {@link GetFoodStamp }
     *     
     */
    public GetFoodStamp getFood() {
        return food;
    }

    /**
     * Define el valor de la propiedad food.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFoodStamp }
     *     
     */
    public void setFood(GetFoodStamp value) {
        this.food = value;
    }

}
