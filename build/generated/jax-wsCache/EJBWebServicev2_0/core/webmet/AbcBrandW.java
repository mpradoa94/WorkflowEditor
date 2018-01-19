
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Abc_BrandW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Abc_BrandW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://Webmet.core/}abcBrand" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abc_BrandW", propOrder = {
    "brand"
})
public class AbcBrandW {

    protected AbcBrand brand;

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link AbcBrand }
     *     
     */
    public AbcBrand getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcBrand }
     *     
     */
    public void setBrand(AbcBrand value) {
        this.brand = value;
    }

}
