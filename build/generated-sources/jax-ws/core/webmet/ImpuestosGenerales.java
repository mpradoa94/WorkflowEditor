
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impuestosGenerales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impuestosGenerales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSis" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idseq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dciniciavig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dcfinvig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salarioMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="isaiMinimo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="certCatastral" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="libGravamen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invGtia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="aviPrevent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="expTestimonios" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="consNoAdeudo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conCredito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sinCredito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxAvaluo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="porcAvaluo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="antilavmesesacumula" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="salariosminventa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="salariosminaporta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestosGenerales", propOrder = {
    "idSis",
    "idseq",
    "dciniciavig",
    "dcfinvig",
    "salarioMin",
    "isaiMinimo",
    "certCatastral",
    "libGravamen",
    "invGtia",
    "aviPrevent",
    "expTestimonios",
    "consNoAdeudo",
    "conCredito",
    "sinCredito",
    "maxAvaluo",
    "porcAvaluo",
    "antilavmesesacumula",
    "salariosminventa",
    "salariosminaporta"
})
public class ImpuestosGenerales {

    protected int idSis;
    protected int idseq;
    protected String dciniciavig;
    protected String dcfinvig;
    protected double salarioMin;
    protected double isaiMinimo;
    protected double certCatastral;
    protected double libGravamen;
    protected double invGtia;
    protected double aviPrevent;
    protected double expTestimonios;
    protected double consNoAdeudo;
    protected double conCredito;
    protected double sinCredito;
    protected double maxAvaluo;
    protected double porcAvaluo;
    protected int antilavmesesacumula;
    protected int salariosminventa;
    protected int salariosminaporta;

    /**
     * Obtiene el valor de la propiedad idSis.
     * 
     */
    public int getIdSis() {
        return idSis;
    }

    /**
     * Define el valor de la propiedad idSis.
     * 
     */
    public void setIdSis(int value) {
        this.idSis = value;
    }

    /**
     * Obtiene el valor de la propiedad idseq.
     * 
     */
    public int getIdseq() {
        return idseq;
    }

    /**
     * Define el valor de la propiedad idseq.
     * 
     */
    public void setIdseq(int value) {
        this.idseq = value;
    }

    /**
     * Obtiene el valor de la propiedad dciniciavig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDciniciavig() {
        return dciniciavig;
    }

    /**
     * Define el valor de la propiedad dciniciavig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDciniciavig(String value) {
        this.dciniciavig = value;
    }

    /**
     * Obtiene el valor de la propiedad dcfinvig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcfinvig() {
        return dcfinvig;
    }

    /**
     * Define el valor de la propiedad dcfinvig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcfinvig(String value) {
        this.dcfinvig = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioMin.
     * 
     */
    public double getSalarioMin() {
        return salarioMin;
    }

    /**
     * Define el valor de la propiedad salarioMin.
     * 
     */
    public void setSalarioMin(double value) {
        this.salarioMin = value;
    }

    /**
     * Obtiene el valor de la propiedad isaiMinimo.
     * 
     */
    public double getIsaiMinimo() {
        return isaiMinimo;
    }

    /**
     * Define el valor de la propiedad isaiMinimo.
     * 
     */
    public void setIsaiMinimo(double value) {
        this.isaiMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad certCatastral.
     * 
     */
    public double getCertCatastral() {
        return certCatastral;
    }

    /**
     * Define el valor de la propiedad certCatastral.
     * 
     */
    public void setCertCatastral(double value) {
        this.certCatastral = value;
    }

    /**
     * Obtiene el valor de la propiedad libGravamen.
     * 
     */
    public double getLibGravamen() {
        return libGravamen;
    }

    /**
     * Define el valor de la propiedad libGravamen.
     * 
     */
    public void setLibGravamen(double value) {
        this.libGravamen = value;
    }

    /**
     * Obtiene el valor de la propiedad invGtia.
     * 
     */
    public double getInvGtia() {
        return invGtia;
    }

    /**
     * Define el valor de la propiedad invGtia.
     * 
     */
    public void setInvGtia(double value) {
        this.invGtia = value;
    }

    /**
     * Obtiene el valor de la propiedad aviPrevent.
     * 
     */
    public double getAviPrevent() {
        return aviPrevent;
    }

    /**
     * Define el valor de la propiedad aviPrevent.
     * 
     */
    public void setAviPrevent(double value) {
        this.aviPrevent = value;
    }

    /**
     * Obtiene el valor de la propiedad expTestimonios.
     * 
     */
    public double getExpTestimonios() {
        return expTestimonios;
    }

    /**
     * Define el valor de la propiedad expTestimonios.
     * 
     */
    public void setExpTestimonios(double value) {
        this.expTestimonios = value;
    }

    /**
     * Obtiene el valor de la propiedad consNoAdeudo.
     * 
     */
    public double getConsNoAdeudo() {
        return consNoAdeudo;
    }

    /**
     * Define el valor de la propiedad consNoAdeudo.
     * 
     */
    public void setConsNoAdeudo(double value) {
        this.consNoAdeudo = value;
    }

    /**
     * Obtiene el valor de la propiedad conCredito.
     * 
     */
    public double getConCredito() {
        return conCredito;
    }

    /**
     * Define el valor de la propiedad conCredito.
     * 
     */
    public void setConCredito(double value) {
        this.conCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad sinCredito.
     * 
     */
    public double getSinCredito() {
        return sinCredito;
    }

    /**
     * Define el valor de la propiedad sinCredito.
     * 
     */
    public void setSinCredito(double value) {
        this.sinCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad maxAvaluo.
     * 
     */
    public double getMaxAvaluo() {
        return maxAvaluo;
    }

    /**
     * Define el valor de la propiedad maxAvaluo.
     * 
     */
    public void setMaxAvaluo(double value) {
        this.maxAvaluo = value;
    }

    /**
     * Obtiene el valor de la propiedad porcAvaluo.
     * 
     */
    public double getPorcAvaluo() {
        return porcAvaluo;
    }

    /**
     * Define el valor de la propiedad porcAvaluo.
     * 
     */
    public void setPorcAvaluo(double value) {
        this.porcAvaluo = value;
    }

    /**
     * Obtiene el valor de la propiedad antilavmesesacumula.
     * 
     */
    public int getAntilavmesesacumula() {
        return antilavmesesacumula;
    }

    /**
     * Define el valor de la propiedad antilavmesesacumula.
     * 
     */
    public void setAntilavmesesacumula(int value) {
        this.antilavmesesacumula = value;
    }

    /**
     * Obtiene el valor de la propiedad salariosminventa.
     * 
     */
    public int getSalariosminventa() {
        return salariosminventa;
    }

    /**
     * Define el valor de la propiedad salariosminventa.
     * 
     */
    public void setSalariosminventa(int value) {
        this.salariosminventa = value;
    }

    /**
     * Obtiene el valor de la propiedad salariosminaporta.
     * 
     */
    public int getSalariosminaporta() {
        return salariosminaporta;
    }

    /**
     * Define el valor de la propiedad salariosminaporta.
     * 
     */
    public void setSalariosminaporta(int value) {
        this.salariosminaporta = value;
    }

}
