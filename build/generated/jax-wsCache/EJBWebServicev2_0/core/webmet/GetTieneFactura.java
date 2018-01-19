
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTieneFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTieneFactura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DCTO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_INSTACIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTieneFactura", propOrder = {
    "iddcto",
    "idinstacia"
})
public class GetTieneFactura {

    @XmlElement(name = "ID_DCTO")
    protected int iddcto;
    @XmlElement(name = "ID_INSTACIA")
    protected int idinstacia;

    /**
     * Obtiene el valor de la propiedad iddcto.
     * 
     */
    public int getIDDCTO() {
        return iddcto;
    }

    /**
     * Define el valor de la propiedad iddcto.
     * 
     */
    public void setIDDCTO(int value) {
        this.iddcto = value;
    }

    /**
     * Obtiene el valor de la propiedad idinstacia.
     * 
     */
    public int getIDINSTACIA() {
        return idinstacia;
    }

    /**
     * Define el valor de la propiedad idinstacia.
     * 
     */
    public void setIDINSTACIA(int value) {
        this.idinstacia = value;
    }

}
