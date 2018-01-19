
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStatementOfAccountResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getStatementOfAccountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://Webmet.core/}resultado" minOccurs="0"/>
 *         &lt;element name="stofac" type="{http://Webmet.core/}statementOfAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatementOfAccountResponse", propOrder = {
    "resultado",
    "stofac"
})
public class GetStatementOfAccountResponse {

    protected Resultado resultado;
    protected StatementOfAccount stofac;

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

    /**
     * Obtiene el valor de la propiedad stofac.
     * 
     * @return
     *     possible object is
     *     {@link StatementOfAccount }
     *     
     */
    public StatementOfAccount getStofac() {
        return stofac;
    }

    /**
     * Define el valor de la propiedad stofac.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementOfAccount }
     *     
     */
    public void setStofac(StatementOfAccount value) {
        this.stofac = value;
    }

}
