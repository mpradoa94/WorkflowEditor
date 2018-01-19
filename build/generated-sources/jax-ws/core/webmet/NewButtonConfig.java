
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para newButtonConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="newButtonConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Oper" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buttonconfig" type="{http://Webmet.core/}buttonConfig"/>
 *         &lt;element name="listaBotones" type="{http://Webmet.core/}buttonConfig" maxOccurs="unbounded"/>
 *         &lt;element name="loghead" type="{http://Webmet.core/}logHead"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newButtonConfig", propOrder = {
    "oper",
    "idInstancia",
    "buttonconfig",
    "listaBotones",
    "loghead"
})
public class NewButtonConfig {

    @XmlElement(name = "Oper", required = true)
    protected String oper;
    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected ButtonConfig buttonconfig;
    @XmlElement(required = true)
    protected List<ButtonConfig> listaBotones;
    @XmlElement(required = true)
    protected LogHead loghead;

    /**
     * Obtiene el valor de la propiedad oper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOper() {
        return oper;
    }

    /**
     * Define el valor de la propiedad oper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOper(String value) {
        this.oper = value;
    }

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
     * Obtiene el valor de la propiedad buttonconfig.
     * 
     * @return
     *     possible object is
     *     {@link ButtonConfig }
     *     
     */
    public ButtonConfig getButtonconfig() {
        return buttonconfig;
    }

    /**
     * Define el valor de la propiedad buttonconfig.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonConfig }
     *     
     */
    public void setButtonconfig(ButtonConfig value) {
        this.buttonconfig = value;
    }

    /**
     * Gets the value of the listaBotones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaBotones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaBotones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ButtonConfig }
     * 
     * 
     */
    public List<ButtonConfig> getListaBotones() {
        if (listaBotones == null) {
            listaBotones = new ArrayList<ButtonConfig>();
        }
        return this.listaBotones;
    }

    /**
     * Obtiene el valor de la propiedad loghead.
     * 
     * @return
     *     possible object is
     *     {@link LogHead }
     *     
     */
    public LogHead getLoghead() {
        return loghead;
    }

    /**
     * Define el valor de la propiedad loghead.
     * 
     * @param value
     *     allowed object is
     *     {@link LogHead }
     *     
     */
    public void setLoghead(LogHead value) {
        this.loghead = value;
    }

}
