
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getImpuestosNotariaAllResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getImpuestosNotariaAllResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imp" type="{http://Webmet.core/}impuestosGenerales" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImpuestosNotariaAllResponse", propOrder = {
    "imp",
    "resultado"
})
public class GetImpuestosNotariaAllResponse {

    protected ImpuestosGenerales imp;
    protected Resultado resultado;

    /**
     * Obtiene el valor de la propiedad imp.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosGenerales }
     *     
     */
    public ImpuestosGenerales getImp() {
        return imp;
    }

    /**
     * Define el valor de la propiedad imp.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosGenerales }
     *     
     */
    public void setImp(ImpuestosGenerales value) {
        this.imp = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

}
