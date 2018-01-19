
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getDocReceivableResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getDocReceivableResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="referencias" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="documentRec" type="{http://Webmet.core/}documentReceivable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocReceivableResponse", propOrder = {
    "resultado",
    "referencias",
    "documentRec"
})
public class GetDocReceivableResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<String> referencias;
    protected DocumentReceivable documentRec;

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
     * Gets the value of the referencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferencias() {
        if (referencias == null) {
            referencias = new ArrayList<String>();
        }
        return this.referencias;
    }

    /**
     * Obtiene el valor de la propiedad documentRec.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReceivable }
     *     
     */
    public DocumentReceivable getDocumentRec() {
        return documentRec;
    }

    /**
     * Define el valor de la propiedad documentRec.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReceivable }
     *     
     */
    public void setDocumentRec(DocumentReceivable value) {
        this.documentRec = value;
    }

}
