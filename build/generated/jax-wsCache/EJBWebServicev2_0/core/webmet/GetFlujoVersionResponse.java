
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFlujoVersionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFlujoVersionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="flujoV" type="{http://Webmet.core/}flujoVersion" minOccurs="0"/>
 *         &lt;element name="listFV" type="{http://Webmet.core/}flujoVersion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlujoVersionResponse", propOrder = {
    "resultado",
    "flujoV",
    "listFV"
})
public class GetFlujoVersionResponse {

    protected Resultado resultado;
    protected FlujoVersion flujoV;
    @XmlElement(nillable = true)
    protected List<FlujoVersion> listFV;

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
     * Obtiene el valor de la propiedad flujoV.
     * 
     * @return
     *     possible object is
     *     {@link FlujoVersion }
     *     
     */
    public FlujoVersion getFlujoV() {
        return flujoV;
    }

    /**
     * Define el valor de la propiedad flujoV.
     * 
     * @param value
     *     allowed object is
     *     {@link FlujoVersion }
     *     
     */
    public void setFlujoV(FlujoVersion value) {
        this.flujoV = value;
    }

    /**
     * Gets the value of the listFV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listFV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListFV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlujoVersion }
     * 
     * 
     */
    public List<FlujoVersion> getListFV() {
        if (listFV == null) {
            listFV = new ArrayList<FlujoVersion>();
        }
        return this.listFV;
    }

}
