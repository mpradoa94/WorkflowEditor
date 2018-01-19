
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para phisicalCountLineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="phisicalCountLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_LCN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LC_LCN_PID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TEORICO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CONTEO1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CONTEO2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CONTEO3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TEORICOAJ" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SELL_PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itm" type="{http://Webmet.core/}item" minOccurs="0"/>
 *         &lt;element name="movAlm" type="{http://Webmet.core/}listaMovAlmacen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phisicalCountLineItem", propOrder = {
    "idlcn",
    "idpid",
    "lclcnpid",
    "iditm",
    "teorico",
    "conteo1",
    "conteo2",
    "conteo3",
    "teoricoaj",
    "sellprice",
    "itm",
    "movAlm"
})
public class PhisicalCountLineItem {

    @XmlElement(name = "ID_LCN")
    protected int idlcn;
    @XmlElement(name = "ID_PID")
    protected int idpid;
    @XmlElement(name = "LC_LCN_PID")
    protected int lclcnpid;
    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "TEORICO")
    protected double teorico;
    @XmlElement(name = "CONTEO1")
    protected double conteo1;
    @XmlElement(name = "CONTEO2")
    protected double conteo2;
    @XmlElement(name = "CONTEO3")
    protected double conteo3;
    @XmlElement(name = "TEORICOAJ")
    protected double teoricoaj;
    @XmlElement(name = "SELL_PRICE")
    protected double sellprice;
    protected Item itm;
    protected ListaMovAlmacen movAlm;

    /**
     * Obtiene el valor de la propiedad idlcn.
     * 
     */
    public int getIDLCN() {
        return idlcn;
    }

    /**
     * Define el valor de la propiedad idlcn.
     * 
     */
    public void setIDLCN(int value) {
        this.idlcn = value;
    }

    /**
     * Obtiene el valor de la propiedad idpid.
     * 
     */
    public int getIDPID() {
        return idpid;
    }

    /**
     * Define el valor de la propiedad idpid.
     * 
     */
    public void setIDPID(int value) {
        this.idpid = value;
    }

    /**
     * Obtiene el valor de la propiedad lclcnpid.
     * 
     */
    public int getLCLCNPID() {
        return lclcnpid;
    }

    /**
     * Define el valor de la propiedad lclcnpid.
     * 
     */
    public void setLCLCNPID(int value) {
        this.lclcnpid = value;
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
     * Obtiene el valor de la propiedad teorico.
     * 
     */
    public double getTEORICO() {
        return teorico;
    }

    /**
     * Define el valor de la propiedad teorico.
     * 
     */
    public void setTEORICO(double value) {
        this.teorico = value;
    }

    /**
     * Obtiene el valor de la propiedad conteo1.
     * 
     */
    public double getCONTEO1() {
        return conteo1;
    }

    /**
     * Define el valor de la propiedad conteo1.
     * 
     */
    public void setCONTEO1(double value) {
        this.conteo1 = value;
    }

    /**
     * Obtiene el valor de la propiedad conteo2.
     * 
     */
    public double getCONTEO2() {
        return conteo2;
    }

    /**
     * Define el valor de la propiedad conteo2.
     * 
     */
    public void setCONTEO2(double value) {
        this.conteo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad conteo3.
     * 
     */
    public double getCONTEO3() {
        return conteo3;
    }

    /**
     * Define el valor de la propiedad conteo3.
     * 
     */
    public void setCONTEO3(double value) {
        this.conteo3 = value;
    }

    /**
     * Obtiene el valor de la propiedad teoricoaj.
     * 
     */
    public double getTEORICOAJ() {
        return teoricoaj;
    }

    /**
     * Define el valor de la propiedad teoricoaj.
     * 
     */
    public void setTEORICOAJ(double value) {
        this.teoricoaj = value;
    }

    /**
     * Obtiene el valor de la propiedad sellprice.
     * 
     */
    public double getSELLPRICE() {
        return sellprice;
    }

    /**
     * Define el valor de la propiedad sellprice.
     * 
     */
    public void setSELLPRICE(double value) {
        this.sellprice = value;
    }

    /**
     * Obtiene el valor de la propiedad itm.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItm() {
        return itm;
    }

    /**
     * Define el valor de la propiedad itm.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItm(Item value) {
        this.itm = value;
    }

    /**
     * Obtiene el valor de la propiedad movAlm.
     * 
     * @return
     *     possible object is
     *     {@link ListaMovAlmacen }
     *     
     */
    public ListaMovAlmacen getMovAlm() {
        return movAlm;
    }

    /**
     * Define el valor de la propiedad movAlm.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMovAlmacen }
     *     
     */
    public void setMovAlm(ListaMovAlmacen value) {
        this.movAlm = value;
    }

}
