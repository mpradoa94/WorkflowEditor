
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Search_ZonaW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Search_ZonaW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SEAZ" type="{http://Webmet.core/}searchZona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_ZonaW", propOrder = {
    "seaz"
})
public class SearchZonaW {

    @XmlElement(name = "SEAZ")
    protected SearchZona seaz;

    /**
     * Obtiene el valor de la propiedad seaz.
     * 
     * @return
     *     possible object is
     *     {@link SearchZona }
     *     
     */
    public SearchZona getSEAZ() {
        return seaz;
    }

    /**
     * Define el valor de la propiedad seaz.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchZona }
     *     
     */
    public void setSEAZ(SearchZona value) {
        this.seaz = value;
    }

}
