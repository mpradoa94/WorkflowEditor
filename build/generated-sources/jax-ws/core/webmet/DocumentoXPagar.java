
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentoXPagar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentoXPagar">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Webmet.core/}document">
 *       &lt;sequence>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="abono" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cantAplica" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tipoDocumento" type="{http://Webmet.core/}tipoDocumentoDatos" minOccurs="0"/>
 *         &lt;element name="selec" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dcDctoForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dcVencForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoXPagar", propOrder = {
    "cargo",
    "abono",
    "cantAplica",
    "tipoDocumento",
    "selec",
    "dcDctoForm",
    "dcVencForm"
})
public class DocumentoXPagar
    extends Document
{

    protected double cargo;
    protected double abono;
    protected double cantAplica;
    protected TipoDocumentoDatos tipoDocumento;
    protected boolean selec;
    protected String dcDctoForm;
    protected String dcVencForm;

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     */
    public double getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     */
    public void setCargo(double value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad abono.
     * 
     */
    public double getAbono() {
        return abono;
    }

    /**
     * Define el valor de la propiedad abono.
     * 
     */
    public void setAbono(double value) {
        this.abono = value;
    }

    /**
     * Obtiene el valor de la propiedad cantAplica.
     * 
     */
    public double getCantAplica() {
        return cantAplica;
    }

    /**
     * Define el valor de la propiedad cantAplica.
     * 
     */
    public void setCantAplica(double value) {
        this.cantAplica = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoDatos }
     *     
     */
    public TipoDocumentoDatos getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoDatos }
     *     
     */
    public void setTipoDocumento(TipoDocumentoDatos value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad selec.
     * 
     */
    public boolean isSelec() {
        return selec;
    }

    /**
     * Define el valor de la propiedad selec.
     * 
     */
    public void setSelec(boolean value) {
        this.selec = value;
    }

    /**
     * Obtiene el valor de la propiedad dcDctoForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcDctoForm() {
        return dcDctoForm;
    }

    /**
     * Define el valor de la propiedad dcDctoForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcDctoForm(String value) {
        this.dcDctoForm = value;
    }

    /**
     * Obtiene el valor de la propiedad dcVencForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcVencForm() {
        return dcVencForm;
    }

    /**
     * Define el valor de la propiedad dcVencForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcVencForm(String value) {
        this.dcVencForm = value;
    }

}
