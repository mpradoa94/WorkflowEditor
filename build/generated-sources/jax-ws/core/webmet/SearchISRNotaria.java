
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchISRNotaria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchISRNotaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iniciaV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchISRNotaria", propOrder = {
    "idInstancia",
    "iniciaV",
    "finV"
})
public class SearchISRNotaria {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected String iniciaV;
    @XmlElement(required = true)
    protected String finV;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad iniciaV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniciaV() {
        return iniciaV;
    }

    /**
     * Define el valor de la propiedad iniciaV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniciaV(String value) {
        this.iniciaV = value;
    }

    /**
     * Obtiene el valor de la propiedad finV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinV() {
        return finV;
    }

    /**
     * Define el valor de la propiedad finV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinV(String value) {
        this.finV = value;
    }

}
