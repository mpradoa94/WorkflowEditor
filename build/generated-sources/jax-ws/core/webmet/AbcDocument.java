
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_INSTANCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="document" type="{http://Webmet.core/}document"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcDocument", propOrder = {
    "operacion",
    "idinstancia",
    "document"
})
public class AbcDocument {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "ID_INSTANCIA")
    protected int idinstancia;
    @XmlElement(required = true)
    protected Document document;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idinstancia.
     * 
     */
    public int getIDINSTANCIA() {
        return idinstancia;
    }

    /**
     * Define el valor de la propiedad idinstancia.
     * 
     */
    public void setIDINSTANCIA(int value) {
        this.idinstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad document.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Define el valor de la propiedad document.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

}
