
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para workGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="workGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_GP_WRK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_GP_WRK_PRNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_USERGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registred" type="{http://Webmet.core/}operator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unregistred" type="{http://Webmet.core/}operator" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workGroup", propOrder = {
    "idgpwrk",
    "idgpwrkprnt",
    "deusergroup",
    "registred",
    "unregistred"
})
public class WorkGroup {

    @XmlElement(name = "ID_GP_WRK")
    protected int idgpwrk;
    @XmlElement(name = "ID_GP_WRK_PRNT")
    protected int idgpwrkprnt;
    @XmlElement(name = "DE_USERGROUP")
    protected String deusergroup;
    @XmlElement(nillable = true)
    protected List<Operator> registred;
    @XmlElement(nillable = true)
    protected List<Operator> unregistred;

    /**
     * Obtiene el valor de la propiedad idgpwrk.
     * 
     */
    public int getIDGPWRK() {
        return idgpwrk;
    }

    /**
     * Define el valor de la propiedad idgpwrk.
     * 
     */
    public void setIDGPWRK(int value) {
        this.idgpwrk = value;
    }

    /**
     * Obtiene el valor de la propiedad idgpwrkprnt.
     * 
     */
    public int getIDGPWRKPRNT() {
        return idgpwrkprnt;
    }

    /**
     * Define el valor de la propiedad idgpwrkprnt.
     * 
     */
    public void setIDGPWRKPRNT(int value) {
        this.idgpwrkprnt = value;
    }

    /**
     * Obtiene el valor de la propiedad deusergroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEUSERGROUP() {
        return deusergroup;
    }

    /**
     * Define el valor de la propiedad deusergroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEUSERGROUP(String value) {
        this.deusergroup = value;
    }

    /**
     * Gets the value of the registred property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registred property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistred().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operator }
     * 
     * 
     */
    public List<Operator> getRegistred() {
        if (registred == null) {
            registred = new ArrayList<Operator>();
        }
        return this.registred;
    }

    /**
     * Gets the value of the unregistred property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unregistred property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnregistred().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operator }
     * 
     * 
     */
    public List<Operator> getUnregistred() {
        if (unregistred == null) {
            unregistred = new ArrayList<Operator>();
        }
        return this.unregistred;
    }

}
