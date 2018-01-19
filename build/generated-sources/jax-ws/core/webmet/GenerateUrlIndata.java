
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generateUrlIndata complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generateUrlIndata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nm_archivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nm_contenedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateUrlIndata", propOrder = {
    "nmArchivo",
    "nmContenedor"
})
public class GenerateUrlIndata {

    @XmlElement(name = "nm_archivo", required = true)
    protected String nmArchivo;
    @XmlElement(name = "nm_contenedor", required = true)
    protected String nmContenedor;

    /**
     * Obtiene el valor de la propiedad nmArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmArchivo() {
        return nmArchivo;
    }

    /**
     * Define el valor de la propiedad nmArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmArchivo(String value) {
        this.nmArchivo = value;
    }

    /**
     * Obtiene el valor de la propiedad nmContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmContenedor() {
        return nmContenedor;
    }

    /**
     * Define el valor de la propiedad nmContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmContenedor(String value) {
        this.nmContenedor = value;
    }

}
