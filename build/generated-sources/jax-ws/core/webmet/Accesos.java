
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para accesos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accesos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ACCESO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FECHA_ACCESO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PUERTA_SUC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PERSONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RESULTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accesos", propOrder = {
    "idacceso",
    "fechaacceso",
    "idpuertasuc",
    "idpersona",
    "resultado"
})
public class Accesos {

    @XmlElement(name = "ID_ACCESO")
    protected int idacceso;
    @XmlElement(name = "FECHA_ACCESO")
    protected String fechaacceso;
    @XmlElement(name = "ID_PUERTA_SUC")
    protected int idpuertasuc;
    @XmlElement(name = "ID_PERSONA")
    protected int idpersona;
    @XmlElement(name = "RESULTADO")
    protected String resultado;

    /**
     * Obtiene el valor de la propiedad idacceso.
     * 
     */
    public int getIDACCESO() {
        return idacceso;
    }

    /**
     * Define el valor de la propiedad idacceso.
     * 
     */
    public void setIDACCESO(int value) {
        this.idacceso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaacceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAACCESO() {
        return fechaacceso;
    }

    /**
     * Define el valor de la propiedad fechaacceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAACCESO(String value) {
        this.fechaacceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idpuertasuc.
     * 
     */
    public int getIDPUERTASUC() {
        return idpuertasuc;
    }

    /**
     * Define el valor de la propiedad idpuertasuc.
     * 
     */
    public void setIDPUERTASUC(int value) {
        this.idpuertasuc = value;
    }

    /**
     * Obtiene el valor de la propiedad idpersona.
     * 
     */
    public int getIDPERSONA() {
        return idpersona;
    }

    /**
     * Define el valor de la propiedad idpersona.
     * 
     */
    public void setIDPERSONA(int value) {
        this.idpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULTADO() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULTADO(String value) {
        this.resultado = value;
    }

}
