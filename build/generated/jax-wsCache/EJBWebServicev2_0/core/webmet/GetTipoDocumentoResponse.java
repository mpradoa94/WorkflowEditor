
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTipoDocumentoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTipoDocumentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="tyDoc" type="{http://Webmet.core/}tipoDocumentoDatos" minOccurs="0"/>
 *         &lt;element name="documentos" type="{http://Webmet.core/}tipoDocumentoDatos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTipoDocumentoResponse", propOrder = {
    "resultado",
    "tyDoc",
    "documentos"
})
public class GetTipoDocumentoResponse {

    protected Resultado resultado;
    protected TipoDocumentoDatos tyDoc;
    @XmlElement(nillable = true)
    protected List<TipoDocumentoDatos> documentos;

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
     * Obtiene el valor de la propiedad tyDoc.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoDatos }
     *     
     */
    public TipoDocumentoDatos getTyDoc() {
        return tyDoc;
    }

    /**
     * Define el valor de la propiedad tyDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoDatos }
     *     
     */
    public void setTyDoc(TipoDocumentoDatos value) {
        this.tyDoc = value;
    }

    /**
     * Gets the value of the documentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDocumentoDatos }
     * 
     * 
     */
    public List<TipoDocumentoDatos> getDocumentos() {
        if (documentos == null) {
            documentos = new ArrayList<TipoDocumentoDatos>();
        }
        return this.documentos;
    }

}
