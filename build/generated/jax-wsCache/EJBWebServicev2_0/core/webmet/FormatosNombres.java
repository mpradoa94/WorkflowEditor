
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formatosNombres complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formatosNombres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFormato" type="{http://Webmet.core/}formatos" minOccurs="0"/>
 *         &lt;element name="ID_CAMPO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOMBRE_CAMPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatosNombres", propOrder = {
    "idFormato",
    "idcampo",
    "nombrecampo",
    "nombre"
})
public class FormatosNombres {

    protected Formatos idFormato;
    @XmlElement(name = "ID_CAMPO")
    protected int idcampo;
    @XmlElement(name = "NOMBRE_CAMPO")
    protected String nombrecampo;
    @XmlElement(name = "NOMBRE")
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad idFormato.
     * 
     * @return
     *     possible object is
     *     {@link Formatos }
     *     
     */
    public Formatos getIdFormato() {
        return idFormato;
    }

    /**
     * Define el valor de la propiedad idFormato.
     * 
     * @param value
     *     allowed object is
     *     {@link Formatos }
     *     
     */
    public void setIdFormato(Formatos value) {
        this.idFormato = value;
    }

    /**
     * Obtiene el valor de la propiedad idcampo.
     * 
     */
    public int getIDCAMPO() {
        return idcampo;
    }

    /**
     * Define el valor de la propiedad idcampo.
     * 
     */
    public void setIDCAMPO(int value) {
        this.idcampo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrecampo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRECAMPO() {
        return nombrecampo;
    }

    /**
     * Define el valor de la propiedad nombrecampo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRECAMPO(String value) {
        this.nombrecampo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

}
