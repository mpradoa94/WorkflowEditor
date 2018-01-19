
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchTenderResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchTenderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="btnAsg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tender" type="{http://Webmet.core/}tender" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchTenderResponse", propOrder = {
    "resultado",
    "btnAsg",
    "tender"
})
public class SearchTenderResponse {

    protected Resultado resultado;
    @XmlElement(nillable = true)
    protected List<String> btnAsg;
    @XmlElement(nillable = true)
    protected List<Tender> tender;

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
     * Gets the value of the btnAsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the btnAsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtnAsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBtnAsg() {
        if (btnAsg == null) {
            btnAsg = new ArrayList<String>();
        }
        return this.btnAsg;
    }

    /**
     * Gets the value of the tender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tender }
     * 
     * 
     */
    public List<Tender> getTender() {
        if (tender == null) {
            tender = new ArrayList<Tender>();
        }
        return this.tender;
    }

}
