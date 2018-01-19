
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GET_StockForListIDW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GET_StockForListIDW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stk" type="{http://Webmet.core/}getSTKIDList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_StockForListIDW", propOrder = {
    "stk"
})
public class GETStockForListIDW {

    protected GetSTKIDList stk;

    /**
     * Obtiene el valor de la propiedad stk.
     * 
     * @return
     *     possible object is
     *     {@link GetSTKIDList }
     *     
     */
    public GetSTKIDList getStk() {
        return stk;
    }

    /**
     * Define el valor de la propiedad stk.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSTKIDList }
     *     
     */
    public void setStk(GetSTKIDList value) {
        this.stk = value;
    }

}
