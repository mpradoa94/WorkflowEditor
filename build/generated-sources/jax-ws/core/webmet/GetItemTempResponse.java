
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getItemTempResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getItemTempResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="itmtmp" type="{http://Webmet.core/}itemTmp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemTempResponse", propOrder = {
    "resultado",
    "itmtmp"
})
public class GetItemTempResponse {

    protected Resultado resultado;
    protected ItemTmp itmtmp;

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
     * Obtiene el valor de la propiedad itmtmp.
     * 
     * @return
     *     possible object is
     *     {@link ItemTmp }
     *     
     */
    public ItemTmp getItmtmp() {
        return itmtmp;
    }

    /**
     * Define el valor de la propiedad itmtmp.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTmp }
     *     
     */
    public void setItmtmp(ItemTmp value) {
        this.itmtmp = value;
    }

}
