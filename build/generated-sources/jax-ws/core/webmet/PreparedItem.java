
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preparedItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preparedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_itm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tm_hldr_fd_itm" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lote_prep" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="peso_lote" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="merma" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preparedItem", propOrder = {
    "idItm",
    "tmHldrFdItm",
    "lotePrep",
    "peso",
    "pesoLote",
    "merma"
})
public class PreparedItem {

    @XmlElement(name = "id_itm")
    protected int idItm;
    @XmlElement(name = "tm_hldr_fd_itm")
    protected double tmHldrFdItm;
    @XmlElement(name = "lote_prep")
    protected double lotePrep;
    protected double peso;
    @XmlElement(name = "peso_lote")
    protected double pesoLote;
    protected double merma;

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
     * Obtiene el valor de la propiedad tmHldrFdItm.
     * 
     */
    public double getTmHldrFdItm() {
        return tmHldrFdItm;
    }

    /**
     * Define el valor de la propiedad tmHldrFdItm.
     * 
     */
    public void setTmHldrFdItm(double value) {
        this.tmHldrFdItm = value;
    }

    /**
     * Obtiene el valor de la propiedad lotePrep.
     * 
     */
    public double getLotePrep() {
        return lotePrep;
    }

    /**
     * Define el valor de la propiedad lotePrep.
     * 
     */
    public void setLotePrep(double value) {
        this.lotePrep = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoLote.
     * 
     */
    public double getPesoLote() {
        return pesoLote;
    }

    /**
     * Define el valor de la propiedad pesoLote.
     * 
     */
    public void setPesoLote(double value) {
        this.pesoLote = value;
    }

    /**
     * Obtiene el valor de la propiedad merma.
     * 
     */
    public double getMerma() {
        return merma;
    }

    /**
     * Define el valor de la propiedad merma.
     * 
     */
    public void setMerma(double value) {
        this.merma = value;
    }

}
