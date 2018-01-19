
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iditmps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmitm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idmrhrcgp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idbrn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itmsellprice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idgptx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="foto1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="foto2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="foto3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaItem", propOrder = {
    "iditmps",
    "nmitm",
    "idmrhrcgp",
    "idbrn",
    "itmsellprice",
    "idgptx",
    "foto1",
    "foto2",
    "foto3"
})
public class ValidaItem {

    protected String iditmps;
    protected String nmitm;
    protected int idmrhrcgp;
    protected int idbrn;
    protected double itmsellprice;
    protected int idgptx;
    protected byte[] foto1;
    protected byte[] foto2;
    protected byte[] foto3;

    /**
     * Obtiene el valor de la propiedad iditmps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIditmps() {
        return iditmps;
    }

    /**
     * Define el valor de la propiedad iditmps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIditmps(String value) {
        this.iditmps = value;
    }

    /**
     * Obtiene el valor de la propiedad nmitm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmitm() {
        return nmitm;
    }

    /**
     * Define el valor de la propiedad nmitm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmitm(String value) {
        this.nmitm = value;
    }

    /**
     * Obtiene el valor de la propiedad idmrhrcgp.
     * 
     */
    public int getIdmrhrcgp() {
        return idmrhrcgp;
    }

    /**
     * Define el valor de la propiedad idmrhrcgp.
     * 
     */
    public void setIdmrhrcgp(int value) {
        this.idmrhrcgp = value;
    }

    /**
     * Obtiene el valor de la propiedad idbrn.
     * 
     */
    public int getIdbrn() {
        return idbrn;
    }

    /**
     * Define el valor de la propiedad idbrn.
     * 
     */
    public void setIdbrn(int value) {
        this.idbrn = value;
    }

    /**
     * Obtiene el valor de la propiedad itmsellprice.
     * 
     */
    public double getItmsellprice() {
        return itmsellprice;
    }

    /**
     * Define el valor de la propiedad itmsellprice.
     * 
     */
    public void setItmsellprice(double value) {
        this.itmsellprice = value;
    }

    /**
     * Obtiene el valor de la propiedad idgptx.
     * 
     */
    public int getIdgptx() {
        return idgptx;
    }

    /**
     * Define el valor de la propiedad idgptx.
     * 
     */
    public void setIdgptx(int value) {
        this.idgptx = value;
    }

    /**
     * Obtiene el valor de la propiedad foto1.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFoto1() {
        return foto1;
    }

    /**
     * Define el valor de la propiedad foto1.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFoto1(byte[] value) {
        this.foto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad foto2.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFoto2() {
        return foto2;
    }

    /**
     * Define el valor de la propiedad foto2.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFoto2(byte[] value) {
        this.foto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad foto3.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFoto3() {
        return foto3;
    }

    /**
     * Define el valor de la propiedad foto3.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFoto3(byte[] value) {
        this.foto3 = value;
    }

}
