
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcFormatoEstado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcFormatoEstado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formE" type="{http://Webmet.core/}formatoEstado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcFormatoEstado", propOrder = {
    "idInstancia",
    "formE"
})
public class AbcFormatoEstado {

    @XmlElement(name = "id_instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected FormatoEstado formE;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad formE.
     * 
     * @return
     *     possible object is
     *     {@link FormatoEstado }
     *     
     */
    public FormatoEstado getFormE() {
        return formE;
    }

    /**
     * Define el valor de la propiedad formE.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatoEstado }
     *     
     */
    public void setFormE(FormatoEstado value) {
        this.formE = value;
    }

}
