
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para repExplosionMaterialesDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="repExplosionMaterialesDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_rcpe" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_itm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="qu_cnt_srv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="id_rcpem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cd_vrt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="de_itm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procesado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repExplosionMaterialesDTO", propOrder = {
    "idRcpe",
    "idItm",
    "quCntSrv",
    "idRcpem",
    "cdVrt",
    "deItm",
    "cantidad",
    "unidad",
    "procesado"
})
public class RepExplosionMaterialesDTO {

    @XmlElement(name = "id_rcpe")
    protected int idRcpe;
    @XmlElement(name = "id_itm")
    protected int idItm;
    @XmlElement(name = "qu_cnt_srv")
    protected double quCntSrv;
    @XmlElement(name = "id_rcpem")
    protected int idRcpem;
    @XmlElement(name = "cd_vrt")
    protected int cdVrt;
    @XmlElement(name = "de_itm")
    protected String deItm;
    protected double cantidad;
    protected String unidad;
    protected boolean procesado;

    /**
     * Obtiene el valor de la propiedad idRcpe.
     * 
     */
    public int getIdRcpe() {
        return idRcpe;
    }

    /**
     * Define el valor de la propiedad idRcpe.
     * 
     */
    public void setIdRcpe(int value) {
        this.idRcpe = value;
    }

    /**
     * Obtiene el valor de la propiedad idItm.
     * 
     */
    public int getIdItm() {
        return idItm;
    }

    /**
     * Define el valor de la propiedad idItm.
     * 
     */
    public void setIdItm(int value) {
        this.idItm = value;
    }

    /**
     * Obtiene el valor de la propiedad quCntSrv.
     * 
     */
    public double getQuCntSrv() {
        return quCntSrv;
    }

    /**
     * Define el valor de la propiedad quCntSrv.
     * 
     */
    public void setQuCntSrv(double value) {
        this.quCntSrv = value;
    }

    /**
     * Obtiene el valor de la propiedad idRcpem.
     * 
     */
    public int getIdRcpem() {
        return idRcpem;
    }

    /**
     * Define el valor de la propiedad idRcpem.
     * 
     */
    public void setIdRcpem(int value) {
        this.idRcpem = value;
    }

    /**
     * Obtiene el valor de la propiedad cdVrt.
     * 
     */
    public int getCdVrt() {
        return cdVrt;
    }

    /**
     * Define el valor de la propiedad cdVrt.
     * 
     */
    public void setCdVrt(int value) {
        this.cdVrt = value;
    }

    /**
     * Obtiene el valor de la propiedad deItm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeItm() {
        return deItm;
    }

    /**
     * Define el valor de la propiedad deItm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeItm(String value) {
        this.deItm = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad procesado.
     * 
     */
    public boolean isProcesado() {
        return procesado;
    }

    /**
     * Define el valor de la propiedad procesado.
     * 
     */
    public void setProcesado(boolean value) {
        this.procesado = value;
    }

}
