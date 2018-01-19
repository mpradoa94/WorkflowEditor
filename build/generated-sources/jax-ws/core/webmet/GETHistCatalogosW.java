
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_HistCatalogosW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_HistCatalogosW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hcs" type="{http://Webmet.core/}getHistCatalogosSinc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_HistCatalogosW", propOrder = {
    "hcs"
})
public class GETHistCatalogosW {

    protected GetHistCatalogosSinc hcs;

    /**
     * Obtiene el valor de la propiedad hcs.
     * 
     * @return
     *     possible object is
     *     {@link GetHistCatalogosSinc }
     *     
     */
    public GetHistCatalogosSinc getHcs() {
        return hcs;
    }

    /**
     * Define el valor de la propiedad hcs.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHistCatalogosSinc }
     *     
     */
    public void setHcs(GetHistCatalogosSinc value) {
        this.hcs = value;
    }

}
