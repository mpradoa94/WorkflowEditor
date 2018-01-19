
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para recipeLineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="recipeLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RCPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AI_LN_RCP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_LN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QU_CNT_SRV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FL_IDGT_KY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_RCPEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recipeLineItem", propOrder = {
    "idrcpe",
    "ailnrcp",
    "tyln",
    "iditm",
    "qucntsrv",
    "flidgtky",
    "idrcpem"
})
public class RecipeLineItem {

    @XmlElement(name = "ID_RCPE")
    protected int idrcpe;
    @XmlElement(name = "AI_LN_RCP")
    protected int ailnrcp;
    @XmlElement(name = "TY_LN")
    protected String tyln;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "QU_CNT_SRV")
    protected double qucntsrv;
    @XmlElement(name = "FL_IDGT_KY")
    protected String flidgtky;
    @XmlElement(name = "ID_RCPEM")
    protected int idrcpem;

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
     * Obtiene el valor de la propiedad ailnrcp.
     * 
     */
    public int getAILNRCP() {
        return ailnrcp;
    }

    /**
     * Define el valor de la propiedad ailnrcp.
     * 
     */
    public void setAILNRCP(int value) {
        this.ailnrcp = value;
    }

    /**
     * Obtiene el valor de la propiedad tyln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYLN() {
        return tyln;
    }

    /**
     * Define el valor de la propiedad tyln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYLN(String value) {
        this.tyln = value;
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
     * Obtiene el valor de la propiedad qucntsrv.
     * 
     */
    public double getQUCNTSRV() {
        return qucntsrv;
    }

    /**
     * Define el valor de la propiedad qucntsrv.
     * 
     */
    public void setQUCNTSRV(double value) {
        this.qucntsrv = value;
    }

    /**
     * Obtiene el valor de la propiedad flidgtky.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIDGTKY() {
        return flidgtky;
    }

    /**
     * Define el valor de la propiedad flidgtky.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIDGTKY(String value) {
        this.flidgtky = value;
    }

    /**
     * Obtiene el valor de la propiedad idrcpem.
     * 
     */
    public int getIDRCPEM() {
        return idrcpem;
    }

    /**
     * Define el valor de la propiedad idrcpem.
     * 
     */
    public void setIDRCPEM(int value) {
        this.idrcpem = value;
    }

}
