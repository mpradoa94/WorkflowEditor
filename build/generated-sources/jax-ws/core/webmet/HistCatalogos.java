
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para histCatalogos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="histCatalogos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DC_DY_BSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AI_LN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_STR_RT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CAT_ACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DT_ACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AI_LN_MAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_LN_MAX_HIST" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "histCatalogos", propOrder = {
    "dcdybsn",
    "ailn",
    "idopr",
    "idstrrt",
    "catact",
    "dtact",
    "oper",
    "xml",
    "ailnmax",
    "ailnmaxhist"
})
public class HistCatalogos {

    @XmlElement(name = "DC_DY_BSN")
    protected String dcdybsn;
    @XmlElement(name = "AI_LN")
    protected int ailn;
    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(name = "ID_STR_RT")
    protected int idstrrt;
    @XmlElement(name = "CAT_ACT")
    protected String catact;
    @XmlElement(name = "DT_ACT")
    protected String dtact;
    @XmlElement(name = "OPER")
    protected String oper;
    @XmlElement(name = "XML")
    protected String xml;
    @XmlElement(name = "AI_LN_MAX")
    protected int ailnmax;
    @XmlElement(name = "AI_LN_MAX_HIST")
    protected int ailnmaxhist;

    /**
     * Obtiene el valor de la propiedad dcdybsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCDYBSN() {
        return dcdybsn;
    }

    /**
     * Define el valor de la propiedad dcdybsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCDYBSN(String value) {
        this.dcdybsn = value;
    }

    /**
     * Obtiene el valor de la propiedad ailn.
     * 
     */
    public int getAILN() {
        return ailn;
    }

    /**
     * Define el valor de la propiedad ailn.
     * 
     */
    public void setAILN(int value) {
        this.ailn = value;
    }

    /**
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

    /**
     * Obtiene el valor de la propiedad idstrrt.
     * 
     */
    public int getIDSTRRT() {
        return idstrrt;
    }

    /**
     * Define el valor de la propiedad idstrrt.
     * 
     */
    public void setIDSTRRT(int value) {
        this.idstrrt = value;
    }

    /**
     * Obtiene el valor de la propiedad catact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATACT() {
        return catact;
    }

    /**
     * Define el valor de la propiedad catact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATACT(String value) {
        this.catact = value;
    }

    /**
     * Obtiene el valor de la propiedad dtact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTACT() {
        return dtact;
    }

    /**
     * Define el valor de la propiedad dtact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTACT(String value) {
        this.dtact = value;
    }

    /**
     * Obtiene el valor de la propiedad oper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPER() {
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
    public void setOPER(String value) {
        this.oper = value;
    }

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXML() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXML(String value) {
        this.xml = value;
    }

    /**
     * Obtiene el valor de la propiedad ailnmax.
     * 
     */
    public int getAILNMAX() {
        return ailnmax;
    }

    /**
     * Define el valor de la propiedad ailnmax.
     * 
     */
    public void setAILNMAX(int value) {
        this.ailnmax = value;
    }

    /**
     * Obtiene el valor de la propiedad ailnmaxhist.
     * 
     */
    public int getAILNMAXHIST() {
        return ailnmaxhist;
    }

    /**
     * Define el valor de la propiedad ailnmaxhist.
     * 
     */
    public void setAILNMAXHIST(int value) {
        this.ailnmaxhist = value;
    }

}
