
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anexosCuestionario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="anexosCuestionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_formato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_anexo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descr_anexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anexo_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_proceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anexosCuestionario", propOrder = {
    "idFormato",
    "idAnexo",
    "descrAnexo",
    "anexoUrl",
    "estatus",
    "proceso",
    "idProceso",
    "prefijo"
})
public class AnexosCuestionario {

    @XmlElement(name = "id_formato")
    protected int idFormato;
    @XmlElement(name = "id_anexo")
    protected int idAnexo;
    @XmlElement(name = "descr_anexo")
    protected String descrAnexo;
    @XmlElement(name = "anexo_url")
    protected String anexoUrl;
    protected String estatus;
    protected String proceso;
    @XmlElement(name = "id_proceso")
    protected int idProceso;
    protected String prefijo;

    /**
     * Obtiene el valor de la propiedad idFormato.
     * 
     */
    public int getIdFormato() {
        return idFormato;
    }

    /**
     * Define el valor de la propiedad idFormato.
     * 
     */
    public void setIdFormato(int value) {
        this.idFormato = value;
    }

    /**
     * Obtiene el valor de la propiedad idAnexo.
     * 
     */
    public int getIdAnexo() {
        return idAnexo;
    }

    /**
     * Define el valor de la propiedad idAnexo.
     * 
     */
    public void setIdAnexo(int value) {
        this.idAnexo = value;
    }

    /**
     * Obtiene el valor de la propiedad descrAnexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrAnexo() {
        return descrAnexo;
    }

    /**
     * Define el valor de la propiedad descrAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrAnexo(String value) {
        this.descrAnexo = value;
    }

    /**
     * Obtiene el valor de la propiedad anexoUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnexoUrl() {
        return anexoUrl;
    }

    /**
     * Define el valor de la propiedad anexoUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnexoUrl(String value) {
        this.anexoUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad estatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatus(String value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad proceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProceso() {
        return proceso;
    }

    /**
     * Define el valor de la propiedad proceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProceso(String value) {
        this.proceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idProceso.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Define el valor de la propiedad idProceso.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Define el valor de la propiedad prefijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijo(String value) {
        this.prefijo = value;
    }

}
