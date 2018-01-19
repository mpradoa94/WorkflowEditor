
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcFlujoVersion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcFlujoVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlujoV" type="{http://Webmet.core/}flujoVersion"/>
 *         &lt;element name="Id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcFlujoVersion", propOrder = {
    "flujoV",
    "idInstancia"
})
public class AbcFlujoVersion {

    @XmlElement(name = "FlujoV", required = true)
    protected FlujoVersion flujoV;
    @XmlElement(name = "Id_instancia")
    protected int idInstancia;

    /**
     * Obtiene el valor de la propiedad flujoV.
     * 
     * @return
     *     possible object is
     *     {@link FlujoVersion }
     *     
     */
    public FlujoVersion getFlujoV() {
        return flujoV;
    }

    /**
     * Define el valor de la propiedad flujoV.
     * 
     * @param value
     *     allowed object is
     *     {@link FlujoVersion }
     *     
     */
    public void setFlujoV(FlujoVersion value) {
        this.flujoV = value;
    }

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

}
