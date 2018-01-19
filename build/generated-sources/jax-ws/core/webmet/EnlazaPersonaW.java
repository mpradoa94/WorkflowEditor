
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Enlaza_PersonaW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Enlaza_PersonaW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entra" type="{http://Webmet.core/}abcEnlazaPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enlaza_PersonaW", propOrder = {
    "entra"
})
public class EnlazaPersonaW {

    protected AbcEnlazaPersona entra;

    /**
     * Obtiene el valor de la propiedad entra.
     * 
     * @return
     *     possible object is
     *     {@link AbcEnlazaPersona }
     *     
     */
    public AbcEnlazaPersona getEntra() {
        return entra;
    }

    /**
     * Define el valor de la propiedad entra.
     * 
     * @param value
     *     allowed object is
     *     {@link AbcEnlazaPersona }
     *     
     */
    public void setEntra(AbcEnlazaPersona value) {
        this.entra = value;
    }

}
