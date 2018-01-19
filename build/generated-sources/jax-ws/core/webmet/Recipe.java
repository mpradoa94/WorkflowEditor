
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para recipe complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="recipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RCPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CD_VRT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DE_RCPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SC_RCPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepareditem" type="{http://Webmet.core/}preparedItem" minOccurs="0"/>
 *         &lt;element name="line" type="{http://Webmet.core/}recipeLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="grouprecipe" type="{http://Webmet.core/}retailStoreGroupRecipe" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recipe", propOrder = {
    "idrcpe",
    "cdvrt",
    "iditm",
    "dercpe",
    "scrcpe",
    "prepareditem",
    "line",
    "grouprecipe"
})
public class Recipe {

    @XmlElement(name = "ID_RCPE")
    protected int idrcpe;
    @XmlElement(name = "CD_VRT")
    protected int cdvrt;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "DE_RCPE")
    protected String dercpe;
    @XmlElement(name = "SC_RCPE")
    protected String scrcpe;
    protected PreparedItem prepareditem;
    @XmlElement(nillable = true)
    protected List<RecipeLineItem> line;
    @XmlElement(nillable = true)
    protected List<RetailStoreGroupRecipe> grouprecipe;

    /**
     * Obtiene el valor de la propiedad idrcpe.
     * 
     */
    public int getIDRCPE() {
        return idrcpe;
    }

    /**
     * Define el valor de la propiedad idrcpe.
     * 
     */
    public void setIDRCPE(int value) {
        this.idrcpe = value;
    }

    /**
     * Obtiene el valor de la propiedad cdvrt.
     * 
     */
    public int getCDVRT() {
        return cdvrt;
    }

    /**
     * Define el valor de la propiedad cdvrt.
     * 
     */
    public void setCDVRT(int value) {
        this.cdvrt = value;
    }

    /**
     * Obtiene el valor de la propiedad iditm.
     * 
     */
    public int getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     */
    public void setIDITM(int value) {
        this.iditm = value;
    }

    /**
     * Obtiene el valor de la propiedad dercpe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDERCPE() {
        return dercpe;
    }

    /**
     * Define el valor de la propiedad dercpe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDERCPE(String value) {
        this.dercpe = value;
    }

    /**
     * Obtiene el valor de la propiedad scrcpe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCRCPE() {
        return scrcpe;
    }

    /**
     * Define el valor de la propiedad scrcpe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCRCPE(String value) {
        this.scrcpe = value;
    }

    /**
     * Obtiene el valor de la propiedad prepareditem.
     * 
     * @return
     *     possible object is
     *     {@link PreparedItem }
     *     
     */
    public PreparedItem getPrepareditem() {
        return prepareditem;
    }

    /**
     * Define el valor de la propiedad prepareditem.
     * 
     * @param value
     *     allowed object is
     *     {@link PreparedItem }
     *     
     */
    public void setPrepareditem(PreparedItem value) {
        this.prepareditem = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeLineItem }
     * 
     * 
     */
    public List<RecipeLineItem> getLine() {
        if (line == null) {
            line = new ArrayList<RecipeLineItem>();
        }
        return this.line;
    }

    /**
     * Gets the value of the grouprecipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grouprecipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrouprecipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailStoreGroupRecipe }
     * 
     * 
     */
    public List<RetailStoreGroupRecipe> getGrouprecipe() {
        if (grouprecipe == null) {
            grouprecipe = new ArrayList<RetailStoreGroupRecipe>();
        }
        return this.grouprecipe;
    }

}
