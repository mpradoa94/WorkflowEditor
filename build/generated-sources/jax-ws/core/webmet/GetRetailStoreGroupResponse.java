
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRetailStoreGroupResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRetailStoreGroupResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="retailstoregp" type="{http://Webmet.core/}retailStoreGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRetailStoreGroupResponse", propOrder = {
    "resultado",
    "retailstoregp"
})
public class GetRetailStoreGroupResponse {

    protected Resultado resultado;
    protected RetailStoreGroup retailstoregp;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad retailstoregp.
     * 
     * @return
     *     possible object is
     *     {@link RetailStoreGroup }
     *     
     */
    public RetailStoreGroup getRetailstoregp() {
        return retailstoregp;
    }

    /**
     * Define el valor de la propiedad retailstoregp.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailStoreGroup }
     *     
     */
    public void setRetailstoregp(RetailStoreGroup value) {
        this.retailstoregp = value;
    }

}
