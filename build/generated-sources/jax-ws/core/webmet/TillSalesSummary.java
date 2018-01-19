
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tillSalesSummary complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tillSalesSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MO_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_SLS_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_SLS_TRN" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="MO_RTN_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_RTN_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_RTN_TRN" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="MO_XDEP_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_XDEP_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_XDEP_TRN" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="MO_PAG_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_PAG_ITM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="QU_PAG_TRN" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tillSalesSummary", propOrder = {
    "iditm",
    "moslsitm",
    "quslsitm",
    "quslstrn",
    "mortnitm",
    "qurtnitm",
    "qurtntrn",
    "moxdepitm",
    "quxdepitm",
    "quxdeptrn",
    "mopagitm",
    "qupagitm",
    "qupagtrn"
})
public class TillSalesSummary {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "MO_SLS_ITM")
    protected float moslsitm;
    @XmlElement(name = "QU_SLS_ITM")
    protected float quslsitm;
    @XmlElement(name = "QU_SLS_TRN")
    protected float quslstrn;
    @XmlElement(name = "MO_RTN_ITM")
    protected float mortnitm;
    @XmlElement(name = "QU_RTN_ITM")
    protected float qurtnitm;
    @XmlElement(name = "QU_RTN_TRN")
    protected float qurtntrn;
    @XmlElement(name = "MO_XDEP_ITM")
    protected float moxdepitm;
    @XmlElement(name = "QU_XDEP_ITM")
    protected float quxdepitm;
    @XmlElement(name = "QU_XDEP_TRN")
    protected float quxdeptrn;
    @XmlElement(name = "MO_PAG_ITM")
    protected float mopagitm;
    @XmlElement(name = "QU_PAG_ITM")
    protected float qupagitm;
    @XmlElement(name = "QU_PAG_TRN")
    protected float qupagtrn;

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
     * Obtiene el valor de la propiedad moslsitm.
     * 
     */
    public float getMOSLSITM() {
        return moslsitm;
    }

    /**
     * Define el valor de la propiedad moslsitm.
     * 
     */
    public void setMOSLSITM(float value) {
        this.moslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quslsitm.
     * 
     */
    public float getQUSLSITM() {
        return quslsitm;
    }

    /**
     * Define el valor de la propiedad quslsitm.
     * 
     */
    public void setQUSLSITM(float value) {
        this.quslsitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quslstrn.
     * 
     */
    public float getQUSLSTRN() {
        return quslstrn;
    }

    /**
     * Define el valor de la propiedad quslstrn.
     * 
     */
    public void setQUSLSTRN(float value) {
        this.quslstrn = value;
    }

    /**
     * Obtiene el valor de la propiedad mortnitm.
     * 
     */
    public float getMORTNITM() {
        return mortnitm;
    }

    /**
     * Define el valor de la propiedad mortnitm.
     * 
     */
    public void setMORTNITM(float value) {
        this.mortnitm = value;
    }

    /**
     * Obtiene el valor de la propiedad qurtnitm.
     * 
     */
    public float getQURTNITM() {
        return qurtnitm;
    }

    /**
     * Define el valor de la propiedad qurtnitm.
     * 
     */
    public void setQURTNITM(float value) {
        this.qurtnitm = value;
    }

    /**
     * Obtiene el valor de la propiedad qurtntrn.
     * 
     */
    public float getQURTNTRN() {
        return qurtntrn;
    }

    /**
     * Define el valor de la propiedad qurtntrn.
     * 
     */
    public void setQURTNTRN(float value) {
        this.qurtntrn = value;
    }

    /**
     * Obtiene el valor de la propiedad moxdepitm.
     * 
     */
    public float getMOXDEPITM() {
        return moxdepitm;
    }

    /**
     * Define el valor de la propiedad moxdepitm.
     * 
     */
    public void setMOXDEPITM(float value) {
        this.moxdepitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quxdepitm.
     * 
     */
    public float getQUXDEPITM() {
        return quxdepitm;
    }

    /**
     * Define el valor de la propiedad quxdepitm.
     * 
     */
    public void setQUXDEPITM(float value) {
        this.quxdepitm = value;
    }

    /**
     * Obtiene el valor de la propiedad quxdeptrn.
     * 
     */
    public float getQUXDEPTRN() {
        return quxdeptrn;
    }

    /**
     * Define el valor de la propiedad quxdeptrn.
     * 
     */
    public void setQUXDEPTRN(float value) {
        this.quxdeptrn = value;
    }

    /**
     * Obtiene el valor de la propiedad mopagitm.
     * 
     */
    public float getMOPAGITM() {
        return mopagitm;
    }

    /**
     * Define el valor de la propiedad mopagitm.
     * 
     */
    public void setMOPAGITM(float value) {
        this.mopagitm = value;
    }

    /**
     * Obtiene el valor de la propiedad qupagitm.
     * 
     */
    public float getQUPAGITM() {
        return qupagitm;
    }

    /**
     * Define el valor de la propiedad qupagitm.
     * 
     */
    public void setQUPAGITM(float value) {
        this.qupagitm = value;
    }

    /**
     * Obtiene el valor de la propiedad qupagtrn.
     * 
     */
    public float getQUPAGTRN() {
        return qupagtrn;
    }

    /**
     * Define el valor de la propiedad qupagtrn.
     * 
     */
    public void setQUPAGTRN(float value) {
        this.qupagtrn = value;
    }

}
